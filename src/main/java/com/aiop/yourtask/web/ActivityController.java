package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.TaskDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Task;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.ActivityService;

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
 * Spring MVC controller that handles CRUD requests for Activity entities
 * 
 */

@Controller("ActivityController")

public class ActivityController {

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
	 * Show all Task entities by Activity
	 * 
	 */
	@RequestMapping("/listActivityTasks")
	public ModelAndView listActivityTasks(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/tasks/listTasks.jsp");

		return mav;
	}

	/**
	* Show all Comment entities by Activity
	* 
	*/
	@RequestMapping("/listActivityComments")
	public ModelAndView listActivityComments(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/comments/listComments.jsp");

		return mav;
	}

	/**
	* Create a new Task entity
	* 
	*/
	@RequestMapping("/newActivityTasks")
	public ModelAndView newActivityTasks(@RequestParam Integer activity_activityid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("task", new Task());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/tasks/editTasks.jsp");

		return mav;
	}

	/**
	* Delete an existing Comment entity
	* 
	*/
	@RequestMapping("/deleteActivityComments")
	public ModelAndView deleteActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer related_comments_commentid) {
		ModelAndView mav = new ModelAndView();

		Activity activity = activityService.deleteActivityComments(activity_activityid, related_comments_commentid);

		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Select the Activity entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteActivity")
	public ModelAndView confirmDeleteActivity(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/deleteActivity.jsp");

		return mav;
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping("/deleteActivity")
	public String deleteActivity(@RequestParam Integer activityidKey) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityidKey);
		activityService.deleteActivity(activity);
		return "forward:/indexActivity";
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping("/newActivity")
	public ModelAndView newActivity() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", new Activity());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/editActivity.jsp");

		return mav;
	}

	/**
	* Show all Yourtaskuser entities by Activity
	* 
	*/
	@RequestMapping("/listActivityYourtaskuser")
	public ModelAndView listActivityYourtaskuser(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/yourtaskuser/listYourtaskuser.jsp");

		return mav;
	}

	/**
	* Save an existing Comment entity
	* 
	*/
	@RequestMapping("/saveActivityComments")
	public ModelAndView saveActivityComments(@RequestParam Integer activity_activityid, @ModelAttribute Comment comments) {
		Activity parent_activity = activityService.saveActivityComments(activity_activityid, comments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", parent_activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteActivityYourtaskuser")
	public ModelAndView confirmDeleteActivityYourtaskuser(@RequestParam Integer activity_activityid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid));
		mav.addObject("activity_activityid", activity_activityid);
		mav.setViewName("activity/yourtaskuser/deleteYourtaskuser.jsp");

		return mav;
	}

	/**
	* Select the child Comment entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteActivityComments")
	public ModelAndView confirmDeleteActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer related_comments_commentid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(related_comments_commentid));
		mav.addObject("activity_activityid", activity_activityid);
		mav.setViewName("activity/comments/deleteComments.jsp");

		return mav;
	}

	/**
	* Save an existing Task entity
	* 
	*/
	@RequestMapping("/saveActivityTasks")
	public ModelAndView saveActivityTasks(@RequestParam Integer activity_activityid, @ModelAttribute Task tasks) {
		Activity parent_activity = activityService.saveActivityTasks(activity_activityid, tasks);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", parent_activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Entry point to show all Activity entities
	* 
	*/
	public String indexActivity() {
		return "redirect:/indexActivity";
	}

	/**
	* View an existing Diary entity
	* 
	*/
	@RequestMapping("/selectActivityDiaries")
	public ModelAndView selectActivityDiaries(@RequestParam Integer activity_activityid, @RequestParam Integer diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaries_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("diary", diary);
		mav.setViewName("activity/diaries/viewDiaries.jsp");

		return mav;
	}

	/**
	* Edit an existing Task entity
	* 
	*/
	@RequestMapping("/editActivityTasks")
	public ModelAndView editActivityTasks(@RequestParam Integer activity_activityid, @RequestParam Integer tasks_taskid) {
		Task task = taskDAO.findTaskByPrimaryKey(tasks_taskid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("task", task);
		mav.setViewName("activity/tasks/editTasks.jsp");

		return mav;
	}

	/**
	* Edit an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/editActivityYourtaskuser")
	public ModelAndView editActivityYourtaskuser(@RequestParam Integer activity_activityid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("activity/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	* View an existing Task entity
	* 
	*/
	@RequestMapping("/selectActivityTasks")
	public ModelAndView selectActivityTasks(@RequestParam Integer activity_activityid, @RequestParam Integer tasks_taskid) {
		Task task = taskDAO.findTaskByPrimaryKey(tasks_taskid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("task", task);
		mav.setViewName("activity/tasks/viewTasks.jsp");

		return mav;
	}

	/**
	* Edit an existing Diary entity
	* 
	*/
	@RequestMapping("/editActivityDiaries")
	public ModelAndView editActivityDiaries(@RequestParam Integer activity_activityid, @RequestParam Integer diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaries_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("diary", diary);
		mav.setViewName("activity/diaries/editDiaries.jsp");

		return mav;
	}

	/**
	* Select an existing Activity entity
	* 
	*/
	@RequestMapping("/selectActivity")
	public ModelAndView selectActivity(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}
	/*
	@RequestMapping("/selectYourtaskuserActivities")
	public ModelAndView selectYourtaskuserActivities(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/viewActivity.jsp");

		//mav.setViewName("yourtaskuser/activities/detailsActivity.jsp");

		return mav;
	}*/

	/**
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/selectActivityYourtaskuser")
	public ModelAndView selectActivityYourtaskuser(@RequestParam Integer activity_activityid, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("activity/yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	* Delete an existing Diary entity
	* 
	*/
	@RequestMapping("/deleteActivityDiaries")
	public ModelAndView deleteActivityDiaries(@RequestParam Integer activity_activityid, @RequestParam Integer related_diaries_iddiary) {
		ModelAndView mav = new ModelAndView();

		Activity activity = activityService.deleteActivityDiaries(activity_activityid, related_diaries_iddiary);

		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Select the child Diary entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteActivityDiaries")
	public ModelAndView confirmDeleteActivityDiaries(@RequestParam Integer activity_activityid, @RequestParam Integer related_diaries_iddiary) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(related_diaries_iddiary));
		mav.addObject("activity_activityid", activity_activityid);
		mav.setViewName("activity/diaries/deleteDiaries.jsp");

		return mav;
	}

	/**
	* Show all Diary entities by Activity
	* 
	*/
	@RequestMapping("/listActivityDiaries")
	public ModelAndView listActivityDiaries(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/diaries/listDiaries.jsp");

		return mav;
	}

	/**
	* Select the child Task entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteActivityTasks")
	public ModelAndView confirmDeleteActivityTasks(@RequestParam Integer activity_activityid, @RequestParam Integer related_tasks_taskid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", taskDAO.findTaskByPrimaryKey(related_tasks_taskid));
		mav.addObject("activity_activityid", activity_activityid);
		mav.setViewName("activity/tasks/deleteTasks.jsp");

		return mav;
	}

	/**
	* Save an existing Diary entity
	* 
	*/
	@RequestMapping("/saveActivityDiaries")
	public ModelAndView saveActivityDiaries(@RequestParam Integer activity_activityid, @ModelAttribute Diary diaries) {
		Activity parent_activity = activityService.saveActivityDiaries(activity_activityid, diaries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", parent_activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/deleteActivityYourtaskuser")
	public ModelAndView deleteActivityYourtaskuser(@RequestParam Integer activity_activityid, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		Activity activity = activityService.deleteActivityYourtaskuser(activity_activityid, related_yourtaskuser_userid);

		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Edit an existing Activity entity
	* 
	*/
	@RequestMapping("/editActivity")
	public ModelAndView editActivity(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/editActivity.jsp");

		return mav;
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping("/newActivityYourtaskuser")
	public ModelAndView newActivityYourtaskuser(@RequestParam Integer activity_activityid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/saveActivityYourtaskuser")
	public ModelAndView saveActivityYourtaskuser(@RequestParam Integer activity_activityid, @ModelAttribute Yourtaskuser yourtaskuser) {
		Activity parent_activity = activityService.saveActivityYourtaskuser(activity_activityid, yourtaskuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", parent_activity);
		mav.setViewName("activity/viewActivity.jsp");

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
	* Show all Activity entities
	* 
	*/
	@RequestMapping("/indexActivity")
	public ModelAndView listActivitys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activitys", activityService.loadActivitys());

		mav.setViewName("activity/listActivitys.jsp");

		return mav;
	}

	/**
	* View an existing Comment entity
	* 
	*/
	@RequestMapping("/selectActivityComments")
	public ModelAndView selectActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comments_commentid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("comment", comment);
		mav.setViewName("activity/comments/viewComments.jsp");

		return mav;
	}

	/**
	* Create a new Diary entity
	* 
	*/
	@RequestMapping("/newActivityDiaries")
	public ModelAndView newActivityDiaries(@RequestParam Integer activity_activityid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("diary", new Diary());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/diaries/editDiaries.jsp");

		return mav;
	}

	/**
	* Delete an existing Task entity
	* 
	*/
	@RequestMapping("/deleteActivityTasks")
	public ModelAndView deleteActivityTasks(@RequestParam Integer activity_activityid, @RequestParam Integer related_tasks_taskid) {
		ModelAndView mav = new ModelAndView();

		Activity activity = activityService.deleteActivityTasks(activity_activityid, related_tasks_taskid);

		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("activity", activity);
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Edit an existing Comment entity
	* 
	*/
	@RequestMapping("/editActivityComments")
	public ModelAndView editActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comments_commentid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("comment", comment);
		mav.setViewName("activity/comments/editComments.jsp");

		return mav;
	}

	/**
	* Create a new Comment entity
	* 
	*/
	@RequestMapping("/newActivityComments")
	public ModelAndView newActivityComments(@RequestParam Integer activity_activityid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("comment", new Comment());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/comments/editComments.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/activityController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping("/saveActivity")
	public String saveActivity(@ModelAttribute Activity activity) {
		activityService.saveActivity(activity);
		return "forward:/indexActivity";
	}
}