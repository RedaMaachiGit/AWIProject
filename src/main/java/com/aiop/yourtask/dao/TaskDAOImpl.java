
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Task;

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

/**
 * DAO to manage Task entities.
 * 
 */
@Repository("TaskDAO")

@Transactional
public class TaskDAOImpl extends AbstractJpaDao<Task> implements TaskDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Task.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TaskDAOImpl
	 *
	 */
	public TaskDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findTaskByPrimaryKey
	 *
	 */
	@Transactional
	public Task findTaskByPrimaryKey(Integer taskid) throws DataAccessException {

		return findTaskByPrimaryKey(taskid, -1, -1);
	}

	/**
	 * JPQL Query - findTaskByPrimaryKey
	 *
	 */

	@Transactional
	public Task findTaskByPrimaryKey(Integer taskid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTaskByPrimaryKey", startResult, maxRows, taskid);
			return (com.aiop.yourtask.domain.Task) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllTasks
	 *
	 */
	@Transactional
	public Set<Task> findAllTasks() throws DataAccessException {

		return findAllTasks(-1, -1);
	}

	/**
	 * JPQL Query - findAllTasks
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Task> findAllTasks(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTasks", startResult, maxRows);
		return new LinkedHashSet<Task>(query.getResultList());
	}

	/**
	 * JPQL Query - findTaskByTaskid
	 *
	 */
	@Transactional
	public Task findTaskByTaskid(Integer taskid) throws DataAccessException {

		return findTaskByTaskid(taskid, -1, -1);
	}

	/**
	 * JPQL Query - findTaskByTaskid
	 *
	 */

	@Transactional
	public Task findTaskByTaskid(Integer taskid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTaskByTaskid", startResult, maxRows, taskid);
			return (com.aiop.yourtask.domain.Task) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTaskByTaskcontent
	 *
	 */
	@Transactional
	public Set<Task> findTaskByTaskcontent(String taskcontent) throws DataAccessException {

		return findTaskByTaskcontent(taskcontent, -1, -1);
	}

	/**
	 * JPQL Query - findTaskByTaskcontent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Task> findTaskByTaskcontent(String taskcontent, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTaskByTaskcontent", startResult, maxRows, taskcontent);
		return new LinkedHashSet<Task>(query.getResultList());
	}

	/**
	 * JPQL Query - findTaskByTaskcontentContaining
	 *
	 */
	@Transactional
	public Set<Task> findTaskByTaskcontentContaining(String taskcontent) throws DataAccessException {

		return findTaskByTaskcontentContaining(taskcontent, -1, -1);
	}

	/**
	 * JPQL Query - findTaskByTaskcontentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Task> findTaskByTaskcontentContaining(String taskcontent, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTaskByTaskcontentContaining", startResult, maxRows, taskcontent);
		return new LinkedHashSet<Task>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Task entity) {
		return true;
	}
}
