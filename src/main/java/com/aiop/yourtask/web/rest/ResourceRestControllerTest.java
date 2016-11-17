
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
 * Unit test for the <code>ResourceRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.ResourceRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class ResourceRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Resourceresource_resourceidroleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetResourceresource_resourceidroleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}/roleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resourceresource_resourceidroleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostResourceresource_resourceidroleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}/roleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resourceresource_resourceidroleResources()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutResourceresource_resourceidroleResources() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}/roleResources");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resourceresource_resourceidroleResourcesroleresource_roleidroleresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteResourceresource_resourceidroleResourcesroleresource_roleidroleresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resourceresource_resourceidroleResourcesroleresource_roleidroleresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetResourceresource_resourceidroleResourcesroleresource_roleidroleresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resourceresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetResourceresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resource()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostResource() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Resourceresource_resourceid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteResourceresource_resourceid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Resource/{resource_resourceid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ResourceRestController controller = (ResourceRestController) context.getBean("ResourceRestController");

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