/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.OrderProduct;
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

// TODO: Auto-generated Javadoc
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
public class OrderServiceTest {

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
	protected OrderService service;

	/**
	 * Instantiates a new OrderServiceTest.
	 *
	 */
	public OrderServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Yourtaskuser entity.
	 */
	@Test
	public void saveOrderYourtaskuserByUseridsc() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderYourtaskuserByUseridsc 
		Integer orderid = 0;
		Yourtaskuser related_yourtaskuserbyuseridsc = new com.aiop.yourtask.domain.Yourtaskuser();
		Order response = null;
		response = service.saveOrderYourtaskuserByUseridsc(orderid, related_yourtaskuserbyuseridsc);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderYourtaskuserByUseridsc
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderProduct entity.
	 */
	@Test
	public void saveOrderOrderProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderOrderProducts 
		Integer orderid_1 = 0;
		OrderProduct related_orderproducts = new com.aiop.yourtask.domain.OrderProduct();
		Order response = null;
		response = service.saveOrderOrderProducts(orderid_1, related_orderproducts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderOrderProducts
	}

	/**
	 * Operation Unit Test
	 * Save an existing Order entity.
	 */
	@Test
	public void saveOrder() {
		// TODO: JUnit - Populate test inputs for operation: saveOrder 
		Order order = new com.aiop.yourtask.domain.Order();
		service.saveOrder(order);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderProduct entity.
	 */
	@Test
	public void deleteOrderOrderProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderOrderProducts 
		Integer order_orderid = 0;
		Integer related_orderproducts_orderid = 0;
		Integer related_orderproducts_productid = 0;
		Order response = null;
		response = service.deleteOrderOrderProducts(order_orderid, related_orderproducts_orderid, related_orderproducts_productid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderOrderProducts
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Order entity.
	 */
	@Test
	public void deleteOrder() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrder 
		Order order_1 = new com.aiop.yourtask.domain.Order();
		service.deleteOrder(order_1);
	}

	/**
	 * Operation Unit Test.
	 */
	@Test
	public void findOrderByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderByPrimaryKey 
		Integer orderid_2 = 0;
		Order response = null;
		response = service.findOrderByPrimaryKey(orderid_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Yourtaskuser entity.
	 */
	@Test
	public void deleteOrderYourtaskuserByUserid() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderYourtaskuserByUserid 
		Integer order_orderid_1 = 0;
		Integer related_yourtaskuserbyuserid_userid = 0;
		Order response = null;
		response = service.deleteOrderYourtaskuserByUserid(order_orderid_1, related_yourtaskuserbyuserid_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderYourtaskuserByUserid
	}

	/**
	 * Operation Unit Test
	 * Load an existing Order entity.
	 */
	@Test
	public void loadOrders() {
		Set<Order> response = null;
		response = service.loadOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrders
	}

	/**
	 * Operation Unit Test
	 * Return all Order entity.
	 */
	@Test
	public void findAllOrders() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrders 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Order> response = null;
		response = service.findAllOrders(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrders
	}

	/**
	 * Operation Unit Test
	 * Save an existing Yourtaskuser entity.
	 */
	@Test
	public void saveOrderYourtaskuserByUserid() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderYourtaskuserByUserid 
		Integer orderid_3 = 0;
		Yourtaskuser related_yourtaskuserbyuserid = new com.aiop.yourtask.domain.Yourtaskuser();
		Order response = null;
		response = service.saveOrderYourtaskuserByUserid(orderid_3, related_yourtaskuserbyuserid);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderYourtaskuserByUserid
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Order entity.
	 */
	@Test
	public void countOrders() {
		Integer response = null;
		response = service.countOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Yourtaskuser entity.
	 */
	@Test
	public void deleteOrderYourtaskuserByUseridsc() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderYourtaskuserByUseridsc 
		Integer order_orderid_2 = 0;
		Integer related_yourtaskuserbyuseridsc_userid = 0;
		Order response = null;
		response = service.deleteOrderYourtaskuserByUseridsc(order_orderid_2, related_yourtaskuserbyuseridsc_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderYourtaskuserByUseridsc
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
	 * Sets Up the Request context.
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
