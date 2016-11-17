
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

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RoleDAOImpl
	 *
	 */
	public RoleDAOImpl() {
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
	 * JPQL Query - findRoleByRolename
	 *
	 */
	@Transactional
	public Set<Role> findRoleByRolename(String rolename) throws DataAccessException {

		return findRoleByRolename(rolename, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByRolename
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Role> findRoleByRolename(String rolename, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleByRolename", startResult, maxRows, rolename);
		return new LinkedHashSet<Role>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleByPrimaryKey
	 *
	 */
	@Transactional
	public Role findRoleByPrimaryKey(Integer roleid) throws DataAccessException {

		return findRoleByPrimaryKey(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByPrimaryKey
	 *
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
	 * JPQL Query - findAllRoles
	 *
	 */
	@Transactional
	public Set<Role> findAllRoles() throws DataAccessException {

		return findAllRoles(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Role> findAllRoles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoles", startResult, maxRows);
		return new LinkedHashSet<Role>(query.getResultList());
	}

	/**
	 * JPQL Query - findRoleByRoleid
	 *
	 */
	@Transactional
	public Role findRoleByRoleid(Integer roleid) throws DataAccessException {

		return findRoleByRoleid(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByRoleid
	 *
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
	 * JPQL Query - findRoleByRolenameContaining
	 *
	 */
	@Transactional
	public Set<Role> findRoleByRolenameContaining(String rolename) throws DataAccessException {

		return findRoleByRolenameContaining(rolename, -1, -1);
	}

	/**
	 * JPQL Query - findRoleByRolenameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Role> findRoleByRolenameContaining(String rolename, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRoleByRolenameContaining", startResult, maxRows, rolename);
		return new LinkedHashSet<Role>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Role entity) {
		return true;
	}
}
