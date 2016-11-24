/*
 * 
 */

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

// TODO: Auto-generated Javadoc
/**
 * Unit test for the <code>RoleResourceController</code> controller.
 *
 * @see com.aiop.yourtask.web.RoleResourceController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class RoleResourceControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoleResourceResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoleResourceResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoleResourceResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoleResourceRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoleResourceRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoleResourceRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoleResource()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>roleresourceControllerbinaryaction()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetroleresourceControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/roleresourceController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceController controller = (RoleResourceController) context.getBean("RoleResourceController");

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