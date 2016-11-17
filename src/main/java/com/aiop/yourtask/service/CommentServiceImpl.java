package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Comment entities
 * 
 */

@Service("CommentService")

@Transactional
public class CommentServiceImpl implements CommentService {

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
	 * Instantiates a new CommentServiceImpl.
	 *
	 */
	public CommentServiceImpl() {
	}

	/**
	 * Save an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Comment saveCommentYourtaskuser(Integer commentid, Yourtaskuser related_yourtaskuser) {
		Comment comment = commentDAO.findCommentByPrimaryKey(commentid, -1, -1);
		Yourtaskuser existingyourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser.getUserid());

		// copy into the existing record to preserve existing relationships
		if (existingyourtaskuser != null) {
			existingyourtaskuser.setUserid(related_yourtaskuser.getUserid());
			existingyourtaskuser.setUserdateofbirth(related_yourtaskuser.getUserdateofbirth());
			existingyourtaskuser.setUserphonenumber(related_yourtaskuser.getUserphonenumber());
			existingyourtaskuser.setUseremail(related_yourtaskuser.getUseremail());
			existingyourtaskuser.setUserstreetnumber(related_yourtaskuser.getUserstreetnumber());
			existingyourtaskuser.setUserzipcode(related_yourtaskuser.getUserzipcode());
			existingyourtaskuser.setUsercity(related_yourtaskuser.getUsercity());
			existingyourtaskuser.setUserusername(related_yourtaskuser.getUserusername());
			existingyourtaskuser.setUserpassword(related_yourtaskuser.getUserpassword());
			existingyourtaskuser.setUsertoken(related_yourtaskuser.getUsertoken());
			existingyourtaskuser.setUserlastconnectiondate(related_yourtaskuser.getUserlastconnectiondate());
			existingyourtaskuser.setUsertype(related_yourtaskuser.getUsertype());
			existingyourtaskuser.setUseriban(related_yourtaskuser.getUseriban());
			related_yourtaskuser = existingyourtaskuser;
		}

		comment.setYourtaskuser(related_yourtaskuser);
		related_yourtaskuser.getComments().add(comment);
		comment = commentDAO.store(comment);
		commentDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return comment;
	}

	/**
	 * Save an existing Activity entity
	 * 
	 */
	@Transactional
	public Comment saveCommentActivity(Integer commentid, Activity related_activity) {
		Comment comment = commentDAO.findCommentByPrimaryKey(commentid, -1, -1);
		Activity existingactivity = activityDAO.findActivityByPrimaryKey(related_activity.getActivityid());

		// copy into the existing record to preserve existing relationships
		if (existingactivity != null) {
			existingactivity.setActivityid(related_activity.getActivityid());
			existingactivity.setActivityname(related_activity.getActivityname());
			existingactivity.setActivitydescription(related_activity.getActivitydescription());
			existingactivity.setActivityvisibility(related_activity.getActivityvisibility());
			related_activity = existingactivity;
		}

		comment.setActivity(related_activity);
		related_activity.getComments().add(comment);
		comment = commentDAO.store(comment);
		commentDAO.flush();

		related_activity = activityDAO.store(related_activity);
		activityDAO.flush();

		return comment;
	}

	/**
	 * Delete an existing Comment entity
	 * 
	 */
	@Transactional
	public void deleteComment(Comment comment) {
		commentDAO.remove(comment);
		commentDAO.flush();
	}

	/**
	 * Delete an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Comment deleteCommentYourtaskuser(Integer comment_commentid, Integer related_yourtaskuser_userid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comment_commentid, -1, -1);
		Yourtaskuser related_yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		comment.setYourtaskuser(null);
		related_yourtaskuser.getComments().remove(comment);
		comment = commentDAO.store(comment);
		commentDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		yourtaskuserDAO.remove(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return comment;
	}

	/**
	 * Delete an existing Activity entity
	 * 
	 */
	@Transactional
	public Comment deleteCommentActivity(Integer comment_commentid, Integer related_activity_activityid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comment_commentid, -1, -1);
		Activity related_activity = activityDAO.findActivityByPrimaryKey(related_activity_activityid, -1, -1);

		comment.setActivity(null);
		related_activity.getComments().remove(comment);
		comment = commentDAO.store(comment);
		commentDAO.flush();

		related_activity = activityDAO.store(related_activity);
		activityDAO.flush();

		activityDAO.remove(related_activity);
		activityDAO.flush();

		return comment;
	}

	/**
	 * Return a count of all Comment entity
	 * 
	 */
	@Transactional
	public Integer countComments() {
		return ((Long) commentDAO.createQuerySingleResult("select count(o) from Comment o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Comment entity
	 * 
	 */
	@Transactional
	public Set<Comment> loadComments() {
		return commentDAO.findAllComments();
	}

	/**
	 * Return all Comment entity
	 * 
	 */
	@Transactional
	public List<Comment> findAllComments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Comment>(commentDAO.findAllComments(startResult, maxRows));
	}

	/**
	 * Save an existing Comment entity
	 * 
	 */
	@Transactional
	public void saveComment(Comment comment) {
		Comment existingComment = commentDAO.findCommentByPrimaryKey(comment.getCommentid());

		if (existingComment != null) {
			if (existingComment != comment) {
				existingComment.setCommentid(comment.getCommentid());
				existingComment.setCommentcontent(comment.getCommentcontent());
				existingComment.setCommentdate(comment.getCommentdate());
			}
			comment = commentDAO.store(existingComment);
		} else {
			comment = commentDAO.store(comment);
		}
		commentDAO.flush();
	}

	/**
	 */
	@Transactional
	public Comment findCommentByPrimaryKey(Integer commentid) {
		return commentDAO.findCommentByPrimaryKey(commentid);
	}
}
