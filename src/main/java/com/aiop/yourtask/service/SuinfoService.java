package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Suinfo;
import com.aiop.yourtask.persistence.SuinfoDao;
import com.aiop.yourtask.persistence.User;

public class SuinfoService {

	private static SuinfoDao suinfoDao;

	public SuinfoService() {
		suinfoDao = new SuinfoDao();
	}

	public void persist(Suinfo entity) {
		suinfoDao.openCurrentSessionwithTransaction();
		suinfoDao.persist(entity);
		suinfoDao.closeCurrentSessionwithTransaction();
	}

	public void update(Suinfo entity) {
		suinfoDao.openCurrentSessionwithTransaction();
		suinfoDao.update(entity);
		suinfoDao.closeCurrentSessionwithTransaction();
	}

	public Suinfo findById(int id) {
		suinfoDao.openCurrentSession();
		Suinfo suinfo = suinfoDao.findById(id);
		suinfoDao.closeCurrentSession();
		return suinfo;
	}
	
	public void delete(Suinfo entity) {
		suinfoDao.openCurrentSessionwithTransaction();
		suinfoDao.delete(entity);
		suinfoDao.closeCurrentSessionwithTransaction();
	}

	public List<Suinfo> findAll() {
		suinfoDao.openCurrentSession();
		List<Suinfo> suinfos = suinfoDao.findAll();
		suinfoDao.closeCurrentSession();
		return suinfos;
	}

	public void deleteAll() {
		suinfoDao.openCurrentSessionwithTransaction();
		suinfoDao.deleteAll();
		suinfoDao.closeCurrentSessionwithTransaction();
	}

	public SuinfoDao suinfoDao() {
		return suinfoDao;
	}

	public Suinfo findByUser(User user) {
		suinfoDao.openCurrentSession();
		Suinfo suinfo = suinfoDao.findByUser(user);
		suinfoDao.closeCurrentSession();
		return suinfo;
	}
	
	
}
