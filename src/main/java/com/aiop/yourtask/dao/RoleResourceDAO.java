/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.RoleResource;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage RoleResource entities.
 * 
 */
public interface RoleResourceDAO extends JpaDao<RoleResource> {

	/**
	 * JPQL Query - findRoleResourceByResourceid.
	 *
	 * @param resourceid the resourceid
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByResourceid.
	 *
	 * @param resourceid the resourceid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findRoleResourceByResourceid(Integer resourceid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoleResources.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findAllRoleResources() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoleResources.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findAllRoleResources(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @param resourceid_1 the resourceid 1
	 * @return the role resource
	 * @throws DataAccessException the data access exception
	 */
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByPrimaryKey.
	 *
	 * @param roleid the roleid
	 * @param resourceid_1 the resourceid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the role resource
	 * @throws DataAccessException the data access exception
	 */
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRightrole.
	 *
	 * @param rightrole the rightrole
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRightrole.
	 *
	 * @param rightrole the rightrole
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findRoleResourceByRightrole(Boolean rightrole, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRoleid.
	 *
	 * @param roleid_1 the roleid 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRoleResourceByRoleid.
	 *
	 * @param roleid_1 the roleid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<RoleResource> findRoleResourceByRoleid(Integer roleid_1, int startResult, int maxRows) throws DataAccessException;

}