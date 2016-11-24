/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Order entities.
 */
public interface OrderService {

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param orderid the orderid
	 * @param related_yourtaskuserbyuseridsc the related yourtaskuserbyuseridsc
	 * @return the order
	 */
	public Order saveOrderYourtaskuserByUseridsc(Integer orderid, Yourtaskuser related_yourtaskuserbyuseridsc);

	/**
	 * Save an existing OrderProduct entity.
	 *
	 * @param orderid_1 the orderid 1
	 * @param related_orderproducts the related orderproducts
	 * @return the order
	 */
	public Order saveOrderOrderProducts(Integer orderid_1, OrderProduct related_orderproducts);

	/**
	 * Save an existing Order entity.
	 *
	 * @param order the order
	 */
	public void saveOrder(Order order);

	/**
	 * Delete an existing OrderProduct entity.
	 *
	 * @param order_orderid the order orderid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the order
	 */
	public Order deleteOrderOrderProducts(Integer order_orderid, Integer related_orderproducts_orderid, Integer related_orderproducts_productid);

	/**
	 * Delete an existing Order entity.
	 *
	 * @param order_1 the order 1
	 */
	public void deleteOrder(Order order_1);

	/**
	 * Find order by primary key.
	 *
	 * @param orderid_2 the orderid 2
	 * @return the order
	 */
	public Order findOrderByPrimaryKey(Integer orderid_2);

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param order_orderid_1 the order orderid 1
	 * @param related_yourtaskuserbyuserid_userid the related yourtaskuserbyuserid userid
	 * @return the order
	 */
	public Order deleteOrderYourtaskuserByUserid(Integer order_orderid_1, Integer related_yourtaskuserbyuserid_userid);

	/**
	 * Load an existing Order entity.
	 *
	 * @return the sets the
	 */
	public Set<Order> loadOrders();

	/**
	 * Return all Order entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Order> findAllOrders(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param orderid_3 the orderid 3
	 * @param related_yourtaskuserbyuserid the related yourtaskuserbyuserid
	 * @return the order
	 */
	public Order saveOrderYourtaskuserByUserid(Integer orderid_3, Yourtaskuser related_yourtaskuserbyuserid);

	/**
	 * Return a count of all Order entity.
	 *
	 * @return the integer
	 */
	public Integer countOrders();

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param order_orderid_2 the order orderid 2
	 * @param related_yourtaskuserbyuseridsc_userid the related yourtaskuserbyuseridsc userid
	 * @return the order
	 */
	public Order deleteOrderYourtaskuserByUseridsc(Integer order_orderid_2, Integer related_yourtaskuserbyuseridsc_userid);
}