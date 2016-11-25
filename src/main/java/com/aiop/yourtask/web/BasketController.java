/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.OrderDAO;
import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Products;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.OrderService;
import com.aiop.yourtask.service.ProductService;
import com.aiop.yourtask.service.YourtaskuserService;
import com.aiop.yourtask.web.security.AuthenticationFacade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to handle the basket of an user
 */

@Controller
public class BasketController {

	/** DAO injected by Spring that manages Order entities. */
	@Autowired
	private OrderDAO orderDAO;

	/** DAO injected by Spring that manages OrderProduct entities. */
	@Autowired
	private OrderProductDAO orderProductDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Order
	 * entities.
	 */
	@Autowired
	private OrderService orderService;

	/**
	 * Service injected by Spring that provides CRUD operations for Product
	 * entities.
	 */
	@Autowired
	private ProductService productService;

	/** The authentication. */
	@Autowired
	private AuthenticationFacade authentication;

	/**
	 * Service injected by Spring that provides CRUD operations for Yourtaskuser
	 * entities.
	 */
	@Autowired
	private YourtaskuserService yourtaskuserService;

	@RequestMapping("/su/basket/add/{productId}")
	public String newBasketItem(@PathVariable int productId, HttpServletResponse response, HttpServletRequest request) {
		Cookie cookie = new Cookie("product" + Integer.toString(productId), Integer.toString(productId));
		cookie.setPath(request.getContextPath());
		cookie.setMaxAge(10000);
		response.addCookie(cookie);
		return "redirect:/su/allproducts";
	}

	@RequestMapping("/su/basket/remove/{productId}")
	public ModelAndView removeBasketItem(@PathVariable int productId, HttpServletResponse response, HttpServletRequest request) {
		Cookie clientCookies[] = request.getCookies();
		for (int i = 0; i < clientCookies.length; i++) {
			//if (clientCookies[i].getValue().equals(Integer.toString(productId))) {
				Cookie cookie = new Cookie(clientCookies[i].getName(),null);
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			//}
		}
		ModelAndView mav = new ModelAndView();
		HashSet<Product> productsList = new HashSet<Product>();
		for (int i = 0; i < clientCookies.length; i++) {
			if (!clientCookies[i].getName().startsWith("JSESSIONID") ) {
				if (clientCookies[i].getValue()!= null){
					int j = Integer.parseInt(clientCookies[i].getValue());
					productsList.add(productService.findProductByPrimaryKey(j));
				}
			}
		}
		
		mav.addObject("products", productsList);
		mav.setViewName("basket/su/listproducts.jsp");
		return mav;
	}

	@RequestMapping("/su/basket/list")
	public ModelAndView listBasket(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Cookie clientCookies[] = request.getCookies();
		HashSet<Product> productsList = new HashSet<Product>();
		for (int i = 0; i < clientCookies.length; i++) {
			if (!clientCookies[i].getName().startsWith("JSESSIONID")) {
				int j = Integer.parseInt(clientCookies[i].getValue());
				productsList.add(productService.findProductByPrimaryKey(j));
			}
		}
		mav.addObject("products", productsList);
		mav.setViewName("basket/su/listproducts.jsp");
		return mav;
	}

	@RequestMapping("/su/basket/order")
	public String orderBasket(HttpServletResponse response, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		int id = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
		Order order = new Order();
		order.setOrderdate(Calendar.getInstance());
		order.setOrderid(id);
		
		order.setOrderstate("completed");
		order.setOrdershippingcost(new BigDecimal(10));
		order.setYourtaskuserByUserid(authentication.getActiveUser());
		BigDecimal price = new BigDecimal(0);
		
		Cookie clientCookies[] = request.getCookies();
		if (clientCookies.length > 0){
			Set<Product> productsList = new HashSet<Product>();
			// this number will change because it exits for sure a company
			int company = 0;
			for (int i = 0; i < clientCookies.length; i++) {
				if (!clientCookies[i].getName().startsWith("JSESSIONID")) {
					int j = Integer.parseInt(clientCookies[i].getValue());
					Product product = productService.findProductByPrimaryKey(j);
					company = product.getYourtaskuser().getUserid(); 
					productsList.add(product);
					Cookie cookie = new Cookie(clientCookies[i].getName(),null);
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					price.add(product.getProductprice());
				}
			}
			order.setOrderprice(price);
			order.setYourtaskuserByUseridsc(yourtaskuserService.findYourtaskuserByPrimaryKey(company));
			orderService.saveOrder(order);
			Iterator it = productsList.iterator();
			while (it.hasNext()) {
				OrderProduct op = new OrderProduct();
				op.setOrderid(id);
				op.setProduct(((Product) it.next()));
				op.setQuantity(1);
				op.setProductid(((Product) it.next()).getProductid());
				orderService.saveOrderOrderProducts(id, op);
			}
			
		}
		 return "redirect :/su/orders";
	}

}