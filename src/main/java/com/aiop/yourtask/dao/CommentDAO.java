/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Comment;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Comment entities.
 * 
 */
public interface CommentDAO extends JpaDao<Comment> {

	/**
	 * JPQL Query - findCommentByCommentdateBefore.
	 *
	 * @param commentdate the commentdate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentdateBefore(java.util.Calendar commentdate) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdateBefore.
	 *
	 * @param commentdate the commentdate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentdateBefore(Calendar commentdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontent.
	 *
	 * @param commentcontent the commentcontent
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentcontent(String commentcontent) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontent.
	 *
	 * @param commentcontent the commentcontent
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentcontent(String commentcontent, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdateAfter.
	 *
	 * @param commentdate_1 the commentdate 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentdateAfter(java.util.Calendar commentdate_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdateAfter.
	 *
	 * @param commentdate_1 the commentdate 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentdateAfter(Calendar commentdate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdate.
	 *
	 * @param commentdate_2 the commentdate 2
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentdate(java.util.Calendar commentdate_2) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentdate.
	 *
	 * @param commentdate_2 the commentdate 2
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentdate(Calendar commentdate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentid.
	 *
	 * @param commentid the commentid
	 * @return the comment
	 * @throws DataAccessException the data access exception
	 */
	public Comment findCommentByCommentid(Integer commentid) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentid.
	 *
	 * @param commentid the commentid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the comment
	 * @throws DataAccessException the data access exception
	 */
	public Comment findCommentByCommentid(Integer commentid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontentContaining.
	 *
	 * @param commentcontent_1 the commentcontent 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentcontentContaining(String commentcontent_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByCommentcontentContaining.
	 *
	 * @param commentcontent_1 the commentcontent 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findCommentByCommentcontentContaining(String commentcontent_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllComments.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findAllComments() throws DataAccessException;

	/**
	 * JPQL Query - findAllComments.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Comment> findAllComments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByPrimaryKey.
	 *
	 * @param commentid_1 the commentid 1
	 * @return the comment
	 * @throws DataAccessException the data access exception
	 */
	public Comment findCommentByPrimaryKey(Integer commentid_1) throws DataAccessException;

	/**
	 * JPQL Query - findCommentByPrimaryKey.
	 *
	 * @param commentid_1 the commentid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the comment
	 * @throws DataAccessException the data access exception
	 */
	public Comment findCommentByPrimaryKey(Integer commentid_1, int startResult, int maxRows) throws DataAccessException;

}