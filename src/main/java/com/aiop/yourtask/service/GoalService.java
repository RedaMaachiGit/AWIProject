/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Goal;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Goal entities.
 */
public interface GoalService {

	/**
	 * Load an existing Goal entity.
	 *
	 * @return the sets the
	 */
	public Set<Goal> loadGoals();

	/**
	 * Save an existing Goal entity.
	 *
	 * @param goal the goal
	 */
	public void saveGoal(Goal goal);

	/**
	 * Delete an existing Goal entity.
	 *
	 * @param goal_1 the goal 1
	 */
	public void deleteGoal(Goal goal_1);

	/**
	 * Save an existing Diary entity.
	 *
	 * @param goalid the goalid
	 * @param related_diary the related diary
	 * @return the goal
	 */
	public Goal saveGoalDiary(Integer goalid, Diary related_diary);

	/**
	 * Find goal by primary key.
	 *
	 * @param goalid_1 the goalid 1
	 * @return the goal
	 */
	public Goal findGoalByPrimaryKey(Integer goalid_1);

	/**
	 * Return a count of all Goal entity.
	 *
	 * @return the integer
	 */
	public Integer countGoals();

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param goal_goalid the goal goalid
	 * @param related_diary_iddiary the related diary iddiary
	 * @return the goal
	 */
	public Goal deleteGoalDiary(Integer goal_goalid, Integer related_diary_iddiary);

	/**
	 * Return all Goal entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Goal> findAllGoals(Integer startResult, Integer maxRows);
}