/*
 * 
 */
package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.GoalDAO;

import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Goal;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Goal entities.
 */

@Service("GoalService")

@Transactional
public class GoalServiceImpl implements GoalService {

	/** DAO injected by Spring that manages Diary entities. */
	@Autowired
	private DiaryDAO diaryDAO;

	/** DAO injected by Spring that manages Goal entities. */
	@Autowired
	private GoalDAO goalDAO;

	/**
	 * Instantiates a new GoalServiceImpl.
	 *
	 */
	public GoalServiceImpl() {
	}

	/**
	 * Load an existing Goal entity.
	 *
	 * @return the sets the
	 */
	@Transactional
	public Set<Goal> loadGoals() {
		return goalDAO.findAllGoals();
	}

	/**
	 * Save an existing Goal entity.
	 *
	 * @param goal the goal
	 */
	@Transactional
	public void saveGoal(Goal goal) {
		Goal existingGoal = goalDAO.findGoalByPrimaryKey(goal.getGoalid());

		if (existingGoal != null) {
			if (existingGoal != goal) {
				existingGoal.setGoalid(goal.getGoalid());
				existingGoal.setGoalname(goal.getGoalname());
				existingGoal.setGoaldescription(goal.getGoaldescription());
			}
			goal = goalDAO.store(existingGoal);
		} else {
			goal = goalDAO.store(goal);
		}
		goalDAO.flush();
	}

	/**
	 * Delete an existing Goal entity.
	 *
	 * @param goal the goal
	 */
	@Transactional
	public void deleteGoal(Goal goal) {
		goalDAO.remove(goal);
		goalDAO.flush();
	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param goalid the goalid
	 * @param related_diary the related diary
	 * @return the goal
	 */
	@Transactional
	public Goal saveGoalDiary(Integer goalid, Diary related_diary) {
		Goal goal = goalDAO.findGoalByPrimaryKey(goalid, -1, -1);
		Diary existingdiary = diaryDAO.findDiaryByPrimaryKey(related_diary.getIddiary());

		// copy into the existing record to preserve existing relationships
		if (existingdiary != null) {
			existingdiary.setIddiary(related_diary.getIddiary());
			existingdiary.setDiaryname(related_diary.getDiaryname());
			existingdiary.setDiarydate(related_diary.getDiarydate());
			related_diary = existingdiary;
		}

		goal.setDiary(related_diary);
		related_diary.getGoals().add(goal);
		goal = goalDAO.store(goal);
		goalDAO.flush();

		related_diary = diaryDAO.store(related_diary);
		diaryDAO.flush();

		return goal;
	}

	/* (non-Javadoc)
	 * @see com.aiop.yourtask.service.GoalService#findGoalByPrimaryKey(java.lang.Integer)
	 */
	@Transactional
	public Goal findGoalByPrimaryKey(Integer goalid) {
		return goalDAO.findGoalByPrimaryKey(goalid);
	}

	/**
	 * Return a count of all Goal entity.
	 *
	 * @return the integer
	 */
	@Transactional
	public Integer countGoals() {
		return ((Long) goalDAO.createQuerySingleResult("select count(o) from Goal o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param related_diary_iddiary the related diary iddiary
	 * @return the goal
	 */
	@Transactional
	public Goal deleteGoalDiary(Integer goal_goalid, Integer related_diary_iddiary) {
		Goal goal = goalDAO.findGoalByPrimaryKey(goal_goalid, -1, -1);
		Diary related_diary = diaryDAO.findDiaryByPrimaryKey(related_diary_iddiary, -1, -1);

		goal.setDiary(null);
		related_diary.getGoals().remove(goal);
		goal = goalDAO.store(goal);
		goalDAO.flush();

		related_diary = diaryDAO.store(related_diary);
		diaryDAO.flush();

		diaryDAO.remove(related_diary);
		diaryDAO.flush();

		return goal;
	}

	/**
	 * Return all Goal entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	@Transactional
	public List<Goal> findAllGoals(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Goal>(goalDAO.findAllGoals(startResult, maxRows));
	}
}
