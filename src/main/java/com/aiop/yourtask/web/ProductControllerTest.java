
package com.aiop.yourtask.web;

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

/**
 * Unit test for the <code>ProductController</code> controller.
 *
 * @see com.aiop.yourtask.web.ProductController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class ProductControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
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
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}