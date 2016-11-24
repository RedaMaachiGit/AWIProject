/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Resource;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Resource entities.
 * 
 */
public interface ResourceDAO extends JpaDao<Resource> {

	/**
	 * JPQL Query - findResourceByPrimaryKey.
	 *
	 * @param resourceid the resourceid
	 * @return the resource
	 * @throws DataAccessException the data access exception
	 */
	public Resource findResourceByPrimaryKey(Integer resourceid) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByPrimaryKey.
	 *
	 * @param resourceid the resourceid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the resource
	 * @throws DataAccessException the data access exception
	 */
	public Resource findResourceByPrimaryKey(Integer resourceid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurlContaining.
	 *
	 * @param resourceurl the resourceurl
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Resource> findResourceByResourceurlContaining(String resourceurl) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurlContaining.
	 *
	 * @param resourceurl the resourceurl
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Resource> findResourceByResourceurlContaining(String resourceurl, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurl.
	 *
	 * @param resourceurl_1 the resourceurl 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Resource> findResourceByResourceurl(String resourceurl_1) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurl.
	 *
	 * @param resourceurl_1 the resourceurl 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Resource> findResourceByResourceurl(String resourceurl_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllResources.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Resource> findAllResources() throws DataAccessException;

	/**
	 * JPQL Query - findAllResources.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Resource> findAllResources(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceid.
	 *
	 * @param resourceid_1 the resourceid 1
	 * @return the resource
	 * @throws DataAccessException the data access exception
	 */
	public Resource findResourceByResourceid(Integer resourceid_1) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceid.
	 *
	 * @param resourceid_1 the resourceid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the resource
	 * @throws DataAccessException the data access exception
	 */
	public Resource findResourceByResourceid(Integer resourceid_1, int startResult, int maxRows) throws DataAccessException;

}