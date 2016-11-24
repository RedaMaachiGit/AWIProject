/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Activity;

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

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Activity entities.
 * 
 */
@Repository("ActivityDAO")

@Transactional
public class ActivityDAOImpl extends AbstractJpaDao<Activity> implements ActivityDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Activity.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ActivityDAOImpl.
	 */
	public ActivityDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit .
	 *
	 * @return the entity manager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 * @return the types
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAllActivitys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Activity> findAllActivitys() throws DataAccessException {

		return findAllActivitys(-1, -1);
	}

	/**
	 * JPQL Query - findAllActivitys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findAllActivitys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllActivitys", startResult, maxRows);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActivityname.
	 *
	 * @param activityname the activityname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Activity> findActivityByActivityname(String activityname) throws DataAccessException {

		return findActivityByActivityname(activityname, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivityname.
	 *
	 * @param activityname the activityname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActivityname(String activityname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActivityname", startResult, maxRows, activityname);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActivitynameContaining.
	 *
	 * @param activityname the activityname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Activity> findActivityByActivitynameContaining(String activityname) throws DataAccessException {

		return findActivityByActivitynameContaining(activityname, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivitynameContaining.
	 *
	 * @param activityname the activityname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActivitynameContaining(String activityname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActivitynameContaining", startResult, maxRows, activityname);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActivityid.
	 *
	 * @param activityid the activityid
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Activity findActivityByActivityid(Integer activityid) throws DataAccessException {

		return findActivityByActivityid(activityid, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivityid.
	 *
	 * @param activityid the activityid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Activity findActivityByActivityid(Integer activityid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findActivityByActivityid", startResult, maxRows, activityid);
			return (com.aiop.yourtask.domain.Activity) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findActivityByActivityvisibility.
	 *
	 * @param activityvisibility the activityvisibility
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Activity> findActivityByActivityvisibility(Boolean activityvisibility) throws DataAccessException {

		return findActivityByActivityvisibility(activityvisibility, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivityvisibility.
	 *
	 * @param activityvisibility the activityvisibility
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActivityvisibility(Boolean activityvisibility, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActivityvisibility", startResult, maxRows, activityvisibility);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActivitydescription.
	 *
	 * @param activitydescription the activitydescription
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Activity> findActivityByActivitydescription(String activitydescription) throws DataAccessException {

		return findActivityByActivitydescription(activitydescription, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivitydescription.
	 *
	 * @param activitydescription the activitydescription
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActivitydescription(String activitydescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActivitydescription", startResult, maxRows, activitydescription);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActivitydescriptionContaining.
	 *
	 * @param activitydescription the activitydescription
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Activity> findActivityByActivitydescriptionContaining(String activitydescription) throws DataAccessException {

		return findActivityByActivitydescriptionContaining(activitydescription, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivitydescriptionContaining.
	 *
	 * @param activitydescription the activitydescription
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActivitydescriptionContaining(String activitydescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActivitydescriptionContaining", startResult, maxRows, activitydescription);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByPrimaryKey.
	 *
	 * @param activityid the activityid
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Activity findActivityByPrimaryKey(Integer activityid) throws DataAccessException {

		return findActivityByPrimaryKey(activityid, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByPrimaryKey.
	 *
	 * @param activityid the activityid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the activity
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Activity findActivityByPrimaryKey(Integer activityid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findActivityByPrimaryKey", startResult, maxRows, activityid);
			return (com.aiop.yourtask.domain.Activity) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Activity entity) {
		return true;
	}
}
