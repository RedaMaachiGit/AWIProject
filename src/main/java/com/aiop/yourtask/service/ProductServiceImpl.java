package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.ProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */

@Service("ProductService")

@Transactional
public class ProductServiceImpl implements ProductService {

	/**
	 * DAO injected by Spring that manages OrderProduct entities
	 * 
	 */
	@Autowired
	private OrderProductDAO orderProductDAO;

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Instantiates a new ProductServiceImpl.
	 *
	 */
	public ProductServiceImpl() {
	}

	/**
	 * Delete an existing OrderProduct entity
	 * 
	 */
	@Transactional
	public Product deleteProductOrderProducts(Integer product_productid, Integer related_orderproducts_orderid, Integer related_orderproducts_productid) {
		OrderProduct related_orderproducts = orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid, -1, -1);

		Product product = productDAO.findProductByPrimaryKey(product_productid, -1, -1);

		related_orderproducts.setProduct(null);
		product.getOrderProducts().remove(related_orderproducts);

		orderProductDAO.remove(related_orderproducts);
		orderProductDAO.flush();

		return product;
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public void saveProduct(Product product) {
		Product existingProduct = productDAO.findProductByPrimaryKey(product.getProductid());

		if (existingProduct != null) {
			if (existingProduct != product) {
				existingProduct.setProductid(product.getProductid());
				existingProduct.setProductname(product.getProductname());
				existingProduct.setProductdescription(product.getProductdescription());
				existingProduct.setProductimage(product.getProductimage());
				existingProduct.setProductprice(product.getProductprice());
				existingProduct.setProductavailablequantity(product.getProductavailablequantity());
			}
			product = productDAO.store(existingProduct);
		} else {
			product = productDAO.store(product);
		}
		productDAO.flush();
	}

	/**
	 * Load an existing Product entity
	 * 
	 */
	@Transactional
	public Set<Product> loadProducts() {
		return productDAO.findAllProducts();
	}

	/**
	 * Save an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Product saveProductYourtaskuser(Integer productid, Yourtaskuser related_yourtaskuser) {
		Product product = productDAO.findProductByPrimaryKey(productid, -1, -1);
		Yourtaskuser existingyourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser.getUserid());

		// copy into the existing record to preserve existing relationships
		if (existingyourtaskuser != null) {
			existingyourtaskuser.setUserid(related_yourtaskuser.getUserid());
			existingyourtaskuser.setUserdateofbirth(related_yourtaskuser.getUserdateofbirth());
			existingyourtaskuser.setUserphonenumber(related_yourtaskuser.getUserphonenumber());
			existingyourtaskuser.setUseremail(related_yourtaskuser.getUseremail());
			existingyourtaskuser.setUserstreetnumber(related_yourtaskuser.getUserstreetnumber());
			existingyourtaskuser.setUserzipcode(related_yourtaskuser.getUserzipcode());
			existingyourtaskuser.setUsercity(related_yourtaskuser.getUsercity());
			existingyourtaskuser.setUserusername(related_yourtaskuser.getUserusername());
			existingyourtaskuser.setUserpassword(related_yourtaskuser.getUserpassword());
			existingyourtaskuser.setUsertoken(related_yourtaskuser.getUsertoken());
			existingyourtaskuser.setUserlastconnectiondate(related_yourtaskuser.getUserlastconnectiondate());
			existingyourtaskuser.setUsertype(related_yourtaskuser.getUsertype());
			existingyourtaskuser.setUseriban(related_yourtaskuser.getUseriban());
			related_yourtaskuser = existingyourtaskuser;
		}

		product.setYourtaskuser(related_yourtaskuser);
		related_yourtaskuser.getProducts().add(product);
		product = productDAO.store(product);
		productDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return product;
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public void deleteProduct(Product product) {
		productDAO.remove(product);
		productDAO.flush();
	}

	/**
	 * Return all Product entity
	 * 
	 */
	@Transactional
	public List<Product> findAllProducts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Product>(productDAO.findAllProducts(startResult, maxRows));
	}

	/**
	 * Save an existing OrderProduct entity
	 * 
	 */
	@Transactional
	public Product saveProductOrderProducts(Integer productid, OrderProduct related_orderproducts) {
		Product product = productDAO.findProductByPrimaryKey(productid, -1, -1);
		OrderProduct existingorderProducts = orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts.getOrderid(), related_orderproducts.getProductid());

		// copy into the existing record to preserve existing relationships
		if (existingorderProducts != null) {
			existingorderProducts.setOrderid(related_orderproducts.getOrderid());
			existingorderProducts.setProductid(related_orderproducts.getProductid());
			existingorderProducts.setQuantity(related_orderproducts.getQuantity());
			related_orderproducts = existingorderProducts;
		}

		related_orderproducts.setProduct(product);
		product.getOrderProducts().add(related_orderproducts);
		related_orderproducts = orderProductDAO.store(related_orderproducts);
		orderProductDAO.flush();

		product = productDAO.store(product);
		productDAO.flush();

		return product;
	}

	/**
	 * Delete an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Product deleteProductYourtaskuser(Integer product_productid, Integer related_yourtaskuser_userid) {
		Product product = productDAO.findProductByPrimaryKey(product_productid, -1, -1);
		Yourtaskuser related_yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		product.setYourtaskuser(null);
		related_yourtaskuser.getProducts().remove(product);
		product = productDAO.store(product);
		productDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		yourtaskuserDAO.remove(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return product;
	}

	/**
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer productid) {
		return productDAO.findProductByPrimaryKey(productid);
	}

	/**
	 * Return a count of all Product entity
	 * 
	 */
	@Transactional
	public Integer countProducts() {
		return ((Long) productDAO.createQuerySingleResult("select count(o) from Product o").getSingleResult()).intValue();
	}
}
