package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Task;
import com.aiop.yourtask.persistence.TaskDao;
import com.aiop.yourtask.persistence.Activity;

public class TaskService {

	private static TaskDao taskDao;

	public TaskService() {
		taskDao = new TaskDao();
	}

	public void persist(Task entity) {
		taskDao.openCurrentSessionwithTransaction();
		taskDao.persist(entity);
		taskDao.closeCurrentSessionwithTransaction();
	}

	public void update(Task entity) {
		taskDao.openCurrentSessionwithTransaction();
		taskDao.update(entity);
		taskDao.closeCurrentSessionwithTransaction();
	}

	public Task findById(int id) {
		taskDao.openCurrentSession();
		Task task = taskDao.findById(id);
		taskDao.closeCurrentSession();
		return task;
	}

	/*
	public void delete(int id) {
		taskDao.openCurrentSessionwithTransaction();
		Task task = taskDao.findById(id);
		taskDao.delete(task);
		taskDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Task entity) {
		taskDao.openCurrentSessionwithTransaction();
		taskDao.delete(entity);
		taskDao.closeCurrentSessionwithTransaction();
	}

	public List<Task> findAll() {
		taskDao.openCurrentSession();
		List<Task> tasks = taskDao.findAll();
		taskDao.closeCurrentSession();
		return tasks;
	}

	public void deleteAll() {
		taskDao.openCurrentSessionwithTransaction();
		taskDao.deleteAll();
		taskDao.closeCurrentSessionwithTransaction();
	}

	public TaskDao taskDao() {
		return taskDao;
	}
	
	
	public List<Task> findByActivity(Activity activity) {
		taskDao.openCurrentSession();
		List<Task> tasks = taskDao.findByActivity(activity);
		taskDao.closeCurrentSession();
		return tasks;
	}

}
