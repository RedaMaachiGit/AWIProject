/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.OrderDAO;
import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.OrderService;
import com.aiop.yourtask.web.security.AuthenticationFacade;

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
 * Spring MVC controller that handles CRUD requests for Order entities.
 */

@Controller("OrderController")

public class OrderController {

	/** DAO injected by Spring that manages Order entities. */
	@Autowired
	private OrderDAO orderDAO;

	/** DAO injected by Spring that manages OrderProduct entities. */
	@Autowired
	private OrderProductDAO orderProductDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Order entities. */
	@Autowired
	private OrderService orderService;
	
	/** The authentication. */
    @Autowired
    private AuthenticationFacade authentication;
    

	/**
	 * Entry point to show all Order entities.
	 *
	 * @return the string
	 */
	public String indexOrder() {
		return "redirect:/indexOrder";
	}

	/**
	 * Show all Yourtaskuser entities by Order.
	 *
	 * @param orderidKey the orderid key
	 * @return the model and view
	 */
	@RequestMapping("/listOrderYourtaskuserByUserid")
	public ModelAndView listOrderYourtaskuserByUserid(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/yourtaskuserbyuserid/listYourtaskuserByUserid.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderProduct entity.
	 *
	 * @param order_orderid the order orderid
	 * @param orderproducts_orderid the orderproducts orderid
	 * @param orderproducts_productid the orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/editOrderOrderProducts")
	public ModelAndView editOrderOrderProducts(@RequestParam Integer order_orderid, @RequestParam Integer orderproducts_orderid, @RequestParam Integer orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(orderproducts_orderid, orderproducts_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("orderproduct", orderproduct);
		mav.setViewName("order/orderproducts/editOrderProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param yourtaskuserbyuserid the yourtaskuserbyuserid
	 * @return the model and view
	 */
	@RequestMapping("/saveOrderYourtaskuserByUserid")
	public ModelAndView saveOrderYourtaskuserByUserid(@RequestParam Integer order_orderid, @ModelAttribute Yourtaskuser yourtaskuserbyuserid) {
		Order parent_order = orderService.saveOrderYourtaskuserByUserid(order_orderid, yourtaskuserbyuserid);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @return the model and view
	 */
	@RequestMapping("/newOrderYourtaskuserByUseridsc")
	public ModelAndView newOrderYourtaskuserByUseridsc(@RequestParam Integer order_orderid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("order/yourtaskuserbyuseridsc/editYourtaskuserByUseridsc.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity.
	 *
	 * @param order the order
	 * @return the string
	 */
	@RequestMapping("/saveOrder")
	public String saveOrder(@ModelAttribute Order order) {
		orderService.saveOrder(order);
		return "forward:/indexOrder";
	}

	/**
	 * Show all OrderProduct entities by Order.
	 *
	 * @param orderidKey the orderid key
	 * @return the model and view
	 */
	@RequestMapping("/listOrderOrderProducts")
	public ModelAndView listOrderOrderProducts(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/orderproducts/listOrderProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param yourtaskuserbyuserid_userid the yourtaskuserbyuserid userid
	 * @return the model and view
	 */
	@RequestMapping("/editOrderYourtaskuserByUserid")
	public ModelAndView editOrderYourtaskuserByUserid(@RequestParam Integer order_orderid, @RequestParam Integer yourtaskuserbyuserid_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuserbyuserid_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("order/yourtaskuserbyuserid/editYourtaskuserByUserid.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderProduct entity.
	 *
	 * @param order_orderid the order orderid
	 * @param orderproducts the orderproducts
	 * @return the model and view
	 */
	@RequestMapping("/saveOrderOrderProducts")
	public ModelAndView saveOrderOrderProducts(@RequestParam Integer order_orderid, @ModelAttribute OrderProduct orderproducts) {
		Order parent_order = orderService.saveOrderOrderProducts(order_orderid, orderproducts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

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
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param yourtaskuserbyuseridsc the yourtaskuserbyuseridsc
	 * @return the model and view
	 */
	@RequestMapping("/saveOrderYourtaskuserByUseridsc")
	public ModelAndView saveOrderYourtaskuserByUseridsc(@RequestParam Integer order_orderid, @ModelAttribute Yourtaskuser yourtaskuserbyuseridsc) {
		Order parent_order = orderService.saveOrderYourtaskuserByUseridsc(order_orderid, yourtaskuserbyuseridsc);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Select an existing Order entity.
	 *
	 * @param orderidKey the orderid key
	 * @return the model and view
	 */
	@RequestMapping("/selectOrder")
	public ModelAndView selectOrder(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_yourtaskuserbyuserid_userid the related yourtaskuserbyuserid userid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteOrderYourtaskuserByUserid")
	public ModelAndView confirmDeleteOrderYourtaskuserByUserid(@RequestParam Integer order_orderid, @RequestParam Integer related_yourtaskuserbyuserid_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuserid_userid));
		mav.addObject("order_orderid", order_orderid);
		mav.setViewName("order/yourtaskuserbyuserid/deleteYourtaskuserByUserid.jsp");

		return mav;
	}

	/**
	 * Show all Yourtaskuser entities by Order.
	 *
	 * @param orderidKey the orderid key
	 * @return the model and view
	 */
	@RequestMapping("/listOrderYourtaskuserByUseridsc")
	public ModelAndView listOrderYourtaskuserByUseridsc(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/yourtaskuserbyuseridsc/listYourtaskuserByUseridsc.jsp");

		return mav;
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param yourtaskuserbyuseridsc_userid the yourtaskuserbyuseridsc userid
	 * @return the model and view
	 */
	@RequestMapping("/editOrderYourtaskuserByUseridsc")
	public ModelAndView editOrderYourtaskuserByUseridsc(@RequestParam Integer order_orderid, @RequestParam Integer yourtaskuserbyuseridsc_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuserbyuseridsc_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("order/yourtaskuserbyuseridsc/editYourtaskuserByUseridsc.jsp");

		return mav;
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_yourtaskuserbyuserid_userid the related yourtaskuserbyuserid userid
	 * @return the model and view
	 */
	@RequestMapping("/deleteOrderYourtaskuserByUserid")
	public ModelAndView deleteOrderYourtaskuserByUserid(@RequestParam Integer order_orderid, @RequestParam Integer related_yourtaskuserbyuserid_userid) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderYourtaskuserByUserid(order_orderid, related_yourtaskuserbyuserid_userid);

		mav.addObject("order_orderid", order_orderid);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Create a new OrderProduct entity.
	 *
	 * @param order_orderid the order orderid
	 * @return the model and view
	 */
	@RequestMapping("/newOrderOrderProducts")
	public ModelAndView newOrderOrderProducts(@RequestParam Integer order_orderid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("orderproduct", new OrderProduct());
		mav.addObject("newFlag", true);
		mav.setViewName("order/orderproducts/editOrderProducts.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newOrder")
	public ModelAndView newOrder() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param yourtaskuserbyuseridsc_userid the yourtaskuserbyuseridsc userid
	 * @return the model and view
	 */
	@RequestMapping("/selectOrderYourtaskuserByUseridsc")
	public ModelAndView selectOrderYourtaskuserByUseridsc(@RequestParam Integer order_orderid, @RequestParam Integer yourtaskuserbyuseridsc_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuserbyuseridsc_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("order/yourtaskuserbyuseridsc/viewYourtaskuserByUseridsc.jsp");

		return mav;
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_yourtaskuserbyuseridsc_userid the related yourtaskuserbyuseridsc userid
	 * @return the model and view
	 */
	@RequestMapping("/deleteOrderYourtaskuserByUseridsc")
	public ModelAndView deleteOrderYourtaskuserByUseridsc(@RequestParam Integer order_orderid, @RequestParam Integer related_yourtaskuserbyuseridsc_userid) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderYourtaskuserByUseridsc(order_orderid, related_yourtaskuserbyuseridsc_userid);

		mav.addObject("order_orderid", order_orderid);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderProduct entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/deleteOrderOrderProducts")
	public ModelAndView deleteOrderOrderProducts(@RequestParam Integer order_orderid, @RequestParam Integer related_orderproducts_orderid, @RequestParam Integer related_orderproducts_productid) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderOrderProducts(order_orderid, related_orderproducts_orderid, related_orderproducts_productid);

		mav.addObject("order_orderid", order_orderid);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * View an existing OrderProduct entity.
	 *
	 * @param order_orderid the order orderid
	 * @param orderproducts_orderid the orderproducts orderid
	 * @param orderproducts_productid the orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/selectOrderOrderProducts")
	public ModelAndView selectOrderOrderProducts(@RequestParam Integer order_orderid, @RequestParam Integer orderproducts_orderid, @RequestParam Integer orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(orderproducts_orderid, orderproducts_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("orderproduct", orderproduct);
		mav.setViewName("order/orderproducts/viewOrderProducts.jsp");

		return mav;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/orderController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Order entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexOrder")
	public ModelAndView listOrders() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orders", orderService.loadOrders());

		mav.setViewName("order/listOrders.jsp");

		return mav;
	}
	
	/**
	 * Show all Order entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/su/orders")
	public ModelAndView listOrdersBySU() {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser user = authentication.getActiveUser();
		mav.addObject("orders", orderDAO.findOrdersByYourtaskuser(user));
		mav.setViewName("order/su/listOrdersBySU.jsp");
		return mav;
	}
	
	/**
	 * List orders by SC.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/sc/orders")
	public ModelAndView listOrdersBySC() {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser user = authentication.getActiveUser();
		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(user.getUserid()));
		mav.setViewName("order/sc/listOrdersBySC.jsp");
		return mav;
	}

	/**
	 * Edit an existing Order entity.
	 *
	 * @param orderidKey the orderid key
	 * @return the model and view
	 */
	@RequestMapping("/editOrder")
	public ModelAndView editOrder(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_yourtaskuserbyuseridsc_userid the related yourtaskuserbyuseridsc userid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteOrderYourtaskuserByUseridsc")
	public ModelAndView confirmDeleteOrderYourtaskuserByUseridsc(@RequestParam Integer order_orderid, @RequestParam Integer related_yourtaskuserbyuseridsc_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuseridsc_userid));
		mav.addObject("order_orderid", order_orderid);
		mav.setViewName("order/yourtaskuserbyuseridsc/deleteYourtaskuserByUseridsc.jsp");

		return mav;
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @return the model and view
	 */
	@RequestMapping("/newOrderYourtaskuserByUserid")
	public ModelAndView newOrderYourtaskuserByUserid(@RequestParam Integer order_orderid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("order/yourtaskuserbyuserid/editYourtaskuserByUserid.jsp");

		return mav;
	}

	/**
	 * Select the child OrderProduct entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteOrderOrderProducts")
	public ModelAndView confirmDeleteOrderOrderProducts(@RequestParam Integer order_orderid, @RequestParam Integer related_orderproducts_orderid, @RequestParam Integer related_orderproducts_productid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderproduct", orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid));
		mav.addObject("order_orderid", order_orderid);
		mav.setViewName("order/orderproducts/deleteOrderProducts.jsp");

		return mav;
	}

	/**
	 * Select the Order entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param orderidKey the orderid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteOrder")
	public ModelAndView confirmDeleteOrder(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/deleteOrder.jsp");

		return mav;
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param order_orderid the order orderid
	 * @param yourtaskuserbyuserid_userid the yourtaskuserbyuserid userid
	 * @return the model and view
	 */
	@RequestMapping("/selectOrderYourtaskuserByUserid")
	public ModelAndView selectOrderYourtaskuserByUserid(@RequestParam Integer order_orderid, @RequestParam Integer yourtaskuserbyuserid_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuserbyuserid_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_orderid", order_orderid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("order/yourtaskuserbyuserid/viewYourtaskuserByUserid.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity.
	 *
	 * @param orderidKey the orderid key
	 * @return the string
	 */
	@RequestMapping("/deleteOrder")
	public String deleteOrder(@RequestParam Integer orderidKey) {
		Order order = orderDAO.findOrderByPrimaryKey(orderidKey);
		orderService.deleteOrder(order);
		return "forward:/indexOrder";
	}
}