/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Task;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Task entities.
 * 
 */
public interface TaskDAO extends JpaDao<Task> {

	/**
	 * JPQL Query - findTaskByPrimaryKey.
	 *
	 * @param taskid the taskid
	 * @return the task
	 * @throws DataAccessException the data access exception
	 */
	public Task findTaskByPrimaryKey(Integer taskid) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByPrimaryKey.
	 *
	 * @param taskid the taskid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the task
	 * @throws DataAccessException the data access exception
	 */
	public Task findTaskByPrimaryKey(Integer taskid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTasks.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Task> findAllTasks() throws DataAccessException;

	/**
	 * JPQL Query - findAllTasks.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Task> findAllTasks(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskid.
	 *
	 * @param taskid_1 the taskid 1
	 * @return the task
	 * @throws DataAccessException the data access exception
	 */
	public Task findTaskByTaskid(Integer taskid_1) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskid.
	 *
	 * @param taskid_1 the taskid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the task
	 * @throws DataAccessException the data access exception
	 */
	public Task findTaskByTaskid(Integer taskid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontent.
	 *
	 * @param taskcontent the taskcontent
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Task> findTaskByTaskcontent(String taskcontent) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontent.
	 *
	 * @param taskcontent the taskcontent
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Task> findTaskByTaskcontent(String taskcontent, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontentContaining.
	 *
	 * @param taskcontent_1 the taskcontent 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Task> findTaskByTaskcontentContaining(String taskcontent_1) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontentContaining.
	 *
	 * @param taskcontent_1 the taskcontent 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Task> findTaskByTaskcontentContaining(String taskcontent_1, int startResult, int maxRows) throws DataAccessException;

}