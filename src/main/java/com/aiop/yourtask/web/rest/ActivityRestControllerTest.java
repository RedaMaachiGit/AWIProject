
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
 * Unit test for the <code>ActivityRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.ActivityRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class ActivityRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Activityactivity_activityidyourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidyourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostActivityactivity_activityidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidyourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutActivityactivity_activityidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidyourtaskuseryourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteActivityactivity_activityidyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidyourtaskuseryourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityidyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityiddiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityiddiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/diaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityiddiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostActivityactivity_activityiddiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/diaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityiddiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutActivityactivity_activityiddiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/diaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityiddiariesdiary_iddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteActivityactivity_activityiddiariesdiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/diaries/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityiddiariesdiary_iddiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityiddiariesdiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/diaries/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityidcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostActivityactivity_activityidcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutActivityactivity_activityidcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidcommentscomment_commentid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteActivityactivity_activityidcommentscomment_commentid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/comments/{comment_commentid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidcommentscomment_commentid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityidcommentscomment_commentid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/comments/{comment_commentid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidtasks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityidtasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/tasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidtasks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostActivityactivity_activityidtasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/tasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidtasks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutActivityactivity_activityidtasks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/tasks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidtaskstask_taskid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteActivityactivity_activityidtaskstask_taskid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/tasks/{task_taskid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityidtaskstask_taskid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityidtaskstask_taskid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}/tasks/{task_taskid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_activityid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteActivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

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