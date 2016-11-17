
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Goal;

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
public class GoalServiceTest {

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
	protected GoalService service;

	/**
	 * Instantiates a new GoalServiceTest.
	 *
	 */
	public GoalServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing Goal entity
	* 
	 */
	@Test
	public void loadGoals() {
		Set<Goal> response = null;
		response = service.loadGoals();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGoals
	}

	/**
	 * Operation Unit Test
	* Save an existing Goal entity
	* 
	 */
	@Test
	public void saveGoal() {
		// TODO: JUnit - Populate test inputs for operation: saveGoal 
		Goal goal = new com.aiop.yourtask.domain.Goal();
		service.saveGoal(goal);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Goal entity
	* 
	 */
	@Test
	public void deleteGoal() {
		// TODO: JUnit - Populate test inputs for operation: deleteGoal 
		Goal goal_1 = new com.aiop.yourtask.domain.Goal();
		service.deleteGoal(goal_1);
	}

	/**
	 * Operation Unit Test
	* Save an existing Diary entity
	* 
	 */
	@Test
	public void saveGoalDiary() {
		// TODO: JUnit - Populate test inputs for operation: saveGoalDiary 
		Integer goalid = 0;
		Diary related_diary = new com.aiop.yourtask.domain.Diary();
		Goal response = null;
		response = service.saveGoalDiary(goalid, related_diary);
		// TODO: JUnit - Add assertions to test outputs of operation: saveGoalDiary
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGoalByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGoalByPrimaryKey 
		Integer goalid_1 = 0;
		Goal response = null;
		response = service.findGoalByPrimaryKey(goalid_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findGoalByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all Goal entity
	* 
	 */
	@Test
	public void countGoals() {
		Integer response = null;
		response = service.countGoals();
		// TODO: JUnit - Add assertions to test outputs of operation: countGoals
	}

	/**
	 * Operation Unit Test
	* Delete an existing Diary entity
	* 
	 */
	@Test
	public void deleteGoalDiary() {
		// TODO: JUnit - Populate test inputs for operation: deleteGoalDiary 
		Integer goal_goalid = 0;
		Integer related_diary_iddiary = 0;
		Goal response = null;
		response = service.deleteGoalDiary(goal_goalid, related_diary_iddiary);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteGoalDiary
	}

	/**
	 * Operation Unit Test
	* Return all Goal entity
	* 
	 */
	@Test
	public void findAllGoals() {
		// TODO: JUnit - Populate test inputs for operation: findAllGoals 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Goal> response = null;
		response = service.findAllGoals(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGoals
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
