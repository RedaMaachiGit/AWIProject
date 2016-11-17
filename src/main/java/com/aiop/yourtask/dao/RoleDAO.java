
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Role;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Role entities.
 * 
 */
public interface RoleDAO extends JpaDao<Role> {

	/**
	 * JPQL Query - findRoleByRolename
	 *
	 */
	public Set<Role> findRoleByRolename(String rolename) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRolename
	 *
	 */
	public Set<Role> findRoleByRolename(String rolename, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByPrimaryKey
	 *
	 */
	public Role findRoleByPrimaryKey(Integer roleid) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByPrimaryKey
	 *
	 */
	public Role findRoleByPrimaryKey(Integer roleid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoles
	 *
	 */
	public Set<Role> findAllRoles() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoles
	 *
	 */
	public Set<Role> findAllRoles(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRoleid
	 *
	 */
	public Role findRoleByRoleid(Integer roleid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRoleid
	 *
	 */
	public Role findRoleByRoleid(Integer roleid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRolenameContaining
	 *
	 */
	public Set<Role> findRoleByRolenameContaining(String rolename_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRolenameContaining
	 *
	 */
	public Set<Role> findRoleByRolenameContaining(String rolename_1, int startResult, int maxRows) throws DataAccessException;

}