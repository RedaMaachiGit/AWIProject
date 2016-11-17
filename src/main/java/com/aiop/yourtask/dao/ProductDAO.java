
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Product;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Product entities.
 * 
 */
public interface ProductDAO extends JpaDao<Product> {

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	public Product findProductByPrimaryKey(Integer productid) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	public Product findProductByPrimaryKey(Integer productid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescriptionContaining
	 *
	 */
	public Set<Product> findProductByProductdescriptionContaining(String productdescription) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescriptionContaining
	 *
	 */
	public Set<Product> findProductByProductdescriptionContaining(String productdescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimage
	 *
	 */
	public Set<Product> findProductByProductimage(String productimage) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimage
	 *
	 */
	public Set<Product> findProductByProductimage(String productimage, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescription
	 *
	 */
	public Set<Product> findProductByProductdescription(String productdescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescription
	 *
	 */
	public Set<Product> findProductByProductdescription(String productdescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductname
	 *
	 */
	public Set<Product> findProductByProductname(String productname) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductname
	 *
	 */
	public Set<Product> findProductByProductname(String productname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	public Set<Product> findAllProducts() throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductprice
	 *
	 */
	public Set<Product> findProductByProductprice(java.math.BigDecimal productprice) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductprice
	 *
	 */
	public Set<Product> findProductByProductprice(BigDecimal productprice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductavailablequantity
	 *
	 */
	public Set<Product> findProductByProductavailablequantity(Integer productavailablequantity) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductavailablequantity
	 *
	 */
	public Set<Product> findProductByProductavailablequantity(Integer productavailablequantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductid
	 *
	 */
	public Product findProductByProductid(Integer productid_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductid
	 *
	 */
	public Product findProductByProductid(Integer productid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimageContaining
	 *
	 */
	public Set<Product> findProductByProductimageContaining(String productimage_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimageContaining
	 *
	 */
	public Set<Product> findProductByProductimageContaining(String productimage_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductnameContaining
	 *
	 */
	public Set<Product> findProductByProductnameContaining(String productname_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductnameContaining
	 *
	 */
	public Set<Product> findProductByProductnameContaining(String productname_1, int startResult, int maxRows) throws DataAccessException;

}