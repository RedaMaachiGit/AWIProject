
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.OrderProduct;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage OrderProduct entities.
 * 
 */
public interface OrderProductDAO extends JpaDao<OrderProduct> {

	/**
	 * JPQL Query - findAllOrderProducts
	 *
	 */
	public Set<OrderProduct> findAllOrderProducts() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderProducts
	 *
	 */
	public Set<OrderProduct> findAllOrderProducts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderProductByPrimaryKey
	 *
	 */
	public OrderProduct findOrderProductByPrimaryKey(Integer orderid, Integer productid) throws DataAccessException;

	/**
	 * JPQL Query - findOrderProductByPrimaryKey
	 *
	 */
	public OrderProduct findOrderProductByPrimaryKey(Integer orderid, Integer productid, int startResult, int maxRows) throws DataAccessException;

}