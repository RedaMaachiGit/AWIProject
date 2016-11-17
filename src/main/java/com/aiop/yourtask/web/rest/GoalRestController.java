package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.GoalDAO;

import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Goal;

import com.aiop.yourtask.service.GoalService;

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
 * Spring Rest controller that handles CRUD requests for Goal entities
 * 
 */

@Controller("GoalRestController")

public class GoalRestController {

	/**
	 * DAO injected by Spring that manages Diary entities
	 * 
	 */
	@Autowired
	private DiaryDAO diaryDAO;

	/**
	 * DAO injected by Spring that manages Goal entities
	 * 
	 */
	@Autowired
	private GoalDAO goalDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Goal entities
	 * 
	 */
	@Autowired
	private GoalService goalService;

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
	* Create a new Diary entity
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}/diary", method = RequestMethod.POST)
	@ResponseBody
	public Diary newGoalDiary(@PathVariable Integer goal_goalid, @RequestBody Diary diary) {
		goalService.saveGoalDiary(goal_goalid, diary);
		return diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());
	}

	/**
	* Show all Goal entities
	* 
	*/
	@RequestMapping(value = "/Goal", method = RequestMethod.GET)
	@ResponseBody
	public List<Goal> listGoals() {
		return new java.util.ArrayList<Goal>(goalService.loadGoals());
	}

	/**
	* Select an existing Goal entity
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}", method = RequestMethod.GET)
	@ResponseBody
	public Goal loadGoal(@PathVariable Integer goal_goalid) {
		return goalDAO.findGoalByPrimaryKey(goal_goalid);
	}

	/**
	* Delete an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}/diary/{diary_iddiary}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGoalDiary(@PathVariable Integer goal_goalid, @PathVariable Integer related_diary_iddiary) {
		goalService.deleteGoalDiary(goal_goalid, related_diary_iddiary);
	}

	/**
	* Create a new Goal entity
	* 
	*/
	@RequestMapping(value = "/Goal", method = RequestMethod.POST)
	@ResponseBody
	public Goal newGoal(@RequestBody Goal goal) {
		goalService.saveGoal(goal);
		return goalDAO.findGoalByPrimaryKey(goal.getGoalid());
	}

	/**
	* View an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}/diary/{diary_iddiary}", method = RequestMethod.GET)
	@ResponseBody
	public Diary loadGoalDiary(@PathVariable Integer goal_goalid, @PathVariable Integer related_diary_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(related_diary_iddiary, -1, -1);

		return diary;
	}

	/**
	* Delete an existing Goal entity
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGoal(@PathVariable Integer goal_goalid) {
		Goal goal = goalDAO.findGoalByPrimaryKey(goal_goalid);
		goalService.deleteGoal(goal);
	}

	/**
	* Save an existing Goal entity
	* 
	*/
	@RequestMapping(value = "/Goal", method = RequestMethod.PUT)
	@ResponseBody
	public Goal saveGoal(@RequestBody Goal goal) {
		goalService.saveGoal(goal);
		return goalDAO.findGoalByPrimaryKey(goal.getGoalid());
	}

	/**
	* Save an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}/diary", method = RequestMethod.PUT)
	@ResponseBody
	public Diary saveGoalDiary(@PathVariable Integer goal_goalid, @RequestBody Diary diary) {
		goalService.saveGoalDiary(goal_goalid, diary);
		return diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());
	}

	/**
	* Get Diary entity by Goal
	* 
	*/
	@RequestMapping(value = "/Goal/{goal_goalid}/diary", method = RequestMethod.GET)
	@ResponseBody
	public Diary getGoalDiary(@PathVariable Integer goal_goalid) {
		return goalDAO.findGoalByPrimaryKey(goal_goalid).getDiary();
	}
}