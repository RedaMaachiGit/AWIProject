
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
 * Unit test for the <code>OrderController</code> controller.
 *
 * @see com.aiop.yourtask.web.OrderController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class OrderControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderYourtaskuserByUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderYourtaskuserByUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderYourtaskuserByUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderYourtaskuserByUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderYourtaskuserByUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderYourtaskuserByUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderOrderProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderOrderProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderOrderProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

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