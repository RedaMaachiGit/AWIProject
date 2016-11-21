package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.TaskDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Task;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.ActivityService;

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
 * Spring Rest controller that handles CRUD requests for Activity entities
 * 
 */

@Controller("ActivityRestController")

public class ActivityRestController {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * DAO injected by Spring that manages Comment entities
	 * 
	 */
	@Autowired
	private CommentDAO commentDAO;

	/**
	 * DAO injected by Spring that manages Diary entities
	 * 
	 */
	@Autowired
	private DiaryDAO diaryDAO;

	/**
	 * DAO injected by Spring that manages Task entities
	 * 
	 */
	@Autowired
	private TaskDAO taskDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Activity entities
	 * 
	 */
	@Autowired
	private ActivityService activityService;

	/**
	 * Delete an existing Task entity
	 * 
	 */
	@RequestMapping(value = "/Activity/{activity_activityid}/tasks/{task_taskid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteActivityTasks(@PathVariable Integer activity_activityid, @PathVariable Integer related_tasks_taskid) {
		activityService.deleteActivityTasks(activity_activityid, related_tasks_taskid);
	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity", method = RequestMethod.PUT)
	@ResponseBody
	public Activity saveActivity(@RequestBody Activity activity) {
		activityService.saveActivity(activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadActivityYourtaskuser(@PathVariable Integer activity_activityid, @PathVariable Integer related_yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	* Show all Activity entities
	* 
	*/
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/Activity", method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public EntityList<Activity> listActivitys() {
		List<Activity> listeActivitys = (List<Activity>) activityService.loadActivitys();
		EntityList<Activity> listOfActivitys = new EntityList<Activity>(listeActivitys);
	    return listOfActivitys;
	}
	

	/**
	* View an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/diaries/{diary_iddiary}", method = RequestMethod.GET)
	@ResponseBody
	public Diary loadActivityDiaries(@PathVariable Integer activity_activityid, @PathVariable Integer related_diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(related_diaries_iddiary, -1, -1);

		return diary;
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
	* Create a new Task entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/tasks", method = RequestMethod.POST)
	@ResponseBody
	public Task newActivityTasks(@PathVariable Integer activity_activityid, @RequestBody Task task) {
		activityService.saveActivityTasks(activity_activityid, task);
		return taskDAO.findTaskByPrimaryKey(task.getTaskid());
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/yourtaskuser", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newActivityYourtaskuser(@PathVariable Integer activity_activityid, @RequestBody Yourtaskuser yourtaskuser) {
		activityService.saveActivityYourtaskuser(activity_activityid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteActivity(@PathVariable Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid);
		activityService.deleteActivity(activity);
	}

	/**
	* Select an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}", method = RequestMethod.GET)
	@ResponseBody
	public Activity loadActivity(@PathVariable Integer activity_activityid) {
		return activityDAO.findActivityByPrimaryKey(activity_activityid);
	}

	/**
	* Create a new Comment entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/comments", method = RequestMethod.POST)
	@ResponseBody
	public Comment newActivityComments(@PathVariable Integer activity_activityid, @RequestBody Comment comment) {
		activityService.saveActivityComments(activity_activityid, comment);
		return commentDAO.findCommentByPrimaryKey(comment.getCommentid());
	}

	/**
	* Delete an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/diaries/{diary_iddiary}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteActivityDiaries(@PathVariable Integer activity_activityid, @PathVariable Integer related_diaries_iddiary) {
		activityService.deleteActivityDiaries(activity_activityid, related_diaries_iddiary);
	}

	/**
	* Save an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/diaries", method = RequestMethod.PUT)
	@ResponseBody
	public Diary saveActivityDiaries(@PathVariable Integer activity_activityid, @RequestBody Diary diaries) {
		activityService.saveActivityDiaries(activity_activityid, diaries);
		return diaryDAO.findDiaryByPrimaryKey(diaries.getIddiary());
	}

	/**
	* View an existing Task entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/tasks/{task_taskid}", method = RequestMethod.GET)
	@ResponseBody
	public Task loadActivityTasks(@PathVariable Integer activity_activityid, @PathVariable Integer related_tasks_taskid) {
		Task task = taskDAO.findTaskByPrimaryKey(related_tasks_taskid, -1, -1);

		return task;
	}

	/**
	* Show all Diary entities by Activity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/diaries", method = RequestMethod.GET)
	@ResponseBody
	public List<Diary> getActivityDiaries(@PathVariable Integer activity_activityid) {
		return new java.util.ArrayList<Diary>(activityDAO.findActivityByPrimaryKey(activity_activityid).getDiaries());
	}

	/**
	* Save an existing Task entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/tasks", method = RequestMethod.PUT)
	@ResponseBody
	public Task saveActivityTasks(@PathVariable Integer activity_activityid, @RequestBody Task tasks) {
		activityService.saveActivityTasks(activity_activityid, tasks);
		return taskDAO.findTaskByPrimaryKey(tasks.getTaskid());
	}

	/**
	* Create a new Diary entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/diaries", method = RequestMethod.POST)
	@ResponseBody
	public Diary newActivityDiaries(@PathVariable Integer activity_activityid, @RequestBody Diary diary) {
		activityService.saveActivityDiaries(activity_activityid, diary);
		return diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity", method = RequestMethod.POST)
	@ResponseBody
	public Activity newActivity(@RequestBody Activity activity) {
		activityService.saveActivity(activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* Delete an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/comments/{comment_commentid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteActivityComments(@PathVariable Integer activity_activityid, @PathVariable Integer related_comments_commentid) {
		activityService.deleteActivityComments(activity_activityid, related_comments_commentid);
	}

	/**
	* Save an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/comments", method = RequestMethod.PUT)
	@ResponseBody
	public Comment saveActivityComments(@PathVariable Integer activity_activityid, @RequestBody Comment comments) {
		activityService.saveActivityComments(activity_activityid, comments);
		return commentDAO.findCommentByPrimaryKey(comments.getCommentid());
	}

	/**
	* View an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/comments/{comment_commentid}", method = RequestMethod.GET)
	@ResponseBody
	public Comment loadActivityComments(@PathVariable Integer activity_activityid, @PathVariable Integer related_comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(related_comments_commentid, -1, -1);

		return comment;
	}

	/**
	* Show all Comment entities by Activity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/comments", method = RequestMethod.GET)
	@ResponseBody
	public List<Comment> getActivityComments(@PathVariable Integer activity_activityid) {
		return new java.util.ArrayList<Comment>(activityDAO.findActivityByPrimaryKey(activity_activityid).getComments());
	}

	/**
	* Show all Task entities by Activity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/tasks", method = RequestMethod.GET)
	@ResponseBody
	public List<Task> getActivityTasks(@PathVariable Integer activity_activityid) {
		return new java.util.ArrayList<Task>(activityDAO.findActivityByPrimaryKey(activity_activityid).getTasks());
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteActivityYourtaskuser(@PathVariable Integer activity_activityid, @PathVariable Integer related_yourtaskuser_userid) {
		activityService.deleteActivityYourtaskuser(activity_activityid, related_yourtaskuser_userid);
	}

	/**
	* Get Yourtaskuser entity by Activity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/yourtaskuser", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser getActivityYourtaskuser(@PathVariable Integer activity_activityid) {
		return activityDAO.findActivityByPrimaryKey(activity_activityid).getYourtaskuser();
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_activityid}/yourtaskuser", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveActivityYourtaskuser(@PathVariable Integer activity_activityid, @RequestBody Yourtaskuser yourtaskuser) {
		activityService.saveActivityYourtaskuser(activity_activityid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}
}