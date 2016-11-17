
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;
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
public class RoleServiceTest {

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
	protected RoleService service;

	/**
	 * Instantiates a new RoleServiceTest.
	 *
	 */
	public RoleServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void deleteRoleYourtaskusers() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoleYourtaskusers 
		Integer role_roleid = 0;
		Integer related_yourtaskusers_userid = 0;
		Role response = null;
		response = service.deleteRoleYourtaskusers(role_roleid, related_yourtaskusers_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoleYourtaskusers
	}

	/**
	 * Operation Unit Test
	* Delete an existing Role entity
	* 
	 */
	@Test
	public void deleteRole() {
		// TODO: JUnit - Populate test inputs for operation: deleteRole 
		Role role = new com.aiop.yourtask.domain.Role();
		service.deleteRole(role);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRoleByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRoleByPrimaryKey 
		Integer roleid = 0;
		Role response = null;
		response = service.findRoleByPrimaryKey(roleid);
		// TODO: JUnit - Add assertions to test outputs of operation: findRoleByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all Role entity
	* 
	 */
	@Test
	public void countRoles() {
		Integer response = null;
		response = service.countRoles();
		// TODO: JUnit - Add assertions to test outputs of operation: countRoles
	}

	/**
	 * Operation Unit Test
	* Save an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void saveRoleYourtaskusers() {
		// TODO: JUnit - Populate test inputs for operation: saveRoleYourtaskusers 
		Integer roleid_1 = 0;
		Yourtaskuser related_yourtaskusers = new com.aiop.yourtask.domain.Yourtaskuser();
		Role response = null;
		response = service.saveRoleYourtaskusers(roleid_1, related_yourtaskusers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoleYourtaskusers
	}

	/**
	 * Operation Unit Test
	* Load an existing Role entity
	* 
	 */
	@Test
	public void loadRoles() {
		Set<Role> response = null;
		response = service.loadRoles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRoles
	}

	/**
	 * Operation Unit Test
	* Save an existing RoleResource entity
	* 
	 */
	@Test
	public void saveRoleRoleResources() {
		// TODO: JUnit - Populate test inputs for operation: saveRoleRoleResources 
		Integer roleid_2 = 0;
		RoleResource related_roleresources = new com.aiop.yourtask.domain.RoleResource();
		Role response = null;
		response = service.saveRoleRoleResources(roleid_2, related_roleresources);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRoleRoleResources
	}

	/**
	 * Operation Unit Test
	* Return all Role entity
	* 
	 */
	@Test
	public void findAllRoles() {
		// TODO: JUnit - Populate test inputs for operation: findAllRoles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Role> response = null;
		response = service.findAllRoles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRoles
	}

	/**
	 * Operation Unit Test
	* Save an existing Role entity
	* 
	 */
	@Test
	public void saveRole() {
		// TODO: JUnit - Populate test inputs for operation: saveRole 
		Role role_1 = new com.aiop.yourtask.domain.Role();
		service.saveRole(role_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RoleResource entity
	* 
	 */
	@Test
	public void deleteRoleRoleResources() {
		// TODO: JUnit - Populate test inputs for operation: deleteRoleRoleResources 
		Integer role_roleid_1 = 0;
		Integer related_roleresources_roleid = 0;
		Integer related_roleresources_resourceid = 0;
		Role response = null;
		response = service.deleteRoleRoleResources(role_roleid_1, related_roleresources_roleid, related_roleresources_resourceid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRoleRoleResources
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
