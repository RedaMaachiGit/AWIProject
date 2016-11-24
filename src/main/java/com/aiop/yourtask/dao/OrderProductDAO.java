/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.OrderProduct;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage OrderProduct entities.
 * 
 */
public interface OrderProductDAO extends JpaDao<OrderProduct> {

	/**
	 * JPQL Query - findAllOrderProducts.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<OrderProduct> findAllOrderProducts() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderProducts.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<OrderProduct> findAllOrderProducts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderProductByPrimaryKey.
	 *
	 * @param orderid the orderid
	 * @param productid the productid
	 * @return the order product
	 * @throws DataAccessException the data access exception
	 */
	public OrderProduct findOrderProductByPrimaryKey(Integer orderid, Integer productid) throws DataAccessException;

	/**
	 * JPQL Query - findOrderProductByPrimaryKey.
	 *
	 * @param orderid the orderid
	 * @param productid the productid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the order product
	 * @throws DataAccessException the data access exception
	 */
	public OrderProduct findOrderProductByPrimaryKey(Integer orderid, Integer productid, int startResult, int maxRows) throws DataAccessException;

}