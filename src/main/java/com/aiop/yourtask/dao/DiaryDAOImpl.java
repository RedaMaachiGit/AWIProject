/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Diary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Diary entities.
 * 
 */
@Repository("DiaryDAO")

@Transactional
public class DiaryDAOImpl extends AbstractJpaDao<Diary> implements DiaryDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Diary.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DiaryDAOImpl.
	 */
	public DiaryDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit .
	 *
	 * @return the entity manager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 * @return the types
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findDiaryByDiarydateBefore.
	 *
	 * @param diarydate the diarydate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diary> findDiaryByDiarydateBefore(java.util.Calendar diarydate) throws DataAccessException {

		return findDiaryByDiarydateBefore(diarydate, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByDiarydateBefore.
	 *
	 * @param diarydate the diarydate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diary> findDiaryByDiarydateBefore(java.util.Calendar diarydate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiaryByDiarydateBefore", startResult, maxRows, diarydate);
		return new LinkedHashSet<Diary>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiaryByDiarynameContaining.
	 *
	 * @param diaryname the diaryname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diary> findDiaryByDiarynameContaining(String diaryname) throws DataAccessException {

		return findDiaryByDiarynameContaining(diaryname, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByDiarynameContaining.
	 *
	 * @param diaryname the diaryname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diary> findDiaryByDiarynameContaining(String diaryname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiaryByDiarynameContaining", startResult, maxRows, diaryname);
		return new LinkedHashSet<Diary>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiaryByPrimaryKey.
	 *
	 * @param iddiary the iddiary
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Diary findDiaryByPrimaryKey(Integer iddiary) throws DataAccessException {

		return findDiaryByPrimaryKey(iddiary, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByPrimaryKey.
	 *
	 * @param iddiary the iddiary
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Diary findDiaryByPrimaryKey(Integer iddiary, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDiaryByPrimaryKey", startResult, maxRows, iddiary);
			return (com.aiop.yourtask.domain.Diary) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDiaryByDiarydate.
	 *
	 * @param diarydate the diarydate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diary> findDiaryByDiarydate(java.util.Calendar diarydate) throws DataAccessException {

		return findDiaryByDiarydate(diarydate, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByDiarydate.
	 *
	 * @param diarydate the diarydate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diary> findDiaryByDiarydate(java.util.Calendar diarydate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiaryByDiarydate", startResult, maxRows, diarydate);
		return new LinkedHashSet<Diary>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiaryByIddiary.
	 *
	 * @param iddiary the iddiary
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Diary findDiaryByIddiary(Integer iddiary) throws DataAccessException {

		return findDiaryByIddiary(iddiary, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByIddiary.
	 *
	 * @param iddiary the iddiary
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the diary
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Diary findDiaryByIddiary(Integer iddiary, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDiaryByIddiary", startResult, maxRows, iddiary);
			return (com.aiop.yourtask.domain.Diary) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDiaryByDiarydateAfter.
	 *
	 * @param diarydate the diarydate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diary> findDiaryByDiarydateAfter(java.util.Calendar diarydate) throws DataAccessException {

		return findDiaryByDiarydateAfter(diarydate, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByDiarydateAfter.
	 *
	 * @param diarydate the diarydate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diary> findDiaryByDiarydateAfter(java.util.Calendar diarydate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiaryByDiarydateAfter", startResult, maxRows, diarydate);
		return new LinkedHashSet<Diary>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiaryByDiaryname.
	 *
	 * @param diaryname the diaryname
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diary> findDiaryByDiaryname(String diaryname) throws DataAccessException {

		return findDiaryByDiaryname(diaryname, -1, -1);
	}

	/**
	 * JPQL Query - findDiaryByDiaryname.
	 *
	 * @param diaryname the diaryname
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diary> findDiaryByDiaryname(String diaryname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiaryByDiaryname", startResult, maxRows, diaryname);
		return new LinkedHashSet<Diary>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllDiarys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Diary> findAllDiarys() throws DataAccessException {

		return findAllDiarys(-1, -1);
	}

	/**
	 * JPQL Query - findAllDiarys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diary> findAllDiarys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDiarys", startResult, maxRows);
		return new LinkedHashSet<Diary>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Diary entity) {
		return true;
	}
}
