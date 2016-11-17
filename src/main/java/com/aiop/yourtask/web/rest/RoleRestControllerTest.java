
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
 * Unit test for the <code>RoleRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.RoleRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class RoleRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Rolerole_roleidyourtaskusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRolerole_roleidyourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/yourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidyourtaskusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRolerole_roleidyourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/yourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidyourtaskusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRolerole_roleidyourtaskusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/yourtaskusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidyourtaskusersyourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRolerole_roleidyourtaskusersyourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/yourtaskusers/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidyourtaskusersyourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRolerole_roleidyourtaskusersyourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/yourtaskusers/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidroleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRolerole_roleidroleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/roleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidroleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRolerole_roleidroleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/roleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidroleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRolerole_roleidroleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/roleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidroleResourcesroleresource_roleidroleresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRolerole_roleidroleResourcesroleresource_roleidroleresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleidroleResourcesroleresource_roleidroleresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRolerole_roleidroleResourcesroleresource_roleidroleresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Role()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRolerole_roleid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Role()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Role()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Rolerole_roleid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRolerole_roleid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Role/{role_roleid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RoleRestController controller = (RoleRestController) context.getBean("RoleRestController");

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