
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Goal;

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
 * DAO to manage Goal entities.
 * 
 */
@Repository("GoalDAO")

@Transactional
public class GoalDAOImpl extends AbstractJpaDao<Goal> implements GoalDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Goal.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GoalDAOImpl
	 *
	 */
	public GoalDAOImpl() {
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
	 * JPQL Query - findGoalByGoalname
	 *
	 */
	@Transactional
	public Set<Goal> findGoalByGoalname(String goalname) throws DataAccessException {

		return findGoalByGoalname(goalname, -1, -1);
	}

	/**
	 * JPQL Query - findGoalByGoalname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Goal> findGoalByGoalname(String goalname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGoalByGoalname", startResult, maxRows, goalname);
		return new LinkedHashSet<Goal>(query.getResultList());
	}

	/**
	 * JPQL Query - findGoalByGoaldescriptionContaining
	 *
	 */
	@Transactional
	public Set<Goal> findGoalByGoaldescriptionContaining(String goaldescription) throws DataAccessException {

		return findGoalByGoaldescriptionContaining(goaldescription, -1, -1);
	}

	/**
	 * JPQL Query - findGoalByGoaldescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Goal> findGoalByGoaldescriptionContaining(String goaldescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGoalByGoaldescriptionContaining", startResult, maxRows, goaldescription);
		return new LinkedHashSet<Goal>(query.getResultList());
	}

	/**
	 * JPQL Query - findGoalByPrimaryKey
	 *
	 */
	@Transactional
	public Goal findGoalByPrimaryKey(Integer goalid) throws DataAccessException {

		return findGoalByPrimaryKey(goalid, -1, -1);
	}

	/**
	 * JPQL Query - findGoalByPrimaryKey
	 *
	 */

	@Transactional
	public Goal findGoalByPrimaryKey(Integer goalid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGoalByPrimaryKey", startResult, maxRows, goalid);
			return (com.aiop.yourtask.domain.Goal) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGoalByGoalnameContaining
	 *
	 */
	@Transactional
	public Set<Goal> findGoalByGoalnameContaining(String goalname) throws DataAccessException {

		return findGoalByGoalnameContaining(goalname, -1, -1);
	}

	/**
	 * JPQL Query - findGoalByGoalnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Goal> findGoalByGoalnameContaining(String goalname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGoalByGoalnameContaining", startResult, maxRows, goalname);
		return new LinkedHashSet<Goal>(query.getResultList());
	}

	/**
	 * JPQL Query - findGoalByGoalid
	 *
	 */
	@Transactional
	public Goal findGoalByGoalid(Integer goalid) throws DataAccessException {

		return findGoalByGoalid(goalid, -1, -1);
	}

	/**
	 * JPQL Query - findGoalByGoalid
	 *
	 */

	@Transactional
	public Goal findGoalByGoalid(Integer goalid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGoalByGoalid", startResult, maxRows, goalid);
			return (com.aiop.yourtask.domain.Goal) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllGoals
	 *
	 */
	@Transactional
	public Set<Goal> findAllGoals() throws DataAccessException {

		return findAllGoals(-1, -1);
	}

	/**
	 * JPQL Query - findAllGoals
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Goal> findAllGoals(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGoals", startResult, maxRows);
		return new LinkedHashSet<Goal>(query.getResultList());
	}

	/**
	 * JPQL Query - findGoalByGoaldescription
	 *
	 */
	@Transactional
	public Set<Goal> findGoalByGoaldescription(String goaldescription) throws DataAccessException {

		return findGoalByGoaldescription(goaldescription, -1, -1);
	}

	/**
	 * JPQL Query - findGoalByGoaldescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Goal> findGoalByGoaldescription(String goaldescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGoalByGoaldescription", startResult, maxRows, goaldescription);
		return new LinkedHashSet<Goal>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Goal entity) {
		return true;
	}
}
