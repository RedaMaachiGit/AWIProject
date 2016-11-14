package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Scinfo;
import com.aiop.yourtask.persistence.ScinfoDao;
import com.aiop.yourtask.persistence.User;

public class ScinfoService {

	private static ScinfoDao scinfoDao;

	public ScinfoService() {
		scinfoDao = new ScinfoDao();
	}

	public void persist(Scinfo entity) {
		scinfoDao.openCurrentSessionwithTransaction();
		scinfoDao.persist(entity);
		scinfoDao.closeCurrentSessionwithTransaction();
	}

	public void update(Scinfo entity) {
		scinfoDao.openCurrentSessionwithTransaction();
		scinfoDao.update(entity);
		scinfoDao.closeCurrentSessionwithTransaction();
	}

	public Scinfo findById(int id) {
		scinfoDao.openCurrentSession();
		Scinfo scinfo = scinfoDao.findById(id);
		scinfoDao.closeCurrentSession();
		return scinfo;
	}
	
	public void delete(Scinfo entity) {
		scinfoDao.openCurrentSessionwithTransaction();
		scinfoDao.delete(entity);
		scinfoDao.closeCurrentSessionwithTransaction();
	}

	public List<Scinfo> findAll() {
		scinfoDao.openCurrentSession();
		List<Scinfo> scinfos = scinfoDao.findAll();
		scinfoDao.closeCurrentSession();
		return scinfos;
	}

	public void deleteAll() {
		scinfoDao.openCurrentSessionwithTransaction();
		scinfoDao.deleteAll();
		scinfoDao.closeCurrentSessionwithTransaction();
	}

	public ScinfoDao scinfoDao() {
		return scinfoDao;
	}

	public Scinfo findByUser(User user) {
		scinfoDao.openCurrentSession();
		Scinfo scinfo = scinfoDao.findByUser(user);
		scinfoDao.closeCurrentSession();
		return scinfo;
	}
	
	
}
