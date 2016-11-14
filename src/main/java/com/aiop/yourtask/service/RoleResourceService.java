package com.aiop.yourtask.service;

import java.util.List;

import com.aiop.yourtask.persistence.Role;
import com.aiop.yourtask.persistence.RoleResource;
import com.aiop.yourtask.persistence.RoleResourceDao;
import com.aiop.yourtask.persistence.RoleResourcePK;

public class RoleResourceService {

	private static RoleResourceDao roleresourceDao;

	public RoleResourceService() {
		roleresourceDao = new RoleResourceDao();
	}

	public void persist(RoleResource entity) {
		roleresourceDao.openCurrentSessionwithTransaction();
		roleresourceDao.persist(entity);
		roleresourceDao.closeCurrentSessionwithTransaction();
	}

	public void update(RoleResource entity) {
		roleresourceDao.openCurrentSessionwithTransaction();
		roleresourceDao.update(entity);
		roleresourceDao.closeCurrentSessionwithTransaction();
	}

	public RoleResource findByIdPK(RoleResourcePK entityPK) {
		roleresourceDao.openCurrentSession();
		RoleResource roleresource = roleresourceDao.findByIdPK(entityPK);
		roleresourceDao.closeCurrentSession();
		return roleresource;
	}

	/*
	public void delete(int id) {
		roleresourceDao.openCurrentSessionwithTransaction();
		RoleResource roleresource = roleresourceDao.findById(id);
		roleresourceDao.delete(roleresource);
		roleresourceDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(RoleResource entity) {
		roleresourceDao.openCurrentSessionwithTransaction();
		roleresourceDao.delete(entity);
		roleresourceDao.closeCurrentSessionwithTransaction();
	}

	public List<RoleResource> findAll() {
		roleresourceDao.openCurrentSession();
		List<RoleResource> roleresources = roleresourceDao.findAll();
		roleresourceDao.closeCurrentSession();
		return roleresources;
	}

	public void deleteAll() {
		roleresourceDao.openCurrentSessionwithTransaction();
		roleresourceDao.deleteAll();
		roleresourceDao.closeCurrentSessionwithTransaction();
	}

	public RoleResourceDao roleresourceDao() {
		return roleresourceDao;
	}
	

	public List<RoleResource> findByRole(Role entity) {
		roleresourceDao.openCurrentSession();
		List<RoleResource> roleresources = roleresourceDao.findByRole(entity);
		roleresourceDao.closeCurrentSession();
		return roleresources;
	}
	
	
	
	
}
