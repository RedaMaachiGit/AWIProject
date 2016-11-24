/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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
 * DAO to manage Order entities.
 * 
 */
@Repository("OrderDAO")

@Transactional
public class OrderDAOImpl extends AbstractJpaDao<Order> implements OrderDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Order.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderDAOImpl.
	 */
	public OrderDAOImpl() {
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
	 * JPQL Query - findOrderByOrderdateAfter.
	 *
	 * @param orderdate the orderdate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrderdateAfter(java.util.Calendar orderdate) throws DataAccessException {

		return findOrderByOrderdateAfter(orderdate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderdateAfter.
	 *
	 * @param orderdate the orderdate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderdateAfter(java.util.Calendar orderdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderdateAfter", startResult, maxRows, orderdate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrdershippingcost.
	 *
	 * @param ordershippingcost the ordershippingcost
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrdershippingcost(java.math.BigDecimal ordershippingcost) throws DataAccessException {

		return findOrderByOrdershippingcost(ordershippingcost, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrdershippingcost.
	 *
	 * @param ordershippingcost the ordershippingcost
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrdershippingcost(java.math.BigDecimal ordershippingcost, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrdershippingcost", startResult, maxRows, ordershippingcost);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderdateBefore.
	 *
	 * @param orderdate the orderdate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrderdateBefore(java.util.Calendar orderdate) throws DataAccessException {

		return findOrderByOrderdateBefore(orderdate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderdateBefore.
	 *
	 * @param orderdate the orderdate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderdateBefore(java.util.Calendar orderdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderdateBefore", startResult, maxRows, orderdate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey.
	 *
	 * @param orderid the orderid
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Order findOrderByPrimaryKey(Integer orderid) throws DataAccessException {

		return findOrderByPrimaryKey(orderid, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByPrimaryKey.
	 *
	 * @param orderid the orderid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Order findOrderByPrimaryKey(Integer orderid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderByPrimaryKey", startResult, maxRows, orderid);
			return (com.aiop.yourtask.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllOrders.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findAllOrders() throws DataAccessException {

		return findAllOrders(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrders.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findAllOrders(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrders", startResult, maxRows);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderprice.
	 *
	 * @param orderprice the orderprice
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrderprice(java.math.BigDecimal orderprice) throws DataAccessException {

		return findOrderByOrderprice(orderprice, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderprice.
	 *
	 * @param orderprice the orderprice
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderprice(java.math.BigDecimal orderprice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderprice", startResult, maxRows, orderprice);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderid.
	 *
	 * @param orderid the orderid
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Order findOrderByOrderid(Integer orderid) throws DataAccessException {

		return findOrderByOrderid(orderid, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderid.
	 *
	 * @param orderid the orderid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the order
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Order findOrderByOrderid(Integer orderid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderByOrderid", startResult, maxRows, orderid);
			return (com.aiop.yourtask.domain.Order) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderByOrderstate.
	 *
	 * @param orderstate the orderstate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrderstate(String orderstate) throws DataAccessException {

		return findOrderByOrderstate(orderstate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderstate.
	 *
	 * @param orderstate the orderstate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderstate(String orderstate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderstate", startResult, maxRows, orderstate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderstateContaining.
	 *
	 * @param orderstate the orderstate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrderstateContaining(String orderstate) throws DataAccessException {

		return findOrderByOrderstateContaining(orderstate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderstateContaining.
	 *
	 * @param orderstate the orderstate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderstateContaining(String orderstate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderstateContaining", startResult, maxRows, orderstate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderByOrderdate.
	 *
	 * @param orderdate the orderdate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Order> findOrderByOrderdate(java.util.Calendar orderdate) throws DataAccessException {

		return findOrderByOrderdate(orderdate, -1, -1);
	}

	/**
	 * JPQL Query - findOrderByOrderdate.
	 *
	 * @param orderdate the orderdate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Order> findOrderByOrderdate(java.util.Calendar orderdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderByOrderdate", startResult, maxRows, orderdate);
		return new LinkedHashSet<Order>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Order entity) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see com.aiop.yourtask.dao.YourtaskuserDAO#findYourtaskuserOrderByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public List findOrdersByYourtaskuser(Yourtaskuser user) throws DataAccessException {
		try {
			return entityManager.createQuery(
			        "SELECT o FROM Order o WHERE o.yourtaskuserByUserid = :user")
	        .setParameter("user", user)
	        .getResultList();
			//Query query = createNamedQuery("findYourtaskuserByPrimaryKey", startResult, maxRows, userid);
			//return (com.aiop.yourtask.domain.Yourtaskuser) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
}
