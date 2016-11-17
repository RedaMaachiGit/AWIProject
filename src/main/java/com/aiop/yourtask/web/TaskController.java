package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.TaskDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Task;

import com.aiop.yourtask.service.TaskService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Task entities
 * 
 */

@Controller("TaskController")

public class TaskController {

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
	 * Entry point to show all Task entities
	 * 
	 */
	public String indexTask() {
		return "redirect:/indexTask";
	}

	/**
	*/
	@RequestMapping("/taskController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new Task entity
	* 
	*/
	@RequestMapping("/newTask")
	public ModelAndView newTask() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", new Task());
		mav.addObject("newFlag", true);
		mav.setViewName("task/editTask.jsp");

		return mav;
	}

	/**
	* Select an existing Task entity
	* 
	*/
	@RequestMapping("/selectTask")
	public ModelAndView selectTask(@RequestParam Integer taskidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", taskDAO.findTaskByPrimaryKey(taskidKey));
		mav.setViewName("task/viewTask.jsp");

		return mav;
	}

	/**
	* Show all Activity entities by Task
	* 
	*/
	@RequestMapping("/listTaskActivity")
	public ModelAndView listTaskActivity(@RequestParam Integer taskidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", taskDAO.findTaskByPrimaryKey(taskidKey));
		mav.setViewName("task/activity/listActivity.jsp");

		return mav;
	}

	/**
	* Show all Task entities
	* 
	*/
	@RequestMapping("/indexTask")
	public ModelAndView listTasks() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tasks", taskService.loadTasks());

		mav.setViewName("task/listTasks.jsp");

		return mav;
	}

	/**
	* View an existing Activity entity
	* 
	*/
	@RequestMapping("/selectTaskActivity")
	public ModelAndView selectTaskActivity(@RequestParam Integer task_taskid, @RequestParam Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("task_taskid", task_taskid);
		mav.addObject("activity", activity);
		mav.setViewName("task/activity/viewActivity.jsp");

		return mav;
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
	* Select the child Activity entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteTaskActivity")
	public ModelAndView confirmDeleteTaskActivity(@RequestParam Integer task_taskid, @RequestParam Integer related_activity_activityid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(related_activity_activityid));
		mav.addObject("task_taskid", task_taskid);
		mav.setViewName("task/activity/deleteActivity.jsp");

		return mav;
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping("/deleteTaskActivity")
	public ModelAndView deleteTaskActivity(@RequestParam Integer task_taskid, @RequestParam Integer related_activity_activityid) {
		ModelAndView mav = new ModelAndView();

		Task task = taskService.deleteTaskActivity(task_taskid, related_activity_activityid);

		mav.addObject("task_taskid", task_taskid);
		mav.addObject("task", task);
		mav.setViewName("task/viewTask.jsp");

		return mav;
	}

	/**
	* Edit an existing Activity entity
	* 
	*/
	@RequestMapping("/editTaskActivity")
	public ModelAndView editTaskActivity(@RequestParam Integer task_taskid, @RequestParam Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("task_taskid", task_taskid);
		mav.addObject("activity", activity);
		mav.setViewName("task/activity/editActivity.jsp");

		return mav;
	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping("/saveTaskActivity")
	public ModelAndView saveTaskActivity(@RequestParam Integer task_taskid, @ModelAttribute Activity activity) {
		Task parent_task = taskService.saveTaskActivity(task_taskid, activity);

		ModelAndView mav = new ModelAndView();
		mav.addObject("task_taskid", task_taskid);
		mav.addObject("task", parent_task);
		mav.setViewName("task/viewTask.jsp");

		return mav;
	}

	/**
	* Select the Task entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteTask")
	public ModelAndView confirmDeleteTask(@RequestParam Integer taskidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", taskDAO.findTaskByPrimaryKey(taskidKey));
		mav.setViewName("task/deleteTask.jsp");

		return mav;
	}

	/**
	* Edit an existing Task entity
	* 
	*/
	@RequestMapping("/editTask")
	public ModelAndView editTask(@RequestParam Integer taskidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", taskDAO.findTaskByPrimaryKey(taskidKey));
		mav.setViewName("task/editTask.jsp");

		return mav;
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping("/newTaskActivity")
	public ModelAndView newTaskActivity(@RequestParam Integer task_taskid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("task_taskid", task_taskid);
		mav.addObject("activity", new Activity());
		mav.addObject("newFlag", true);
		mav.setViewName("task/activity/editActivity.jsp");

		return mav;
	}

	/**
	* Delete an existing Task entity
	* 
	*/
	@RequestMapping("/deleteTask")
	public String deleteTask(@RequestParam Integer taskidKey) {
		Task task = taskDAO.findTaskByPrimaryKey(taskidKey);
		taskService.deleteTask(task);
		return "forward:/indexTask";
	}

	/**
	* Save an existing Task entity
	* 
	*/
	@RequestMapping("/saveTask")
	public String saveTask(@ModelAttribute Task task) {
		taskService.saveTask(task);
		return "forward:/indexTask";
	}
}