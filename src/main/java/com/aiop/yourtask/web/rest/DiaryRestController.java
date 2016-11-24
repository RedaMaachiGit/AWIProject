/*
 * 
 */
package com.aiop.yourtask.web.rest;

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

// TODO: Auto-generated Javadoc
/**
 * Spring Rest controller that handles CRUD requests for Diary entities.
 */

@Controller("DiaryRestController")

public class DiaryRestController {

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
	 * Show all Goal entities by Diary.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the diary goals
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/goals", method = RequestMethod.GET)
	@ResponseBody
	public List<Goal> getDiaryGoals(@PathVariable Integer diary_iddiary) {
		return new java.util.ArrayList<Goal>(diaryDAO.findDiaryByPrimaryKey(diary_iddiary).getGoals());
	}

	/**
	 * Save an existing Diaryentry entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param diaryentries the diaryentries
	 * @return the diaryentry
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/diaryentries", method = RequestMethod.PUT)
	@ResponseBody
	public Diaryentry saveDiaryDiaryentries(@PathVariable Integer diary_iddiary, @RequestBody Diaryentry diaryentries) {
		diaryService.saveDiaryDiaryentries(diary_iddiary, diaryentries);
		return diaryentryDAO.findDiaryentryByPrimaryKey(diaryentries.getDiaryentryid());
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
	 * Delete an existing Diary entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDiary(@PathVariable Integer diary_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary);
		diaryService.deleteDiary(diary);
	}

	/**
	 * Get Yourtaskuser entity by Diary.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the diary yourtaskuser
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/yourtaskuser", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser getDiaryYourtaskuser(@PathVariable Integer diary_iddiary) {
		return diaryDAO.findDiaryByPrimaryKey(diary_iddiary).getYourtaskuser();
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param yourtaskuser the yourtaskuser
	 * @return the yourtaskuser
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/yourtaskuser", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newDiaryYourtaskuser(@PathVariable Integer diary_iddiary, @RequestBody Yourtaskuser yourtaskuser) {
		diaryService.saveDiaryYourtaskuser(diary_iddiary, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDiaryYourtaskuser(@PathVariable Integer diary_iddiary, @PathVariable Integer related_yourtaskuser_userid) {
		diaryService.deleteDiaryYourtaskuser(diary_iddiary, related_yourtaskuser_userid);
	}

	/**
	 * View an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the yourtaskuser
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadDiaryYourtaskuser(@PathVariable Integer diary_iddiary, @PathVariable Integer related_yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	 * Create a new Diaryentry entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param diaryentry the diaryentry
	 * @return the diaryentry
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/diaryentries", method = RequestMethod.POST)
	@ResponseBody
	public Diaryentry newDiaryDiaryentries(@PathVariable Integer diary_iddiary, @RequestBody Diaryentry diaryentry) {
		diaryService.saveDiaryDiaryentries(diary_iddiary, diaryentry);
		return diaryentryDAO.findDiaryentryByPrimaryKey(diaryentry.getDiaryentryid());
	}

	/**
	 * View an existing Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_activity_activityid the related activity activityid
	 * @return the activity
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/activity/{activity_activityid}", method = RequestMethod.GET)
	@ResponseBody
	public Activity loadDiaryActivity(@PathVariable Integer diary_iddiary, @PathVariable Integer related_activity_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(related_activity_activityid, -1, -1);

		return activity;
	}

	/**
	 * Show all Diaryentry entities by Diary.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the diary diaryentries
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/diaryentries", method = RequestMethod.GET)
	@ResponseBody
	public List<Diaryentry> getDiaryDiaryentries(@PathVariable Integer diary_iddiary) {
		return new java.util.ArrayList<Diaryentry>(diaryDAO.findDiaryByPrimaryKey(diary_iddiary).getDiaryentries());
	}

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_activity_activityid the related activity activityid
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/activity/{activity_activityid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDiaryActivity(@PathVariable Integer diary_iddiary, @PathVariable Integer related_activity_activityid) {
		diaryService.deleteDiaryActivity(diary_iddiary, related_activity_activityid);
	}

	/**
	 * Get Activity entity by Diary.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the diary activity
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/activity", method = RequestMethod.GET)
	@ResponseBody
	public Activity getDiaryActivity(@PathVariable Integer diary_iddiary) {
		return diaryDAO.findDiaryByPrimaryKey(diary_iddiary).getActivity();
	}

	/**
	 * View an existing Diaryentry entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_diaryentries_diaryentryid the related diaryentries diaryentryid
	 * @return the diaryentry
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/diaryentries/{diaryentry_diaryentryid}", method = RequestMethod.GET)
	@ResponseBody
	public Diaryentry loadDiaryDiaryentries(@PathVariable Integer diary_iddiary, @PathVariable Integer related_diaryentries_diaryentryid) {
		Diaryentry diaryentry = diaryentryDAO.findDiaryentryByPrimaryKey(related_diaryentries_diaryentryid, -1, -1);

		return diaryentry;
	}

	/**
	 * Show all Diary entities.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "/Diary", method = RequestMethod.GET)
	@ResponseBody
	public List<Diary> listDiarys() {
		return new java.util.ArrayList<Diary>(diaryService.loadDiarys());
	}

	/**
	 * Create a new Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param activity the activity
	 * @return the activity
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/activity", method = RequestMethod.POST)
	@ResponseBody
	public Activity newDiaryActivity(@PathVariable Integer diary_iddiary, @RequestBody Activity activity) {
		diaryService.saveDiaryActivity(diary_iddiary, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param yourtaskuser the yourtaskuser
	 * @return the yourtaskuser
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/yourtaskuser", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveDiaryYourtaskuser(@PathVariable Integer diary_iddiary, @RequestBody Yourtaskuser yourtaskuser) {
		diaryService.saveDiaryYourtaskuser(diary_iddiary, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	 * Save an existing Activity entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param activity the activity
	 * @return the activity
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/activity", method = RequestMethod.PUT)
	@ResponseBody
	public Activity saveDiaryActivity(@PathVariable Integer diary_iddiary, @RequestBody Activity activity) {
		diaryService.saveDiaryActivity(diary_iddiary, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	 * View an existing Goal entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_goals_goalid the related goals goalid
	 * @return the goal
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/goals/{goal_goalid}", method = RequestMethod.GET)
	@ResponseBody
	public Goal loadDiaryGoals(@PathVariable Integer diary_iddiary, @PathVariable Integer related_goals_goalid) {
		Goal goal = goalDAO.findGoalByPrimaryKey(related_goals_goalid, -1, -1);

		return goal;
	}

	/**
	 * Create a new Diary entity.
	 *
	 * @param diary the diary
	 * @return the diary
	 */
	@RequestMapping(value = "/Diary", method = RequestMethod.POST)
	@ResponseBody
	public Diary newDiary(@RequestBody Diary diary) {
		diaryService.saveDiary(diary);
		return diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());
	}

	/**
	 * Delete an existing Diaryentry entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_diaryentries_diaryentryid the related diaryentries diaryentryid
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/diaryentries/{diaryentry_diaryentryid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDiaryDiaryentries(@PathVariable Integer diary_iddiary, @PathVariable Integer related_diaryentries_diaryentryid) {
		diaryService.deleteDiaryDiaryentries(diary_iddiary, related_diaryentries_diaryentryid);
	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param diary the diary
	 * @return the diary
	 */
	@RequestMapping(value = "/Diary", method = RequestMethod.PUT)
	@ResponseBody
	public Diary saveDiary(@RequestBody Diary diary) {
		diaryService.saveDiary(diary);
		return diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());
	}

	/**
	 * Delete an existing Goal entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_goals_goalid the related goals goalid
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/goals/{goal_goalid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDiaryGoals(@PathVariable Integer diary_iddiary, @PathVariable Integer related_goals_goalid) {
		diaryService.deleteDiaryGoals(diary_iddiary, related_goals_goalid);
	}

	/**
	 * Select an existing Diary entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @return the diary
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}", method = RequestMethod.GET)
	@ResponseBody
	public Diary loadDiary(@PathVariable Integer diary_iddiary) {
		return diaryDAO.findDiaryByPrimaryKey(diary_iddiary);
	}

	/**
	 * Save an existing Goal entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param goals the goals
	 * @return the goal
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/goals", method = RequestMethod.PUT)
	@ResponseBody
	public Goal saveDiaryGoals(@PathVariable Integer diary_iddiary, @RequestBody Goal goals) {
		diaryService.saveDiaryGoals(diary_iddiary, goals);
		return goalDAO.findGoalByPrimaryKey(goals.getGoalid());
	}

	/**
	 * Create a new Goal entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param goal the goal
	 * @return the goal
	 */
	@RequestMapping(value = "/Diary/{diary_iddiary}/goals", method = RequestMethod.POST)
	@ResponseBody
	public Goal newDiaryGoals(@PathVariable Integer diary_iddiary, @RequestBody Goal goal) {
		diaryService.saveDiaryGoals(diary_iddiary, goal);
		return goalDAO.findGoalByPrimaryKey(goal.getGoalid());
	}
}