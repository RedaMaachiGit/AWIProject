
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Task;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Activity entities
 * 
 */
public interface ActivityService {

	/**
	* Save an existing Diary entity
	* 
	 */
	public Activity saveActivityDiaries(Integer activityid, Diary related_diaries);

	/**
	* Delete an existing Activity entity
	* 
	 */
	public void deleteActivity(Activity activity);

	/**
	* Delete an existing Comment entity
	* 
	 */
	public Activity deleteActivityComments(Integer activity_activityid, Integer related_comments_commentid);

	/**
	* Return all Activity entity
	* 
	 */
	public List<Activity> findAllActivitys(Integer startResult, Integer maxRows);

	/**
	* Save an existing Comment entity
	* 
	 */
	public Activity saveActivityComments(Integer activityid_1, Comment related_comments);

	/**
	 */
	public Activity findActivityByPrimaryKey(Integer activityid_2);

	/**
	* Save an existing Task entity
	* 
	 */
	public Activity saveActivityTasks(Integer activityid_3, Task related_tasks);

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Activity saveActivityYourtaskuser(Integer activityid_4, Yourtaskuser related_yourtaskuser);

	/**
	* Save an existing Activity entity
	* 
	 */
	public void saveActivity(Activity activity_1);

	/**
	* Delete an existing Task entity
	* 
	 */
	public Activity deleteActivityTasks(Integer activity_activityid_1, Integer related_tasks_taskid);

	/**
	* Delete an existing Diary entity
	* 
	 */
	public Activity deleteActivityDiaries(Integer activity_activityid_2, Integer related_diaries_iddiary);

	/**
	* Return a count of all Activity entity
	* 
	 */
	public Integer countActivitys();

	/**
	* Load an existing Activity entity
	* 
	 */
	public Set<Activity> loadActivitys();

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Activity deleteActivityYourtaskuser(Integer activity_activityid_3, Integer related_yourtaskuser_userid);
}