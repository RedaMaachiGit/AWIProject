package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Order;
import com.aiop.yourtask.persistence.OrderDao;

public class OrderService {

	private static OrderDao roleDao;

	public OrderService() {
		roleDao = new OrderDao();
	}

	public void persist(Order entity) {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.persist(entity);
		roleDao.closeCurrentSessionwithTransaction();
	}

	public void update(Order entity) {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.update(entity);
		roleDao.closeCurrentSessionwithTransaction();
	}

	public Order findById(int id) {
		roleDao.openCurrentSession();
		Order role = roleDao.findById(id);
		roleDao.closeCurrentSession();
		return role;
	}

	/*
	public void delete(int id) {
		roleDao.openCurrentSessionwithTransaction();
		Order role = roleDao.findById(id);
		roleDao.delete(role);
		roleDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Order entity) {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.delete(entity);
		roleDao.closeCurrentSessionwithTransaction();
	}

	public List<Order> findAll() {
		roleDao.openCurrentSession();
		List<Order> roles = roleDao.findAll();
		roleDao.closeCurrentSession();
		return roles;
	}

	public void deleteAll() {
		roleDao.openCurrentSessionwithTransaction();
		roleDao.deleteAll();
		roleDao.closeCurrentSessionwithTransaction();
	}

	public OrderDao roleDao() {
		return roleDao;
	}
	
	
}
