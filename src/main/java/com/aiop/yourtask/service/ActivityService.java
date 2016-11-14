package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Activity;
import com.aiop.yourtask.persistence.ActivityDao;
import com.aiop.yourtask.persistence.User;

public class ActivityService {

	private static ActivityDao activityDao;

	public ActivityService() {
		activityDao = new ActivityDao();
	}

	public void persist(Activity entity) {
		activityDao.openCurrentSessionwithTransaction();
		activityDao.persist(entity);
		activityDao.closeCurrentSessionwithTransaction();
	}

	public void update(Activity entity) {
		activityDao.openCurrentSessionwithTransaction();
		activityDao.update(entity);
		activityDao.closeCurrentSessionwithTransaction();
	}

	public Activity findById(int id) {
		activityDao.openCurrentSession();
		Activity activity = activityDao.findById(id);
		activityDao.closeCurrentSession();
		return activity;
	}

	/*
	public void delete(int id) {
		activityDao.openCurrentSessionwithTransaction();
		Activity activity = activityDao.findById(id);
		activityDao.delete(activity);
		activityDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Activity entity) {
		activityDao.openCurrentSessionwithTransaction();
		activityDao.delete(entity);
		activityDao.closeCurrentSessionwithTransaction();
	}

	public List<Activity> findAll() {
		activityDao.openCurrentSession();
		List<Activity> activities = activityDao.findAll();
		activityDao.closeCurrentSession();
		return activities;
	}

	public void deleteAll() {
		activityDao.openCurrentSessionwithTransaction();
		activityDao.deleteAll();
		activityDao.closeCurrentSessionwithTransaction();
	}

	public ActivityDao activityDao() {
		return activityDao;
	}
	
	
	public List<Activity> findByUser(User user) {
		activityDao.openCurrentSession();
		List<Activity> activities = activityDao.findByUser(user);
		activityDao.closeCurrentSession();
		return activities;
	}

}
