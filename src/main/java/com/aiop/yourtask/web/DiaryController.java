/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.DiaryentryDAO;
import com.aiop.yourtask.dao.GoalDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Diaryentry;
import com.aiop.yourtask.domain.Goal;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.DiaryService;

import java.util.Calendar;

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
 * Spring MVC controller that handles CRUD requests for Diary entities.
 */

@Controller("DiaryController")

public class DiaryController {

	/** DAO injected by Spring that manages Activity entities. */
	@Autowired
	private ActivityDAO activityDAO;

	/** DAO injected by Spring that manages Diary entities. */
	@Autowired
	private DiaryDAO diaryDAO;

	/** DAO injected by Spring that manages Diaryentry entities. */
	@Autowired
	private DiaryentryDAO diaryentryDAO;

	/** DAO injected by Spring that manages Goal entities. */
	@Autowired
	private GoalDAO goalDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Diary entities. */
	@Autowired
	private DiaryService diaryService;

	/**
	 * Edit an existing Diaryentry entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param diaryentryId the diaryentry id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/diaryentry/{diaryentryId}/editDiaryentry")
	public ModelAndView editDiaryDiaryentries(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId,@PathVariable("diaryentryId") Integer diaryentryId) {
		Diaryentry diaryentry = diaryentryDAO.findDiaryentryByPrimaryKey(diaryentryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("diaryid", diaryId);
		mav.addObject("diaryentry", diaryentry);
		mav.setViewName("diary/diaryentries/editDiaryentries.jsp");

		return mav;
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/deleteDiaryYourtaskuser")
	public ModelAndView deleteDiaryYourtaskuser(@RequestParam Integer diary_iddiary, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		Diary diary = diaryService.deleteDiaryYourtaskuser(diary_iddiary, related_yourtaskuser_userid);

		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("diary", diary);
		mav.setViewName("diary/viewDiary.jsp");

		return mav;
	}

	/**
	 * Create a new Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the model and view
	 */
	@RequestMapping("/newDiaryActivity")
	public ModelAndView newDiaryActivity(@RequestParam Integer diary_iddiary) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("activity", new Activity());
		mav.addObject("newFlag", true);
		mav.setViewName("diary/activity/editActivity.jsp");

		return mav;
	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param diary the diary
	 * @return the string
	 */
	@RequestMapping("/saveDiary")
	public String saveDiary(@ModelAttribute Diary diary) {
		diaryService.saveDiary(diary);
		return "forward:/indexDiary";
	}

	/**
	 * Delete an existing Goal entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param goalId the goal id
	 * @return the string
	 */
	@RequestMapping("/deleteDiaryGoals/{userId}/{activityId}/{diaryId}/{goalId}")
	public String deleteDiaryGoals(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId,@PathVariable("goalId") Integer goalId ) {
		diaryService.deleteDiaryGoals(diaryId, goalId);
		return "redirect:/su/"+userId+"/activity/"+activityId+"/diary/"+diaryId;
	}

	/**
	 * Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteDiaryYourtaskuser")
	public ModelAndView confirmDeleteDiaryYourtaskuser(@RequestParam Integer diary_iddiary, @RequestParam Integer related_yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid));
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.setViewName("diary/yourtaskuser/deleteYourtaskuser.jsp");

		return mav;
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/selectDiaryYourtaskuser")
	public ModelAndView selectDiaryYourtaskuser(@RequestParam Integer diary_iddiary, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("diary/yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the Diary entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteDiary")
	public ModelAndView confirmDeleteDiary(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("diary/deleteDiary.jsp");

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
	 * Show all Diaryentry entities by Diary.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	@RequestMapping("/listDiaryDiaryentries")
	public ModelAndView listDiaryDiaryentries(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("diary/diaryentries/listDiaryentries.jsp");

		return mav;
	}

	/**
	 * View an existing Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param activity_activityid the activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/selectDiaryActivity")
	public ModelAndView selectDiaryActivity(@RequestParam Integer diary_iddiary, @RequestParam Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("activity", activity);
		mav.setViewName("diary/activity/viewActivity.jsp");

		return mav;
	}

	/**
	 * Select the child Diaryentry entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param diaryentryId the diaryentry id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/diaryentry/{diaryentryId}/deleteDiaryentry")
	public ModelAndView confirmDeleteDiaryDiaryentries(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId,@PathVariable("diaryentryId") Integer diaryentryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diaryentry", diaryentryDAO.findDiaryentryByPrimaryKey(diaryentryId));
		mav.addObject("diaryid", diaryId);
		mav.addObject("activityid",activityId);
		mav.addObject("userid",userId);
		mav.setViewName("diary/diaryentries/deleteDiaryentries.jsp");

		return mav;
	}

	/**
	 * Save an existing Diaryentry entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param diaryentry the diaryentry
	 * @return the string
	 */
	@RequestMapping("/saveDiaryDiaryentries/{userId}/{activityId}/{diaryId}")
	public String saveDiaryDiaryentries(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId, @PathVariable("diaryId") Integer diaryId, @ModelAttribute Diaryentry diaryentry) {
		if (diaryentry.getDiaryentryid() == null) {
			diaryentry.setDiaryentryid((int)(System.currentTimeMillis() % Integer.MAX_VALUE));
			diaryentry.setDiaryentrydate(Calendar.getInstance());
		}
		diaryService.saveDiaryDiaryentries(diaryId, diaryentry);

		return "redirect:/su/"+userId+"/activity/"+activityId+"/diary/"+diaryId;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/diaryController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Diary entity.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	@RequestMapping("/editDiary")
	public ModelAndView editDiary(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("diary/editDiary.jsp");

		return mav;
	}

	/**
	 * View an existing Goal entity.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	/*
	@RequestMapping("/selectDiaryGoals")
	public ModelAndView selectDiaryGoals(@RequestParam Integer diary_iddiary, @RequestParam Integer goals_goalid) {
		Goal goal = goalDAO.findGoalByPrimaryKey(goals_goalid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("goal", goal);
		mav.setViewName("diary/goals/viewGoals.jsp");

		return mav;
	}*/

	/**
	* Show all Goal entities by Diary
	* 
	*/
	@RequestMapping("/listDiaryGoals")
	public ModelAndView listDiaryGoals(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("diary/goals/listGoals.jsp");

		return mav;
	}

	/**
	 * Show all Yourtaskuser entities by Diary.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	@RequestMapping("/listDiaryYourtaskuser")
	public ModelAndView listDiaryYourtaskuser(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("diary/yourtaskuser/listYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new Goal entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/createGoal")
	public ModelAndView newUserActivityDiaryGoal(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diaryid", diaryId);
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("goal", new Goal());
		mav.addObject("newFlag", true);
		mav.setViewName("diary/goals/editGoals.jsp");

		return mav;
	}

	/**
	 * Show all Diary entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexDiary")
	public ModelAndView listDiarys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diarys", diaryService.loadDiarys());

		mav.setViewName("diary/listDiarys.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Diary entities.
	 *
	 * @return the string
	 */
	public String indexDiary() {
		return "redirect:/indexDiary";
	}

	/**
	 * Save an existing Goal entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param goal the goal
	 * @return the string
	 */
	@RequestMapping("/saveDiaryGoals/{userId}/{activityId}/{diaryId}")
	public String saveDiaryGoals(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId, @PathVariable("diaryId") Integer diaryId, @ModelAttribute Goal goal) {
		if (goal.getGoalid() == null) {
			goal.setGoalid((int)(System.currentTimeMillis() % Integer.MAX_VALUE));
		}
		diaryService.saveDiaryGoals(diaryId, goal);

		return "redirect:/su/"+userId+"/activity/"+activityId+"/diary/"+diaryId;
	}

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the string
	 */
	@RequestMapping("/deleteDiary")
	public String deleteDiary(@RequestParam Integer iddiaryKey) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(iddiaryKey);
		diaryService.deleteDiary(diary);
		return "forward:/indexDiary";
	}

	/**
	 * View an existing Diaryentry entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param activity_activityid the activity activityid
	 * @return the model and view
	 */
	/*
	@RequestMapping("/selectDiaryDiaryentries")
	public ModelAndView selectDiaryDiaryentries(@RequestParam Integer diary_iddiary, @RequestParam Integer diaryentries_diaryentryid) {
		Diaryentry diaryentry = diaryentryDAO.findDiaryentryByPrimaryKey(diaryentries_diaryentryid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("diaryentry", diaryentry);
		mav.setViewName("diary/diaryentries/viewDiaryentries.jsp");

		return mav;
	}*/

	/**
	* Edit an existing Activity entity
	* 
	*/
	@RequestMapping("/editDiaryActivity")
	public ModelAndView editDiaryActivity(@RequestParam Integer diary_iddiary, @RequestParam Integer activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("activity", activity);
		mav.setViewName("diary/activity/editActivity.jsp");

		return mav;
	}

	/**
	 * Show all Activity entities by Diary.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	@RequestMapping("/listDiaryActivity")
	public ModelAndView listDiaryActivity(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("diary/activity/listActivity.jsp");

		return mav;
	}

	/**
	 * Create a new Diary entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newDiary")
	public ModelAndView newDiary() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", new Diary());
		mav.addObject("newFlag", true);
		mav.setViewName("diary/editDiary.jsp");

		return mav;
	}

	/**
	 * Select the child Activity entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_activity_activityid the related activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteDiaryActivity")
	public ModelAndView confirmDeleteDiaryActivity(@RequestParam Integer diary_iddiary, @RequestParam Integer related_activity_activityid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(related_activity_activityid));
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.setViewName("diary/activity/deleteActivity.jsp");

		return mav;
	}

	/**
	 * Delete an existing Diaryentry entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param diaryentryId the diaryentry id
	 * @return the string
	 */
	@RequestMapping("/deleteDiaryDiaryentries/{userId}/{activityId}/{diaryId}/{diaryentryId}")
	public String deleteDiaryDiaryentries(@PathVariable("userId") Integer userId, @PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId,@PathVariable("diaryentryId") Integer diaryentryId ) {
		diaryService.deleteDiaryDiaryentries(diaryId, diaryentryId);
		return "redirect:/su/"+userId+"/activity/"+activityId+"/diary/"+diaryId;
	}

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_activity_activityid the related activity activityid
	 * @return the model and view
	 */
	@RequestMapping("/deleteDiaryActivity")
	public ModelAndView deleteDiaryActivity(@RequestParam Integer diary_iddiary, @RequestParam Integer related_activity_activityid) {
		ModelAndView mav = new ModelAndView();

		Diary diary = diaryService.deleteDiaryActivity(diary_iddiary, related_activity_activityid);

		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("diary", diary);
		mav.setViewName("diary/viewDiary.jsp");

		return mav;
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/editDiaryYourtaskuser")
	public ModelAndView editDiaryYourtaskuser(@RequestParam Integer diary_iddiary, @RequestParam Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("diary/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param yourtaskuser the yourtaskuser
	 * @return the model and view
	 */
	@RequestMapping("/saveDiaryYourtaskuser")
	public ModelAndView saveDiaryYourtaskuser(@RequestParam Integer diary_iddiary, @ModelAttribute Yourtaskuser yourtaskuser) {
		Diary parent_diary = diaryService.saveDiaryYourtaskuser(diary_iddiary, yourtaskuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("diary", parent_diary);
		mav.setViewName("diary/viewDiary.jsp");

		return mav;
	}

	/**
	 * Save an existing Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param activity the activity
	 * @return the model and view
	 */
	@RequestMapping("/saveDiaryActivity")
	public ModelAndView saveDiaryActivity(@RequestParam Integer diary_iddiary, @ModelAttribute Activity activity) {
		Diary parent_diary = diaryService.saveDiaryActivity(diary_iddiary, activity);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("diary", parent_diary);
		mav.setViewName("diary/viewDiary.jsp");

		return mav;
	}

	/**
	 * Select an existing Diary entity.
	 *
	 * @param iddiaryKey the iddiary key
	 * @return the model and view
	 */
	
	@RequestMapping("/selectDiary")
	public ModelAndView selectDiary(@RequestParam Integer iddiaryKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(iddiaryKey));
		mav.setViewName("activity/su/diaries/detailsDiary.jsp");

		return mav;
	}
	
	/**
	 * Select user activity diary.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the model and view
	 */
	@RequestMapping("/su/activity/{activityId}/diary/{diaryId}")
	public ModelAndView selectUserActivityDiary(@PathVariable("activityId") Integer activityId, @PathVariable("diaryId") Integer diaryId) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaryId, -1, -1);
		Activity activity = activityDAO.findActivityByActivityid(activityId);
		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", activity.getYourtaskuser().getUserid());
		mav.addObject("diary", diary);
		mav.setViewName("activity/su/diaries/detailsDiary.jsp");

		return mav;
	}
	
	/**
	 * Select public activity diaries.
	 *
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the model and view
	 */
	@RequestMapping("/su/allactivities/activity/{activityId}/diary/{diaryId}")
	public ModelAndView selectPublicActivityDiaries(@PathVariable("activityId") Integer activityId, @PathVariable("diaryId") Integer diaryId) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaryId, -1, -1);
		Activity activity = activityDAO.findActivityByActivityid(activityId);
		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", activity.getYourtaskuser().getUserid());
		mav.addObject("diary", diary);
		mav.setViewName("activity/su/diaries/detailsDiaryPublicActivity.jsp");

		return mav;
	}

	/**
	 * Edit an existing Goal entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param goalId the goal id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/goal/{goalId}/editGoal")
	public ModelAndView editDiaryGoals(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId,@PathVariable("goalId") Integer goalId) {
		Goal goal = goalDAO.findGoalByPrimaryKey(goalId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("diaryid", diaryId);
		mav.addObject("goal", goal);
		mav.setViewName("diary/goals/editGoals.jsp");

		return mav;
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the model and view
	 */
	@RequestMapping("/newDiaryYourtaskuser")
	public ModelAndView newDiaryYourtaskuser(@RequestParam Integer diary_iddiary) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diary_iddiary", diary_iddiary);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("diary/yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new Diaryentry entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/createDiaryentry")
	public ModelAndView newUserActivityDiaryDiaryentry(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diaryid", diaryId);
		mav.addObject("activityid", activityId);
		mav.addObject("userid", userId);
		mav.addObject("diaryentry", new Diaryentry());
		mav.addObject("newFlag", true);
		mav.setViewName("diary/diaryentries/editDiaryentries.jsp");

		return mav;
	}

	/**
	 * Select the child Goal entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @param diaryId the diary id
	 * @param goalId the goal id
	 * @return the model and view
	 */
	@RequestMapping("/su/{userId}/activity/{activityId}/diary/{diaryId}/goal/{goalId}/deleteGoal")
	public ModelAndView confirmDeleteDiaryGoals(@PathVariable("userId") Integer userId,@PathVariable("activityId") Integer activityId,@PathVariable("diaryId") Integer diaryId,@PathVariable("goalId") Integer goalId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goal", goalDAO.findGoalByPrimaryKey(goalId));
		mav.addObject("diaryid", diaryId);
		mav.addObject("activityid",activityId);
		mav.addObject("userid",userId);
		mav.setViewName("diary/goals/deleteGoals.jsp");

		return mav;
	}
}