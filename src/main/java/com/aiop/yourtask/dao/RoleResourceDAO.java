
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.RoleResource;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RoleResource entities.
 * 
 */
public interface RoleResourceDAO extends JpaDao<RoleResource> {

	/**
	 * JPQL Query - findRoleResourceByResourceid
	 *
	 */
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByResourceid
	 *
	 */
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoleResources
	 *
	 */
	public Set<RoleResource> findAllRoleResources() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoleResources
	 *
	 */
	public Set<RoleResource> findAllRoleResources(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey
	 *
	 */
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey
	 *
	 */
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRightrole
	 *
	 */
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRightrole
	 *
	 */
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRoleid
	 *
	 */
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRoleid
	 *
	 */
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid_1, int startResult, int maxRows) throws DataAccessException;

}