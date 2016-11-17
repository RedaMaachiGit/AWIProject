
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.Role;
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
public class RoleResourceServiceTest {

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
	protected RoleResourceService service;

	/**
	 * Instantiates a new RoleResourceServiceTest.
	 *
	 */
	public RoleResourceServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all RoleResource entity
	* 
	 */
	@Test
	public void findAllRoleResources() {
		// TODO: JUnit - Populate test inputs for operation: findAllRoleResources 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RoleResource> response = null;
		response = service.findAllRoleResources(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRoleResources
	}

	/**
	 * Operation Unit Test
	* Return a count of all RoleResource entity
	* 
	 */
	@Test
	public void countRoleResources() {
		Integer response = null;
		response = service.countRoleResources();
		// TODO: JUnit - Add assertions to test outputs of operation: countRoleResources
	}

	/**
	 * Operation Unit Test
	* Load an existing RoleResource entity
	* 
	 */
	@Test
	public void loadRoleResources() {
		Set<RoleResource> response = null;
		response = service.loadRoleResources();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRoleResources
	}

	/**
	 * Operation Unit Test
	* Save an existing RoleResource entity
	* 
	 */
	@Test
	public void saveRoleResource() {
		// TODO: JUnit - Populate test inputs for operation: saveRoleResource 
		RoleResource roleresource = new com.aiop.yourtask.domain.RoleResource();
		service.saveRoleResource(roleresource);
	}

	/**
	 * Operation Unit Test
	* Save an existing Resource entity
	* 
	 */
	@Test
	public void saveRoleResourceResource() {
		// TODO: JUnit - Populate test inputs for operation: saveRoleResourceResource 
		Integer roleid = 0;
		Integer resourceid = 0;
		Resource related_resource = new com.aiop.yourtask.domain.Resource();
		RoleResource response = null;
		response = service.saveRoleResourceResource(roleid, resourceid, related_resource);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoleResourceResource
	}

	/**
	 * Operation Unit Test
	* Save an existing Role entity
	* 
	 */
	@Test
	public void saveRoleResourceRole() {
		// TODO: JUnit - Populate test inputs for operation: saveRoleResourceRole 
		Integer roleid_1 = 0;
		Integer resourceid_1 = 0;
		Role related_role = new com.aiop.yourtask.domain.Role();
		RoleResource response = null;
		response = service.saveRoleResourceRole(roleid_1, resourceid_1, related_role);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoleResourceRole
	}

	/**
	 * Operation Unit Test
	* Delete an existing Resource entity
	* 
	 */
	@Test
	public void deleteRoleResourceResource() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoleResourceResource 
		Integer roleresource_roleid = 0;
		Integer roleresource_resourceid = 0;
		Integer related_resource_resourceid = 0;
		RoleResource response = null;
		response = service.deleteRoleResourceResource(roleresource_roleid, roleresource_resourceid, related_resource_resourceid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoleResourceResource
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRoleResourceByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRoleResourceByPrimaryKey 
		Integer roleid_2 = 0;
		Integer resourceid_2 = 0;
		RoleResource response = null;
		response = service.findRoleResourceByPrimaryKey(roleid_2, resourceid_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findRoleResourceByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Role entity
	* 
	 */
	@Test
	public void deleteRoleResourceRole() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoleResourceRole 
		Integer roleresource_roleid_1 = 0;
		Integer roleresource_resourceid_1 = 0;
		Integer related_role_roleid = 0;
		RoleResource response = null;
		response = service.deleteRoleResourceRole(roleresource_roleid_1, roleresource_resourceid_1, related_role_roleid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoleResourceRole
	}

	/**
	 * Operation Unit Test
	* Delete an existing RoleResource entity
	* 
	 */
	@Test
	public void deleteRoleResource() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoleResource 
		RoleResource roleresource_1 = new com.aiop.yourtask.domain.RoleResource();
		service.deleteRoleResource(roleresource_1);
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
