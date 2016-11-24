/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Suinfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Suinfo entities.
 * 
 */
public interface SuinfoDAO extends JpaDao<Suinfo> {

	/**
	 * JPQL Query - findAllSuinfos.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Suinfo> findAllSuinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllSuinfos.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Suinfo> findAllSuinfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSuinfoByPrimaryKey.
	 *
	 * @param suinfoid the suinfoid
	 * @return the suinfo
	 * @throws DataAccessException the data access exception
	 */
	public Suinfo findSuinfoByPrimaryKey(Integer suinfoid) throws DataAccessException;

	/**
	 * JPQL Query - findSuinfoByPrimaryKey.
	 *
	 * @param suinfoid the suinfoid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the suinfo
	 * @throws DataAccessException the data access exception
	 */
	public Suinfo findSuinfoByPrimaryKey(Integer suinfoid, int startResult, int maxRows) throws DataAccessException;

}