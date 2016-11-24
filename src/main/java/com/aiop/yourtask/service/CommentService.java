/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Comment entities.
 */
public interface CommentService {

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param commentid the commentid
	 * @param related_yourtaskuser the related yourtaskuser
	 * @return the comment
	 */
	public Comment saveCommentYourtaskuser(Integer commentid, Yourtaskuser related_yourtaskuser);

	/**
	 * Save an existing Activity entity.
	 *
	 * @param commentid_1 the commentid 1
	 * @param related_activity the related activity
	 * @return the comment
	 */
	public Comment saveCommentActivity(Integer commentid_1, Activity related_activity);

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param comment the comment
	 */
	public void deleteComment(Comment comment);

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param comment_commentid the comment commentid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the comment
	 */
	public Comment deleteCommentYourtaskuser(Integer comment_commentid, Integer related_yourtaskuser_userid);

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param comment_commentid_1 the comment commentid 1
	 * @param related_activity_activityid the related activity activityid
	 * @return the comment
	 */
	public Comment deleteCommentActivity(Integer comment_commentid_1, Integer related_activity_activityid);

	/**
	 * Return a count of all Comment entity.
	 *
	 * @return the integer
	 */
	public Integer countComments();

	/**
	 * Load an existing Comment entity.
	 *
	 * @return the sets the
	 */
	public Set<Comment> loadComments();

	/**
	 * Return all Comment entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Comment> findAllComments(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Comment entity.
	 *
	 * @param comment_1 the comment 1
	 */
	public void saveComment(Comment comment_1);

	/**
	 * Find comment by primary key.
	 *
	 * @param commentid_2 the commentid 2
	 * @return the comment
	 */
	public Comment findCommentByPrimaryKey(Integer commentid_2);
}