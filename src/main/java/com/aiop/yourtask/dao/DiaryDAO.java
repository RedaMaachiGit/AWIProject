/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Diary;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Diary entities.
 * 
 */
public interface DiaryDAO extends JpaDao<Diary> {

	/**
	 * JPQL Query - findDiaryByDiarydateBefore.
	 *
	 * @param diarydate the diarydate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarydateBefore(java.util.Calendar diarydate) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydateBefore.
	 *
	 * @param diarydate the diarydate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarydateBefore(Calendar diarydate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarynameContaining.
	 *
	 * @param diaryname the diaryname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarynameContaining(String diaryname) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarynameContaining.
	 *
	 * @param diaryname the diaryname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarynameContaining(String diaryname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByPrimaryKey.
	 *
	 * @param iddiary the iddiary
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */
	public Diary findDiaryByPrimaryKey(Integer iddiary) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByPrimaryKey.
	 *
	 * @param iddiary the iddiary
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */
	public Diary findDiaryByPrimaryKey(Integer iddiary, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydate.
	 *
	 * @param diarydate_1 the diarydate 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarydate(java.util.Calendar diarydate_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydate.
	 *
	 * @param diarydate_1 the diarydate 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarydate(Calendar diarydate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByIddiary.
	 *
	 * @param iddiary_1 the iddiary 1
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */
	public Diary findDiaryByIddiary(Integer iddiary_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByIddiary.
	 *
	 * @param iddiary_1 the iddiary 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */
	public Diary findDiaryByIddiary(Integer iddiary_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydateAfter.
	 *
	 * @param diarydate_2 the diarydate 2
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarydateAfter(java.util.Calendar diarydate_2) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydateAfter.
	 *
	 * @param diarydate_2 the diarydate 2
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiarydateAfter(Calendar diarydate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiaryname.
	 *
	 * @param diaryname_1 the diaryname 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiaryname(String diaryname_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiaryname.
	 *
	 * @param diaryname_1 the diaryname 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findDiaryByDiaryname(String diaryname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDiarys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findAllDiarys() throws DataAccessException;

	/**
	 * JPQL Query - findAllDiarys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Diary> findAllDiarys(int startResult, int maxRows) throws DataAccessException;

}