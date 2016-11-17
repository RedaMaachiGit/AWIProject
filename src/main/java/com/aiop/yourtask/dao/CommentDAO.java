
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Comment;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Comment entities.
 * 
 */
public interface CommentDAO extends JpaDao<Comment> {

	/**
	 * JPQL Query - findCommentByCommentdateBefore
	 *
	 */
	public Set<Comment> findCommentByCommentdateBefore(java.util.Calendar commentdate) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdateBefore
	 *
	 */
	public Set<Comment> findCommentByCommentdateBefore(Calendar commentdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontent
	 *
	 */
	public Set<Comment> findCommentByCommentcontent(String commentcontent) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontent
	 *
	 */
	public Set<Comment> findCommentByCommentcontent(String commentcontent, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdateAfter
	 *
	 */
	public Set<Comment> findCommentByCommentdateAfter(java.util.Calendar commentdate_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdateAfter
	 *
	 */
	public Set<Comment> findCommentByCommentdateAfter(Calendar commentdate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdate
	 *
	 */
	public Set<Comment> findCommentByCommentdate(java.util.Calendar commentdate_2) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdate
	 *
	 */
	public Set<Comment> findCommentByCommentdate(Calendar commentdate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentid
	 *
	 */
	public Comment findCommentByCommentid(Integer commentid) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentid
	 *
	 */
	public Comment findCommentByCommentid(Integer commentid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontentContaining
	 *
	 */
	public Set<Comment> findCommentByCommentcontentContaining(String commentcontent_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontentContaining
	 *
	 */
	public Set<Comment> findCommentByCommentcontentContaining(String commentcontent_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllComments
	 *
	 */
	public Set<Comment> findAllComments() throws DataAccessException;

	/**
	 * JPQL Query - findAllComments
	 *
	 */
	public Set<Comment> findAllComments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */
	public Comment findCommentByPrimaryKey(Integer commentid_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */
	public Comment findCommentByPrimaryKey(Integer commentid_1, int startResult, int maxRows) throws DataAccessException;

}