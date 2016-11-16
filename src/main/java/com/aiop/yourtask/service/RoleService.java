package com.aiop.yourtask.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aiop.yourtask.persistence.Role;
import com.aiop.yourtask.persistence.RoleDao;
import com.aiop.yourtask.serviceinterface.RoleServiceInterface;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RoleService implements RoleServiceInterface{
	@Autowired
	private static RoleDao roleDao;

	public RoleService() {
		roleDao = new RoleDao();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
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
