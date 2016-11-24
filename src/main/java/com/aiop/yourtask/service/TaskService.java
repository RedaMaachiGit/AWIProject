/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Task;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Task entities.
 */
public interface TaskService {

	/**
	 * Save an existing Task entity.
	 *
	 * @param task the task
	 */
	public void saveTask(Task task);

	/**
	 * Save an existing Activity entity.
	 *
	 * @param taskid the taskid
	 * @param related_activity the related activity
	 * @return the task
	 */
	public Task saveTaskActivity(Integer taskid, Activity related_activity);

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param task_taskid the task taskid
	 * @param related_activity_activityid the related activity activityid
	 * @return the task
	 */
	public Task deleteTaskActivity(Integer task_taskid, Integer related_activity_activityid);

	/**
	 * Find task by primary key.
	 *
	 * @param taskid_1 the taskid 1
	 * @return the task
	 */
	public Task findTaskByPrimaryKey(Integer taskid_1);

	/**
	 * Return all Task entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Task> findAllTasks(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Task entity.
	 *
	 * @param task_1 the task 1
	 */
	public void deleteTask(Task task_1);

	/**
	 * Return a count of all Task entity.
	 *
	 * @return the integer
	 */
	public Integer countTasks();

	/**
	 * Load an existing Task entity.
	 *
	 * @return the sets the
	 */
	public Set<Task> loadTasks();
}