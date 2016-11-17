
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Task;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Task entities.
 * 
 */
public interface TaskDAO extends JpaDao<Task> {

	/**
	 * JPQL Query - findTaskByPrimaryKey
	 *
	 */
	public Task findTaskByPrimaryKey(Integer taskid) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByPrimaryKey
	 *
	 */
	public Task findTaskByPrimaryKey(Integer taskid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTasks
	 *
	 */
	public Set<Task> findAllTasks() throws DataAccessException;

	/**
	 * JPQL Query - findAllTasks
	 *
	 */
	public Set<Task> findAllTasks(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskid
	 *
	 */
	public Task findTaskByTaskid(Integer taskid_1) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskid
	 *
	 */
	public Task findTaskByTaskid(Integer taskid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontent
	 *
	 */
	public Set<Task> findTaskByTaskcontent(String taskcontent) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontent
	 *
	 */
	public Set<Task> findTaskByTaskcontent(String taskcontent, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontentContaining
	 *
	 */
	public Set<Task> findTaskByTaskcontentContaining(String taskcontent_1) throws DataAccessException;

	/**
	 * JPQL Query - findTaskByTaskcontentContaining
	 *
	 */
	public Set<Task> findTaskByTaskcontentContaining(String taskcontent_1, int startResult, int maxRows) throws DataAccessException;

}