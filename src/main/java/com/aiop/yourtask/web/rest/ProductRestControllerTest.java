/*
 * 
 */

package com.aiop.yourtask.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

// TODO: Auto-generated Javadoc
/**
 * Unit test for the <code>ProductRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.ProductRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class ProductRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Productproduct_productidyourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_productidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidyourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductproduct_productidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidyourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductproduct_productidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidyourtaskuseryourtaskuser_userid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductproduct_productidyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidyourtaskuseryourtaskuser_userid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_productidyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidorderProducts()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_productidorderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/orderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidorderProducts()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductproduct_productidorderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/orderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidorderProducts()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductproduct_productidorderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/orderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidorderProductsorderproduct_orderidorderproduct_productid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductproduct_productidorderProductsorderproduct_orderidorderproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productidorderProductsorderproduct_orderidorderproduct_productid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_productidorderProductsorderproduct_orderidorderproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Product()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Product()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Product()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_productid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 * @param context the new context
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Returns a mock HttpServletRequest object.
	 *
	 * @return the mock http servlet request
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 * @return the mock http servlet response
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}