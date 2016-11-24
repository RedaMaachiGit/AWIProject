/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Role;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Role entities.
 * 
 */
public interface RoleDAO extends JpaDao<Role> {

	/**
	 * JPQL Query - findRoleByRolename.
	 *
	 * @param rolename the rolename
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Role> findRoleByRolename(String rolename) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRolename.
	 *
	 * @param rolename the rolename
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Role> findRoleByRolename(String rolename, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */
	public Role findRoleByPrimaryKey(Integer roleid) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */
	public Role findRoleByPrimaryKey(Integer roleid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoles.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Role> findAllRoles() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoles.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Role> findAllRoles(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRoleid.
	 *
	 * @param roleid_1 the roleid 1
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */
	public Role findRoleByRoleid(Integer roleid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRoleid.
	 *
	 * @param roleid_1 the roleid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the role
	 * @throws DataAccessException the data access exception
	 */
	public Role findRoleByRoleid(Integer roleid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRolenameContaining.
	 *
	 * @param rolename_1 the rolename 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Role> findRoleByRolenameContaining(String rolename_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleByRolenameContaining.
	 *
	 * @param rolename_1 the rolename 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Role> findRoleByRolenameContaining(String rolename_1, int startResult, int maxRows) throws DataAccessException;

}