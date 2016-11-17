package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.TaskDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Task;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Task entities
 * 
 */

@Service("TaskService")

@Transactional
public class TaskServiceImpl implements TaskService {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * DAO injected by Spring that manages Task entities
	 * 
	 */
	@Autowired
	private TaskDAO taskDAO;

	/**
	 * Instantiates a new TaskServiceImpl.
	 *
	 */
	public TaskServiceImpl() {
	}

	/**
	 * Save an existing Task entity
	 * 
	 */
	@Transactional
	public void saveTask(Task task) {
		Task existingTask = taskDAO.findTaskByPrimaryKey(task.getTaskid());

		if (existingTask != null) {
			if (existingTask != task) {
				existingTask.setTaskid(task.getTaskid());
				existingTask.setTaskcontent(task.getTaskcontent());
			}
			task = taskDAO.store(existingTask);
		} else {
			task = taskDAO.store(task);
		}
		taskDAO.flush();
	}

	/**
	 * Save an existing Activity entity
	 * 
	 */
	@Transactional
	public Task saveTaskActivity(Integer taskid, Activity related_activity) {
		Task task = taskDAO.findTaskByPrimaryKey(taskid, -1, -1);
		Activity existingactivity = activityDAO.findActivityByPrimaryKey(related_activity.getActivityid());

		// copy into the existing record to preserve existing relationships
		if (existingactivity != null) {
			existingactivity.setActivityid(related_activity.getActivityid());
			existingactivity.setActivityname(related_activity.getActivityname());
			existingactivity.setActivitydescription(related_activity.getActivitydescription());
			existingactivity.setActivityvisibility(related_activity.getActivityvisibility());
			related_activity = existingactivity;
		}

		task.setActivity(related_activity);
		related_activity.getTasks().add(task);
		task = taskDAO.store(task);
		taskDAO.flush();

		related_activity = activityDAO.store(related_activity);
		activityDAO.flush();

		return task;
	}

	/**
	 * Delete an existing Activity entity
	 * 
	 */
	@Transactional
	public Task deleteTaskActivity(Integer task_taskid, Integer related_activity_activityid) {
		Task task = taskDAO.findTaskByPrimaryKey(task_taskid, -1, -1);
		Activity related_activity = activityDAO.findActivityByPrimaryKey(related_activity_activityid, -1, -1);

		task.setActivity(null);
		related_activity.getTasks().remove(task);
		task = taskDAO.store(task);
		taskDAO.flush();

		related_activity = activityDAO.store(related_activity);
		activityDAO.flush();

		activityDAO.remove(related_activity);
		activityDAO.flush();

		return task;
	}

	/**
	 */
	@Transactional
	public Task findTaskByPrimaryKey(Integer taskid) {
		return taskDAO.findTaskByPrimaryKey(taskid);
	}

	/**
	 * Return all Task entity
	 * 
	 */
	@Transactional
	public List<Task> findAllTasks(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Task>(taskDAO.findAllTasks(startResult, maxRows));
	}

	/**
	 * Delete an existing Task entity
	 * 
	 */
	@Transactional
	public void deleteTask(Task task) {
		taskDAO.remove(task);
		taskDAO.flush();
	}

	/**
	 * Return a count of all Task entity
	 * 
	 */
	@Transactional
	public Integer countTasks() {
		return ((Long) taskDAO.createQuerySingleResult("select count(o) from Task o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Task entity
	 * 
	 */
	@Transactional
	public Set<Task> loadTasks() {
		return taskDAO.findAllTasks();
	}
}
