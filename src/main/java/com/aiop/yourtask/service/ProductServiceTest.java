
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.OrderProduct;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
@Transactional
public class ProductServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ProductService service;

	/**
	 * Instantiates a new ProductServiceTest.
	 *
	 */
	public ProductServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing OrderProduct entity
	* 
	 */
	@Test
	public void deleteProductOrderProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductOrderProducts 
		Integer product_productid = 0;
		Integer related_orderproducts_orderid = 0;
		Integer related_orderproducts_productid = 0;
		Product response = null;
		response = service.deleteProductOrderProducts(product_productid, related_orderproducts_orderid, related_orderproducts_productid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductOrderProducts
	}

	/**
	 * Operation Unit Test
	* Save an existing Product entity
	* 
	 */
	@Test
	public void saveProduct() {
		// TODO: JUnit - Populate test inputs for operation: saveProduct 
		Product product = new com.aiop.yourtask.domain.Product();
		service.saveProduct(product);
	}

	/**
	 * Operation Unit Test
	* Load an existing Product entity
	* 
	 */
	@Test
	public void loadProducts() {
		Set<Product> response = null;
		response = service.loadProducts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProducts
	}

	/**
	 * Operation Unit Test
	* Save an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void saveProductYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: saveProductYourtaskuser 
		Integer productid = 0;
		Yourtaskuser related_yourtaskuser = new com.aiop.yourtask.domain.Yourtaskuser();
		Product response = null;
		response = service.saveProductYourtaskuser(productid, related_yourtaskuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductYourtaskuser
	}

	/**
	 * Operation Unit Test
	* Delete an existing Product entity
	* 
	 */
	@Test
	public void deleteProduct() {
		// TODO: JUnit - Populate test inputs for operation: deleteProduct 
		Product product_1 = new com.aiop.yourtask.domain.Product();
		service.deleteProduct(product_1);
	}

	/**
	 * Operation Unit Test
	* Return all Product entity
	* 
	 */
	@Test
	public void findAllProducts() {
		// TODO: JUnit - Populate test inputs for operation: findAllProducts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Product> response = null;
		response = service.findAllProducts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProducts
	}

	/**
	 * Operation Unit Test
	* Save an existing OrderProduct entity
	* 
	 */
	@Test
	public void saveProductOrderProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProductOrderProducts 
		Integer productid_1 = 0;
		OrderProduct related_orderproducts = new com.aiop.yourtask.domain.OrderProduct();
		Product response = null;
		response = service.saveProductOrderProducts(productid_1, related_orderproducts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductOrderProducts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void deleteProductYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductYourtaskuser 
		Integer product_productid_1 = 0;
		Integer related_yourtaskuser_userid = 0;
		Product response = null;
		response = service.deleteProductYourtaskuser(product_productid_1, related_yourtaskuser_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductYourtaskuser
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductByPrimaryKey 
		Integer productid_2 = 0;
		Product response = null;
		response = service.findProductByPrimaryKey(productid_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all Product entity
	* 
	 */
	@Test
	public void countProducts() {
		Integer response = null;
		response = service.countProducts();
		// TODO: JUnit - Add assertions to test outputs of operation: countProducts
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
