/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Activity;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Activity entities.
 * 
 */
public interface ActivityDAO extends JpaDao<Activity> {

	/**
	 * JPQL Query - findAllActivitys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findAllActivitys() throws DataAccessException;

	/**
	 * JPQL Query - findAllActivitys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findAllActivitys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityname.
	 *
	 * @param activityname the activityname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivityname(String activityname) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityname.
	 *
	 * @param activityname the activityname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivityname(String activityname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitynameContaining.
	 *
	 * @param activityname_1 the activityname 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivitynameContaining(String activityname_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitynameContaining.
	 *
	 * @param activityname_1 the activityname 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivitynameContaining(String activityname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityid.
	 *
	 * @param activityid the activityid
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */
	public Activity findActivityByActivityid(Integer activityid) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityid.
	 *
	 * @param activityid the activityid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */
	public Activity findActivityByActivityid(Integer activityid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityvisibility.
	 *
	 * @param activityvisibility the activityvisibility
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivityvisibility(Boolean activityvisibility) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityvisibility.
	 *
	 * @param activityvisibility the activityvisibility
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivityvisibility(Boolean activityvisibility, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescription.
	 *
	 * @param activitydescription the activitydescription
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivitydescription(String activitydescription) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescription.
	 *
	 * @param activitydescription the activitydescription
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivitydescription(String activitydescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescriptionContaining.
	 *
	 * @param activitydescription_1 the activitydescription 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivitydescriptionContaining(String activitydescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescriptionContaining.
	 *
	 * @param activitydescription_1 the activitydescription 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Activity> findActivityByActivitydescriptionContaining(String activitydescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByPrimaryKey.
	 *
	 * @param activityid_1 the activityid 1
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */
	public Activity findActivityByPrimaryKey(Integer activityid_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByPrimaryKey.
	 *
	 * @param activityid_1 the activityid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */
	public Activity findActivityByPrimaryKey(Integer activityid_1, int startResult, int maxRows) throws DataAccessException;

}