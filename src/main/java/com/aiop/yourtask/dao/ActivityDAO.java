
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Activity;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Activity entities.
 * 
 */
public interface ActivityDAO extends JpaDao<Activity> {

	/**
	 * JPQL Query - findAllActivitys
	 *
	 */
	public Set<Activity> findAllActivitys() throws DataAccessException;

	/**
	 * JPQL Query - findAllActivitys
	 *
	 */
	public Set<Activity> findAllActivitys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityname
	 *
	 */
	public Set<Activity> findActivityByActivityname(String activityname) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityname
	 *
	 */
	public Set<Activity> findActivityByActivityname(String activityname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitynameContaining
	 *
	 */
	public Set<Activity> findActivityByActivitynameContaining(String activityname_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitynameContaining
	 *
	 */
	public Set<Activity> findActivityByActivitynameContaining(String activityname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityid
	 *
	 */
	public Activity findActivityByActivityid(Integer activityid) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityid
	 *
	 */
	public Activity findActivityByActivityid(Integer activityid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityvisibility
	 *
	 */
	public Set<Activity> findActivityByActivityvisibility(Boolean activityvisibility) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityvisibility
	 *
	 */
	public Set<Activity> findActivityByActivityvisibility(Boolean activityvisibility, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescription
	 *
	 */
	public Set<Activity> findActivityByActivitydescription(String activitydescription) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescription
	 *
	 */
	public Set<Activity> findActivityByActivitydescription(String activitydescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescriptionContaining
	 *
	 */
	public Set<Activity> findActivityByActivitydescriptionContaining(String activitydescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivitydescriptionContaining
	 *
	 */
	public Set<Activity> findActivityByActivitydescriptionContaining(String activitydescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByPrimaryKey
	 *
	 */
	public Activity findActivityByPrimaryKey(Integer activityid_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByPrimaryKey
	 *
	 */
	public Activity findActivityByPrimaryKey(Integer activityid_1, int startResult, int maxRows) throws DataAccessException;

}