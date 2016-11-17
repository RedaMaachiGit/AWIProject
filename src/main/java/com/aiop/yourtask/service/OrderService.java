
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */
public interface OrderService {

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Order saveOrderYourtaskuserByUseridsc(Integer orderid, Yourtaskuser related_yourtaskuserbyuseridsc);

	/**
	* Save an existing OrderProduct entity
	* 
	 */
	public Order saveOrderOrderProducts(Integer orderid_1, OrderProduct related_orderproducts);

	/**
	* Save an existing Order entity
	* 
	 */
	public void saveOrder(Order order);

	/**
	* Delete an existing OrderProduct entity
	* 
	 */
	public Order deleteOrderOrderProducts(Integer order_orderid, Integer related_orderproducts_orderid, Integer related_orderproducts_productid);

	/**
	* Delete an existing Order entity
	* 
	 */
	public void deleteOrder(Order order_1);

	/**
	 */
	public Order findOrderByPrimaryKey(Integer orderid_2);

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Order deleteOrderYourtaskuserByUserid(Integer order_orderid_1, Integer related_yourtaskuserbyuserid_userid);

	/**
	* Load an existing Order entity
	* 
	 */
	public Set<Order> loadOrders();

	/**
	* Return all Order entity
	* 
	 */
	public List<Order> findAllOrders(Integer startResult, Integer maxRows);

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Order saveOrderYourtaskuserByUserid(Integer orderid_3, Yourtaskuser related_yourtaskuserbyuserid);

	/**
	* Return a count of all Order entity
	* 
	 */
	public Integer countOrders();

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Order deleteOrderYourtaskuserByUseridsc(Integer order_orderid_2, Integer related_yourtaskuserbyuseridsc_userid);
}