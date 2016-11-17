
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Notification;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Notification entities.
 * 
 */
@Repository("NotificationDAO")

@Transactional
public class NotificationDAOImpl extends AbstractJpaDao<Notification> implements NotificationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Notification.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new NotificationDAOImpl
	 *
	 */
	public NotificationDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findNotificationByPrimaryKey
	 *
	 */
	@Transactional
	public Notification findNotificationByPrimaryKey(Integer notificationid) throws DataAccessException {

		return findNotificationByPrimaryKey(notificationid, -1, -1);
	}

	/**
	 * JPQL Query - findNotificationByPrimaryKey
	 *
	 */

	@Transactional
	public Notification findNotificationByPrimaryKey(Integer notificationid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findNotificationByPrimaryKey", startResult, maxRows, notificationid);
			return (com.aiop.yourtask.domain.Notification) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllNotifications
	 *
	 */
	@Transactional
	public Set<Notification> findAllNotifications() throws DataAccessException {

		return findAllNotifications(-1, -1);
	}

	/**
	 * JPQL Query - findAllNotifications
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Notification> findAllNotifications(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllNotifications", startResult, maxRows);
		return new LinkedHashSet<Notification>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Notification entity) {
		return true;
	}
}
