
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Suinfo;

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
 * DAO to manage Suinfo entities.
 * 
 */
@Repository("SuinfoDAO")

@Transactional
public class SuinfoDAOImpl extends AbstractJpaDao<Suinfo> implements SuinfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Suinfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new SuinfoDAOImpl
	 *
	 */
	public SuinfoDAOImpl() {
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
	 * JPQL Query - findAllSuinfos
	 *
	 */
	@Transactional
	public Set<Suinfo> findAllSuinfos() throws DataAccessException {

		return findAllSuinfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllSuinfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Suinfo> findAllSuinfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllSuinfos", startResult, maxRows);
		return new LinkedHashSet<Suinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findSuinfoByPrimaryKey
	 *
	 */
	@Transactional
	public Suinfo findSuinfoByPrimaryKey(Integer suinfoid) throws DataAccessException {

		return findSuinfoByPrimaryKey(suinfoid, -1, -1);
	}

	/**
	 * JPQL Query - findSuinfoByPrimaryKey
	 *
	 */

	@Transactional
	public Suinfo findSuinfoByPrimaryKey(Integer suinfoid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSuinfoByPrimaryKey", startResult, maxRows, suinfoid);
			return (com.aiop.yourtask.domain.Suinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Suinfo entity) {
		return true;
	}
}
