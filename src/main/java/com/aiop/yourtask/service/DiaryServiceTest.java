/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Diaryentry;
import com.aiop.yourtask.domain.Goal;
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

// TODO: Auto-generated Javadoc
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
public class DiaryServiceTest {

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
	protected DiaryService service;

	/**
	 * Instantiates a new DiaryServiceTest.
	 *
	 */
	public DiaryServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Activity entity.
	 */
	@Test
	public void saveDiaryActivity() {
		// TODO: JUnit - Populate test inputs for operation: saveDiaryActivity 
		Integer iddiary = 0;
		Activity related_activity = new com.aiop.yourtask.domain.Activity();
		Diary response = null;
		response = service.saveDiaryActivity(iddiary, related_activity);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDiaryActivity
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Diary entity.
	 */
	@Test
	public void deleteDiary() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiary 
		Diary diary = new com.aiop.yourtask.domain.Diary();
		service.deleteDiary(diary);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Diary entity.
	 */
	@Test
	public void saveDiary() {
		// TODO: JUnit - Populate test inputs for operation: saveDiary 
		Diary diary_1 = new com.aiop.yourtask.domain.Diary();
		service.saveDiary(diary_1);
	}

	/**
	 * Operation Unit Test.
	 */
	@Test
	public void findDiaryByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDiaryByPrimaryKey 
		Integer iddiary_1 = 0;
		Diary response = null;
		response = service.findDiaryByPrimaryKey(iddiary_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findDiaryByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Diary entity.
	 */
	@Test
	public void loadDiarys() {
		Set<Diary> response = null;
		response = service.loadDiarys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDiarys
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Diaryentry entity.
	 */
	@Test
	public void deleteDiaryDiaryentries() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiaryDiaryentries 
		Integer diary_iddiary = 0;
		Integer related_diaryentries_diaryentryid = 0;
		Diary response = null;
		response = service.deleteDiaryDiaryentries(diary_iddiary, related_diaryentries_diaryentryid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDiaryDiaryentries
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Goal entity.
	 */
	@Test
	public void deleteDiaryGoals() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiaryGoals 
		Integer diary_iddiary_1 = 0;
		Integer related_goals_goalid = 0;
		Diary response = null;
		response = service.deleteDiaryGoals(diary_iddiary_1, related_goals_goalid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDiaryGoals
	}

	/**
	 * Operation Unit Test
	 * Return all Diary entity.
	 */
	@Test
	public void findAllDiarys() {
		// TODO: JUnit - Populate test inputs for operation: findAllDiarys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Diary> response = null;
		response = service.findAllDiarys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDiarys
	}

	/**
	 * Operation Unit Test
	 * Save an existing Diaryentry entity.
	 */
	@Test
	public void saveDiaryDiaryentries() {
		// TODO: JUnit - Populate test inputs for operation: saveDiaryDiaryentries 
		Integer iddiary_2 = 0;
		Diaryentry related_diaryentries = new com.aiop.yourtask.domain.Diaryentry();
		Diary response = null;
		response = service.saveDiaryDiaryentries(iddiary_2, related_diaryentries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDiaryDiaryentries
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Diary entity.
	 */
	@Test
	public void countDiarys() {
		Integer response = null;
		response = service.countDiarys();
		// TODO: JUnit - Add assertions to test outputs of operation: countDiarys
	}

	/**
	 * Operation Unit Test
	 * Save an existing Goal entity.
	 */
	@Test
	public void saveDiaryGoals() {
		// TODO: JUnit - Populate test inputs for operation: saveDiaryGoals 
		Integer iddiary_3 = 0;
		Goal related_goals = new com.aiop.yourtask.domain.Goal();
		Diary response = null;
		response = service.saveDiaryGoals(iddiary_3, related_goals);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDiaryGoals
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Yourtaskuser entity.
	 */
	@Test
	public void deleteDiaryYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiaryYourtaskuser 
		Integer diary_iddiary_2 = 0;
		Integer related_yourtaskuser_userid = 0;
		Diary response = null;
		response = service.deleteDiaryYourtaskuser(diary_iddiary_2, related_yourtaskuser_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDiaryYourtaskuser
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Activity entity.
	 */
	@Test
	public void deleteDiaryActivity() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiaryActivity 
		Integer diary_iddiary_3 = 0;
		Integer related_activity_activityid = 0;
		Diary response = null;
		response = service.deleteDiaryActivity(diary_iddiary_3, related_activity_activityid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDiaryActivity
	}

	/**
	 * Operation Unit Test
	 * Save an existing Yourtaskuser entity.
	 */
	@Test
	public void saveDiaryYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: saveDiaryYourtaskuser 
		Integer iddiary_4 = 0;
		Yourtaskuser related_yourtaskuser = new com.aiop.yourtask.domain.Yourtaskuser();
		Diary response = null;
		response = service.saveDiaryYourtaskuser(iddiary_4, related_yourtaskuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDiaryYourtaskuser
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
	 * Sets Up the Request context.
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
