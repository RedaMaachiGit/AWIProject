package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.DiaryentryDAO;
import com.aiop.yourtask.dao.GoalDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Diaryentry;
import com.aiop.yourtask.domain.Goal;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Diary entities
 * 
 */

@Service("DiaryService")

@Transactional
public class DiaryServiceImpl implements DiaryService {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * DAO injected by Spring that manages Diary entities
	 * 
	 */
	@Autowired
	private DiaryDAO diaryDAO;

	/**
	 * DAO injected by Spring that manages Diaryentry entities
	 * 
	 */
	@Autowired
	private DiaryentryDAO diaryentryDAO;

	/**
	 * DAO injected by Spring that manages Goal entities
	 * 
	 */
	@Autowired
	private GoalDAO goalDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Instantiates a new DiaryServiceImpl.
	 *
	 */
	public DiaryServiceImpl() {
	}

	/**
	 * Save an existing Activity entity
	 * 
	 */
	@Transactional
	public Diary saveDiaryActivity(Integer iddiary, Activity related_activity) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(iddiary, -1, -1);
		Activity existingactivity = activityDAO.findActivityByPrimaryKey(related_activity.getActivityid());

		// copy into the existing record to preserve existing relationships
		if (existingactivity != null) {
			existingactivity.setActivityid(related_activity.getActivityid());
			existingactivity.setActivityname(related_activity.getActivityname());
			existingactivity.setActivitydescription(related_activity.getActivitydescription());
			existingactivity.setActivityvisibility(related_activity.getActivityvisibility());
			related_activity = existingactivity;
		}

		diary.setActivity(related_activity);
		related_activity.getDiaries().add(diary);
		diary = diaryDAO.store(diary);
		diaryDAO.flush();

		related_activity = activityDAO.store(related_activity);
		activityDAO.flush();

		return diary;
	}

	/**
	 * Delete an existing Diary entity
	 * 
	 */
	@Transactional
	public void deleteDiary(Diary diary) {
		diaryDAO.remove(diary);
		diaryDAO.flush();
	}

	/**
	 * Save an existing Diary entity
	 * 
	 */
	@Transactional
	public void saveDiary(Diary diary) {
		Diary existingDiary = diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());

		if (existingDiary != null) {
			if (existingDiary != diary) {
				existingDiary.setIddiary(diary.getIddiary());
				existingDiary.setDiaryname(diary.getDiaryname());
				existingDiary.setDiarydate(diary.getDiarydate());
			}
			diary = diaryDAO.store(existingDiary);
		} else {
			diary = diaryDAO.store(diary);
		}
		diaryDAO.flush();
	}

	/**
	 */
	@Transactional
	public Diary findDiaryByPrimaryKey(Integer iddiary) {
		return diaryDAO.findDiaryByPrimaryKey(iddiary);
	}

	/**
	 * Load an existing Diary entity
	 * 
	 */
	@Transactional
	public Set<Diary> loadDiarys() {
		return diaryDAO.findAllDiarys();
	}

	/**
	 * Delete an existing Diaryentry entity
	 * 
	 */
	@Transactional
	public Diary deleteDiaryDiaryentries(Integer diary_iddiary, Integer related_diaryentries_diaryentryid) {
		Diaryentry related_diaryentries = diaryentryDAO.findDiaryentryByPrimaryKey(related_diaryentries_diaryentryid, -1, -1);

		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary, -1, -1);

		related_diaryentries.setDiary(null);
		diary.getDiaryentries().remove(related_diaryentries);

		diaryentryDAO.remove(related_diaryentries);
		diaryentryDAO.flush();

		return diary;
	}

	/**
	 * Delete an existing Goal entity
	 * 
	 */
	@Transactional
	public Diary deleteDiaryGoals(Integer diary_iddiary, Integer related_goals_goalid) {
		Goal related_goals = goalDAO.findGoalByPrimaryKey(related_goals_goalid, -1, -1);

		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary, -1, -1);

		related_goals.setDiary(null);
		diary.getGoals().remove(related_goals);

		goalDAO.remove(related_goals);
		goalDAO.flush();

		return diary;
	}

	/**
	 * Return all Diary entity
	 * 
	 */
	@Transactional
	public List<Diary> findAllDiarys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Diary>(diaryDAO.findAllDiarys(startResult, maxRows));
	}

	/**
	 * Save an existing Diaryentry entity
	 * 
	 */
	@Transactional
	public Diary saveDiaryDiaryentries(Integer iddiary, Diaryentry related_diaryentries) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(iddiary, -1, -1);
		Diaryentry existingdiaryentries = diaryentryDAO.findDiaryentryByPrimaryKey(related_diaryentries.getDiaryentryid());

		// copy into the existing record to preserve existing relationships
		if (existingdiaryentries != null) {
			existingdiaryentries.setDiaryentryid(related_diaryentries.getDiaryentryid());
			existingdiaryentries.setDiaryentrydate(related_diaryentries.getDiaryentrydate());
			existingdiaryentries.setDiaryentrycontent(related_diaryentries.getDiaryentrycontent());
			existingdiaryentries.setDiaryentryvisibility(related_diaryentries.getDiaryentryvisibility());
			related_diaryentries = existingdiaryentries;
		}

		related_diaryentries.setDiary(diary);
		diary.getDiaryentries().add(related_diaryentries);
		related_diaryentries = diaryentryDAO.store(related_diaryentries);
		diaryentryDAO.flush();

		diary = diaryDAO.store(diary);
		diaryDAO.flush();

		return diary;
	}

	/**
	 * Return a count of all Diary entity
	 * 
	 */
	@Transactional
	public Integer countDiarys() {
		return ((Long) diaryDAO.createQuerySingleResult("select count(o) from Diary o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Goal entity
	 * 
	 */
	@Transactional
	public Diary saveDiaryGoals(Integer iddiary, Goal related_goals) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(iddiary, -1, -1);
		Goal existinggoals = goalDAO.findGoalByPrimaryKey(related_goals.getGoalid());

		// copy into the existing record to preserve existing relationships
		if (existinggoals != null) {
			existinggoals.setGoalid(related_goals.getGoalid());
			existinggoals.setGoalname(related_goals.getGoalname());
			existinggoals.setGoaldescription(related_goals.getGoaldescription());
			related_goals = existinggoals;
		}

		related_goals.setDiary(diary);
		diary.getGoals().add(related_goals);
		related_goals = goalDAO.store(related_goals);
		goalDAO.flush();

		diary = diaryDAO.store(diary);
		diaryDAO.flush();

		return diary;
	}

	/**
	 * Delete an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Diary deleteDiaryYourtaskuser(Integer diary_iddiary, Integer related_yourtaskuser_userid) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary, -1, -1);
		Yourtaskuser related_yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskuser_userid, -1, -1);

		diary.setYourtaskuser(null);
		related_yourtaskuser.getDiaries().remove(diary);
		diary = diaryDAO.store(diary);
		diaryDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		yourtaskuserDAO.remove(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return diary;
	}

	/**
	 * Delete an existing Activity entity
	 * 
	 */
	@Transactional
	public Diary deleteDiaryActivity(Integer diary_iddiary, Integer related_activity_activityid) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diary_iddiary, -1, -1);
		Activity related_activity = activityDAO.findActivityByPrimaryKey(related_activity_activityid, -1, -1);

		diary.setActivity(null);
		related_activity.getDiaries().remove(diary);
		diary = diaryDAO.store(diary);
		diaryDAO.flush();

		related_activity = activityDAO.store(related_activity);
		activityDAO.flush();

		activityDAO.remove(related_activity);
		activityDAO.flush();

		return diary;
	}

	/**
	 * Save an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Diary saveDiaryYourtaskuser(Integer iddiary, Yourtaskuser related_yourtaskuser) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(iddiary, -1, -1);
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

		diary.setYourtaskuser(related_yourtaskuser);
		related_yourtaskuser.getDiaries().add(diary);
		diary = diaryDAO.store(diary);
		diaryDAO.flush();

		related_yourtaskuser = yourtaskuserDAO.store(related_yourtaskuser);
		yourtaskuserDAO.flush();

		return diary;
	}
}
