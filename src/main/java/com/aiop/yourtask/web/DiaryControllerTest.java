
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
 * Unit test for the <code>DiaryController</code> controller.
 *
 * @see com.aiop.yourtask.web.DiaryController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class DiaryControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDiaryActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDiaryActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDiaryActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDiaryYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDiaryYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDiaryYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDiaryDiaryentries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDiaryDiaryentries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDiaryDiaryentries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDiaryGoals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDiaryGoals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDiaryGoals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiary()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiary");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>diaryControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdiaryControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/diaryController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiaryController controller = (DiaryController) context.getBean("DiaryController");

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