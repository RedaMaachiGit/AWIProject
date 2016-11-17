
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Goal;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Goal entities
 * 
 */
public interface GoalService {

	/**
	* Load an existing Goal entity
	* 
	 */
	public Set<Goal> loadGoals();

	/**
	* Save an existing Goal entity
	* 
	 */
	public void saveGoal(Goal goal);

	/**
	* Delete an existing Goal entity
	* 
	 */
	public void deleteGoal(Goal goal_1);

	/**
	* Save an existing Diary entity
	* 
	 */
	public Goal saveGoalDiary(Integer goalid, Diary related_diary);

	/**
	 */
	public Goal findGoalByPrimaryKey(Integer goalid_1);

	/**
	* Return a count of all Goal entity
	* 
	 */
	public Integer countGoals();

	/**
	* Delete an existing Diary entity
	* 
	 */
	public Goal deleteGoalDiary(Integer goal_goalid, Integer related_diary_iddiary);

	/**
	* Return all Goal entity
	* 
	 */
	public List<Goal> findAllGoals(Integer startResult, Integer maxRows);
}