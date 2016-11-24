/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Goal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Goal entities.
 * 
 */
public interface GoalDAO extends JpaDao<Goal> {

	/**
	 * JPQL Query - findGoalByGoalname.
	 *
	 * @param goalname the goalname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoalname(String goalname) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalname.
	 *
	 * @param goalname the goalname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoalname(String goalname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescriptionContaining.
	 *
	 * @param goaldescription the goaldescription
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoaldescriptionContaining(String goaldescription) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescriptionContaining.
	 *
	 * @param goaldescription the goaldescription
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoaldescriptionContaining(String goaldescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByPrimaryKey.
	 *
	 * @param goalid the goalid
	 * @return the goal
	 * @throws DataAccessException the data access exception
	 */
	public Goal findGoalByPrimaryKey(Integer goalid) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByPrimaryKey.
	 *
	 * @param goalid the goalid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the goal
	 * @throws DataAccessException the data access exception
	 */
	public Goal findGoalByPrimaryKey(Integer goalid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalnameContaining.
	 *
	 * @param goalname_1 the goalname 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoalnameContaining(String goalname_1) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalnameContaining.
	 *
	 * @param goalname_1 the goalname 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoalnameContaining(String goalname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalid.
	 *
	 * @param goalid_1 the goalid 1
	 * @return the goal
	 * @throws DataAccessException the data access exception
	 */
	public Goal findGoalByGoalid(Integer goalid_1) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoalid.
	 *
	 * @param goalid_1 the goalid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the goal
	 * @throws DataAccessException the data access exception
	 */
	public Goal findGoalByGoalid(Integer goalid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGoals.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findAllGoals() throws DataAccessException;

	/**
	 * JPQL Query - findAllGoals.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findAllGoals(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescription.
	 *
	 * @param goaldescription_1 the goaldescription 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoaldescription(String goaldescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findGoalByGoaldescription.
	 *
	 * @param goaldescription_1 the goaldescription 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Goal> findGoalByGoaldescription(String goaldescription_1, int startResult, int maxRows) throws DataAccessException;

}