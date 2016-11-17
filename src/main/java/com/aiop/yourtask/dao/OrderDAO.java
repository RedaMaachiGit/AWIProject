
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Order;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Order entities.
 * 
 */
public interface OrderDAO extends JpaDao<Order> {

	/**
	 * JPQL Query - findOrderByOrderdateAfter
	 *
	 */
	public Set<Order> findOrderByOrderdateAfter(java.util.Calendar orderdate) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdateAfter
	 *
	 */
	public Set<Order> findOrderByOrderdateAfter(Calendar orderdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrdershippingcost
	 *
	 */
	public Set<Order> findOrderByOrdershippingcost(java.math.BigDecimal ordershippingcost) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrdershippingcost
	 *
	 */
	public Set<Order> findOrderByOrdershippingcost(BigDecimal ordershippingcost, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdateBefore
	 *
	 */
	public Set<Order> findOrderByOrderdateBefore(java.util.Calendar orderdate_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdateBefore
	 *
	 */
	public Set<Order> findOrderByOrderdateBefore(Calendar orderdate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(Integer orderid) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey
	 *
	 */
	public Order findOrderByPrimaryKey(Integer orderid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders
	 *
	 */
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderprice
	 *
	 */
	public Set<Order> findOrderByOrderprice(java.math.BigDecimal orderprice) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderprice
	 *
	 */
	public Set<Order> findOrderByOrderprice(BigDecimal orderprice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderid
	 *
	 */
	public Order findOrderByOrderid(Integer orderid_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderid
	 *
	 */
	public Order findOrderByOrderid(Integer orderid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstate
	 *
	 */
	public Set<Order> findOrderByOrderstate(String orderstate) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstate
	 *
	 */
	public Set<Order> findOrderByOrderstate(String orderstate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstateContaining
	 *
	 */
	public Set<Order> findOrderByOrderstateContaining(String orderstate_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstateContaining
	 *
	 */
	public Set<Order> findOrderByOrderstateContaining(String orderstate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdate
	 *
	 */
	public Set<Order> findOrderByOrderdate(java.util.Calendar orderdate_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdate
	 *
	 */
	public Set<Order> findOrderByOrderdate(Calendar orderdate_2, int startResult, int maxRows) throws DataAccessException;

}