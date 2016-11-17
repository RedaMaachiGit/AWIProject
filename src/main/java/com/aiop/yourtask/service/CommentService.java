
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Comment entities
 * 
 */
public interface CommentService {

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Comment saveCommentYourtaskuser(Integer commentid, Yourtaskuser related_yourtaskuser);

	/**
	* Save an existing Activity entity
	* 
	 */
	public Comment saveCommentActivity(Integer commentid_1, Activity related_activity);

	/**
	* Delete an existing Comment entity
	* 
	 */
	public void deleteComment(Comment comment);

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Comment deleteCommentYourtaskuser(Integer comment_commentid, Integer related_yourtaskuser_userid);

	/**
	* Delete an existing Activity entity
	* 
	 */
	public Comment deleteCommentActivity(Integer comment_commentid_1, Integer related_activity_activityid);

	/**
	* Return a count of all Comment entity
	* 
	 */
	public Integer countComments();

	/**
	* Load an existing Comment entity
	* 
	 */
	public Set<Comment> loadComments();

	/**
	* Return all Comment entity
	* 
	 */
	public List<Comment> findAllComments(Integer startResult, Integer maxRows);

	/**
	* Save an existing Comment entity
	* 
	 */
	public void saveComment(Comment comment_1);

	/**
	 */
	public Comment findCommentByPrimaryKey(Integer commentid_2);
}