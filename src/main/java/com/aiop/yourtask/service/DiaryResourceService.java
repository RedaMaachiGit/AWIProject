package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.DiaryResource;
import com.aiop.yourtask.persistence.DiaryResourceDao;
import com.aiop.yourtask.persistence.DiaryEntry;

public class DiaryResourceService {

	private static DiaryResourceDao diaryresourceDao;

	public DiaryResourceService() {
		diaryresourceDao = new DiaryResourceDao();
	}

	public void persist(DiaryResource entity) {
		diaryresourceDao.openCurrentSessionwithTransaction();
		diaryresourceDao.persist(entity);
		diaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public void update(DiaryResource entity) {
		diaryresourceDao.openCurrentSessionwithTransaction();
		diaryresourceDao.update(entity);
		diaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public DiaryResource findById(int id) {
		diaryresourceDao.openCurrentSession();
		DiaryResource diaryresource = diaryresourceDao.findById(id);
		diaryresourceDao.closeCurrentSession();
		return diaryresource;
	}

	/*
	public void delete(int id) {
		diaryresourceDao.openCurrentSessionwithTransaction();
		DiaryResource diaryresource = diaryresourceDao.findById(id);
		diaryresourceDao.delete(diaryresource);
		diaryresourceDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(DiaryResource entity) {
		diaryresourceDao.openCurrentSessionwithTransaction();
		diaryresourceDao.delete(entity);
		diaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public List<DiaryResource> findAll() {
		diaryresourceDao.openCurrentSession();
		List<DiaryResource> diaryresources = diaryresourceDao.findAll();
		diaryresourceDao.closeCurrentSession();
		return diaryresources;
	}

	public void deleteAll() {
		diaryresourceDao.openCurrentSessionwithTransaction();
		diaryresourceDao.deleteAll();
		diaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public DiaryResourceDao diaryresourceDao() {
		return diaryresourceDao;
	}
	
	
	public List<DiaryResource> findByDiaryEntry(DiaryEntry diaryentry) {
		diaryresourceDao.openCurrentSession();
		List<DiaryResource> diaryresources = diaryresourceDao.findByDiaryEntry(diaryentry);
		diaryresourceDao.closeCurrentSession();
		return diaryresources;
	}

	
}
