/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.ProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Product entities.
 */

@Controller("ProductController")

public class ProductController {

	/** DAO injected by Spring that manages OrderProduct entities. */
	@Autowired
	private OrderProductDAO orderProductDAO;

	/** DAO injected by Spring that manages Product entities. */
	@Autowired
	private ProductDAO productDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Product entities. */
	@Autowired
	private ProductService productService;

	/**
	 * Entry point to show all Product entities.
	 *
	 * @return the string
	 */
	public String indexProduct() {
		return "redirect:/indexProduct";
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/editProductYourtaskuser")
	public ModelAndView editProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("product/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param product_productid the product productid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteProductYourtaskuser")
	public ModelAndView confirmDeleteProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid));
		mav.addObject("product_productid", product_productid);
		mav.setViewName("product/yourtaskuser/deleteYourtaskuser.jsp");

		return mav;
	}

	/**
	 * View an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param orderproducts_orderid the orderproducts orderid
	 * @param orderproducts_productid the orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/selectProductOrderProducts")
	public ModelAndView selectProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer orderproducts_orderid, @RequestParam Integer orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(orderproducts_orderid, orderproducts_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("orderproduct", orderproduct);
		mav.setViewName("product/orderproducts/viewOrderProducts.jsp");

		return mav;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/productController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Register custom, context-specific property editors.
	 *
	 * @param binder the binder
	 * @param request the request
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	
	/**
	 * Select an existing Activity entity.
	 *
	 * @return the model and view
	 */
	 @RequestMapping("/selectProducts")
	 public ModelAndView selectProducts() {
	 	ModelAndView mav = new ModelAndView();
	  	mav.addObject("products", productDAO.findAllProducts());
	 	mav.setViewName("products/detailsProducts.jsp");
	  	return mav;
	 }
	 
	
	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @return the model and view
	 */
	@RequestMapping("/newProductYourtaskuser")
	public ModelAndView newProductYourtaskuser(@RequestParam Integer product_productid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("product/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the child OrderProduct entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param product_productid the product productid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteProductOrderProducts")
	public ModelAndView confirmDeleteProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer related_orderproducts_orderid, @RequestParam Integer related_orderproducts_productid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderproduct", orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid));
		mav.addObject("product_productid", product_productid);
		mav.setViewName("product/orderproducts/deleteOrderProducts.jsp");

		return mav;
	}

	/**
	 * Show all Yourtaskuser entities by Product.
	 *
	 * @param productidKey the productid key
	 * @return the model and view
	 */
	@RequestMapping("/listProductYourtaskuser")
	public ModelAndView listProductYourtaskuser(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/yourtaskuser/listYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @return the model and view
	 */
	@RequestMapping("/newProductOrderProducts")
	public ModelAndView newProductOrderProducts(@RequestParam Integer product_productid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("orderproduct", new OrderProduct());
		mav.addObject("newFlag", true);
		mav.setViewName("product/orderproducts/editOrderProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing Product entity.
	 *
	 * @param product the product
	 * @return the string
	 */
	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product) {
		productService.saveProduct(product);
		return "forward:/indexProduct";
	}

	/**
	 * Select the Product entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param productidKey the productid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteProduct")
	public ModelAndView confirmDeleteProduct(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/deleteProduct.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param orderproducts the orderproducts
	 * @return the model and view
	 */
	@RequestMapping("/saveProductOrderProducts")
	public ModelAndView saveProductOrderProducts(@RequestParam Integer product_productid, @ModelAttribute OrderProduct orderproducts) {
		Product parent_product = productService.saveProductOrderProducts(product_productid, orderproducts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("product", parent_product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param yourtaskuser the yourtaskuser
	 * @return the model and view
	 */
	@RequestMapping("/saveProductYourtaskuser")
	public ModelAndView saveProductYourtaskuser(@RequestParam Integer product_productid, @ModelAttribute Yourtaskuser yourtaskuser) {
		Product parent_product = productService.saveProductYourtaskuser(product_productid, yourtaskuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("product", parent_product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	 * Create a new Product entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newProduct")
	public ModelAndView newProduct() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	 * Show all Product entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexProduct")
	public ModelAndView listProducts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productService.loadProducts());

		mav.setViewName("product/listProducts.jsp");

		return mav;
	}
	
	/**
	 * All products.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/su/allproducts")
	public ModelAndView allProducts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productService.loadProducts());

		mav.setViewName("product/listAllProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/deleteProductOrderProducts")
	public ModelAndView deleteProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer related_orderproducts_orderid, @RequestParam Integer related_orderproducts_productid) {
		ModelAndView mav = new ModelAndView();

		Product product = productService.deleteProductOrderProducts(product_productid, related_orderproducts_orderid, related_orderproducts_productid);

		mav.addObject("product_productid", product_productid);
		mav.addObject("product", product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param orderproducts_orderid the orderproducts orderid
	 * @param orderproducts_productid the orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/editProductOrderProducts")
	public ModelAndView editProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer orderproducts_orderid, @RequestParam Integer orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(orderproducts_orderid, orderproducts_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("orderproduct", orderproduct);
		mav.setViewName("product/orderproducts/editOrderProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing Product entity.
	 *
	 * @param productidKey the productid key
	 * @return the model and view
	 */
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/deleteProductYourtaskuser")
	public ModelAndView deleteProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		Product product = productService.deleteProductYourtaskuser(product_productid, related_yourtaskuser_userid);

		mav.addObject("product_productid", product_productid);
		mav.addObject("product", product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	 * Show all OrderProduct entities by Product.
	 *
	 * @param productidKey the productid key
	 * @return the model and view
	 */
	@RequestMapping("/listProductOrderProducts")
	public ModelAndView listProductOrderProducts(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/orderproducts/listOrderProducts.jsp");

		return mav;
	}

	/**
	 * Select an existing Product entity.
	 *
	 * @param productidKey the productid key
	 * @return the model and view
	 */
	@RequestMapping("/selectProduct")
	public ModelAndView selectProduct(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/selectProductYourtaskuser")
	public ModelAndView selectProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("product/yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Delete an existing Product entity.
	 *
	 * @param productidKey the productid key
	 * @return the string
	 */
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam Integer productidKey) {
		Product product = productDAO.findProductByPrimaryKey(productidKey);
		productService.deleteProduct(product);
		return "forward:/indexProduct";
	}
}