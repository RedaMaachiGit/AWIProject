package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Resource;
import com.aiop.yourtask.persistence.ResourceDao;
import com.aiop.yourtask.persistence.RoleResource;
import com.aiop.yourtask.persistence.User;

public class ResourceService {

	private static ResourceDao resourceDao;

	public ResourceService() {
		resourceDao = new ResourceDao();
	}

	public void persist(Resource entity) {
		resourceDao.openCurrentSessionwithTransaction();
		resourceDao.persist(entity);
		resourceDao.closeCurrentSessionwithTransaction();
	}

	public void update(Resource entity) {
		resourceDao.openCurrentSessionwithTransaction();
		resourceDao.update(entity);
		resourceDao.closeCurrentSessionwithTransaction();
	}

	public Resource findById(int id) {
		resourceDao.openCurrentSession();
		Resource resource = resourceDao.findById(id);
		resourceDao.closeCurrentSession();
		return resource;
	}

	/*
	public void delete(int id) {
		resourceDao.openCurrentSessionwithTransaction();
		Resource resource = resourceDao.findById(id);
		resourceDao.delete(resource);
		resourceDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Resource entity) {
		resourceDao.openCurrentSessionwithTransaction();
		resourceDao.delete(entity);
		resourceDao.closeCurrentSessionwithTransaction();
	}

	public List<Resource> findAll() {
		resourceDao.openCurrentSession();
		List<Resource> resources = resourceDao.findAll();
		resourceDao.closeCurrentSession();
		return resources;
	}

	public void deleteAll() {
		resourceDao.openCurrentSessionwithTransaction();
		resourceDao.deleteAll();
		resourceDao.closeCurrentSessionwithTransaction();
	}

	public ResourceDao resourceDao() {
		return resourceDao;
	}
	
	
	public Resource findByRoleResource(RoleResource entity) {
		resourceDao.openCurrentSession();
		Resource resource = resourceDao.findByRoleResource(entity);
		resourceDao.closeCurrentSession();
		return resource;
	}
	
	
}
