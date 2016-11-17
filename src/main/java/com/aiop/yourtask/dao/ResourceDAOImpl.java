
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Resource;

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
 * DAO to manage Resource entities.
 * 
 */
@Repository("ResourceDAO")

@Transactional
public class ResourceDAOImpl extends AbstractJpaDao<Resource> implements ResourceDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Resource.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ResourceDAOImpl
	 *
	 */
	public ResourceDAOImpl() {
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
	 * JPQL Query - findResourceByPrimaryKey
	 *
	 */
	@Transactional
	public Resource findResourceByPrimaryKey(Integer resourceid) throws DataAccessException {

		return findResourceByPrimaryKey(resourceid, -1, -1);
	}

	/**
	 * JPQL Query - findResourceByPrimaryKey
	 *
	 */

	@Transactional
	public Resource findResourceByPrimaryKey(Integer resourceid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findResourceByPrimaryKey", startResult, maxRows, resourceid);
			return (com.aiop.yourtask.domain.Resource) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findResourceByResourceurlContaining
	 *
	 */
	@Transactional
	public Set<Resource> findResourceByResourceurlContaining(String resourceurl) throws DataAccessException {

		return findResourceByResourceurlContaining(resourceurl, -1, -1);
	}

	/**
	 * JPQL Query - findResourceByResourceurlContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Resource> findResourceByResourceurlContaining(String resourceurl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findResourceByResourceurlContaining", startResult, maxRows, resourceurl);
		return new LinkedHashSet<Resource>(query.getResultList());
	}

	/**
	 * JPQL Query - findResourceByResourceurl
	 *
	 */
	@Transactional
	public Set<Resource> findResourceByResourceurl(String resourceurl) throws DataAccessException {

		return findResourceByResourceurl(resourceurl, -1, -1);
	}

	/**
	 * JPQL Query - findResourceByResourceurl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Resource> findResourceByResourceurl(String resourceurl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findResourceByResourceurl", startResult, maxRows, resourceurl);
		return new LinkedHashSet<Resource>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllResources
	 *
	 */
	@Transactional
	public Set<Resource> findAllResources() throws DataAccessException {

		return findAllResources(-1, -1);
	}

	/**
	 * JPQL Query - findAllResources
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Resource> findAllResources(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllResources", startResult, maxRows);
		return new LinkedHashSet<Resource>(query.getResultList());
	}

	/**
	 * JPQL Query - findResourceByResourceid
	 *
	 */
	@Transactional
	public Resource findResourceByResourceid(Integer resourceid) throws DataAccessException {

		return findResourceByResourceid(resourceid, -1, -1);
	}

	/**
	 * JPQL Query - findResourceByResourceid
	 *
	 */

	@Transactional
	public Resource findResourceByResourceid(Integer resourceid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findResourceByResourceid", startResult, maxRows, resourceid);
			return (com.aiop.yourtask.domain.Resource) query.getSingleResult();
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
	public boolean canBeMerged(Resource entity) {
		return true;
	}
}
