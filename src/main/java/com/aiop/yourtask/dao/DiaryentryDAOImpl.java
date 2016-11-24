/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Diaryentry;

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
 * DAO to manage Diaryentry entities.
 * 
 */
@Repository("DiaryentryDAO")

@Transactional
public class DiaryentryDAOImpl extends AbstractJpaDao<Diaryentry> implements DiaryentryDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Diaryentry.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DiaryentryDAOImpl.
	 */
	public DiaryentryDAOImpl() {
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
	 * JPQL Query - findDiaryentryByPrimaryKey.
	 *
	 * @param diaryentryid the diaryentryid
	 * @return the diaryentry
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Diaryentry findDiaryentryByPrimaryKey(Integer diaryentryid) throws DataAccessException {

		return findDiaryentryByPrimaryKey(diaryentryid, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryentryByPrimaryKey.
	 *
	 * @param diaryentryid the diaryentryid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the diaryentry
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Diaryentry findDiaryentryByPrimaryKey(Integer diaryentryid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDiaryentryByPrimaryKey", startResult, maxRows, diaryentryid);
			return (com.aiop.yourtask.domain.Diaryentry) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllDiaryentrys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diaryentry> findAllDiaryentrys() throws DataAccessException {

		return findAllDiaryentrys(-1, -1);
	}

	/**
	 * JPQL Query - findAllDiaryentrys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diaryentry> findAllDiaryentrys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDiaryentrys", startResult, maxRows);
		return new LinkedHashSet<Diaryentry>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Diaryentry entity) {
		return true;
	}
}
