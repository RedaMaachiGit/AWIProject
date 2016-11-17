
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Task;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Task entities
 * 
 */
public interface TaskService {

	/**
	* Save an existing Task entity
	* 
	 */
	public void saveTask(Task task);

	/**
	* Save an existing Activity entity
	* 
	 */
	public Task saveTaskActivity(Integer taskid, Activity related_activity);

	/**
	* Delete an existing Activity entity
	* 
	 */
	public Task deleteTaskActivity(Integer task_taskid, Integer related_activity_activityid);

	/**
	 */
	public Task findTaskByPrimaryKey(Integer taskid_1);

	/**
	* Return all Task entity
	* 
	 */
	public List<Task> findAllTasks(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Task entity
	* 
	 */
	public void deleteTask(Task task_1);

	/**
	* Return a count of all Task entity
	* 
	 */
	public Integer countTasks();

	/**
	* Load an existing Task entity
	* 
	 */
	public Set<Task> loadTasks();
}