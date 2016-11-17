
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
 * Unit test for the <code>ResourceController</code> controller.
 *
 * @see com.aiop.yourtask.web.ResourceController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class ResourceControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listResourceRoleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistResourceRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listResourceRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>resourceControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetresourceControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/resourceController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceController controller = (ResourceController) context.getBean("ResourceController");

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