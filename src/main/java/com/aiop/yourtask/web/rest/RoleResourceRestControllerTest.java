
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
 * Unit test for the <code>RoleResourceRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.RoleResourceRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class RoleResourceRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidresource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoleResourceroleresource_roleidroleresource_resourceidresource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidresource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoleResourceroleresource_roleidroleresource_resourceidresource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidresource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoleResourceroleresource_roleidroleresource_resourceidresource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidresourceresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoleResourceroleresource_roleidroleresource_resourceidresourceresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource/{resource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidresourceresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoleResourceroleresource_roleidroleresource_resourceidresourceresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource/{resource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoleResourceroleresource_roleidroleresource_resourceidrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoleResourceroleresource_roleidroleresource_resourceidrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoleResourceroleresource_roleidroleresource_resourceidrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidrolerole_roleid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoleResourceroleresource_roleidroleresource_resourceidrolerole_roleid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role/{role_roleid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceidrolerole_roleid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoleResourceroleresource_roleidroleresource_resourceidrolerole_roleid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role/{role_roleid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRoleResourceroleresource_roleidroleresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRoleResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RoleResourceroleresource_roleidroleresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRoleResourceroleresource_roleidroleresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RoleResource/{roleresource_roleid}/{roleresource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleResourceRestController controller = (RoleResourceRestController) context.getBean("RoleResourceRestController");

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