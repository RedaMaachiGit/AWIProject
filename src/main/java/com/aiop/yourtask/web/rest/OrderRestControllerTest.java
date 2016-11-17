
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

/**
 * Unit test for the <code>OrderRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.OrderRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class OrderRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderidyourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderorder_orderidyourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderorder_orderidyourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridscyourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_orderidyourtaskuserByUseridscyourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUseridsc/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridscyourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderidyourtaskuserByUseridscyourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUseridsc/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderidyourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderorder_orderidyourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderorder_orderidyourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridyourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_orderidyourtaskuserByUseridyourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUserid/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidyourtaskuserByUseridyourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderidyourtaskuserByUseridyourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/yourtaskuserByUserid/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidorderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderidorderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/orderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidorderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderorder_orderidorderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/orderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidorderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderorder_orderidorderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/orderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidorderProductsorderproduct_orderidorderproduct_productid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_orderidorderProductsorderproduct_orderidorderproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderidorderProductsorderproduct_orderidorderproduct_productid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderidorderProductsorderproduct_orderidorderproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}/orderProducts/{orderproduct_orderid}/{orderproduct_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Order()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderorder_orderid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Order()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Order()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Orderorder_orderid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderorder_orderid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Order/{order_orderid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRestController controller = (OrderRestController) context.getBean("OrderRestController");

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