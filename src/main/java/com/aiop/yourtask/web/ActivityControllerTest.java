/*
 * 
 */

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

// TODO: Auto-generated Javadoc
/**
 * Unit test for the <code>ActivityController</code> controller.
 *
 * @see com.aiop.yourtask.web.ActivityController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class ActivityControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listActivityYourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistActivityYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listActivityYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listActivityDiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistActivityDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listActivityDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listActivityComments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistActivityComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listActivityComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listActivityTasks()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistActivityTasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listActivityTasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteActivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>activityControllerbinaryaction()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetactivityControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/activityController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

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