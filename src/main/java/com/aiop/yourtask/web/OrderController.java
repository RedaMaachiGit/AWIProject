package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.OrderDAO;
import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.OrderService;

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

/**
 * Spring MVC controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderController")

public class OrderController {

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages OrderProduct entities
	 * 
	 */
	@Autowired
	private OrderProductDAO orderProductDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Order entities
	 * 
	 */
	@Autowired
	private OrderService orderService;

	/**
	 * Entry point to show all Order entities
	 * 
	 */
	public String indexOrder() {
		return "redirect:/indexOrder";
	}

	/**
	* Show all Yourtaskuser entities by Order
	* 
	*/
	@RequestMapping("/listOrderYourtaskuserByUserid")
	public ModelAndView listOrderYourtaskuserByUserid(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/yourtaskuserbyuserid/listYourtaskuserByUserid.jsp");

		return mav;
	}

	/**
	* Edit an existing OrderProduct entity
	* 
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
	* Save an existing Yourtaskuser entity
	* 
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
	* Create a new Yourtaskuser entity
	* 
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
	* Save an existing Order entity
	* 
	*/
	@RequestMapping("/saveOrder")
	public String saveOrder(@ModelAttribute Order order) {
		orderService.saveOrder(order);
		return "forward:/indexOrder";
	}

	/**
	* Show all OrderProduct entities by Order
	* 
	*/
	@RequestMapping("/listOrderOrderProducts")
	public ModelAndView listOrderOrderProducts(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/orderproducts/listOrderProducts.jsp");

		return mav;
	}

	/**
	* Edit an existing Yourtaskuser entity
	* 
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
	* Save an existing OrderProduct entity
	* 
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
	* Register custom, context-specific property editors
	* 
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
	* Save an existing Yourtaskuser entity
	* 
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
	* Select an existing Order entity
	* 
	*/
	@RequestMapping("/selectOrder")
	public ModelAndView selectOrder(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	* Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity
	* 
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
	* Show all Yourtaskuser entities by Order
	* 
	*/
	@RequestMapping("/listOrderYourtaskuserByUseridsc")
	public ModelAndView listOrderYourtaskuserByUseridsc(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/yourtaskuserbyuseridsc/listYourtaskuserByUseridsc.jsp");

		return mav;
	}

	/**
	* Edit an existing Yourtaskuser entity
	* 
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
	* Delete an existing Yourtaskuser entity
	* 
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
	* Create a new OrderProduct entity
	* 
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
	* Create a new Order entity
	* 
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
	* View an existing Yourtaskuser entity
	* 
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
	* Delete an existing Yourtaskuser entity
	* 
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
	* Delete an existing OrderProduct entity
	* 
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
	* View an existing OrderProduct entity
	* 
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
	*/
	@RequestMapping("/orderController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Show all Order entities
	* 
	*/
	@RequestMapping("/indexOrder")
	public ModelAndView listOrders() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orders", orderService.loadOrders());

		mav.setViewName("order/listOrders.jsp");

		return mav;
	}

	/**
	* Edit an existing Order entity
	* 
	*/
	@RequestMapping("/editOrder")
	public ModelAndView editOrder(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	* Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity
	* 
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
	* Create a new Yourtaskuser entity
	* 
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
	* Select the child OrderProduct entity for display allowing the user to confirm that they would like to delete the entity
	* 
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
	* Select the Order entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteOrder")
	public ModelAndView confirmDeleteOrder(@RequestParam Integer orderidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(orderidKey));
		mav.setViewName("order/deleteOrder.jsp");

		return mav;
	}

	/**
	* View an existing Yourtaskuser entity
	* 
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
	* Delete an existing Order entity
	* 
	*/
	@RequestMapping("/deleteOrder")
	public String deleteOrder(@RequestParam Integer orderidKey) {
		Order order = orderDAO.findOrderByPrimaryKey(orderidKey);
		orderService.deleteOrder(order);
		return "forward:/indexOrder";
	}
}