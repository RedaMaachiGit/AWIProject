/*
 * 
 */
package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.ProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Products;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.ProductService;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// TODO: Auto-generated Javadoc
/**
 * Spring Rest controller that handles CRUD requests for Product entities.
 */

@Controller("ProductRestController")

public class ProductRestController {

	/** DAO injected by Spring that manages OrderProduct entities. */
	@Autowired
	private OrderProductDAO orderProductDAO;

	/** DAO injected by Spring that manages Product entities. */
	@Autowired
	private ProductDAO productDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Product entities. */
	@Autowired
	private ProductService productService;

	/**
	 * Save an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param orderproducts the orderproducts
	 * @return the order product
	 */
	@RequestMapping(value = "/Product/{product_productid}/orderProducts", method = RequestMethod.PUT)
	@ResponseBody
	public OrderProduct saveProductOrderProducts(@PathVariable Integer product_productid, @RequestBody OrderProduct orderproducts) {
		productService.saveProductOrderProducts(product_productid, orderproducts);
		return orderProductDAO.findOrderProductByPrimaryKey(orderproducts.getOrderid(), orderproducts.getProductid());
	}

	/**
	 * Delete an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 */
	@RequestMapping(value = "/Product/{product_productid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductOrderProducts(@PathVariable Integer product_productid, @PathVariable Integer related_orderproducts_orderid, @PathVariable Integer related_orderproducts_productid) {
		productService.deleteProductOrderProducts(product_productid, related_orderproducts_orderid, related_orderproducts_productid);
	}

	/**
	 * View an existing OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param related_orderproducts_orderid the related orderproducts orderid
	 * @param related_orderproducts_productid the related orderproducts productid
	 * @return the order product
	 */
	@RequestMapping(value = "/Product/{product_productid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}", method = RequestMethod.GET)
	@ResponseBody
	public OrderProduct loadProductOrderProducts(@PathVariable Integer product_productid, @PathVariable Integer related_orderproducts_orderid, @PathVariable Integer related_orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid, -1, -1);

		return orderproduct;
	}

	/**
	 * Show all OrderProduct entities by Product.
	 *
	 * @param product_productid the product productid
	 * @return the product order products
	 */
	@RequestMapping(value = "/Product/{product_productid}/orderProducts", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderProduct> getProductOrderProducts(@PathVariable Integer product_productid) {
		return new java.util.ArrayList<OrderProduct>(productDAO.findProductByPrimaryKey(product_productid).getOrderProducts());
	}

	/**
	 * Get Yourtaskuser entity by Product.
	 *
	 * @param product_productid the product productid
	 * @return the product yourtaskuser
	 */
	@RequestMapping(value = "/Product/{product_productid}/yourtaskuser", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser getProductYourtaskuser(@PathVariable Integer product_productid) {
		return productDAO.findProductByPrimaryKey(product_productid).getYourtaskuser();
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the yourtaskuser
	 */
	@RequestMapping(value = "/Product/{product_productid}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadProductYourtaskuser(@PathVariable Integer product_productid, @PathVariable Integer related_yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	 * Delete an existing Product entity.
	 *
	 * @param product_productid the product productid
	 */
	@RequestMapping(value = "/Product/{product_productid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable Integer product_productid) {
		Product product = productDAO.findProductByPrimaryKey(product_productid);
		productService.deleteProduct(product);
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param yourtaskuser the yourtaskuser
	 * @return the yourtaskuser
	 */
	@RequestMapping(value = "/Product/{product_productid}/yourtaskuser", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveProductYourtaskuser(@PathVariable Integer product_productid, @RequestBody Yourtaskuser yourtaskuser) {
		productService.saveProductYourtaskuser(product_productid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	 * Select an existing Product entity.
	 *
	 * @param product_productid the product productid
	 * @return the product
	 */
	@RequestMapping(value = "/Product/{product_productid}", method = RequestMethod.GET)
	@ResponseBody
	public Product loadProduct(@PathVariable Integer product_productid) {
		return productDAO.findProductByPrimaryKey(product_productid);
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param yourtaskuser the yourtaskuser
	 * @return the yourtaskuser
	 */
	@RequestMapping(value = "/Product/{product_productid}/yourtaskuser", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newProductYourtaskuser(@PathVariable Integer product_productid, @RequestBody Yourtaskuser yourtaskuser) {
		productService.saveProductYourtaskuser(product_productid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	 * Save an existing Product entity.
	 *
	 * @param product the product
	 * @return the product
	 */
	@RequestMapping(value = "/Product", method = RequestMethod.PUT)
	@ResponseBody
	public Product saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return productDAO.findProductByPrimaryKey(product.getProductid());
	}

	/**
	 * Create a new Product entity.
	 *
	 * @param product the product
	 * @return the product
	 */
	@RequestMapping(value = "/Product", method = RequestMethod.POST)
	@ResponseBody
	public Product newProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return productDAO.findProductByPrimaryKey(product.getProductid());
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param product_productid the product productid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 */
	@RequestMapping(value = "/Product/{product_productid}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductYourtaskuser(@PathVariable Integer product_productid, @PathVariable Integer related_yourtaskuser_userid) {
		productService.deleteProductYourtaskuser(product_productid, related_yourtaskuser_userid);
	}

	/**
	 * Register custom, context-specific property editors.
	 *
	 * @param binder the binder
	 * @param request the request
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Create a new OrderProduct entity.
	 *
	 * @param product_productid the product productid
	 * @param orderproduct the orderproduct
	 */
	@RequestMapping(value = "/Product/{product_productid}/orderProducts", method = RequestMethod.POST)
	@ResponseBody
	//public OrderProduct newProductOrderProducts(@PathVariable Integer product_productid, @RequestBody OrderProduct orderproduct) {
	public void newProductOrderProducts(@PathVariable Integer product_productid, @RequestBody OrderProduct orderproduct) {
		productService.saveProductOrderProducts(product_productid, orderproduct);
		System.out.println("Create a new OrderProduct Entity");
		//return orderProductDAO.findOrderProductByPrimaryKey(orderproduct.getOrderid(), orderproduct.getProductid());
	}
//
//	/**
//	* Show all Product entities
//	* 
//	*/
//	@RequestMapping(value = "/Product", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Product> listProducts() {
//		return new java.util.ArrayList<Product>(productService.loadProducts());
//	}
//	
	/**
 * Show all Product entities.
 *
 * @return the products
 */
	@RequestMapping(value = "/Product", method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public EntityList<Product> getProducts() {
		List<Product> listeProducts = productService.findAllProducts();
		EntityList<Product> listOfProducts = new EntityList<Product>(listeProducts);
	    return listOfProducts;   
	}
	
	/**
	 * Show all Product entities of a certain company.
	 *
	 * @param company_companyid the company companyid
	 * @return the companys products
	 */
	// Path must be Product (without s)
	@RequestMapping(value = "/Products/{company_companyid}", method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public EntityList<Product> getCompanysProducts(@PathVariable Integer company_companyid) {
		List<Product> listeProducts = productService.findAllCompanysProducts(company_companyid);
		EntityList<Product> listOfProducts = new EntityList<Product>(listeProducts);
	    return listOfProducts;
	}

//  for(Product produit: listeProducts){
//	System.out.println(produit.toString());
//	products.add(produit);
//}	
//	public Object[] listProducts() {
//	Products products = new Products();
//		//ProductService productService = new ProductService();
//		List<Product> listeProducts = productService.findAllProducts(0,1);
//		Set<Product> fooList= new LinkedHashSet<Product>();
//        for(Product produit: listeProducts){
//        	System.out.println(produit.toString());
//		    fooList.add(produit);
//		}
//        System.out.println(fooList.toString());
//        //RestResponseList books=new RestResponseList();
//        //books.setList(fooList);
//		return fooList.toArray();
//	}
}