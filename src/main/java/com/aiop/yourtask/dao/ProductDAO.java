/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Product;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Product entities.
 * 
 */
public interface ProductDAO extends JpaDao<Product> {

	/**
	 * JPQL Query - findProductByPrimaryKey.
	 *
	 * @param productid the productid
	 * @return the product
	 * @throws DataAccessException the data access exception
	 */
	public Product findProductByPrimaryKey(Integer productid) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPrimaryKey.
	 *
	 * @param productid the productid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the product
	 * @throws DataAccessException the data access exception
	 */
	public Product findProductByPrimaryKey(Integer productid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescriptionContaining.
	 *
	 * @param productdescription the productdescription
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductdescriptionContaining(String productdescription) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescriptionContaining.
	 *
	 * @param productdescription the productdescription
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductdescriptionContaining(String productdescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimage.
	 *
	 * @param productimage the productimage
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductimage(String productimage) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimage.
	 *
	 * @param productimage the productimage
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductimage(String productimage, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescription.
	 *
	 * @param productdescription_1 the productdescription 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductdescription(String productdescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductdescription.
	 *
	 * @param productdescription_1 the productdescription 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductdescription(String productdescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductname.
	 *
	 * @param productname the productname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductname(String productname) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductname.
	 *
	 * @param productname the productname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductname(String productname, int startResult, int maxRows) throws DataAccessException;


	/**
	 * JPQL Query - findAllProducts for a certain company.
	 *
	 * @param company_companyid the company companyid
	 * @return the collection<? extends product>
	 * @throws DataAccessException the data access exception
	 */
	public Collection<? extends Product> findProductByCompany(Integer company_companyid) throws DataAccessException ;

	/**
	 * JPQL Query - findAllProducts for a certain company.
	 *
	 * @param company_companyid the company companyid
	 * @param startResult the start result
	 * @return the collection<? extends product>
	 * @throws DataAccessException the data access exception
	 */
	public Collection<? extends Product> findProductByCompany(Integer company_companyid, int startResult) throws DataAccessException ;

	/**
	 * JPQL Query - findAllProducts for a certain company.
	 *
	 * @param company_companyid the company companyid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the collection<? extends product>
	 * @throws DataAccessException the data access exception
	 */
	public Collection<? extends Product> findProductByCompany(Integer company_companyid, int startResult, int maxRows) throws DataAccessException ;

	/**
	 * JPQL Query - findAllProducts.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findAllProducts() throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductprice.
	 *
	 * @param productprice the productprice
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductprice(java.math.BigDecimal productprice) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductprice.
	 *
	 * @param productprice the productprice
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductprice(BigDecimal productprice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductavailablequantity.
	 *
	 * @param productavailablequantity the productavailablequantity
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductavailablequantity(Integer productavailablequantity) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductavailablequantity.
	 *
	 * @param productavailablequantity the productavailablequantity
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductavailablequantity(Integer productavailablequantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductid.
	 *
	 * @param productid_1 the productid 1
	 * @return the product
	 * @throws DataAccessException the data access exception
	 */
	public Product findProductByProductid(Integer productid_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductid.
	 *
	 * @param productid_1 the productid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the product
	 * @throws DataAccessException the data access exception
	 */
	public Product findProductByProductid(Integer productid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimageContaining.
	 *
	 * @param productimage_1 the productimage 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductimageContaining(String productimage_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductimageContaining.
	 *
	 * @param productimage_1 the productimage 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductimageContaining(String productimage_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductnameContaining.
	 *
	 * @param productname_1 the productname 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductnameContaining(String productname_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByProductnameContaining.
	 *
	 * @param productname_1 the productname 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Product> findProductByProductnameContaining(String productname_1, int startResult, int maxRows) throws DataAccessException;


}