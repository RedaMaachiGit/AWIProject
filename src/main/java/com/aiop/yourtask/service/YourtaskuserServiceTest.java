
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Notification;
import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.Scinfo;
import com.aiop.yourtask.domain.Suinfo;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
@Transactional
public class YourtaskuserServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected YourtaskuserService service;

	/**
	 * Instantiates a new YourtaskuserServiceTest.
	 *
	 */
	public YourtaskuserServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Comment entity
	* 
	 */
	@Test
	public void saveYourtaskuserComments() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserComments 
		Integer userid = 0;
		Comment related_comments = new com.aiop.yourtask.domain.Comment();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserComments(userid, related_comments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserComments
	}

	/**
	 * Operation Unit Test
	* Delete an existing Role entity
	* 
	 */
	@Test
	public void deleteYourtaskuserRole() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserRole 
		Integer yourtaskuser_userid = 0;
		Integer related_role_roleid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserRole(yourtaskuser_userid, related_role_roleid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserRole
	}

	/**
	 * Operation Unit Test
	* Save an existing Order entity
	* 
	 */
	@Test
	public void saveYourtaskuserOrdersForUseridsc() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserOrdersForUseridsc 
		Integer userid_1 = 0;
		Order related_ordersforuseridsc = new com.aiop.yourtask.domain.Order();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserOrdersForUseridsc(userid_1, related_ordersforuseridsc);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserOrdersForUseridsc
	}

	/**
	 * Operation Unit Test
	* Delete an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void deleteYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuser 
		Yourtaskuser yourtaskuser = new com.aiop.yourtask.domain.Yourtaskuser();
		service.deleteYourtaskuser(yourtaskuser);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Suinfo entity
	* 
	 */
	@Test
	public void deleteYourtaskuserSuinfos() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserSuinfos 
		Integer yourtaskuser_userid_1 = 0;
		Integer related_suinfos_suinfoid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserSuinfos(yourtaskuser_userid_1, related_suinfos_suinfoid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserSuinfos
	}

	/**
	 * Operation Unit Test
	* Delete an existing Notification entity
	* 
	 */
	@Test
	public void deleteYourtaskuserNotifications() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserNotifications 
		Integer yourtaskuser_userid_2 = 0;
		Integer related_notifications_notificationid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserNotifications(yourtaskuser_userid_2, related_notifications_notificationid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserNotifications
	}

	/**
	 * Operation Unit Test
	* Save an existing Suinfo entity
	* 
	 */
	@Test
	public void saveYourtaskuserSuinfos() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserSuinfos 
		Integer userid_2 = 0;
		Suinfo related_suinfos = new com.aiop.yourtask.domain.Suinfo();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserSuinfos(userid_2, related_suinfos);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserSuinfos
	}

	/**
	 * Operation Unit Test
	* Return a count of all Yourtaskuser entity
	* 
	 */
	@Test
	public void countYourtaskusers() {
		Integer response = null;
		response = service.countYourtaskusers();
		// TODO: JUnit - Add assertions to test outputs of operation: countYourtaskusers
	}

	/**
	 * Operation Unit Test
	* Delete an existing Comment entity
	* 
	 */
	@Test
	public void deleteYourtaskuserComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserComments 
		Integer yourtaskuser_userid_3 = 0;
		Integer related_comments_commentid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserComments(yourtaskuser_userid_3, related_comments_commentid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserComments
	}

	/**
	 * Operation Unit Test
	* Delete an existing Scinfo entity
	* 
	 */
	@Test
	public void deleteYourtaskuserScinfos() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserScinfos 
		Integer yourtaskuser_userid_4 = 0;
		Integer related_scinfos_scinfoid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserScinfos(yourtaskuser_userid_4, related_scinfos_scinfoid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserScinfos
	}

	/**
	 * Operation Unit Test
	* Delete an existing Order entity
	* 
	 */
	@Test
	public void deleteYourtaskuserOrdersForUseridsc() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserOrdersForUseridsc 
		Integer yourtaskuser_userid_5 = 0;
		Integer related_ordersforuseridsc_orderid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserOrdersForUseridsc(yourtaskuser_userid_5, related_ordersforuseridsc_orderid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserOrdersForUseridsc
	}

	/**
	 * Operation Unit Test
	* Save an existing Scinfo entity
	* 
	 */
	@Test
	public void saveYourtaskuserScinfos() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserScinfos 
		Integer userid_3 = 0;
		Scinfo related_scinfos = new com.aiop.yourtask.domain.Scinfo();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserScinfos(userid_3, related_scinfos);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserScinfos
	}

	/**
	 * Operation Unit Test
	* Save an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void saveYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuser 
		Yourtaskuser yourtaskuser_1 = new com.aiop.yourtask.domain.Yourtaskuser();
		service.saveYourtaskuser(yourtaskuser_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Order entity
	* 
	 */
	@Test
	public void deleteYourtaskuserOrdersForUserid() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserOrdersForUserid 
		Integer yourtaskuser_userid_6 = 0;
		Integer related_ordersforuserid_orderid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserOrdersForUserid(yourtaskuser_userid_6, related_ordersforuserid_orderid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserOrdersForUserid
	}

	/**
	 * Operation Unit Test
	* Save an existing Product entity
	* 
	 */
	@Test
	public void saveYourtaskuserProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserProducts 
		Integer userid_4 = 0;
		Product related_products = new com.aiop.yourtask.domain.Product();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserProducts(userid_4, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserProducts
	}

	/**
	 * Operation Unit Test
	* Return all Yourtaskuser entity
	* 
	 */
	@Test
	public void findAllYourtaskusers() {
		// TODO: JUnit - Populate test inputs for operation: findAllYourtaskusers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Yourtaskuser> response = null;
		response = service.findAllYourtaskusers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllYourtaskusers
	}

	/**
	 * Operation Unit Test
	* Delete an existing Activity entity
	* 
	 */
	@Test
	public void deleteYourtaskuserActivities() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserActivities 
		Integer yourtaskuser_userid_7 = 0;
		Integer related_activities_activityid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserActivities(yourtaskuser_userid_7, related_activities_activityid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserActivities
	}

	/**
	 * Operation Unit Test
	* Save an existing Role entity
	* 
	 */
	@Test
	public void saveYourtaskuserRole() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserRole 
		Integer userid_5 = 0;
		Role related_role = new com.aiop.yourtask.domain.Role();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserRole(userid_5, related_role);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserRole
	}

	/**
	 * Operation Unit Test
	* Save an existing Diary entity
	* 
	 */
	@Test
	public void saveYourtaskuserDiaries() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserDiaries 
		Integer userid_6 = 0;
		Diary related_diaries = new com.aiop.yourtask.domain.Diary();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserDiaries(userid_6, related_diaries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserDiaries
	}

	/**
	 * Operation Unit Test
	* Load an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void loadYourtaskusers() {
		Set<Yourtaskuser> response = null;
		response = service.loadYourtaskusers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadYourtaskusers
	}

	/**
	 * Operation Unit Test
	* Save an existing Notification entity
	* 
	 */
	@Test
	public void saveYourtaskuserNotifications() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserNotifications 
		Integer userid_7 = 0;
		Notification related_notifications = new com.aiop.yourtask.domain.Notification();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserNotifications(userid_7, related_notifications);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserNotifications
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findYourtaskuserByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findYourtaskuserByPrimaryKey 
		Integer userid_8 = 0;
		Yourtaskuser response = null;
		response = service.findYourtaskuserByPrimaryKey(userid_8);
		// TODO: JUnit - Add assertions to test outputs of operation: findYourtaskuserByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Product entity
	* 
	 */
	@Test
	public void deleteYourtaskuserProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserProducts 
		Integer yourtaskuser_userid_8 = 0;
		Integer related_products_productid = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserProducts(yourtaskuser_userid_8, related_products_productid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserProducts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Diary entity
	* 
	 */
	@Test
	public void deleteYourtaskuserDiaries() {
		// TODO: JUnit - Populate test inputs for operation: deleteYourtaskuserDiaries 
		Integer yourtaskuser_userid_9 = 0;
		Integer related_diaries_iddiary = 0;
		Yourtaskuser response = null;
		response = service.deleteYourtaskuserDiaries(yourtaskuser_userid_9, related_diaries_iddiary);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteYourtaskuserDiaries
	}

	/**
	 * Operation Unit Test
	* Save an existing Order entity
	* 
	 */
	@Test
	public void saveYourtaskuserOrdersForUserid() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserOrdersForUserid 
		Integer userid_9 = 0;
		Order related_ordersforuserid = new com.aiop.yourtask.domain.Order();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserOrdersForUserid(userid_9, related_ordersforuserid);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserOrdersForUserid
	}

	/**
	 * Operation Unit Test
	* Save an existing Activity entity
	* 
	 */
	@Test
	public void saveYourtaskuserActivities() {
		// TODO: JUnit - Populate test inputs for operation: saveYourtaskuserActivities 
		Integer userid_10 = 0;
		Activity related_activities = new com.aiop.yourtask.domain.Activity();
		Yourtaskuser response = null;
		response = service.saveYourtaskuserActivities(userid_10, related_activities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveYourtaskuserActivities
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
