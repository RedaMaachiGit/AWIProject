
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Diaryentry;
import com.aiop.yourtask.domain.Goal;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Diary entities
 * 
 */
public interface DiaryService {

	/**
	* Save an existing Activity entity
	* 
	 */
	public Diary saveDiaryActivity(Integer iddiary, Activity related_activity);

	/**
	* Delete an existing Diary entity
	* 
	 */
	public void deleteDiary(Diary diary);

	/**
	* Save an existing Diary entity
	* 
	 */
	public void saveDiary(Diary diary_1);

	/**
	 */
	public Diary findDiaryByPrimaryKey(Integer iddiary_1);

	/**
	* Load an existing Diary entity
	* 
	 */
	public Set<Diary> loadDiarys();

	/**
	* Delete an existing Diaryentry entity
	* 
	 */
	public Diary deleteDiaryDiaryentries(Integer diary_iddiary, Integer related_diaryentries_diaryentryid);

	/**
	* Delete an existing Goal entity
	* 
	 */
	public Diary deleteDiaryGoals(Integer diary_iddiary_1, Integer related_goals_goalid);

	/**
	* Return all Diary entity
	* 
	 */
	public List<Diary> findAllDiarys(Integer startResult, Integer maxRows);

	/**
	* Save an existing Diaryentry entity
	* 
	 */
	public Diary saveDiaryDiaryentries(Integer iddiary_2, Diaryentry related_diaryentries);

	/**
	* Return a count of all Diary entity
	* 
	 */
	public Integer countDiarys();

	/**
	* Save an existing Goal entity
	* 
	 */
	public Diary saveDiaryGoals(Integer iddiary_3, Goal related_goals);

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Diary deleteDiaryYourtaskuser(Integer diary_iddiary_2, Integer related_yourtaskuser_userid);

	/**
	* Delete an existing Activity entity
	* 
	 */
	public Diary deleteDiaryActivity(Integer diary_iddiary_3, Integer related_activity_activityid);

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Diary saveDiaryYourtaskuser(Integer iddiary_4, Yourtaskuser related_yourtaskuser);
}