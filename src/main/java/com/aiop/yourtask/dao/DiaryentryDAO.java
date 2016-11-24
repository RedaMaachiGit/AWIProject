/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Diaryentry;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Diaryentry entities.
 * 
 */
public interface DiaryentryDAO extends JpaDao<Diaryentry> {

	/**
	 * JPQL Query - findDiaryentryByPrimaryKey.
	 *
	 * @param diaryentryid the diaryentryid
	 * @return the diaryentry
	 * @throws DataAccessException the data access exception
	 */
	public Diaryentry findDiaryentryByPrimaryKey(Integer diaryentryid) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryentryByPrimaryKey.
	 *
	 * @param diaryentryid the diaryentryid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the diaryentry
	 * @throws DataAccessException the data access exception
	 */
	public Diaryentry findDiaryentryByPrimaryKey(Integer diaryentryid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDiaryentrys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diaryentry> findAllDiaryentrys() throws DataAccessException;

	/**
	 * JPQL Query - findAllDiaryentrys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diaryentry> findAllDiaryentrys(int startResult, int maxRows) throws DataAccessException;

}