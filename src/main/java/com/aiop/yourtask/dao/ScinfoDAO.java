/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Scinfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Scinfo entities.
 * 
 */
public interface ScinfoDAO extends JpaDao<Scinfo> {

	/**
	 * JPQL Query - findScinfoByPrimaryKey.
	 *
	 * @param scinfoid the scinfoid
	 * @return the scinfo
	 * @throws DataAccessException the data access exception
	 */
	public Scinfo findScinfoByPrimaryKey(Integer scinfoid) throws DataAccessException;

	/**
	 * JPQL Query - findScinfoByPrimaryKey.
	 *
	 * @param scinfoid the scinfoid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the scinfo
	 * @throws DataAccessException the data access exception
	 */
	public Scinfo findScinfoByPrimaryKey(Integer scinfoid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllScinfos.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Scinfo> findAllScinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllScinfos.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Scinfo> findAllScinfos(int startResult, int maxRows) throws DataAccessException;

}