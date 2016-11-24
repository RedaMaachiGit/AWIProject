/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Order entities.
 * 
 */
public interface OrderDAO extends JpaDao<Order> {

	/**
	 * JPQL Query - findOrderByOrderdateAfter.
	 *
	 * @param orderdate the orderdate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderdateAfter(java.util.Calendar orderdate) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdateAfter.
	 *
	 * @param orderdate the orderdate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderdateAfter(Calendar orderdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrdershippingcost.
	 *
	 * @param ordershippingcost the ordershippingcost
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrdershippingcost(java.math.BigDecimal ordershippingcost) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrdershippingcost.
	 *
	 * @param ordershippingcost the ordershippingcost
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrdershippingcost(BigDecimal ordershippingcost, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdateBefore.
	 *
	 * @param orderdate_1 the orderdate 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderdateBefore(java.util.Calendar orderdate_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdateBefore.
	 *
	 * @param orderdate_1 the orderdate 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderdateBefore(Calendar orderdate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey.
	 *
	 * @param orderid the orderid
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */
	public Order findOrderByPrimaryKey(Integer orderid) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByPrimaryKey.
	 *
	 * @param orderid the orderid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */
	public Order findOrderByPrimaryKey(Integer orderid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findAllOrders() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrders.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderprice.
	 *
	 * @param orderprice the orderprice
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderprice(java.math.BigDecimal orderprice) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderprice.
	 *
	 * @param orderprice the orderprice
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderprice(BigDecimal orderprice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderid.
	 *
	 * @param orderid_1 the orderid 1
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */
	public Order findOrderByOrderid(Integer orderid_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderid.
	 *
	 * @param orderid_1 the orderid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */
	public Order findOrderByOrderid(Integer orderid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstate.
	 *
	 * @param orderstate the orderstate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderstate(String orderstate) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstate.
	 *
	 * @param orderstate the orderstate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderstate(String orderstate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstateContaining.
	 *
	 * @param orderstate_1 the orderstate 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderstateContaining(String orderstate_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderstateContaining.
	 *
	 * @param orderstate_1 the orderstate 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderstateContaining(String orderstate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdate.
	 *
	 * @param orderdate_2 the orderdate 2
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderdate(java.util.Calendar orderdate_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrderByOrderdate.
	 *
	 * @param orderdate_2 the orderdate 2
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Order> findOrderByOrderdate(Calendar orderdate_2, int startResult, int maxRows) throws DataAccessException;
	
	public List findOrdersByYourtaskuser(Yourtaskuser user) throws DataAccessException;

}