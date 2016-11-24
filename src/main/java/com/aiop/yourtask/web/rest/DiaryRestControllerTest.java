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
 * Unit test for the <code>DiaryRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.DiaryRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class DiaryRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Diarydiary_iddiaryactivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiaryactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryactivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDiarydiary_iddiaryactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryactivity()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDiarydiary_iddiaryactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryactivityactivity_activityid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDiarydiary_iddiaryactivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryactivityactivity_activityid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiaryactivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryyourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiaryyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryyourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDiarydiary_iddiaryyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryyourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDiarydiary_iddiaryyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryyourtaskuseryourtaskuser_userid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDiarydiary_iddiaryyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiaryyourtaskuseryourtaskuser_userid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiaryyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarydiaryentries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiarydiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/diaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarydiaryentries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDiarydiary_iddiarydiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/diaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarydiaryentries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDiarydiary_iddiarydiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/diaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarydiaryentriesdiaryentry_diaryentryid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDiarydiary_iddiarydiaryentriesdiaryentry_diaryentryid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/diaryentries/{diaryentry_diaryentryid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarydiaryentriesdiaryentry_diaryentryid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiarydiaryentriesdiaryentry_diaryentryid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/diaryentries/{diaryentry_diaryentryid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarygoals()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiarygoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/goals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarygoals()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDiarydiary_iddiarygoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/goals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarygoals()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDiarydiary_iddiarygoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/goals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarygoalsgoal_goalid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDiarydiary_iddiarygoalsgoal_goalid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/goals/{goal_goalid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiarygoalsgoal_goalid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiarygoalsgoal_goalid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}/goals/{goal_goalid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetDiarydiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Diarydiary_iddiary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteDiarydiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Diary/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryRestController controller = (DiaryRestController) context.getBean("DiaryRestController");

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