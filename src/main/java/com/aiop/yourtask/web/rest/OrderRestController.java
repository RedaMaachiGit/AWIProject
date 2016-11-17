package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.OrderDAO;
import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.OrderService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderRestController")

public class OrderRestController {

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
	 * Get Yourtaskuser entity by Order
	 * 
	 */
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUserid", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser getOrderYourtaskuserByUserid(@PathVariable Integer order_orderid) {
		return orderDAO.findOrderByPrimaryKey(order_orderid).getYourtaskuserByUserid();
	}

	/**
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUseridsc/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadOrderYourtaskuserByUseridsc(@PathVariable Integer order_orderid, @PathVariable Integer related_yourtaskuserbyuseridsc_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuseridsc_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	* View an existing OrderProduct entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}", method = RequestMethod.GET)
	@ResponseBody
	public OrderProduct loadOrderOrderProducts(@PathVariable Integer order_orderid, @PathVariable Integer related_orderproducts_orderid, @PathVariable Integer related_orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid, -1, -1);

		return orderproduct;
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUserid", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newOrderYourtaskuserByUserid(@PathVariable Integer order_orderid, @RequestBody Yourtaskuser yourtaskuser) {
		orderService.saveOrderYourtaskuserByUserid(order_orderid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* Save an existing OrderProduct entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/orderProducts", method = RequestMethod.PUT)
	@ResponseBody
	public OrderProduct saveOrderOrderProducts(@PathVariable Integer order_orderid, @RequestBody OrderProduct orderproducts) {
		orderService.saveOrderOrderProducts(order_orderid, orderproducts);
		return orderProductDAO.findOrderProductByPrimaryKey(orderproducts.getOrderid(), orderproducts.getProductid());
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUserid", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveOrderYourtaskuserByUserid(@PathVariable Integer order_orderid, @RequestBody Yourtaskuser yourtaskuserbyuserid) {
		orderService.saveOrderYourtaskuserByUserid(order_orderid, yourtaskuserbyuserid);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuserbyuserid.getUserid());
	}

	/**
	* Show all OrderProduct entities by Order
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/orderProducts", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderProduct> getOrderOrderProducts(@PathVariable Integer order_orderid) {
		return new java.util.ArrayList<OrderProduct>(orderDAO.findOrderByPrimaryKey(order_orderid).getOrderProducts());
	}

	/**
	* Create a new OrderProduct entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/orderProducts", method = RequestMethod.POST)
	@ResponseBody
	public OrderProduct newOrderOrderProducts(@PathVariable Integer order_orderid, @RequestBody OrderProduct orderproduct) {
		orderService.saveOrderOrderProducts(order_orderid, orderproduct);
		return orderProductDAO.findOrderProductByPrimaryKey(orderproduct.getOrderid(), orderproduct.getProductid());
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUseridsc", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveOrderYourtaskuserByUseridsc(@PathVariable Integer order_orderid, @RequestBody Yourtaskuser yourtaskuserbyuseridsc) {
		orderService.saveOrderYourtaskuserByUseridsc(order_orderid, yourtaskuserbyuseridsc);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuserbyuseridsc.getUserid());
	}

	/**
	* Select an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadOrder(@PathVariable Integer order_orderid) {
		return orderDAO.findOrderByPrimaryKey(order_orderid);
	}

	/**
	* Delete an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrder(@PathVariable Integer order_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(order_orderid);
		orderService.deleteOrder(order);
	}

	/**
	* Show all Order entities
	* 
	*/
	@RequestMapping(value = "/Order", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> listOrders() {
		return new java.util.ArrayList<Order>(orderService.loadOrders());
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUserid/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderYourtaskuserByUserid(@PathVariable Integer order_orderid, @PathVariable Integer related_yourtaskuserbyuserid_userid) {
		orderService.deleteOrderYourtaskuserByUserid(order_orderid, related_yourtaskuserbyuserid_userid);
	}

	/**
	* Get Yourtaskuser entity by Order
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUseridsc", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser getOrderYourtaskuserByUseridsc(@PathVariable Integer order_orderid) {
		return orderDAO.findOrderByPrimaryKey(order_orderid).getYourtaskuserByUseridsc();
	}

	/**
	* Create a new Order entity
	* 
	*/
	@RequestMapping(value = "/Order", method = RequestMethod.POST)
	@ResponseBody
	public Order newOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return orderDAO.findOrderByPrimaryKey(order.getOrderid());
	}

	/**
	* Save an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Order", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return orderDAO.findOrderByPrimaryKey(order.getOrderid());
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
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUserid/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadOrderYourtaskuserByUserid(@PathVariable Integer order_orderid, @PathVariable Integer related_yourtaskuserbyuserid_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuserid_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	* Delete an existing OrderProduct entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderOrderProducts(@PathVariable Integer order_orderid, @PathVariable Integer related_orderproducts_orderid, @PathVariable Integer related_orderproducts_productid) {
		orderService.deleteOrderOrderProducts(order_orderid, related_orderproducts_orderid, related_orderproducts_productid);
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUseridsc/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderYourtaskuserByUseridsc(@PathVariable Integer order_orderid, @PathVariable Integer related_yourtaskuserbyuseridsc_userid) {
		orderService.deleteOrderYourtaskuserByUseridsc(order_orderid, related_yourtaskuserbyuseridsc_userid);
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Order/{order_orderid}/yourtaskuserByUseridsc", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newOrderYourtaskuserByUseridsc(@PathVariable Integer order_orderid, @RequestBody Yourtaskuser yourtaskuser) {
		orderService.saveOrderYourtaskuserByUseridsc(order_orderid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}
}