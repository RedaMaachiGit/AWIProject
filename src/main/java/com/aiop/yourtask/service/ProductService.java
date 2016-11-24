/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Product entities.
 */
public interface ProductService {

	/**
	 * Delete an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the product
	 */
	public Product deleteProductOrderProducts(Integer product_productid, Integer related_orderproducts_orderid, Integer related_orderproducts_productid);

	/**
	 * Save an existing Product entity.
	 *
	 * @param product the product
	 */
	public void saveProduct(Product product);

	/**
	 * Load an existing Product entity.
	 *
	 * @return the sets the
	 */
	public Set<Product> loadProducts();

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param productid the productid
	 * @param related_yourtaskuser the related yourtaskuser
	 * @return the product
	 */
	public Product saveProductYourtaskuser(Integer productid, Yourtaskuser related_yourtaskuser);

	/**
	 * Delete an existing Product entity.
	 *
	 * @param product_1 the product 1
	 */
	public void deleteProduct(Product product_1);

	/**
	 * Return all Product entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Product> findAllProducts(Integer startResult, Integer maxRows);
	
	/**
	 * Return all Product entity.
	 *
	 * @return the list
	 */
	public List<Product> findAllProducts();

	/**
	 * Return all Product entity of a certain entity.
	 *
	 * @param company_companyid the company companyid
	 * @return the list
	 */
	public List<Product> findAllCompanysProducts(Integer company_companyid);
	
	/**
	 * Save an existing OrderProduct entity.
	 *
	 * @param productid_1 the productid 1
	 * @param related_orderproducts the related orderproducts
	 * @return the product
	 */
	public Product saveProductOrderProducts(Integer productid_1, OrderProduct related_orderproducts);

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param product_productid_1 the product productid 1
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the product
	 */
	public Product deleteProductYourtaskuser(Integer product_productid_1, Integer related_yourtaskuser_userid);

	/**
	 * Find product by primary key.
	 *
	 * @param productid_2 the productid 2
	 * @return the product
	 */
	public Product findProductByPrimaryKey(Integer productid_2);

	/**
	 * Return a count of all Product entity.
	 *
	 * @return the integer
	 */
	public Integer countProducts();
}