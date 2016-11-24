/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Scinfo;

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
 * DAO to manage Scinfo entities.
 * 
 */
@Repository("ScinfoDAO")

@Transactional
public class ScinfoDAOImpl extends AbstractJpaDao<Scinfo> implements ScinfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Scinfo.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ScinfoDAOImpl.
	 */
	public ScinfoDAOImpl() {
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
	 * JPQL Query - findScinfoByPrimaryKey.
	 *
	 * @param scinfoid the scinfoid
	 * @return the scinfo
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Scinfo findScinfoByPrimaryKey(Integer scinfoid) throws DataAccessException {

		return findScinfoByPrimaryKey(scinfoid, -1, -1);
	}

	/**
	 * JPQL Query - findScinfoByPrimaryKey.
	 *
	 * @param scinfoid the scinfoid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the scinfo
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Scinfo findScinfoByPrimaryKey(Integer scinfoid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findScinfoByPrimaryKey", startResult, maxRows, scinfoid);
			return (com.aiop.yourtask.domain.Scinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllScinfos.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Scinfo> findAllScinfos() throws DataAccessException {

		return findAllScinfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllScinfos.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Scinfo> findAllScinfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllScinfos", startResult, maxRows);
		return new LinkedHashSet<Scinfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Scinfo entity) {
		return true;
	}
}
