package com.aiop.yourtask.service;


import java.util.List;

import com.aiop.yourtask.persistence.Notification;
import com.aiop.yourtask.persistence.NotificationDao;
import com.aiop.yourtask.persistence.User;

public class NotificationService {

	private static NotificationDao notificationDao;

	public NotificationService() {
		notificationDao = new NotificationDao();
	}

	public void persist(Notification entity) {
		notificationDao.openCurrentSessionwithTransaction();
		notificationDao.persist(entity);
		notificationDao.closeCurrentSessionwithTransaction();
	}

	public void update(Notification entity) {
		notificationDao.openCurrentSessionwithTransaction();
		notificationDao.update(entity);
		notificationDao.closeCurrentSessionwithTransaction();
	}

	public Notification findById(int id) {
		notificationDao.openCurrentSession();
		Notification notification = notificationDao.findById(id);
		notificationDao.closeCurrentSession();
		return notification;
	}

	/*
	public void delete(int id) {
		notificationDao.openCurrentSessionwithTransaction();
		Notification notification = notificationDao.findById(id);
		notificationDao.delete(notification);
		notificationDao.closeCurrentSessionwithTransaction();
	}
	*/
	
	public void delete(Notification entity) {
		notificationDao.openCurrentSessionwithTransaction();
		notificationDao.delete(entity);
		notificationDao.closeCurrentSessionwithTransaction();
	}

	public List<Notification> findAll() {
		notificationDao.openCurrentSession();
		List<Notification> notifications = notificationDao.findAll();
		notificationDao.closeCurrentSession();
		return notifications;
	}

	public void deleteAll() {
		notificationDao.openCurrentSessionwithTransaction();
		notificationDao.deleteAll();
		notificationDao.closeCurrentSessionwithTransaction();
	}

	public NotificationDao notificationDao() {
		return notificationDao;
	}
	
	
	public List<Notification> findByUser(User user) {
		notificationDao.openCurrentSession();
		List<Notification> notifications = notificationDao.findByUser(user);
		notificationDao.closeCurrentSession();
		return notifications;
	}

}
