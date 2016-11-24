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
 * Unit test for the <code>YourtaskuserRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.YourtaskuserRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class YourtaskuserRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridrole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridrole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridrole()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/role");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridrolerole_roleid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridrolerole_roleid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/role/{role_roleid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridrolerole_roleid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridrolerole_roleid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/role/{role_roleid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridsuinfos()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridsuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/suinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridsuinfos()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridsuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/suinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridsuinfos()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridsuinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/suinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridsuinfossuinfo_suinfoid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridsuinfossuinfo_suinfoid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/suinfos/{suinfo_suinfoid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridsuinfossuinfo_suinfoid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridsuinfossuinfo_suinfoid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/suinfos/{suinfo_suinfoid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridnotifications()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridnotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/notifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridnotifications()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridnotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/notifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridnotifications()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridnotifications() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/notifications");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridnotificationsnotification_notificationid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridnotificationsnotification_notificationid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/notifications/{notification_notificationid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridnotificationsnotification_notificationid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridnotificationsnotification_notificationid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/notifications/{notification_notificationid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridscinfos()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridscinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/scinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridscinfos()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridscinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/scinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridscinfos()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridscinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/scinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridscinfosscinfo_scinfoid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridscinfosscinfo_scinfoid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/scinfos/{scinfo_scinfoid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridscinfosscinfo_scinfoid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridscinfosscinfo_scinfoid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/scinfos/{scinfo_scinfoid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridsc()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridordersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridsc()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridordersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridsc()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridordersForUseridsc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridscorder_orderid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridordersForUseridscorder_orderid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc/{order_orderid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridscorder_orderid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridordersForUseridscorder_orderid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc/{order_orderid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridactivities()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridactivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/activities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridactivities()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridactivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/activities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridactivities()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridactivities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/activities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridactivitiesactivity_activityid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridactivitiesactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/activities/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridactivitiesactivity_activityid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridactivitiesactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/activities/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useriddiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useriddiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/diaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useriddiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useriddiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/diaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useriddiaries()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useriddiaries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/diaries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useriddiariesdiary_iddiary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useriddiariesdiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/diaries/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useriddiariesdiary_iddiary()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useriddiariesdiary_iddiary() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/diaries/{diary_iddiary}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridproducts()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridproducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/products");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridproducts()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridproducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/products");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridproducts()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridproducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/products");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridproductsproduct_productid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridproductsproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/products/{product_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridproductsproduct_productid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridproductsproduct_productid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/products/{product_productid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridcomments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridcomments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridcomments()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/comments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridcommentscomment_commentid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridcommentscomment_commentid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/comments/{comment_commentid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridcommentscomment_commentid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridcommentscomment_commentid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/comments/{comment_commentid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUserid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridordersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUserid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuseryourtaskuser_useridordersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUserid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuseryourtaskuser_useridordersForUserid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridorder_orderid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_useridordersForUseridorder_orderid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid/{order_orderid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_useridordersForUseridorder_orderid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_useridordersForUseridorder_orderid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid/{order_orderid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_userid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetYourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuser()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Yourtaskuseryourtaskuser_userid()</code>.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteYourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		YourtaskuserRestController controller = (YourtaskuserRestController) context.getBean("YourtaskuserRestController");

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