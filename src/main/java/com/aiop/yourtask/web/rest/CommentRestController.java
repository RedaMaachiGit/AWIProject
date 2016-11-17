package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.CommentService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Comment entities
 * 
 */

@Controller("CommentRestController")

public class CommentRestController {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * DAO injected by Spring that manages Comment entities
	 * 
	 */
	@Autowired
	private CommentDAO commentDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Comment entities
	 * 
	 */
	@Autowired
	private CommentService commentService;

	/**
	 * Create a new Activity entity
	 * 
	 */
	@RequestMapping(value = "/Comment/{comment_commentid}/activity", method = RequestMethod.POST)
	@ResponseBody
	public Activity newCommentActivity(@PathVariable Integer comment_commentid, @RequestBody Activity activity) {
		commentService.saveCommentActivity(comment_commentid, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* Get Activity entity by Comment
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/activity", method = RequestMethod.GET)
	@ResponseBody
	public Activity getCommentActivity(@PathVariable Integer comment_commentid) {
		return commentDAO.findCommentByPrimaryKey(comment_commentid).getActivity();
	}

	/**
	* Register custom, context-specific property editors
	* 
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
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCommentYourtaskuser(@PathVariable Integer comment_commentid, @PathVariable Integer related_yourtaskuser_userid) {
		commentService.deleteCommentYourtaskuser(comment_commentid, related_yourtaskuser_userid);
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/yourtaskuser", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newCommentYourtaskuser(@PathVariable Integer comment_commentid, @RequestBody Yourtaskuser yourtaskuser) {
		commentService.saveCommentYourtaskuser(comment_commentid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/activity", method = RequestMethod.PUT)
	@ResponseBody
	public Activity saveCommentActivity(@PathVariable Integer comment_commentid, @RequestBody Activity activity) {
		commentService.saveCommentActivity(comment_commentid, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* Save an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Comment", method = RequestMethod.PUT)
	@ResponseBody
	public Comment saveComment(@RequestBody Comment comment) {
		commentService.saveComment(comment);
		return commentDAO.findCommentByPrimaryKey(comment.getCommentid());
	}

	/**
	* Get Yourtaskuser entity by Comment
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/yourtaskuser", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser getCommentYourtaskuser(@PathVariable Integer comment_commentid) {
		return commentDAO.findCommentByPrimaryKey(comment_commentid).getYourtaskuser();
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/yourtaskuser", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveCommentYourtaskuser(@PathVariable Integer comment_commentid, @RequestBody Yourtaskuser yourtaskuser) {
		commentService.saveCommentYourtaskuser(comment_commentid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* View an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/activity/{activity_activityid}", method = RequestMethod.GET)
	@ResponseBody
	public Activity loadCommentActivity(@PathVariable Integer comment_commentid, @PathVariable Integer related_activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(related_activity_activityid, -1, -1);

		return activity;
	}

	/**
	* Create a new Comment entity
	* 
	*/
	@RequestMapping(value = "/Comment", method = RequestMethod.POST)
	@ResponseBody
	public Comment newComment(@RequestBody Comment comment) {
		commentService.saveComment(comment);
		return commentDAO.findCommentByPrimaryKey(comment.getCommentid());
	}

	/**
	* Delete an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComment(@PathVariable Integer comment_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comment_commentid);
		commentService.deleteComment(comment);
	}

	/**
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadCommentYourtaskuser(@PathVariable Integer comment_commentid, @PathVariable Integer related_yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}/activity/{activity_activityid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCommentActivity(@PathVariable Integer comment_commentid, @PathVariable Integer related_activity_activityid) {
		commentService.deleteCommentActivity(comment_commentid, related_activity_activityid);
	}

	/**
	* Select an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Comment/{comment_commentid}", method = RequestMethod.GET)
	@ResponseBody
	public Comment loadComment(@PathVariable Integer comment_commentid) {
		return commentDAO.findCommentByPrimaryKey(comment_commentid);
	}

	/**
	* Show all Comment entities
	* 
	*/
	@RequestMapping(value = "/Comment", method = RequestMethod.GET)
	@ResponseBody
	public List<Comment> listComments() {
		return new java.util.ArrayList<Comment>(commentService.loadComments());
	}
}