package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.User;
import com.aiop.yourtask.persistence.UserDao;
import com.aiop.yourtask.serviceinterface.UserServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("UserServiceInterface")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserService implements UserServiceInterface{
	@Autowired
	private static UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void persist(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.persist(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public void update(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.update(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public User findById(int id) {
		userDao.openCurrentSession();
		User user = userDao.findById(id);
		userDao.closeCurrentSession();
		return user;
	}
	
	public void delete(User entity) {
		userDao.openCurrentSessionwithTransaction();
		userDao.delete(entity);
		userDao.closeCurrentSessionwithTransaction();
	}

	public List<User> findAll() {
		userDao.openCurrentSession();
		List<User> users = userDao.findAll();
		userDao.closeCurrentSession();
		return users;
	}

	public void deleteAll() {
		userDao.openCurrentSessionwithTransaction();
		userDao.deleteAll();
		userDao.closeCurrentSessionwithTransaction();
	}

	public UserDao userDao() {
		return userDao;
	}
	
	
}
