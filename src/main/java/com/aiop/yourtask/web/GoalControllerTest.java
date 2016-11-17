
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
 * Unit test for the <code>GoalController</code> controller.
 *
 * @see com.aiop.yourtask.web.GoalController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class GoalControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listGoalDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistGoalDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listGoalDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGoal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGoal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>goalControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetgoalControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/goalController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalController controller = (GoalController) context.getBean("GoalController");

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