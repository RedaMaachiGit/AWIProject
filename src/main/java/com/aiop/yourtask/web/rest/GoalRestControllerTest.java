
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
 * Unit test for the <code>GoalRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.GoalRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class GoalRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Goalgoal_goaliddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGoalgoal_goaliddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}/diary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goalgoal_goaliddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostGoalgoal_goaliddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}/diary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goalgoal_goaliddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutGoalgoal_goaliddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}/diary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goalgoal_goaliddiarydiary_iddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteGoalgoal_goaliddiarydiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}/diary/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goalgoal_goaliddiarydiary_iddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGoalgoal_goaliddiarydiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}/diary/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goalgoal_goalid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetGoalgoal_goalid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goal()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostGoal() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Goalgoal_goalid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteGoalgoal_goalid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Goal/{goal_goalid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GoalRestController controller = (GoalRestController) context.getBean("GoalRestController");

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