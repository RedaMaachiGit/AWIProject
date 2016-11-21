
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Product;

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
 * DAO to manage Product entities.
 * 
 */
@Repository("ProductDAO")

@Transactional
public class ProductDAOImpl extends AbstractJpaDao<Product> implements ProductDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Product.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductDAOImpl
	 *
	 */
	public ProductDAOImpl() {
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
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer productid) throws DataAccessException {

		return findProductByPrimaryKey(productid, -1, -1);
	}

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */

	@Transactional
	public Product findProductByPrimaryKey(Integer productid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByPrimaryKey", startResult, maxRows, productid);
			return (com.aiop.yourtask.domain.Product) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
	

	/**
	 * JPQL Query - findProductByCompany
	 *
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByCompany(Integer company_companyid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByCompany", startResult, maxRows, company_companyid);
			return new LinkedHashSet<Product>(query.getResultList());
		} catch (NoResultException nre) {
			return null;
		}
	}
	
	/**
	 * JPQL Query - findProductByCompany (without max rows)
	 *
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByCompany(Integer company_companyid, int startResult) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByCompany", startResult, -1, company_companyid);
			return new LinkedHashSet<Product>(query.getResultList());
		} catch (NoResultException nre) {
			return null;
		}
	}
	

	/**
	 * JPQL Query - findProductByCompany (without max rows & start results)
	 *
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByCompany(Integer company_companyid) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByCompany", -1, -1, company_companyid);
			return new LinkedHashSet<Product>(query.getResultList());
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductByProductdescriptionContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductdescriptionContaining(String productdescription) throws DataAccessException {

		return findProductByProductdescriptionContaining(productdescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductdescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductdescriptionContaining(String productdescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductdescriptionContaining", startResult, maxRows, productdescription);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductimage
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductimage(String productimage) throws DataAccessException {

		return findProductByProductimage(productimage, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductimage
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductimage(String productimage, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductimage", startResult, maxRows, productimage);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductdescription
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductdescription(String productdescription) throws DataAccessException {

		return findProductByProductdescription(productdescription, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductdescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductdescription(String productdescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductdescription", startResult, maxRows, productdescription);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductname
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductname(String productname) throws DataAccessException {

		return findProductByProductname(productname, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductname(String productname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductname", startResult, maxRows, productname);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	@Transactional
	public Set<Product> findAllProducts() throws DataAccessException {

		return findAllProducts(-1, -1);
	}

	/**
	 * JPQL Query - findAllProducts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProducts", startResult, maxRows);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductprice
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductprice(java.math.BigDecimal productprice) throws DataAccessException {

		return findProductByProductprice(productprice, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductprice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductprice(java.math.BigDecimal productprice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductprice", startResult, maxRows, productprice);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductavailablequantity
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductavailablequantity(Integer productavailablequantity) throws DataAccessException {

		return findProductByProductavailablequantity(productavailablequantity, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductavailablequantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductavailablequantity(Integer productavailablequantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductavailablequantity", startResult, maxRows, productavailablequantity);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductid
	 *
	 */
	@Transactional
	public Product findProductByProductid(Integer productid) throws DataAccessException {

		return findProductByProductid(productid, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductid
	 *
	 */

	@Transactional
	public Product findProductByProductid(Integer productid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByProductid", startResult, maxRows, productid);
			return (com.aiop.yourtask.domain.Product) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductByProductimageContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductimageContaining(String productimage) throws DataAccessException {

		return findProductByProductimageContaining(productimage, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductimageContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductimageContaining(String productimage, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductimageContaining", startResult, maxRows, productimage);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByProductnameContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByProductnameContaining(String productname) throws DataAccessException {

		return findProductByProductnameContaining(productname, -1, -1);
	}

	/**
	 * JPQL Query - findProductByProductnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByProductnameContaining(String productname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByProductnameContaining", startResult, maxRows, productname);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Product entity) {
		return true;
	}
}
