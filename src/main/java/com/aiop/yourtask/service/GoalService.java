package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Goal;
import com.aiop.yourtask.persistence.GoalDao;
import com.aiop.yourtask.persistence.Diary;

public class GoalService {

	private static GoalDao goalDao;

	public GoalService() {
		goalDao = new GoalDao();
	}

	public void persist(Goal entity) {
		goalDao.openCurrentSessionwithTransaction();
		goalDao.persist(entity);
		goalDao.closeCurrentSessionwithTransaction();
	}

	public void update(Goal entity) {
		goalDao.openCurrentSessionwithTransaction();
		goalDao.update(entity);
		goalDao.closeCurrentSessionwithTransaction();
	}

	public Goal findById(int id) {
		goalDao.openCurrentSession();
		Goal goal = goalDao.findById(id);
		goalDao.closeCurrentSession();
		return goal;
	}

	/*
	public void delete(int id) {
		goalDao.openCurrentSessionwithTransaction();
		Goal goal = goalDao.findById(id);
		goalDao.delete(goal);
		goalDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Goal entity) {
		goalDao.openCurrentSessionwithTransaction();
		goalDao.delete(entity);
		goalDao.closeCurrentSessionwithTransaction();
	}

	public List<Goal> findAll() {
		goalDao.openCurrentSession();
		List<Goal> goals = goalDao.findAll();
		goalDao.closeCurrentSession();
		return goals;
	}

	public void deleteAll() {
		goalDao.openCurrentSessionwithTransaction();
		goalDao.deleteAll();
		goalDao.closeCurrentSessionwithTransaction();
	}

	public GoalDao goalDao() {
		return goalDao;
	}
	
	
	public List<Goal> findByDiary(Diary diary) {
		goalDao.openCurrentSession();
		List<Goal> goals = goalDao.findByDiary(diary);
		goalDao.closeCurrentSession();
		return goals;
	}

	
}
