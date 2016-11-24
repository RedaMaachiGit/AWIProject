/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Notification;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Notification entities.
 * 
 */
public interface NotificationDAO extends JpaDao<Notification> {

	/**
	 * JPQL Query - findNotificationByPrimaryKey.
	 *
	 * @param notificationid the notificationid
	 * @return the notification
	 * @throws DataAccessException the data access exception
	 */
	public Notification findNotificationByPrimaryKey(Integer notificationid) throws DataAccessException;

	/**
	 * JPQL Query - findNotificationByPrimaryKey.
	 *
	 * @param notificationid the notificationid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the notification
	 * @throws DataAccessException the data access exception
	 */
	public Notification findNotificationByPrimaryKey(Integer notificationid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllNotifications.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Notification> findAllNotifications() throws DataAccessException;

	/**
	 * JPQL Query - findAllNotifications.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Notification> findAllNotifications(int startResult, int maxRows) throws DataAccessException;

}