
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Notification;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Notification entities.
 * 
 */
public interface NotificationDAO extends JpaDao<Notification> {

	/**
	 * JPQL Query - findNotificationByPrimaryKey
	 *
	 */
	public Notification findNotificationByPrimaryKey(Integer notificationid) throws DataAccessException;

	/**
	 * JPQL Query - findNotificationByPrimaryKey
	 *
	 */
	public Notification findNotificationByPrimaryKey(Integer notificationid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllNotifications
	 *
	 */
	public Set<Notification> findAllNotifications() throws DataAccessException;

	/**
	 * JPQL Query - findAllNotifications
	 *
	 */
	public Set<Notification> findAllNotifications(int startResult, int maxRows) throws DataAccessException;

}