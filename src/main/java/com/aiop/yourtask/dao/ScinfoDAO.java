
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Scinfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Scinfo entities.
 * 
 */
public interface ScinfoDAO extends JpaDao<Scinfo> {

	/**
	 * JPQL Query - findScinfoByPrimaryKey
	 *
	 */
	public Scinfo findScinfoByPrimaryKey(Integer scinfoid) throws DataAccessException;

	/**
	 * JPQL Query - findScinfoByPrimaryKey
	 *
	 */
	public Scinfo findScinfoByPrimaryKey(Integer scinfoid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllScinfos
	 *
	 */
	public Set<Scinfo> findAllScinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllScinfos
	 *
	 */
	public Set<Scinfo> findAllScinfos(int startResult, int maxRows) throws DataAccessException;

}