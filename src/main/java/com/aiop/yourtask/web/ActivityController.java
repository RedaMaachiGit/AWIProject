/*
 * 
 */
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
import com.aiop.yourtask.web.security.AuthenticationFacade;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Activity entities.
 */

@Controller("ActivityController")

public class ActivityController {

	/** DAO injected by Spring that manages Activity entities. */
	@Autowired
	private ActivityDAO activityDAO;

	/** DAO injected by Spring that manages Comment entities. */
	@Autowired
	private CommentDAO commentDAO;

	/** DAO injected by Spring that manages Diary entities. */
	@Autowired
	private DiaryDAO diaryDAO;

	/** DAO injected by Spring that manages Task entities. */
	@Autowired
	private TaskDAO taskDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Activity entities. */
	@Autowired
	private ActivityService activityService;
	
    /** The authentication. */
    @Autowired
    private AuthenticationFacade authentication;
    
    

	/**
	 * Show all Task entities by Activity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/listActivityTasks")
	public ModelAndView listActivityTasks(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/tasks/listTasks.jsp");

		return mav;
	}

	/**
	 * Show all Comment entities by Activity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/listActivityComments")
	public ModelAndView listActivityComments(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/comments/listComments.jsp");

		return mav;
	}

	/**
	 * Create a new Task entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/createTask")
	public ModelAndView newUserActivityTask(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("task", new Task());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/tasks/editTasks.jsp");

		return mav;
	}

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_comments_commentid the related comments commentid
	 * @return the model and view
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
	 * Select the Activity entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteActivity")
	public ModelAndView confirmDeleteActivity(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/deleteActivity.jsp");

		return mav;
	}

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param activityidKey the activityid key
	 * @return the string
	 */
	@RequestMapping("/deleteActivity")
	public String deleteActivity(@RequestParam Integer activityidKey) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityidKey);
		activityService.deleteActivity(activity);
		return "forward:/indexActivity";
	}

	/**
	 * Create a new Activity entity.
	 *
	 * @return the model and view
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
	 * Show all Yourtaskuser entities by Activity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/listActivityYourtaskuser")
	public ModelAndView listActivityYourtaskuser(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/yourtaskuser/listYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Save an existing Comment entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param comments the comments
	 * @return the string
	 */
	@RequestMapping("/saveActivityComments/{userId}/{activityId}")
	public String saveActivityComments(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId, @ModelAttribute Comment comments) {		
		if (comments.getCommentid() == null) {
			int id = (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
			comments.setCommentid(id);
			comments.setCommentdate(Calendar.getInstance());
		}
		
		comments.setYourtaskuser(yourtaskuserDAO.findYourtaskuserByPrimaryKey(userId));
		activityService.saveActivityComments(activityId, comments);
		return "redirect:/su/"+userId+"/activity/"+activityId;
	}

	/**
	 * Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
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
	 * Select the child Comment entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param task the task
	 * @return the string
	 */
	/*
	@RequestMapping("/confirmDeleteActivityComments")
	public ModelAndView confirmDeleteActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer related_comments_commentid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(related_comments_commentid));
		mav.addObject("activity_activityid", activity_activityid);
		mav.setViewName("activity/comments/deleteComments.jsp");

		return mav;
	}
	*/

	/**
	* Save an existing Task entity
	* 
	*/
	@RequestMapping("/saveActivityTasks/{userId}/{activityId}")
	public String saveActivityTasks(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId, @ModelAttribute Task task) {
		if (task.getTaskid() == null) {
			task.setTaskid((int)(System.currentTimeMillis() % Integer.MAX_VALUE));
		}
		activityService.saveActivityTasks(activityId, task);

		/*
		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activityId);
		mav.addObject("activity", parent_activity);
		mav.setViewName("activity/detailsActivity.jsp");

		return mav;
		*/
		
		return "redirect:/su/"+userId+"/activity/"+activityId;
	}

	/**
	 * Entry point to show all Activity entities.
	 *
	 * @return the string
	 */
	public String indexActivity() {
		return "redirect:/indexActivity";
	}

	/**
	 * View an existing Diary entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param taskId the task id
	 * @return the model and view
	 */
	/*
	@RequestMapping("/selectActivityDiaries")
	public ModelAndView selectActivityDiaries(@RequestParam Integer activity_activityid, @RequestParam Integer diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaries_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("diary", diary);
		mav.setViewName("activity/diaries/viewDiaries.jsp");

		return mav;
	}
	*/
	/**
	* Edit an existing Task entity
	* 
	*/
	@RequestMapping("/su/{userId}/activity/{activityId}/task/{taskId}/editTask")
	public ModelAndView editActivityTasks(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("taskId") Integer taskId) {
		Task task = taskDAO.findTaskByPrimaryKey(taskId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("task", task);
		mav.setViewName("activity/tasks/editTasks.jsp");

		return mav;
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
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
	 * View an existing Task entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param tasks_taskid the tasks taskid
	 * @return the model and view
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
	 * Edit an existing Diary entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/editDiary")
	public ModelAndView editUserActivityDiary(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("diary", diary);
		mav.setViewName("activity/diaries/editDiaries.jsp");

		return mav;
	}

	/**
	 * Select an existing Activity entity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/selectActivity")
	public ModelAndView selectActivity(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/detailsActivity.jsp");

		return mav;
	}
	
	/**
	 * Select an existing Activity entity.
	 *
	 * @param activityId the activity id
	 * @return the model and view
	 */
	@RequestMapping("/su/allactivities/activity/{activityId}")
	public ModelAndView selectPublicActivity(@PathVariable("activityId") Integer activityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityId));
		mav.setViewName("activity/detailsPublicActivity.jsp");

		return mav;
	}
	
	/**
	 * Select user activity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}")
	public ModelAndView selectUserActivity(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityId, -1, -1);
		
		Set<Comment> listcomment = activity.getComments();
		Set<Yourtaskuser> listusercomment = new HashSet<Yourtaskuser>();
		for(Comment item : listcomment) {
			Comment comment = commentDAO.findCommentByPrimaryKey(item.getCommentid());
			listusercomment.add(comment.getYourtaskuser());
		}
		List<Yourtaskuser> listusercommentok = new ArrayList<>(listusercomment);
		

		ModelAndView mav = new ModelAndView();

		mav.addObject("listcomment", listcomment);
		mav.addObject("listusercomment", listusercommentok);
		
		mav.addObject("activity", activity);
		mav.addObject("userid", activity.getYourtaskuser().getUserid());
		
		mav.setViewName("activity/detailsActivity.jsp");

		return mav;
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
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
	 * Delete an existing Diary entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the string
	 */
	@RequestMapping("/deleteActivityDiaries/{userId}/{activityId}/{diaryId}")
	public String deleteActivityDiaries(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId) {
		//ModelAndView mav = new ModelAndView();

		activityService.deleteActivityDiaries(activityId, diaryId);
/*
		mav.addObject("activity_activityid", activityId);
		mav.addObject("activity", activity);
		mav.setViewName("activity/detailsActivity.jsp");

		return mav;
		*/
		return "redirect:/su/"+userId+"/activity/"+activityId;
	}

	/**
	 * Select the child Diary entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/deleteDiary")
	public ModelAndView confirmDeleteActivityDiaries(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(diaryId));
		mav.addObject("activityid",activityId);
		mav.addObject("userid",userId);
		mav.setViewName("activity/diaries/deleteDiaries.jsp");

		return mav;
	}

	/**
	 * Show all Diary entities by Activity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/listActivityDiaries")
	public ModelAndView listActivityDiaries(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/diaries/listDiaries.jsp");

		return mav;
	}

	/**
	 * Select the child Task entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param taskId the task id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/task/{taskId}/deleteTask")
	public ModelAndView confirmDeleteActivityTasks(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("taskId") Integer taskId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("task", taskDAO.findTaskByPrimaryKey(taskId));
		mav.addObject("activityid", activityId);
		mav.addObject("userid",userId);
		mav.setViewName("activity/tasks/deleteTasks.jsp");

		return mav;
	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diary the diary
	 * @return the string
	 */
	@RequestMapping("/saveActivityDiaries/{userId}/{activityId}")
	public String saveActivityDiaries(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId, @ModelAttribute Diary diary) {
		if (diary.getIddiary() == null) {
			diary.setIddiary((int)(System.currentTimeMillis() % Integer.MAX_VALUE));
			diary.setDiarydate(Calendar.getInstance());
		}
		diary.setYourtaskuser(activityDAO.findActivityByActivityid(activityId).getYourtaskuser());
		activityService.saveActivityDiaries(activityId, diary);

		return "redirect:/su/"+userId+"/activity/"+activityId;
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
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
	 * Edit an existing Activity entity.
	 *
	 * @param activityidKey the activityid key
	 * @return the model and view
	 */
	@RequestMapping("/editActivity")
	public ModelAndView editActivity(@RequestParam Integer activityidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityidKey));
		mav.setViewName("activity/editActivity.jsp");

		return mav;
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @return the model and view
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
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param yourtaskuser the yourtaskuser
	 * @return the model and view
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
	 * Register custom, context-specific property editors.
	 *
	 * @param binder the binder
	 * @param request the request
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
	 * Show all Activity entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/su/allactivities")
	public ModelAndView listActivitys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activitys", activityDAO.findActivityByActivityvisibility(true));

		mav.setViewName("activity/listActivities.jsp");

		return mav;
	}

	/**
	 * View an existing Comment entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the model and view
	 */
	/*
	@RequestMapping("/selectActivityComments")
	public ModelAndView selectActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comments_commentid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("comment", comment);
		mav.setViewName("activity/comments/viewComments.jsp");

		return mav;
	}*/

	/**
	* Create a new Diary entity
	* 
	*/
	@RequestMapping("/su/{userId}/activity/{activityId}/createDiary")
	public ModelAndView newUserActivityDiary(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("diary", new Diary());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/diaries/editDiaries.jsp");

		return mav;
	}

	/**
	 * Delete an existing Task entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param taskId the task id
	 * @return the string
	 */
	@RequestMapping("/deleteActivityTasks/{userId}/{activityId}/{taskId}")
	public String deleteActivityTasks(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId,@PathVariable("taskId") Integer taskId) {

		activityService.deleteActivityTasks(activityId, taskId);
		
		return "redirect:/su/"+userId+"/activity/"+activityId;
		
	}

	/**
	 * Edit an existing Comment entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the model and view
	 */
	/*
	@RequestMapping("/editActivityComments")
	public ModelAndView editActivityComments(@RequestParam Integer activity_activityid, @RequestParam Integer comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comments_commentid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activity_activityid);
		mav.addObject("comment", comment);
		mav.setViewName("activity/comments/editComments.jsp");

		return mav;
	}*/

	/**
	* Create a new Comment entity
	* 
	*/
	@RequestMapping("/su/{userId}/activity/{activityId}/createComment")
	public ModelAndView newUserActivityComment(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("comment", new Comment());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/comments/editComments.jsp");

		return mav;
	}
	
	/**
	 * Create a new Comment entity.
	 *
	 * @param activityId the activity id
	 * @return the model and view
	 */
	@RequestMapping("/su/allactivities/activity/{activityId}/createComment")
	public ModelAndView newPublicActivityComments(@PathVariable("activityId") Integer activityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("activity_activityid", activityId);
		mav.addObject("comment", new Comment());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/comments/editCommentsPublicActivity.jsp");

		return mav;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/activityController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Activity entity.
	 *
	 * @param activity the activity
	 * @return the string
	 */
	@RequestMapping("/saveActivity")
	public String saveActivity(@ModelAttribute Activity activity) {
		activityService.saveActivity(activity);
		return "forward:/indexActivity";
	}
	
	
	/**
	 * Select the activities of a user.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/su/activities")
	public ModelAndView activitiesByUser() {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser user = authentication.getActiveUser();
		mav.addObject("yourtaskuser", user);
		mav.setViewName("activity/yourtaskuser/activitiesByUser.jsp");
		return mav;
	}
	
	
	/**
	 * Create a new Activity entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/su/activity/new")
	public ModelAndView newUserActivity() {
		Yourtaskuser user = authentication.getActiveUser();
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser_userid", user.getUserid());
		mav.addObject("activity", new Activity());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/newactivity.jsp");

		return mav;
	}
}