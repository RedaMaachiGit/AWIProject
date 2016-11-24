/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.GoalDAO;

import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Goal;

import com.aiop.yourtask.service.GoalService;

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

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Goal entities.
 */

@Controller("GoalController")

public class GoalController {

	/** DAO injected by Spring that manages Diary entities. */
	@Autowired
	private DiaryDAO diaryDAO;

	/** DAO injected by Spring that manages Goal entities. */
	@Autowired
	private GoalDAO goalDAO;

	/** Service injected by Spring that provides CRUD operations for Goal entities. */
	@Autowired
	private GoalService goalService;

	/**
	 * Entry point to show all Goal entities.
	 *
	 * @return the string
	 */
	public String indexGoal() {
		return "redirect:/indexGoal";
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/goalController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Goal entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexGoal")
	public ModelAndView listGoals() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goals", goalService.loadGoals());

		mav.setViewName("goal/listGoals.jsp");

		return mav;
	}

	/**
	 * Create a new Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @return the model and view
	 */
	@RequestMapping("/newGoalDiary")
	public ModelAndView newGoalDiary(@RequestParam Integer goal_goalid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("goal_goalid", goal_goalid);
		mav.addObject("diary", new Diary());
		mav.addObject("newFlag", true);
		mav.setViewName("goal/diary/editDiary.jsp");

		return mav;
	}

	/**
	 * Edit an existing Goal entity.
	 *
	 * @param goalidKey the goalid key
	 * @return the model and view
	 */
	@RequestMapping("/editGoal")
	public ModelAndView editGoal(@RequestParam Integer goalidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goal", goalDAO.findGoalByPrimaryKey(goalidKey));
		mav.setViewName("goal/editGoal.jsp");

		return mav;
	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param diary the diary
	 * @return the model and view
	 */
	@RequestMapping("/saveGoalDiary")
	public ModelAndView saveGoalDiary(@RequestParam Integer goal_goalid, @ModelAttribute Diary diary) {
		Goal parent_goal = goalService.saveGoalDiary(goal_goalid, diary);

		ModelAndView mav = new ModelAndView();
		mav.addObject("goal_goalid", goal_goalid);
		mav.addObject("goal", parent_goal);
		mav.setViewName("goal/viewGoal.jsp");

		return mav;
	}

	/**
	 * Delete an existing Goal entity.
	 *
	 * @param goalidKey the goalid key
	 * @return the string
	 */
	@RequestMapping("/deleteGoal")
	public String deleteGoal(@RequestParam Integer goalidKey) {
		Goal goal = goalDAO.findGoalByPrimaryKey(goalidKey);
		goalService.deleteGoal(goal);
		return "forward:/indexGoal";
	}

	/**
	 * Create a new Goal entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newGoal")
	public ModelAndView newGoal() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goal", new Goal());
		mav.addObject("newFlag", true);
		mav.setViewName("goal/editGoal.jsp");

		return mav;
	}

	/**
	 * Select the child Diary entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param related_diary_iddiary the related diary iddiary
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteGoalDiary")
	public ModelAndView confirmDeleteGoalDiary(@RequestParam Integer goal_goalid, @RequestParam Integer related_diary_iddiary) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(related_diary_iddiary));
		mav.addObject("goal_goalid", goal_goalid);
		mav.setViewName("goal/diary/deleteDiary.jsp");

		return mav;
	}

	/**
	 * Select an existing Goal entity.
	 *
	 * @param goalidKey the goalid key
	 * @return the model and view
	 */
	@RequestMapping("/selectGoal")
	public ModelAndView selectGoal(@RequestParam Integer goalidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goal", goalDAO.findGoalByPrimaryKey(goalidKey));
		mav.setViewName("goal/viewGoal.jsp");

		return mav;
	}

	/**
	 * Show all Diary entities by Goal.
	 *
	 * @param goalidKey the goalid key
	 * @return the model and view
	 */
	@RequestMapping("/listGoalDiary")
	public ModelAndView listGoalDiary(@RequestParam Integer goalidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goal", goalDAO.findGoalByPrimaryKey(goalidKey));
		mav.setViewName("goal/diary/listDiary.jsp");

		return mav;
	}

	/**
	 * Select the Goal entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param goalidKey the goalid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteGoal")
	public ModelAndView confirmDeleteGoal(@RequestParam Integer goalidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("goal", goalDAO.findGoalByPrimaryKey(goalidKey));
		mav.setViewName("goal/deleteGoal.jsp");

		return mav;
	}

	/**
	 * View an existing Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param diary_iddiary the diary iddiary
	 * @return the model and view
	 */
	@RequestMapping("/selectGoalDiary")
	public ModelAndView selectGoalDiary(@RequestParam Integer goal_goalid, @RequestParam Integer diary_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("goal_goalid", goal_goalid);
		mav.addObject("diary", diary);
		mav.setViewName("goal/diary/viewDiary.jsp");

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
	 * Save an existing Goal entity.
	 *
	 * @param goal the goal
	 * @return the string
	 */
	@RequestMapping("/saveGoal")
	public String saveGoal(@ModelAttribute Goal goal) {
		goalService.saveGoal(goal);
		return "forward:/indexGoal";
	}

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param related_diary_iddiary the related diary iddiary
	 * @return the model and view
	 */
	@RequestMapping("/deleteGoalDiary")
	public ModelAndView deleteGoalDiary(@RequestParam Integer goal_goalid, @RequestParam Integer related_diary_iddiary) {
		ModelAndView mav = new ModelAndView();

		Goal goal = goalService.deleteGoalDiary(goal_goalid, related_diary_iddiary);

		mav.addObject("goal_goalid", goal_goalid);
		mav.addObject("goal", goal);
		mav.setViewName("goal/viewGoal.jsp");

		return mav;
	}

	/**
	 * Edit an existing Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param diary_iddiary the diary iddiary
	 * @return the model and view
	 */
	@RequestMapping("/editGoalDiary")
	public ModelAndView editGoalDiary(@RequestParam Integer goal_goalid, @RequestParam Integer diary_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("goal_goalid", goal_goalid);
		mav.addObject("diary", diary);
		mav.setViewName("goal/diary/editDiary.jsp");

		return mav;
	}
}