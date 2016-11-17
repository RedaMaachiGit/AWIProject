package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.TaskDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Task;

import com.aiop.yourtask.service.TaskService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Task entities
 * 
 */

@Controller("TaskRestController")

public class TaskRestController {

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
	 * Service injected by Spring that provides CRUD operations for Task entities
	 * 
	 */
	@Autowired
	private TaskService taskService;

	/**
	 * View an existing Activity entity
	 * 
	 */
	@RequestMapping(value = "/Task/{task_taskid}/activity/{activity_activityid}", method = RequestMethod.GET)
	@ResponseBody
	public Activity loadTaskActivity(@PathVariable Integer task_taskid, @PathVariable Integer related_activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(related_activity_activityid, -1, -1);

		return activity;
	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Task/{task_taskid}/activity", method = RequestMethod.PUT)
	@ResponseBody
	public Activity saveTaskActivity(@PathVariable Integer task_taskid, @RequestBody Activity activity) {
		taskService.saveTaskActivity(task_taskid, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* Show all Task entities
	* 
	*/
	@RequestMapping(value = "/Task", method = RequestMethod.GET)
	@ResponseBody
	public List<Task> listTasks() {
		return new java.util.ArrayList<Task>(taskService.loadTasks());
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping(value = "/Task/{task_taskid}/activity", method = RequestMethod.POST)
	@ResponseBody
	public Activity newTaskActivity(@PathVariable Integer task_taskid, @RequestBody Activity activity) {
		taskService.saveTaskActivity(task_taskid, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* Get Activity entity by Task
	* 
	*/
	@RequestMapping(value = "/Task/{task_taskid}/activity", method = RequestMethod.GET)
	@ResponseBody
	public Activity getTaskActivity(@PathVariable Integer task_taskid) {
		return taskDAO.findTaskByPrimaryKey(task_taskid).getActivity();
	}

	/**
	* Select an existing Task entity
	* 
	*/
	@RequestMapping(value = "/Task/{task_taskid}", method = RequestMethod.GET)
	@ResponseBody
	public Task loadTask(@PathVariable Integer task_taskid) {
		return taskDAO.findTaskByPrimaryKey(task_taskid);
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Task/{task_taskid}/activity/{activity_activityid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTaskActivity(@PathVariable Integer task_taskid, @PathVariable Integer related_activity_activityid) {
		taskService.deleteTaskActivity(task_taskid, related_activity_activityid);
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Save an existing Task entity
	* 
	*/
	@RequestMapping(value = "/Task", method = RequestMethod.PUT)
	@ResponseBody
	public Task saveTask(@RequestBody Task task) {
		taskService.saveTask(task);
		return taskDAO.findTaskByPrimaryKey(task.getTaskid());
	}

	/**
	* Delete an existing Task entity
	* 
	*/
	@RequestMapping(value = "/Task/{task_taskid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTask(@PathVariable Integer task_taskid) {
		Task task = taskDAO.findTaskByPrimaryKey(task_taskid);
		taskService.deleteTask(task);
	}

	/**
	* Create a new Task entity
	* 
	*/
	@RequestMapping(value = "/Task", method = RequestMethod.POST)
	@ResponseBody
	public Task newTask(@RequestBody Task task) {
		taskService.saveTask(task);
		return taskDAO.findTaskByPrimaryKey(task.getTaskid());
	}
}