/*
 * 
 */
package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.TaskDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Task;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Activity entities.
 */

@Service("ActivityService")

@Transactional
public class ActivityServiceImpl implements ActivityService {

	/** DAO injected by Spring that manages Activity entities. */
	@Autowired
	private ActivityDAO activityDAO;

	/** DAO injected by Spring that manages Comment entities. */
	@Autowired
	private CommentDAO commentDAO;

	/** DAO injected by Spring that manages Diary entities. */
	@Autowired
	private DiaryDAO diaryDAO;

	/** DAO injected by Spring that manages Task entities. */
	@Autowired
	private TaskDAO taskDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Instantiates a new ActivityServiceImpl.
	 *
	 */
	public ActivityServiceImpl() {
	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param activityid the activityid
	 * @param related_diaries the related diaries
	 * @return the activity
	 */
	@Transactional
	public Activity saveActivityDiaries(Integer activityid, Diary related_diaries) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityid, -1, -1);
		Diary existingdiaries = diaryDAO.findDiaryByPrimaryKey(related_diaries.getIddiary());

		// copy into the existing record to preserve existing relationships
		if (existingdiaries != null) {
			existingdiaries.setIddiary(related_diaries.getIddiary());
			existingdiaries.setDiaryname(related_diaries.getDiaryname());
			existingdiaries.setDiarydate(related_diaries.getDiarydate());
			related_diaries = existingdiaries;
		}

		related_diaries.setActivity(activity);
		activity.getDiaries().add(related_diaries);
		related_diaries = diaryDAO.store(related_diaries);
		diaryDAO.flush();

		activity = activityDAO.store(activity);
		activityDAO.flush();

		return activity;
	}

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param activity the activity
	 */
	@Transactional
	public void deleteActivity(Activity activity) {
		activityDAO.remove(activity);
		activityDAO.flush();
	}

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_comments_commentid the related comments commentid
	 * @return the activity
	 */
	@Transactional
	public Activity deleteActivityComments(Integer activity_activityid, Integer related_comments_commentid) {
		Comment related_comments = commentDAO.findCommentByPrimaryKey(related_comments_commentid, -1, -1);

		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		related_comments.setActivity(null);
		activity.getComments().remove(related_comments);

		commentDAO.remove(related_comments);
		commentDAO.flush();

		return activity;
	}

	/**
	 * Return all Activity entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	@Transactional
	public List<Activity> findAllActivitys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Activity>(activityDAO.findAllActivitys(startResult, maxRows));
	}

	/**
	 * Save an existing Comment entity.
	 *
	 * @param activityid the activityid
	 * @param related_comments the related comments
	 * @return the activity
	 */
	@Transactional
	public Activity saveActivityComments(Integer activityid, Comment related_comments) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityid, -1, -1);
		Comment existingcomments = commentDAO.findCommentByPrimaryKey(related_comments.getCommentid());

		// copy into the existing record to preserve existing relationships
		if (existingcomments != null) {
			existingcomments.setCommentid(related_comments.getCommentid());
			existingcomments.setCommentcontent(related_comments.getCommentcontent());
			existingcomments.setCommentdate(related_comments.getCommentdate());
			related_comments = existingcomments;
		}

		related_comments.setActivity(activity);
		activity.getComments().add(related_comments);
		related_comments = commentDAO.store(related_comments);
		commentDAO.flush();

		activity = activityDAO.store(activity);
		activityDAO.flush();

		return activity;
	}

	/* (non-Javadoc)
	 * @see com.aiop.yourtask.service.ActivityService#findActivityByPrimaryKey(java.lang.Integer)
	 */
	@Transactional
	public Activity findActivityByPrimaryKey(Integer activityid) {
		return activityDAO.findActivityByPrimaryKey(activityid);
	}

	/**
	 * Save an existing Task entity.
	 *
	 * @param activityid the activityid
	 * @param related_tasks the related tasks
	 * @return the activity
	 */
	@Transactional
	public Activity saveActivityTasks(Integer activityid, Task related_tasks) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityid, -1, -1);
		Task existingtasks = taskDAO.findTaskByPrimaryKey(related_tasks.getTaskid());

		// copy into the existing record to preserve existing relationships
		if (existingtasks != null) {
			existingtasks.setTaskid(related_tasks.getTaskid());
			existingtasks.setTaskcontent(related_tasks.getTaskcontent());
			related_tasks = existingtasks;
		}

		related_tasks.setActivity(activity);
		activity.getTasks().add(related_tasks);
		related_tasks = taskDAO.store(related_tasks);
		taskDAO.flush();

		activity = activityDAO.store(activity);
		activityDAO.flush();

		return activity;
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param activityid the activityid
	 * @param related_yourtaskuser the related yourtaskuser
	 * @return the activity
	 */
	@Transactional
	public Activity saveActivityYourtaskuser(Integer activityid, Yourtaskuser related_yourtaskuser) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityid, -1, -1);
		Yourtaskuser existingyourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser.getUserid());

		// copy into the existing record to preserve existing relationships
		if (existingyourtaskuser != null) {
			existingyourtaskuser.setUserid(related_yourtaskuser.getUserid());
			existingyourtaskuser.setUserdateofbirth(related_yourtaskuser.getUserdateofbirth());
			existingyourtaskuser.setUserphonenumber(related_yourtaskuser.getUserphonenumber());
			existingyourtaskuser.setUseremail(related_yourtaskuser.getUseremail());
			existingyourtaskuser.setUserstreetnumber(related_yourtaskuser.getUserstreetnumber());
			existingyourtaskuser.setUserzipcode(related_yourtaskuser.getUserzipcode());
			existingyourtaskuser.setUsercity(related_yourtaskuser.getUsercity());
			existingyourtaskuser.setUserusername(related_yourtaskuser.getUserusername());
			existingyourtaskuser.setUserpassword(related_yourtaskuser.getUserpassword());
			existingyourtaskuser.setUsertoken(related_yourtaskuser.getUsertoken());
			existingyourtaskuser.setUserlastconnectiondate(related_yourtaskuser.getUserlastconnectiondate());
			existingyourtaskuser.setUsertype(related_yourtaskuser.getUsertype());
			existingyourtaskuser.setUseriban(related_yourtaskuser.getUseriban());
			related_yourtaskuser = existingyourtaskuser;
		}

		activity.setYourtaskuser(related_yourtaskuser);
		related_yourtaskuser.getActivities().add(activity);
		activity = activityDAO.store(activity);
		activityDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return activity;
	}

	/**
	 * Save an existing Activity entity.
	 *
	 * @param activity the activity
	 */
	@Transactional
	public void saveActivity(Activity activity) {
		Activity existingActivity = activityDAO.findActivityByPrimaryKey(activity.getActivityid());

		if (existingActivity != null) {
			if (existingActivity != activity) {
				existingActivity.setActivityid(activity.getActivityid());
				existingActivity.setActivityname(activity.getActivityname());
				existingActivity.setActivitydescription(activity.getActivitydescription());
				existingActivity.setActivityvisibility(activity.getActivityvisibility());
			}
			activity = activityDAO.store(existingActivity);
		} else {
			activity = activityDAO.store(activity);
		}
		activityDAO.flush();
	}

	/**
	 * Delete an existing Task entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_tasks_taskid the related tasks taskid
	 * @return the activity
	 */
	@Transactional
	public Activity deleteActivityTasks(Integer activity_activityid, Integer related_tasks_taskid) {
		Task related_tasks = taskDAO.findTaskByPrimaryKey(related_tasks_taskid, -1, -1);

		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		related_tasks.setActivity(null);
		activity.getTasks().remove(related_tasks);

		taskDAO.remove(related_tasks);
		taskDAO.flush();

		return activity;
	}

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_diaries_iddiary the related diaries iddiary
	 * @return the activity
	 */
	@Transactional
	public Activity deleteActivityDiaries(Integer activity_activityid, Integer related_diaries_iddiary) {
		Diary related_diaries = diaryDAO.findDiaryByPrimaryKey(related_diaries_iddiary, -1, -1);

		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);

		related_diaries.setActivity(null);
		activity.getDiaries().remove(related_diaries);

		diaryDAO.remove(related_diaries);
		diaryDAO.flush();

		return activity;
	}

	/**
	 * Return a count of all Activity entity.
	 *
	 * @return the integer
	 */
	@Transactional
	public Integer countActivitys() {
		return ((Long) activityDAO.createQuerySingleResult("select count(o) from Activity o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Activity entity.
	 *
	 * @return the sets the
	 */
	@Transactional
	public Set<Activity> loadActivitys() {
		return activityDAO.findAllActivitys();
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param activity_activityid the activity activityid
	 * @param related_yourtaskuser_userid the related yourtaskuser userid
	 * @return the activity
	 */
	@Transactional
	public Activity deleteActivityYourtaskuser(Integer activity_activityid, Integer related_yourtaskuser_userid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_activityid, -1, -1);
		Yourtaskuser related_yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		activity.setYourtaskuser(null);
		related_yourtaskuser.getActivities().remove(activity);
		activity = activityDAO.store(activity);
		activityDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		yourtaskuserDAO.remove(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return activity;
	}
}
