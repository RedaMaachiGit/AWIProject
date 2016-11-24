/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Diaryentry;
import com.aiop.yourtask.domain.Goal;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Diary entities.
 */
public interface DiaryService {

	/**
	 * Save an existing Activity entity.
	 *
	 * @param iddiary the iddiary
	 * @param related_activity the related activity
	 * @return the diary
	 */
	public Diary saveDiaryActivity(Integer iddiary, Activity related_activity);

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param diary the diary
	 */
	public void deleteDiary(Diary diary);

	/**
	 * Save an existing Diary entity.
	 *
	 * @param diary_1 the diary 1
	 */
	public void saveDiary(Diary diary_1);

	/**
	 * Find diary by primary key.
	 *
	 * @param iddiary_1 the iddiary 1
	 * @return the diary
	 */
	public Diary findDiaryByPrimaryKey(Integer iddiary_1);

	/**
	 * Load an existing Diary entity.
	 *
	 * @return the sets the
	 */
	public Set<Diary> loadDiarys();

	/**
	 * Delete an existing Diaryentry entity.
	 *
	 * @param diary_iddiary the diary iddiary
	 * @param related_diaryentries_diaryentryid the related diaryentries diaryentryid
	 * @return the diary
	 */
	public Diary deleteDiaryDiaryentries(Integer diary_iddiary, Integer related_diaryentries_diaryentryid);

	/**
	 * Delete an existing Goal entity.
	 *
	 * @param diary_iddiary_1 the diary iddiary 1
	 * @param related_goals_goalid the related goals goalid
	 * @return the diary
	 */
	public Diary deleteDiaryGoals(Integer diary_iddiary_1, Integer related_goals_goalid);

	/**
	 * Return all Diary entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Diary> findAllDiarys(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Diaryentry entity.
	 *
	 * @param iddiary_2 the iddiary 2
	 * @param related_diaryentries the related diaryentries
	 * @return the diary
	 */
	public Diary saveDiaryDiaryentries(Integer iddiary_2, Diaryentry related_diaryentries);

	/**
	 * Return a count of all Diary entity.
	 *
	 * @return the integer
	 */
	public Integer countDiarys();

	/**
	 * Save an existing Goal entity.
	 *
	 * @param iddiary_3 the iddiary 3
	 * @param related_goals the related goals
	 * @return the diary
	 */
	public Diary saveDiaryGoals(Integer iddiary_3, Goal related_goals);

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param diary_iddiary_2 the diary iddiary 2
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the diary
	 */
	public Diary deleteDiaryYourtaskuser(Integer diary_iddiary_2, Integer related_yourtaskuser_userid);

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param diary_iddiary_3 the diary iddiary 3
	 * @param related_activity_activityid the related activity activityid
	 * @return the diary
	 */
	public Diary deleteDiaryActivity(Integer diary_iddiary_3, Integer related_activity_activityid);

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param iddiary_4 the iddiary 4
	 * @param related_yourtaskuser the related yourtaskuser
	 * @return the diary
	 */
	public Diary saveDiaryYourtaskuser(Integer iddiary_4, Yourtaskuser related_yourtaskuser);
}