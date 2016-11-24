/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.CommentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Comment entities.
 */

@Controller("CommentController")

public class CommentController {

	/** DAO injected by Spring that manages Activity entities. */
	@Autowired
	private ActivityDAO activityDAO;

	/** DAO injected by Spring that manages Comment entities. */
	@Autowired
	private CommentDAO commentDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Comment entities. */
	@Autowired
	private CommentService commentService;

	/**
	 * Entry point to show all Comment entities.
	 *
	 * @return the string
	 */
	public String indexComment() {
		return "redirect:/indexComment";
	}

	/**
	 * Save an existing Comment entity.
	 *
	 * @param comment the comment
	 * @return the string
	 */
	@RequestMapping("/saveComment")
	public String saveComment(@ModelAttribute Comment comment) {
		commentService.saveComment(comment);
		return "forward:/indexComment";
	}

	/**
	 * Save an existing Activity entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param activity the activity
	 * @return the model and view
	 */
	@RequestMapping("/saveCommentActivity")
	public ModelAndView saveCommentActivity(@RequestParam Integer comment_commentid, @ModelAttribute Activity activity) {
		Comment parent_comment = commentService.saveCommentActivity(comment_commentid, activity);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("comment", parent_comment);
		mav.setViewName("comment/viewComment.jsp");

		return mav;
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/deleteCommentYourtaskuser")
	public ModelAndView deleteCommentYourtaskuser(@RequestParam Integer comment_commentid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		Comment comment = commentService.deleteCommentYourtaskuser(comment_commentid, related_yourtaskuser_userid);

		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("comment", comment);
		mav.setViewName("comment/viewComment.jsp");

		return mav;
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/editCommentYourtaskuser")
	public ModelAndView editCommentYourtaskuser(@RequestParam Integer comment_commentid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("comment/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the Comment entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param commentidKey the commentid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteComment")
	public ModelAndView confirmDeleteComment(@RequestParam Integer commentidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(commentidKey));
		mav.setViewName("comment/deleteComment.jsp");

		return mav;
	}

	/**
	 * Create a new Activity entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @return the model and view
	 */
	@RequestMapping("/newCommentActivity")
	public ModelAndView newCommentActivity(@RequestParam Integer comment_commentid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("activity", new Activity());
		mav.addObject("newFlag", true);
		mav.setViewName("comment/activity/editActivity.jsp");

		return mav;
	}

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param related_activity_activityid the related activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/deleteCommentActivity")
	public ModelAndView deleteCommentActivity(@RequestParam Integer comment_commentid, @RequestParam Integer related_activity_activityid) {
		ModelAndView mav = new ModelAndView();

		Comment comment = commentService.deleteCommentActivity(comment_commentid, related_activity_activityid);

		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("comment", comment);
		mav.setViewName("comment/viewComment.jsp");

		return mav;
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param yourtaskuser the yourtaskuser
	 * @return the model and view
	 */
	@RequestMapping("/saveCommentYourtaskuser")
	public ModelAndView saveCommentYourtaskuser(@RequestParam Integer comment_commentid, @ModelAttribute Yourtaskuser yourtaskuser) {
		Comment parent_comment = commentService.saveCommentYourtaskuser(comment_commentid, yourtaskuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("comment", parent_comment);
		mav.setViewName("comment/viewComment.jsp");

		return mav;
	}

	/**
	 * Select an existing Comment entity.
	 *
	 * @param commentidKey the commentid key
	 * @return the model and view
	 */
	@RequestMapping("/selectComment")
	public ModelAndView selectComment(@RequestParam Integer commentidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(commentidKey));
		mav.setViewName("comment/viewComment.jsp");

		return mav;
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @return the model and view
	 */
	@RequestMapping("/newCommentYourtaskuser")
	public ModelAndView newCommentYourtaskuser(@RequestParam Integer comment_commentid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("comment/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Show all Activity entities by Comment.
	 *
	 * @param commentidKey the commentid key
	 * @return the model and view
	 */
	@RequestMapping("/listCommentActivity")
	public ModelAndView listCommentActivity(@RequestParam Integer commentidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(commentidKey));
		mav.setViewName("comment/activity/listActivity.jsp");

		return mav;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/commentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Activity entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param activity_activityid the activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/editCommentActivity")
	public ModelAndView editCommentActivity(@RequestParam Integer comment_commentid, @RequestParam Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("activity", activity);
		mav.setViewName("comment/activity/editActivity.jsp");

		return mav;
	}

	/**
	 * View an existing Activity entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param activity_activityid the activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/selectCommentActivity")
	public ModelAndView selectCommentActivity(@RequestParam Integer comment_commentid, @RequestParam Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("activity", activity);
		mav.setViewName("comment/activity/viewActivity.jsp");

		return mav;
	}

	/**
	 * Show all Comment entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexComment")
	public ModelAndView listComments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comments", commentService.loadComments());

		mav.setViewName("comment/listComments.jsp");

		return mav;
	}

	/**
	 * Show all Yourtaskuser entities by Comment.
	 *
	 * @param commentidKey the commentid key
	 * @return the model and view
	 */
	@RequestMapping("/listCommentYourtaskuser")
	public ModelAndView listCommentYourtaskuser(@RequestParam Integer commentidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(commentidKey));
		mav.setViewName("comment/yourtaskuser/listYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new Comment entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newComment")
	public ModelAndView newComment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", new Comment());
		mav.addObject("newFlag", true);
		mav.setViewName("comment/editComment.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors.
	 *
	 * @param binder the binder
	 * @param request the request
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Edit an existing Comment entity.
	 *
	 * @param commentidKey the commentid key
	 * @return the model and view
	 */
	@RequestMapping("/editComment")
	public ModelAndView editComment(@RequestParam Integer commentidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(commentidKey));
		mav.setViewName("comment/editComment.jsp");

		return mav;
	}

	/**
	 * Select the child Activity entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param related_activity_activityid the related activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteCommentActivity")
	public ModelAndView confirmDeleteCommentActivity(@RequestParam Integer comment_commentid, @RequestParam Integer related_activity_activityid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(related_activity_activityid));
		mav.addObject("comment_commentid", comment_commentid);
		mav.setViewName("comment/activity/deleteActivity.jsp");

		return mav;
	}

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param commentidKey the commentid key
	 * @return the string
	 */
	@RequestMapping("/deleteComment")
	public String deleteComment(@RequestParam Integer commentidKey) {
		Comment comment = commentDAO.findCommentByPrimaryKey(commentidKey);
		commentService.deleteComment(comment);
		return "forward:/indexComment";
	}

	/**
	 * Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteCommentYourtaskuser")
	public ModelAndView confirmDeleteCommentYourtaskuser(@RequestParam Integer comment_commentid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid));
		mav.addObject("comment_commentid", comment_commentid);
		mav.setViewName("comment/yourtaskuser/deleteYourtaskuser.jsp");

		return mav;
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/selectCommentYourtaskuser")
	public ModelAndView selectCommentYourtaskuser(@RequestParam Integer comment_commentid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comment_commentid", comment_commentid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("comment/yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}
}