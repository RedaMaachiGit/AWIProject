package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.OrderProductDAO;
import com.aiop.yourtask.dao.ProductDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Product entities
 * 
 */

@Controller("ProductController")

public class ProductController {

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
	 * Service injected by Spring that provides CRUD operations for Product entities
	 * 
	 */
	@Autowired
	private ProductService productService;

	/**
	 * Entry point to show all Product entities
	 * 
	 */
	public String indexProduct() {
		return "redirect:/indexProduct";
	}

	/**
	* Edit an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/editProductYourtaskuser")
	public ModelAndView editProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("product/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	* Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProductYourtaskuser")
	public ModelAndView confirmDeleteProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid));
		mav.addObject("product_productid", product_productid);
		mav.setViewName("product/yourtaskuser/deleteYourtaskuser.jsp");

		return mav;
	}

	/**
	* View an existing OrderProduct entity
	* 
	*/
	@RequestMapping("/selectProductOrderProducts")
	public ModelAndView selectProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer orderproducts_orderid, @RequestParam Integer orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(orderproducts_orderid, orderproducts_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("orderproduct", orderproduct);
		mav.setViewName("product/orderproducts/viewOrderProducts.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/productController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Register custom, context-specific property editors
	* 
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
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping("/newProductYourtaskuser")
	public ModelAndView newProductYourtaskuser(@RequestParam Integer product_productid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("product/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	* Select the child OrderProduct entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProductOrderProducts")
	public ModelAndView confirmDeleteProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer related_orderproducts_orderid, @RequestParam Integer related_orderproducts_productid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderproduct", orderProductDAO.findOrderProductByPrimaryKey(related_orderproducts_orderid, related_orderproducts_productid));
		mav.addObject("product_productid", product_productid);
		mav.setViewName("product/orderproducts/deleteOrderProducts.jsp");

		return mav;
	}

	/**
	* Show all Yourtaskuser entities by Product
	* 
	*/
	@RequestMapping("/listProductYourtaskuser")
	public ModelAndView listProductYourtaskuser(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/yourtaskuser/listYourtaskuser.jsp");

		return mav;
	}

	/**
	* Create a new OrderProduct entity
	* 
	*/
	@RequestMapping("/newProductOrderProducts")
	public ModelAndView newProductOrderProducts(@RequestParam Integer product_productid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("orderproduct", new OrderProduct());
		mav.addObject("newFlag", true);
		mav.setViewName("product/orderproducts/editOrderProducts.jsp");

		return mav;
	}

	/**
	* Save an existing Product entity
	* 
	*/
	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product) {
		productService.saveProduct(product);
		return "forward:/indexProduct";
	}

	/**
	* Select the Product entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProduct")
	public ModelAndView confirmDeleteProduct(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/deleteProduct.jsp");

		return mav;
	}

	/**
	* Save an existing OrderProduct entity
	* 
	*/
	@RequestMapping("/saveProductOrderProducts")
	public ModelAndView saveProductOrderProducts(@RequestParam Integer product_productid, @ModelAttribute OrderProduct orderproducts) {
		Product parent_product = productService.saveProductOrderProducts(product_productid, orderproducts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("product", parent_product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/saveProductYourtaskuser")
	public ModelAndView saveProductYourtaskuser(@RequestParam Integer product_productid, @ModelAttribute Yourtaskuser yourtaskuser) {
		Product parent_product = productService.saveProductYourtaskuser(product_productid, yourtaskuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("product", parent_product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Create a new Product entity
	* 
	*/
	@RequestMapping("/newProduct")
	public ModelAndView newProduct() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	* Show all Product entities
	* 
	*/
	@RequestMapping("/indexProduct")
	public ModelAndView listProducts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productService.loadProducts());

		mav.setViewName("product/listProducts.jsp");

		return mav;
	}

	/**
	* Delete an existing OrderProduct entity
	* 
	*/
	@RequestMapping("/deleteProductOrderProducts")
	public ModelAndView deleteProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer related_orderproducts_orderid, @RequestParam Integer related_orderproducts_productid) {
		ModelAndView mav = new ModelAndView();

		Product product = productService.deleteProductOrderProducts(product_productid, related_orderproducts_orderid, related_orderproducts_productid);

		mav.addObject("product_productid", product_productid);
		mav.addObject("product", product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Edit an existing OrderProduct entity
	* 
	*/
	@RequestMapping("/editProductOrderProducts")
	public ModelAndView editProductOrderProducts(@RequestParam Integer product_productid, @RequestParam Integer orderproducts_orderid, @RequestParam Integer orderproducts_productid) {
		OrderProduct orderproduct = orderProductDAO.findOrderProductByPrimaryKey(orderproducts_orderid, orderproducts_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("orderproduct", orderproduct);
		mav.setViewName("product/orderproducts/editOrderProducts.jsp");

		return mav;
	}

	/**
	* Edit an existing Product entity
	* 
	*/
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/deleteProductYourtaskuser")
	public ModelAndView deleteProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		Product product = productService.deleteProductYourtaskuser(product_productid, related_yourtaskuser_userid);

		mav.addObject("product_productid", product_productid);
		mav.addObject("product", product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Show all OrderProduct entities by Product
	* 
	*/
	@RequestMapping("/listProductOrderProducts")
	public ModelAndView listProductOrderProducts(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/orderproducts/listOrderProducts.jsp");

		return mav;
	}

	/**
	* Select an existing Product entity
	* 
	*/
	@RequestMapping("/selectProduct")
	public ModelAndView selectProduct(@RequestParam Integer productidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(productidKey));
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/selectProductYourtaskuser")
	public ModelAndView selectProductYourtaskuser(@RequestParam Integer product_productid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_productid", product_productid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("product/yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	* Delete an existing Product entity
	* 
	*/
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam Integer productidKey) {
		Product product = productDAO.findProductByPrimaryKey(productidKey);
		productService.deleteProduct(product);
		return "forward:/indexProduct";
	}
}