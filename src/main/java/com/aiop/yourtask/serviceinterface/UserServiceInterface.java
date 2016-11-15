package com.aiop.yourtask.serviceinterface;


import java.util.List;

import com.aiop.yourtask.persistence.User;
import com.aiop.yourtask.persistence.UserDao;

public interface UserServiceInterface {


	public void persist(User entity);
	public void update(User entity);
	public User findById(int id);
	public void delete(User entity);
	public List<User> findAll();
	public void deleteAll();
	public UserDao userDao();
	
	
}
