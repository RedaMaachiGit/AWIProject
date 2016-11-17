
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
 * Unit test for the <code>TaskController</code> controller.
 *
 * @see com.aiop.yourtask.web.TaskController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class TaskControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTaskActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTaskActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTaskActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTask()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTask");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>taskControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettaskControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/taskController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskController controller = (TaskController) context.getBean("TaskController");

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