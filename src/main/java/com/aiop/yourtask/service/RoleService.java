package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Role;
import com.aiop.yourtask.persistence.RoleDao;
import com.aiop.yourtask.persistence.User;

public class RoleService {

	private static RoleDao roleDao;

	public RoleService() {
		roleDao = new RoleDao();
	}

	public void persist(Role entity) {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.persist(entity);
		roleDao.closeCurrentSessionwithTransaction();
	}

	public void update(Role entity) {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.update(entity);
		roleDao.closeCurrentSessionwithTransaction();
	}

	public Role findById(int id) {
		roleDao.openCurrentSession();
		Role role = roleDao.findById(id);
		roleDao.closeCurrentSession();
		return role;
	}

	/*
	public void delete(int id) {
		roleDao.openCurrentSessionwithTransaction();
		Role role = roleDao.findById(id);
		roleDao.delete(role);
		roleDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Role entity) {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.delete(entity);
		roleDao.closeCurrentSessionwithTransaction();
	}

	public List<Role> findAll() {
		roleDao.openCurrentSession();
		List<Role> roles = roleDao.findAll();
		roleDao.closeCurrentSession();
		return roles;
	}

	public void deleteAll() {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.deleteAll();
		roleDao.closeCurrentSessionwithTransaction();
	}

	public RoleDao roleDao() {
		return roleDao;
	}
	
	
}
