
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Task;

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
public class TaskServiceTest {

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
	protected TaskService service;

	/**
	 * Instantiates a new TaskServiceTest.
	 *
	 */
	public TaskServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Task entity
	* 
	 */
	@Test
	public void saveTask() {
		// TODO: JUnit - Populate test inputs for operation: saveTask 
		Task task = new com.aiop.yourtask.domain.Task();
		service.saveTask(task);
	}

	/**
	 * Operation Unit Test
	* Save an existing Activity entity
	* 
	 */
	@Test
	public void saveTaskActivity() {
		// TODO: JUnit - Populate test inputs for operation: saveTaskActivity 
		Integer taskid = 0;
		Activity related_activity = new com.aiop.yourtask.domain.Activity();
		Task response = null;
		response = service.saveTaskActivity(taskid, related_activity);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTaskActivity
	}

	/**
	 * Operation Unit Test
	* Delete an existing Activity entity
	* 
	 */
	@Test
	public void deleteTaskActivity() {
		// TODO: JUnit - Populate test inputs for operation: deleteTaskActivity 
		Integer task_taskid = 0;
		Integer related_activity_activityid = 0;
		Task response = null;
		response = service.deleteTaskActivity(task_taskid, related_activity_activityid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTaskActivity
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTaskByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTaskByPrimaryKey 
		Integer taskid_1 = 0;
		Task response = null;
		response = service.findTaskByPrimaryKey(taskid_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findTaskByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all Task entity
	* 
	 */
	@Test
	public void findAllTasks() {
		// TODO: JUnit - Populate test inputs for operation: findAllTasks 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Task> response = null;
		response = service.findAllTasks(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTasks
	}

	/**
	 * Operation Unit Test
	* Delete an existing Task entity
	* 
	 */
	@Test
	public void deleteTask() {
		// TODO: JUnit - Populate test inputs for operation: deleteTask 
		Task task_1 = new com.aiop.yourtask.domain.Task();
		service.deleteTask(task_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all Task entity
	* 
	 */
	@Test
	public void countTasks() {
		Integer response = null;
		response = service.countTasks();
		// TODO: JUnit - Add assertions to test outputs of operation: countTasks
	}

	/**
	 * Operation Unit Test
	* Load an existing Task entity
	* 
	 */
	@Test
	public void loadTasks() {
		Set<Task> response = null;
		response = service.loadTasks();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTasks
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
