/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
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
public class CommentServiceTest {

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
	protected CommentService service;

	/**
	 * Instantiates a new CommentServiceTest.
	 *
	 */
	public CommentServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Yourtaskuser entity.
	 */
	@Test
	public void saveCommentYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: saveCommentYourtaskuser 
		Integer commentid = 0;
		Yourtaskuser related_yourtaskuser = new com.aiop.yourtask.domain.Yourtaskuser();
		Comment response = null;
		response = service.saveCommentYourtaskuser(commentid, related_yourtaskuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCommentYourtaskuser
	}

	/**
	 * Operation Unit Test
	 * Save an existing Activity entity.
	 */
	@Test
	public void saveCommentActivity() {
		// TODO: JUnit - Populate test inputs for operation: saveCommentActivity 
		Integer commentid_1 = 0;
		Activity related_activity = new com.aiop.yourtask.domain.Activity();
		Comment response = null;
		response = service.saveCommentActivity(commentid_1, related_activity);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCommentActivity
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Comment entity.
	 */
	@Test
	public void deleteComment() {
		// TODO: JUnit - Populate test inputs for operation: deleteComment 
		Comment comment = new com.aiop.yourtask.domain.Comment();
		service.deleteComment(comment);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Yourtaskuser entity.
	 */
	@Test
	public void deleteCommentYourtaskuser() {
		// TODO: JUnit - Populate test inputs for operation: deleteCommentYourtaskuser 
		Integer comment_commentid = 0;
		Integer related_yourtaskuser_userid = 0;
		Comment response = null;
		response = service.deleteCommentYourtaskuser(comment_commentid, related_yourtaskuser_userid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCommentYourtaskuser
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Activity entity.
	 */
	@Test
	public void deleteCommentActivity() {
		// TODO: JUnit - Populate test inputs for operation: deleteCommentActivity 
		Integer comment_commentid_1 = 0;
		Integer related_activity_activityid = 0;
		Comment response = null;
		response = service.deleteCommentActivity(comment_commentid_1, related_activity_activityid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCommentActivity
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Comment entity.
	 */
	@Test
	public void countComments() {
		Integer response = null;
		response = service.countComments();
		// TODO: JUnit - Add assertions to test outputs of operation: countComments
	}

	/**
	 * Operation Unit Test
	 * Load an existing Comment entity.
	 */
	@Test
	public void loadComments() {
		Set<Comment> response = null;
		response = service.loadComments();
		// TODO: JUnit - Add assertions to test outputs of operation: loadComments
	}

	/**
	 * Operation Unit Test
	 * Return all Comment entity.
	 */
	@Test
	public void findAllComments() {
		// TODO: JUnit - Populate test inputs for operation: findAllComments 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Comment> response = null;
		response = service.findAllComments(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllComments
	}

	/**
	 * Operation Unit Test
	 * Save an existing Comment entity.
	 */
	@Test
	public void saveComment() {
		// TODO: JUnit - Populate test inputs for operation: saveComment 
		Comment comment_1 = new com.aiop.yourtask.domain.Comment();
		service.saveComment(comment_1);
	}

	/**
	 * Operation Unit Test.
	 */
	@Test
	public void findCommentByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCommentByPrimaryKey 
		Integer commentid_2 = 0;
		Comment response = null;
		response = service.findCommentByPrimaryKey(commentid_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findCommentByPrimaryKey
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
