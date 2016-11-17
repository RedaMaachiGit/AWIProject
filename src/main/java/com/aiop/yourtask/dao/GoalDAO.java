
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Goal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Goal entities.
 * 
 */
public interface GoalDAO extends JpaDao<Goal> {

	/**
	 * JPQL Query - findGoalByGoalname
	 *
	 */
	public Set<Goal> findGoalByGoalname(String goalname) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalname
	 *
	 */
	public Set<Goal> findGoalByGoalname(String goalname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescriptionContaining
	 *
	 */
	public Set<Goal> findGoalByGoaldescriptionContaining(String goaldescription) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescriptionContaining
	 *
	 */
	public Set<Goal> findGoalByGoaldescriptionContaining(String goaldescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByPrimaryKey
	 *
	 */
	public Goal findGoalByPrimaryKey(Integer goalid) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByPrimaryKey
	 *
	 */
	public Goal findGoalByPrimaryKey(Integer goalid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalnameContaining
	 *
	 */
	public Set<Goal> findGoalByGoalnameContaining(String goalname_1) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalnameContaining
	 *
	 */
	public Set<Goal> findGoalByGoalnameContaining(String goalname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalid
	 *
	 */
	public Goal findGoalByGoalid(Integer goalid_1) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalid
	 *
	 */
	public Goal findGoalByGoalid(Integer goalid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGoals
	 *
	 */
	public Set<Goal> findAllGoals() throws DataAccessException;

	/**
	 * JPQL Query - findAllGoals
	 *
	 */
	public Set<Goal> findAllGoals(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescription
	 *
	 */
	public Set<Goal> findGoalByGoaldescription(String goaldescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescription
	 *
	 */
	public Set<Goal> findGoalByGoaldescription(String goaldescription_1, int startResult, int maxRows) throws DataAccessException;

}