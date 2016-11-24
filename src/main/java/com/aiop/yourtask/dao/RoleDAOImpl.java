/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Role;

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
 * DAO to manage Role entities.
 * 
 */
@Repository("RoleDAO")

@Transactional
public class RoleDAOImpl extends AbstractJpaDao<Role> implements RoleDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Role.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoleDAOImpl.
	 */
	public RoleDAOImpl() {
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
	 * JPQL Query - findRoleByRolename.
	 *
	 * @param rolename the rolename
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Role> findRoleByRolename(String rolename) throws DataAccessException {

		return findRoleByRolename(rolename, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByRolename.
	 *
	 * @param rolename the rolename
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Role> findRoleByRolename(String rolename, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleByRolename", startResult, maxRows, rolename);
		return new LinkedHashSet<Role>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Role findRoleByPrimaryKey(Integer roleid) throws DataAccessException {

		return findRoleByPrimaryKey(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Role findRoleByPrimaryKey(Integer roleid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoleByPrimaryKey", startResult, maxRows, roleid);
			return (com.aiop.yourtask.domain.Role) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllRoles.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Role> findAllRoles() throws DataAccessException {

		return findAllRoles(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoles.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Role> findAllRoles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoles", startResult, maxRows);
		return new LinkedHashSet<Role>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleByRoleid.
	 *
	 * @param roleid the roleid
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Role findRoleByRoleid(Integer roleid) throws DataAccessException {

		return findRoleByRoleid(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByRoleid.
	 *
	 * @param roleid the roleid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Role findRoleByRoleid(Integer roleid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRoleByRoleid", startResult, maxRows, roleid);
			return (com.aiop.yourtask.domain.Role) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRoleByRolenameContaining.
	 *
	 * @param rolename the rolename
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Role> findRoleByRolenameContaining(String rolename) throws DataAccessException {

		return findRoleByRolenameContaining(rolename, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByRolenameContaining.
	 *
	 * @param rolename the rolename
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Role> findRoleByRolenameContaining(String rolename, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleByRolenameContaining", startResult, maxRows, rolename);
		return new LinkedHashSet<Role>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Role entity) {
		return true;
	}
}
