package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.OrderDAO;
import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */

@Service("OrderService")

@Transactional
public class OrderServiceImpl implements OrderService {

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
	 * Instantiates a new OrderServiceImpl.
	 *
	 */
	public OrderServiceImpl() {
	}

	/**
	 * Save an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Order saveOrderYourtaskuserByUseridsc(Integer orderid, Yourtaskuser related_yourtaskuserbyuseridsc) {
		Order order = orderDAO.findOrderByPrimaryKey(orderid, -1, -1);
		Yourtaskuser existingyourtaskuserByUseridsc = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuseridsc.getUserid());

		// copy into the existing record to preserve existing relationships
		if (existingyourtaskuserByUseridsc != null) {
			existingyourtaskuserByUseridsc.setUserid(related_yourtaskuserbyuseridsc.getUserid());
			existingyourtaskuserByUseridsc.setUserdateofbirth(related_yourtaskuserbyuseridsc.getUserdateofbirth());
			existingyourtaskuserByUseridsc.setUserphonenumber(related_yourtaskuserbyuseridsc.getUserphonenumber());
			existingyourtaskuserByUseridsc.setUseremail(related_yourtaskuserbyuseridsc.getUseremail());
			existingyourtaskuserByUseridsc.setUserstreetnumber(related_yourtaskuserbyuseridsc.getUserstreetnumber());
			existingyourtaskuserByUseridsc.setUserzipcode(related_yourtaskuserbyuseridsc.getUserzipcode());
			existingyourtaskuserByUseridsc.setUsercity(related_yourtaskuserbyuseridsc.getUsercity());
			existingyourtaskuserByUseridsc.setUserusername(related_yourtaskuserbyuseridsc.getUserusername());
			existingyourtaskuserByUseridsc.setUserpassword(related_yourtaskuserbyuseridsc.getUserpassword());
			existingyourtaskuserByUseridsc.setUsertoken(related_yourtaskuserbyuseridsc.getUsertoken());
			existingyourtaskuserByUseridsc.setUserlastconnectiondate(related_yourtaskuserbyuseridsc.getUserlastconnectiondate());
			existingyourtaskuserByUseridsc.setUsertype(related_yourtaskuserbyuseridsc.getUsertype());
			existingyourtaskuserByUseridsc.setUseriban(related_yourtaskuserbyuseridsc.getUseriban());
			related_yourtaskuserbyuseridsc = existingyourtaskuserByUseridsc;
		}

		order.setYourtaskuserByUseridsc(related_yourtaskuserbyuseridsc);
		related_yourtaskuserbyuseridsc.getOrdersForUseridsc().add(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_yourtaskuserbyuseridsc = yourtaskuserDAO.store(related_yourtaskuserbyuseridsc);
		yourtaskuserDAO.flush();

		return order;
	}

	/**
	 * Save an existing OrderProduct entity
	 * 
	 */
	@Transactional
	public Order saveOrderOrderProducts(Integer orderid, OrderProduct related_orderproducts) {
		Order order = orderDAO.findOrderByPrimaryKey(orderid, -1, -1);
		OrderProduct existingorderProducts = orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts.getOrderid(), related_orderproducts.getProductid());

		// copy into the existing record to preserve existing relationships
		if (existingorderProducts != null) {
			existingorderProducts.setOrderid(related_orderproducts.getOrderid());
			existingorderProducts.setProductid(related_orderproducts.getProductid());
			existingorderProducts.setQuantity(related_orderproducts.getQuantity());
			related_orderproducts = existingorderProducts;
		}

		related_orderproducts.setOrder(order);
		order.getOrderProducts().add(related_orderproducts);
		related_orderproducts = orderProductDAO.store(related_orderproducts);
		orderProductDAO.flush();

		order = orderDAO.store(order);
		orderDAO.flush();

		return order;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public void saveOrder(Order order) {
		Order existingOrder = orderDAO.findOrderByPrimaryKey(order.getOrderid());

		if (existingOrder != null) {
			if (existingOrder != order) {
				existingOrder.setOrderid(order.getOrderid());
				existingOrder.setOrderdate(order.getOrderdate());
				existingOrder.setOrdershippingcost(order.getOrdershippingcost());
				existingOrder.setOrderprice(order.getOrderprice());
				existingOrder.setOrderstate(order.getOrderstate());
			}
			order = orderDAO.store(existingOrder);
		} else {
			order = orderDAO.store(order);
		}
		orderDAO.flush();
	}

	/**
	 * Delete an existing OrderProduct entity
	 * 
	 */
	@Transactional
	public Order deleteOrderOrderProducts(Integer order_orderid, Integer related_orderproducts_orderid, Integer related_orderproducts_productid) {
		OrderProduct related_orderproducts = orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid, -1, -1);

		Order order = orderDAO.findOrderByPrimaryKey(order_orderid, -1, -1);

		related_orderproducts.setOrder(null);
		order.getOrderProducts().remove(related_orderproducts);

		orderProductDAO.remove(related_orderproducts);
		orderProductDAO.flush();

		return order;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public void deleteOrder(Order order) {
		orderDAO.remove(order);
		orderDAO.flush();
	}

	/**
	 */
	@Transactional
	public Order findOrderByPrimaryKey(Integer orderid) {
		return orderDAO.findOrderByPrimaryKey(orderid);
	}

	/**
	 * Delete an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Order deleteOrderYourtaskuserByUserid(Integer order_orderid, Integer related_yourtaskuserbyuserid_userid) {
		Order order = orderDAO.findOrderByPrimaryKey(order_orderid, -1, -1);
		Yourtaskuser related_yourtaskuserbyuserid = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuserid_userid, -1, -1);

		order.setYourtaskuserByUserid(null);
		related_yourtaskuserbyuserid.getOrdersForUserid().remove(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_yourtaskuserbyuserid = yourtaskuserDAO.store(related_yourtaskuserbyuserid);
		yourtaskuserDAO.flush();

		yourtaskuserDAO.remove(related_yourtaskuserbyuserid);
		yourtaskuserDAO.flush();

		return order;
	}

	/**
	 * Load an existing Order entity
	 * 
	 */
	@Transactional
	public Set<Order> loadOrders() {
		return orderDAO.findAllOrders();
	}

	/**
	 * Return all Order entity
	 * 
	 */
	@Transactional
	public List<Order> findAllOrders(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Order>(orderDAO.findAllOrders(startResult, maxRows));
	}

	/**
	 * Save an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Order saveOrderYourtaskuserByUserid(Integer orderid, Yourtaskuser related_yourtaskuserbyuserid) {
		Order order = orderDAO.findOrderByPrimaryKey(orderid, -1, -1);
		Yourtaskuser existingyourtaskuserByUserid = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuserid.getUserid());

		// copy into the existing record to preserve existing relationships
		if (existingyourtaskuserByUserid != null) {
			existingyourtaskuserByUserid.setUserid(related_yourtaskuserbyuserid.getUserid());
			existingyourtaskuserByUserid.setUserdateofbirth(related_yourtaskuserbyuserid.getUserdateofbirth());
			existingyourtaskuserByUserid.setUserphonenumber(related_yourtaskuserbyuserid.getUserphonenumber());
			existingyourtaskuserByUserid.setUseremail(related_yourtaskuserbyuserid.getUseremail());
			existingyourtaskuserByUserid.setUserstreetnumber(related_yourtaskuserbyuserid.getUserstreetnumber());
			existingyourtaskuserByUserid.setUserzipcode(related_yourtaskuserbyuserid.getUserzipcode());
			existingyourtaskuserByUserid.setUsercity(related_yourtaskuserbyuserid.getUsercity());
			existingyourtaskuserByUserid.setUserusername(related_yourtaskuserbyuserid.getUserusername());
			existingyourtaskuserByUserid.setUserpassword(related_yourtaskuserbyuserid.getUserpassword());
			existingyourtaskuserByUserid.setUsertoken(related_yourtaskuserbyuserid.getUsertoken());
			existingyourtaskuserByUserid.setUserlastconnectiondate(related_yourtaskuserbyuserid.getUserlastconnectiondate());
			existingyourtaskuserByUserid.setUsertype(related_yourtaskuserbyuserid.getUsertype());
			existingyourtaskuserByUserid.setUseriban(related_yourtaskuserbyuserid.getUseriban());
			related_yourtaskuserbyuserid = existingyourtaskuserByUserid;
		}

		order.setYourtaskuserByUserid(related_yourtaskuserbyuserid);
		related_yourtaskuserbyuserid.getOrdersForUserid().add(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_yourtaskuserbyuserid = yourtaskuserDAO.store(related_yourtaskuserbyuserid);
		yourtaskuserDAO.flush();

		return order;
	}

	/**
	 * Return a count of all Order entity
	 * 
	 */
	@Transactional
	public Integer countOrders() {
		return ((Long) orderDAO.createQuerySingleResult("select count(o) from Order o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Order deleteOrderYourtaskuserByUseridsc(Integer order_orderid, Integer related_yourtaskuserbyuseridsc_userid) {
		Order order = orderDAO.findOrderByPrimaryKey(order_orderid, -1, -1);
		Yourtaskuser related_yourtaskuserbyuseridsc = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuserbyuseridsc_userid, -1, -1);

		order.setYourtaskuserByUseridsc(null);
		related_yourtaskuserbyuseridsc.getOrdersForUseridsc().remove(order);
		order = orderDAO.store(order);
		orderDAO.flush();

		related_yourtaskuserbyuseridsc = yourtaskuserDAO.store(related_yourtaskuserbyuseridsc);
		yourtaskuserDAO.flush();

		yourtaskuserDAO.remove(related_yourtaskuserbyuseridsc);
		yourtaskuserDAO.flush();

		return order;
	}
}
