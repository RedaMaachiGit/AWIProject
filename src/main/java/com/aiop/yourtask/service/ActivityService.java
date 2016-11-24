/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Task;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Activity entities.
 */
public interface ActivityService {

	/**
	 * Save an existing Diary entity.
	 *
	 * @param activityid the activityid
	 * @param related_diaries the related diaries
	 * @return the activity
	 */
	public Activity saveActivityDiaries(Integer activityid, Diary related_diaries);

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param activity the activity
	 */
	public void deleteActivity(Activity activity);

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_comments_commentid the related comments commentid
	 * @return the activity
	 */
	public Activity deleteActivityComments(Integer activity_activityid, Integer related_comments_commentid);

	/**
	 * Return all Activity entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Activity> findAllActivitys(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Comment entity.
	 *
	 * @param activityid_1 the activityid 1
	 * @param related_comments the related comments
	 * @return the activity
	 */
	public Activity saveActivityComments(Integer activityid_1, Comment related_comments);

	/**
	 * Find activity by primary key.
	 *
	 * @param activityid_2 the activityid 2
	 * @return the activity
	 */
	public Activity findActivityByPrimaryKey(Integer activityid_2);

	/**
	 * Save an existing Task entity.
	 *
	 * @param activityid_3 the activityid 3
	 * @param related_tasks the related tasks
	 * @return the activity
	 */
	public Activity saveActivityTasks(Integer activityid_3, Task related_tasks);

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param activityid_4 the activityid 4
	 * @param related_yourtaskuser the related yourtaskuser
	 * @return the activity
	 */
	public Activity saveActivityYourtaskuser(Integer activityid_4, Yourtaskuser related_yourtaskuser);

	/**
	 * Save an existing Activity entity.
	 *
	 * @param activity_1 the activity 1
	 */
	public void saveActivity(Activity activity_1);

	/**
	 * Delete an existing Task entity.
	 *
	 * @param activity_activityid_1 the activity activityid 1
	 * @param related_tasks_taskid the related tasks taskid
	 * @return the activity
	 */
	public Activity deleteActivityTasks(Integer activity_activityid_1, Integer related_tasks_taskid);

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param activity_activityid_2 the activity activityid 2
	 * @param related_diaries_iddiary the related diaries iddiary
	 * @return the activity
	 */
	public Activity deleteActivityDiaries(Integer activity_activityid_2, Integer related_diaries_iddiary);

	/**
	 * Return a count of all Activity entity.
	 *
	 * @return the integer
	 */
	public Integer countActivitys();

	/**
	 * Load an existing Activity entity.
	 *
	 * @return the sets the
	 */
	public Set<Activity> loadActivitys();

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param activity_activityid_3 the activity activityid 3
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the activity
	 */
	public Activity deleteActivityYourtaskuser(Integer activity_activityid_3, Integer related_yourtaskuser_userid);
}