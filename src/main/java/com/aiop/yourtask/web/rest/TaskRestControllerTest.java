/*
 * 
 */

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

// TODO: Auto-generated Javadoc
/**
 * Unit test for the <code>TaskRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.TaskRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class TaskRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Tasktask_taskidactivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTasktask_taskidactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tasktask_taskidactivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostTasktask_taskidactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tasktask_taskidactivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutTasktask_taskidactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tasktask_taskidactivityactivity_activityid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteTasktask_taskidactivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}/activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tasktask_taskidactivityactivity_activityid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTasktask_taskidactivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}/activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Task()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tasktask_taskid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTasktask_taskid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Task()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Task()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostTask() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tasktask_taskid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteTasktask_taskid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Task/{task_taskid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TaskRestController controller = (TaskRestController) context.getBean("TaskRestController");

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