package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.DiaryEntry;
import com.aiop.yourtask.persistence.DiaryEntryDao;
import com.aiop.yourtask.persistence.Diary;

public class DiaryEntryService {

	private static DiaryEntryDao diaryentryDao;

	public DiaryEntryService() {
		diaryentryDao = new DiaryEntryDao();
	}

	public void persist(DiaryEntry entity) {
		diaryentryDao.openCurrentSessionwithTransaction();
		diaryentryDao.persist(entity);
		diaryentryDao.closeCurrentSessionwithTransaction();
	}

	public void update(DiaryEntry entity) {
		diaryentryDao.openCurrentSessionwithTransaction();
		diaryentryDao.update(entity);
		diaryentryDao.closeCurrentSessionwithTransaction();
	}

	public DiaryEntry findById(int id) {
		diaryentryDao.openCurrentSession();
		DiaryEntry diaryentry = diaryentryDao.findById(id);
		diaryentryDao.closeCurrentSession();
		return diaryentry;
	}

	/*
	public void delete(int id) {
		diaryentryDao.openCurrentSessionwithTransaction();
		DiaryEntry diaryentry = diaryentryDao.findById(id);
		diaryentryDao.delete(diaryentry);
		diaryentryDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(DiaryEntry entity) {
		diaryentryDao.openCurrentSessionwithTransaction();
		diaryentryDao.delete(entity);
		diaryentryDao.closeCurrentSessionwithTransaction();
	}

	public List<DiaryEntry> findAll() {
		diaryentryDao.openCurrentSession();
		List<DiaryEntry> diaryentries = diaryentryDao.findAll();
		diaryentryDao.closeCurrentSession();
		return diaryentries;
	}

	public void deleteAll() {
		diaryentryDao.openCurrentSessionwithTransaction();
		diaryentryDao.deleteAll();
		diaryentryDao.closeCurrentSessionwithTransaction();
	}

	public DiaryEntryDao diaryentryDao() {
		return diaryentryDao;
	}
	
	
	public List<DiaryEntry> findByDiary(Diary diary) {
		diaryentryDao.openCurrentSession();
		List<DiaryEntry> diaryentries = diaryentryDao.findByDiary(diary);
		diaryentryDao.closeCurrentSession();
		return diaryentries;
	}

	
}
