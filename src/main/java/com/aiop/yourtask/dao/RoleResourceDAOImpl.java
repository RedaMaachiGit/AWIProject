
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

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoleResourceDAOImpl
	 *
	 */
	public RoleResourceDAOImpl() {
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
	 * JPQL Query - findRoleResourceByResourceid
	 *
	 */
	@Transactional
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid) throws DataAccessException {

		return findRoleResourceByResourceid(resourceid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByResourceid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleResourceByResourceid", startResult, maxRows, resourceid);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRoleResources
	 *
	 */
	@Transactional
	public Set<RoleResource> findAllRoleResources() throws DataAccessException {

		return findAllRoleResources(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoleResources
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findAllRoleResources(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoleResources", startResult, maxRows);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey
	 *
	 */
	@Transactional
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid) throws DataAccessException {

		return findRoleResourceByPrimaryKey(roleid, resourceid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey
	 *
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
	 * JPQL Query - findRoleResourceByRightrole
	 *
	 */
	@Transactional
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole) throws DataAccessException {

		return findRoleResourceByRightrole(rightrole, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByRightrole
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleResourceByRightrole", startResult, maxRows, rightrole);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleResourceByRoleid
	 *
	 */
	@Transactional
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid) throws DataAccessException {

		return findRoleResourceByRoleid(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleResourceByRoleid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleResourceByRoleid", startResult, maxRows, roleid);
		return new LinkedHashSet<RoleResource>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RoleResource entity) {
		return true;
	}
}
