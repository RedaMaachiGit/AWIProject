
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Suinfo;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Suinfo entities.
 * 
 */
public interface SuinfoDAO extends JpaDao<Suinfo> {

	/**
	 * JPQL Query - findAllSuinfos
	 *
	 */
	public Set<Suinfo> findAllSuinfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllSuinfos
	 *
	 */
	public Set<Suinfo> findAllSuinfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSuinfoByPrimaryKey
	 *
	 */
	public Suinfo findSuinfoByPrimaryKey(Integer suinfoid) throws DataAccessException;

	/**
	 * JPQL Query - findSuinfoByPrimaryKey
	 *
	 */
	public Suinfo findSuinfoByPrimaryKey(Integer suinfoid, int startResult, int maxRows) throws DataAccessException;

}