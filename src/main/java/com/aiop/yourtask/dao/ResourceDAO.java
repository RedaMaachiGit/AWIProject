
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Resource;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Resource entities.
 * 
 */
public interface ResourceDAO extends JpaDao<Resource> {

	/**
	 * JPQL Query - findResourceByPrimaryKey
	 *
	 */
	public Resource findResourceByPrimaryKey(Integer resourceid) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByPrimaryKey
	 *
	 */
	public Resource findResourceByPrimaryKey(Integer resourceid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurlContaining
	 *
	 */
	public Set<Resource> findResourceByResourceurlContaining(String resourceurl) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurlContaining
	 *
	 */
	public Set<Resource> findResourceByResourceurlContaining(String resourceurl, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurl
	 *
	 */
	public Set<Resource> findResourceByResourceurl(String resourceurl_1) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceurl
	 *
	 */
	public Set<Resource> findResourceByResourceurl(String resourceurl_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllResources
	 *
	 */
	public Set<Resource> findAllResources() throws DataAccessException;

	/**
	 * JPQL Query - findAllResources
	 *
	 */
	public Set<Resource> findAllResources(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceid
	 *
	 */
	public Resource findResourceByResourceid(Integer resourceid_1) throws DataAccessException;

	/**
	 * JPQL Query - findResourceByResourceid
	 *
	 */
	public Resource findResourceByResourceid(Integer resourceid_1, int startResult, int maxRows) throws DataAccessException;

}