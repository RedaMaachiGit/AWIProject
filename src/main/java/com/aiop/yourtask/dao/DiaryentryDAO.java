
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Diaryentry;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Diaryentry entities.
 * 
 */
public interface DiaryentryDAO extends JpaDao<Diaryentry> {

	/**
	 * JPQL Query - findDiaryentryByPrimaryKey
	 *
	 */
	public Diaryentry findDiaryentryByPrimaryKey(Integer diaryentryid) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryentryByPrimaryKey
	 *
	 */
	public Diaryentry findDiaryentryByPrimaryKey(Integer diaryentryid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDiaryentrys
	 *
	 */
	public Set<Diaryentry> findAllDiaryentrys() throws DataAccessException;

	/**
	 * JPQL Query - findAllDiaryentrys
	 *
	 */
	public Set<Diaryentry> findAllDiaryentrys(int startResult, int maxRows) throws DataAccessException;

}