
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */
public interface ProductService {

	/**
	* Delete an existing OrderProduct entity
	* 
	 */
	public Product deleteProductOrderProducts(Integer product_productid, Integer related_orderproducts_orderid, Integer related_orderproducts_productid);

	/**
	* Save an existing Product entity
	* 
	 */
	public void saveProduct(Product product);

	/**
	* Load an existing Product entity
	* 
	 */
	public Set<Product> loadProducts();

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Product saveProductYourtaskuser(Integer productid, Yourtaskuser related_yourtaskuser);

	/**
	* Delete an existing Product entity
	* 
	 */
	public void deleteProduct(Product product_1);

	/**
	* Return all Product entity
	* 
	 */
	public List<Product> findAllProducts(Integer startResult, Integer maxRows);

	/**
	* Save an existing OrderProduct entity
	* 
	 */
	public Product saveProductOrderProducts(Integer productid_1, OrderProduct related_orderproducts);

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Product deleteProductYourtaskuser(Integer product_productid_1, Integer related_yourtaskuser_userid);

	/**
	 */
	public Product findProductByPrimaryKey(Integer productid_2);

	/**
	* Return a count of all Product entity
	* 
	 */
	public Integer countProducts();
}