package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Activity;
import com.aiop.yourtask.persistence.Diary;
import com.aiop.yourtask.persistence.DiaryDao;
import com.aiop.yourtask.persistence.User;

public class DiaryService {

	private static DiaryDao diaryDao;

	public DiaryService() {
		diaryDao = new DiaryDao();
	}

	public void persist(Diary entity) {
		diaryDao.openCurrentSessionwithTransaction();
		diaryDao.persist(entity);
		diaryDao.closeCurrentSessionwithTransaction();
	}

	public void update(Diary entity) {
		diaryDao.openCurrentSessionwithTransaction();
		diaryDao.update(entity);
		diaryDao.closeCurrentSessionwithTransaction();
	}

	public Diary findById(int id) {
		diaryDao.openCurrentSession();
		Diary diary = diaryDao.findById(id);
		diaryDao.closeCurrentSession();
		return diary;
	}

	/*
	public void delete(int id) {
		diaryDao.openCurrentSessionwithTransaction();
		Diary diary = diaryDao.findById(id);
		diaryDao.delete(diary);
		diaryDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Diary entity) {
		diaryDao.openCurrentSessionwithTransaction();
		diaryDao.delete(entity);
		diaryDao.closeCurrentSessionwithTransaction();
	}

	public List<Diary> findAll() {
		diaryDao.openCurrentSession();
		List<Diary> diaries = diaryDao.findAll();
		diaryDao.closeCurrentSession();
		return diaries;
	}

	public void deleteAll() {
		diaryDao.openCurrentSessionwithTransaction();
		diaryDao.deleteAll();
		diaryDao.closeCurrentSessionwithTransaction();
	}

	public DiaryDao diaryDao() {
		return diaryDao;
	}
	
	
	public List<Diary> findByUser(User user) {
		diaryDao.openCurrentSession();
		List<Diary> diaries = diaryDao.findByUser(user);
		diaryDao.closeCurrentSession();
		return diaries;
	}

	public List<Diary> findByActivity(Activity activity) {
		diaryDao.openCurrentSession();
		List<Diary> diaries = diaryDao.findByActivity(activity);
		diaryDao.closeCurrentSession();
		return diaries;
	}
	
}
