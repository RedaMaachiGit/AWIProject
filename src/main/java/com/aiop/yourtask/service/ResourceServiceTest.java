
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.RoleResource;

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
public class ResourceServiceTest {

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
	protected ResourceService service;

	/**
	 * Instantiates a new ResourceServiceTest.
	 *
	 */
	public ResourceServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findResourceByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findResourceByPrimaryKey 
		Integer resourceid = 0;
		Resource response = null;
		response = service.findResourceByPrimaryKey(resourceid);
		// TODO: JUnit - Add assertions to test outputs of operation: findResourceByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all Resource entity
	* 
	 */
	@Test
	public void findAllResources() {
		// TODO: JUnit - Populate test inputs for operation: findAllResources 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Resource> response = null;
		response = service.findAllResources(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllResources
	}

	/**
	 * Operation Unit Test
	* Save an existing RoleResource entity
	* 
	 */
	@Test
	public void saveResourceRoleResources() {
		// TODO: JUnit - Populate test inputs for operation: saveResourceRoleResources 
		Integer resourceid_1 = 0;
		RoleResource related_roleresources = new com.aiop.yourtask.domain.RoleResource();
		Resource response = null;
		response = service.saveResourceRoleResources(resourceid_1, related_roleresources);
		// TODO: JUnit - Add assertions to test outputs of operation: saveResourceRoleResources
	}

	/**
	 * Operation Unit Test
	* Save an existing Resource entity
	* 
	 */
	@Test
	public void saveResource() {
		// TODO: JUnit - Populate test inputs for operation: saveResource 
		Resource resource = new com.aiop.yourtask.domain.Resource();
		service.saveResource(resource);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Resource entity
	* 
	 */
	@Test
	public void countResources() {
		Integer response = null;
		response = service.countResources();
		// TODO: JUnit - Add assertions to test outputs of operation: countResources
	}

	/**
	 * Operation Unit Test
	* Load an existing Resource entity
	* 
	 */
	@Test
	public void loadResources() {
		Set<Resource> response = null;
		response = service.loadResources();
		// TODO: JUnit - Add assertions to test outputs of operation: loadResources
	}

	/**
	 * Operation Unit Test
	* Delete an existing Resource entity
	* 
	 */
	@Test
	public void deleteResource() {
		// TODO: JUnit - Populate test inputs for operation: deleteResource 
		Resource resource_1 = new com.aiop.yourtask.domain.Resource();
		service.deleteResource(resource_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RoleResource entity
	* 
	 */
	@Test
	public void deleteResourceRoleResources() {
		// TODO: JUnit - Populate test inputs for operation: deleteResourceRoleResources 
		Integer resource_resourceid = 0;
		Integer related_roleresources_roleid = 0;
		Integer related_roleresources_resourceid = 0;
		Resource response = null;
		response = service.deleteResourceRoleResources(resource_resourceid, related_roleresources_roleid, related_roleresources_resourceid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteResourceRoleResources
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
