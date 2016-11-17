
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Task;
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
public class ActivityServiceTest {

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
	protected ActivityService service;

	/**
	 * Instantiates a new ActivityServiceTest.
	 *
	 */
	public ActivityServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Diary entity
	* 
	 */
	@Test
	public void saveActivityDiaries() {
		// TODO: JUnit - Populate test inputs for operation: saveActivityDiaries 
		Integer activityid = 0;
		Diary related_diaries = new com.aiop.yourtask.domain.Diary();
		Activity response = null;
		response = service.saveActivityDiaries(activityid, related_diaries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveActivityDiaries
	}

	/**
	 * Operation Unit Test
	* Delete an existing Activity entity
	* 
	 */
	@Test
	public void deleteActivity() {
		// TODO: JUnit - Populate test inputs for operation: deleteActivity 
		Activity activity = new com.aiop.yourtask.domain.Activity();
		service.deleteActivity(activity);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Comment entity
	* 
	 */
	@Test
	public void deleteActivityComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteActivityComments 
		Integer activity_activityid = 0;
		Integer related_comments_commentid = 0;
		Activity response = null;
		response = service.deleteActivityComments(activity_activityid, related_comments_commentid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteActivityComments
	}

	/**
	 * Operation Unit Test
	* Return all Activity entity
	* 
	 */
	@Test
	public void findAllActivitys() {
		// TODO: JUnit - Populate test inputs for operation: findAllActivitys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Activity> response = null;
		response = service.findAllActivitys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllActivitys
	}

	/**
	 * Operation Unit Test
	* Save an existing Comment entity
	* 
	 */
	@Test
	public void saveActivityComments() {
		// TODO: JUnit - Populate test inputs for operation: saveActivityComments 
		Integer activityid_1 = 0;
		Comment related_comments = new com.aiop.yourtask.domain.Comment();
		Activity response = null;
		response = service.saveActivityComments(activityid_1, related_comments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveActivityComments
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findActivityByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findActivityByPrimaryKey 
		Integer activityid_2 = 0;
		Activity response = null;
		response = service.findActivityByPrimaryKey(activityid_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findActivityByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Task entity
	* 
	 */
	@Test
	public void saveActivityTasks() {
		// TODO: JUnit - Populate test inputs for operation: saveActivityTasks 
		Integer activityid_3 = 0;
		Task related_tasks = new com.aiop.yourtask.domain.Task();
		Activity response = null;
		response = service.saveActivityTasks(activityid_3, related_tasks);
		// TODO: JUnit - Add assertions to test outputs of operation: saveActivityTasks
	}

	/**
	 * Operation Unit Test
	* Save an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void saveActivityYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: saveActivityYourtaskuser 
		Integer activityid_4 = 0;
		Yourtaskuser related_yourtaskuser = new com.aiop.yourtask.domain.Yourtaskuser();
		Activity response = null;
		response = service.saveActivityYourtaskuser(activityid_4, related_yourtaskuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveActivityYourtaskuser
	}

	/**
	 * Operation Unit Test
	* Save an existing Activity entity
	* 
	 */
	@Test
	public void saveActivity() {
		// TODO: JUnit - Populate test inputs for operation: saveActivity 
		Activity activity_1 = new com.aiop.yourtask.domain.Activity();
		service.saveActivity(activity_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Task entity
	* 
	 */
	@Test
	public void deleteActivityTasks() {
		// TODO: JUnit - Populate test inputs for operation: deleteActivityTasks 
		Integer activity_activityid_1 = 0;
		Integer related_tasks_taskid = 0;
		Activity response = null;
		response = service.deleteActivityTasks(activity_activityid_1, related_tasks_taskid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteActivityTasks
	}

	/**
	 * Operation Unit Test
	* Delete an existing Diary entity
	* 
	 */
	@Test
	public void deleteActivityDiaries() {
		// TODO: JUnit - Populate test inputs for operation: deleteActivityDiaries 
		Integer activity_activityid_2 = 0;
		Integer related_diaries_iddiary = 0;
		Activity response = null;
		response = service.deleteActivityDiaries(activity_activityid_2, related_diaries_iddiary);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteActivityDiaries
	}

	/**
	 * Operation Unit Test
	* Return a count of all Activity entity
	* 
	 */
	@Test
	public void countActivitys() {
		Integer response = null;
		response = service.countActivitys();
		// TODO: JUnit - Add assertions to test outputs of operation: countActivitys
	}

	/**
	 * Operation Unit Test
	* Load an existing Activity entity
	* 
	 */
	@Test
	public void loadActivitys() {
		Set<Activity> response = null;
		response = service.loadActivitys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadActivitys
	}

	/**
	 * Operation Unit Test
	* Delete an existing Yourtaskuser entity
	* 
	 */
	@Test
	public void deleteActivityYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: deleteActivityYourtaskuser 
		Integer activity_activityid_3 = 0;
		Integer related_yourtaskuser_userid = 0;
		Activity response = null;
		response = service.deleteActivityYourtaskuser(activity_activityid_3, related_yourtaskuser_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteActivityYourtaskuser
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
