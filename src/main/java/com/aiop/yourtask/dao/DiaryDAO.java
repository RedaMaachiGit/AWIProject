
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Diary;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Diary entities.
 * 
 */
public interface DiaryDAO extends JpaDao<Diary> {

	/**
	 * JPQL Query - findDiaryByDiarydateBefore
	 *
	 */
	public Set<Diary> findDiaryByDiarydateBefore(java.util.Calendar diarydate) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydateBefore
	 *
	 */
	public Set<Diary> findDiaryByDiarydateBefore(Calendar diarydate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarynameContaining
	 *
	 */
	public Set<Diary> findDiaryByDiarynameContaining(String diaryname) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarynameContaining
	 *
	 */
	public Set<Diary> findDiaryByDiarynameContaining(String diaryname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByPrimaryKey
	 *
	 */
	public Diary findDiaryByPrimaryKey(Integer iddiary) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByPrimaryKey
	 *
	 */
	public Diary findDiaryByPrimaryKey(Integer iddiary, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydate
	 *
	 */
	public Set<Diary> findDiaryByDiarydate(java.util.Calendar diarydate_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydate
	 *
	 */
	public Set<Diary> findDiaryByDiarydate(Calendar diarydate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByIddiary
	 *
	 */
	public Diary findDiaryByIddiary(Integer iddiary_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByIddiary
	 *
	 */
	public Diary findDiaryByIddiary(Integer iddiary_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydateAfter
	 *
	 */
	public Set<Diary> findDiaryByDiarydateAfter(java.util.Calendar diarydate_2) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiarydateAfter
	 *
	 */
	public Set<Diary> findDiaryByDiarydateAfter(Calendar diarydate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiaryname
	 *
	 */
	public Set<Diary> findDiaryByDiaryname(String diaryname_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiaryByDiaryname
	 *
	 */
	public Set<Diary> findDiaryByDiaryname(String diaryname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDiarys
	 *
	 */
	public Set<Diary> findAllDiarys() throws DataAccessException;

	/**
	 * JPQL Query - findAllDiarys
	 *
	 */
	public Set<Diary> findAllDiarys(int startResult, int maxRows) throws DataAccessException;

}