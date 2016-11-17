
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

/**
 * Unit test for the <code>CommentRestController</code> controller.
 *
 * @see com.aiop.yourtask.web.rest.CommentRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/aiopproject-security-context.xml",
		"file:./src/main/resources/aiopproject-service-context.xml",
		"file:./src/main/resources/aiopproject-dao-context.xml",
		"file:./src/main/resources/aiopproject-web-context.xml" })
public class CommentRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Commentcomment_commentidactivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentcomment_commentidactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidactivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCommentcomment_commentidactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidactivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCommentcomment_commentidactivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidactivityactivity_activityid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentcomment_commentidactivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidactivityactivity_activityid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentcomment_commentidactivityactivity_activityid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/activity/{activity_activityid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidyourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentcomment_commentidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidyourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCommentcomment_commentidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidyourtaskuser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCommentcomment_commentidyourtaskuser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/yourtaskuser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidyourtaskuseryourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentcomment_commentidyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentidyourtaskuseryourtaskuser_userid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentcomment_commentidyourtaskuseryourtaskuser_userid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}/yourtaskuser/{yourtaskuser_userid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCommentcomment_commentid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Commentcomment_commentid()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCommentcomment_commentid() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comment/{comment_commentid}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CommentRestController controller = (CommentRestController) context.getBean("CommentRestController");

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