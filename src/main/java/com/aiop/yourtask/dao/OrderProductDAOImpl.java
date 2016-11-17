
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.OrderProduct;

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
 * DAO to manage OrderProduct entities.
 * 
 */
@Repository("OrderProductDAO")

@Transactional
public class OrderProductDAOImpl extends AbstractJpaDao<OrderProduct> implements OrderProductDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			OrderProduct.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderProductDAOImpl
	 *
	 */
	public OrderProductDAOImpl() {
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
	 * JPQL Query - findAllOrderProducts
	 *
	 */
	@Transactional
	public Set<OrderProduct> findAllOrderProducts() throws DataAccessException {

		return findAllOrderProducts(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderProducts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderProduct> findAllOrderProducts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderProducts", startResult, maxRows);
		return new LinkedHashSet<OrderProduct>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderProductByPrimaryKey
	 *
	 */
	@Transactional
	public OrderProduct findOrderProductByPrimaryKey(Integer orderid, Integer productid) throws DataAccessException {

		return findOrderProductByPrimaryKey(orderid, productid, -1, -1);
	}

	/**
	 * JPQL Query - findOrderProductByPrimaryKey
	 *
	 */

	@Transactional
	public OrderProduct findOrderProductByPrimaryKey(Integer orderid, Integer productid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderProductByPrimaryKey", startResult, maxRows, orderid, productid);
			return (com.aiop.yourtask.domain.OrderProduct) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(OrderProduct entity) {
		return true;
	}
}
