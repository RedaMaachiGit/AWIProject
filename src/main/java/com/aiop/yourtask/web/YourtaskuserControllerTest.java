
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
 * Unit test for the <code>YourtaskuserController</code> controller.
 *
 * @see com.aiop.yourtask.web.YourtaskuserController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class YourtaskuserControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserSuinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserSuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserSuinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserNotifications()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserNotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserNotifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserScinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserScinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserScinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserOrdersForUseridsc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserOrdersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserOrdersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserActivities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserActivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserActivities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserDiaries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserDiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserDiaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserComments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserComments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserComments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listYourtaskuserOrdersForUserid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistYourtaskuserOrdersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listYourtaskuserOrdersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>yourtaskuserControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetyourtaskuserControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/yourtaskuserController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserController controller = (YourtaskuserController) context.getBean("YourtaskuserController");

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