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
 * Unit test for the <code>RoleController</code> controller.
 *
 * @see com.aiop.yourtask.web.RoleController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class RoleControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoleYourtaskusers()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoleYourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoleYourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRoleRoleResources()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRoleRoleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRoleRoleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>roleControllerbinaryaction()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetroleControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/roleController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleController controller = (RoleController) context.getBean("RoleController");

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