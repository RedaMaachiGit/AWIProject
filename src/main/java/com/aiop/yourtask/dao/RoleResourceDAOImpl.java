/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.RoleResource;

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
 * DAO to manage RoleResource entities.
 * 
 */
@Repository("RoleResourceDAO")

@Transactional
public class RoleResourceDAOImpl extends AbstractJpaDao<RoleResource> implements RoleResourceDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RoleResource.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoleResourceDAOImpl.
	 */
	public RoleResourceDAOImpl() {
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
	 * JPQL Query - findRoleResourceByResourceid.
	 *
	 * @param resourceid the resourceid
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid) throws DataAccessException {

		return findRoleResourceByResourceid(resourceid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByResourceid.
	 *
	 * @param resourceid the resourceid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleResourceByResourceid", startResult, maxRows, resourceid);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRoleResources.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<RoleResource> findAllRoleResources() throws DataAccessException {

		return findAllRoleResources(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoleResources.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findAllRoleResources(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoleResources", startResult, maxRows);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @param resourceid the resourceid
	 * @return the role resource
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid) throws DataAccessException {

		return findRoleResourceByPrimaryKey(roleid, resourceid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @param resourceid the resourceid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the role resource
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoleResourceByPrimaryKey", startResult, maxRows, roleid, resourceid);
			return (com.aiop.yourtask.domain.RoleResource) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoleResourceByRightrole.
	 *
	 * @param rightrole the rightrole
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole) throws DataAccessException {

		return findRoleResourceByRightrole(rightrole, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByRightrole.
	 *
	 * @param rightrole the rightrole
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleResourceByRightrole", startResult, maxRows, rightrole);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleResourceByRoleid.
	 *
	 * @param roleid the roleid
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid) throws DataAccessException {

		return findRoleResourceByRoleid(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByRoleid.
	 *
	 * @param roleid the roleid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleResourceByRoleid", startResult, maxRows, roleid);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(RoleResource entity) {
		return true;
	}
}
