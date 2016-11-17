
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
 * Unit test for the <code>CommentController</code> controller.
 *
 * @see com.aiop.yourtask.web.CommentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class CommentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCommentActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCommentActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCommentActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCommentYourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCommentYourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCommentYourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>commentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcommentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/commentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentController controller = (CommentController) context.getBean("CommentController");

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