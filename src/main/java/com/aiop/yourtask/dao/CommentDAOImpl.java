
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Comment;

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
 * DAO to manage Comment entities.
 * 
 */
@Repository("CommentDAO")

@Transactional
public class CommentDAOImpl extends AbstractJpaDao<Comment> implements CommentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Comment.class }));

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CommentDAOImpl
	 *
	 */
	public CommentDAOImpl() {
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
	 * JPQL Query - findCommentByCommentdateBefore
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByCommentdateBefore(java.util.Calendar commentdate) throws DataAccessException {

		return findCommentByCommentdateBefore(commentdate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCommentdateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByCommentdateBefore(java.util.Calendar commentdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByCommentdateBefore", startResult, maxRows, commentdate);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByCommentcontent
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByCommentcontent(String commentcontent) throws DataAccessException {

		return findCommentByCommentcontent(commentcontent, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCommentcontent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByCommentcontent(String commentcontent, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByCommentcontent", startResult, maxRows, commentcontent);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByCommentdateAfter
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByCommentdateAfter(java.util.Calendar commentdate) throws DataAccessException {

		return findCommentByCommentdateAfter(commentdate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCommentdateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByCommentdateAfter(java.util.Calendar commentdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByCommentdateAfter", startResult, maxRows, commentdate);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByCommentdate
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByCommentdate(java.util.Calendar commentdate) throws DataAccessException {

		return findCommentByCommentdate(commentdate, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCommentdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByCommentdate(java.util.Calendar commentdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByCommentdate", startResult, maxRows, commentdate);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByCommentid
	 *
	 */
	@Transactional
	public Comment findCommentByCommentid(Integer commentid) throws DataAccessException {

		return findCommentByCommentid(commentid, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCommentid
	 *
	 */

	@Transactional
	public Comment findCommentByCommentid(Integer commentid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCommentByCommentid", startResult, maxRows, commentid);
			return (com.aiop.yourtask.domain.Comment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCommentByCommentcontentContaining
	 *
	 */
	@Transactional
	public Set<Comment> findCommentByCommentcontentContaining(String commentcontent) throws DataAccessException {

		return findCommentByCommentcontentContaining(commentcontent, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByCommentcontentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findCommentByCommentcontentContaining(String commentcontent, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCommentByCommentcontentContaining", startResult, maxRows, commentcontent);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllComments
	 *
	 */
	@Transactional
	public Set<Comment> findAllComments() throws DataAccessException {

		return findAllComments(-1, -1);
	}

	/**
	 * JPQL Query - findAllComments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comment> findAllComments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllComments", startResult, maxRows);
		return new LinkedHashSet<Comment>(query.getResultList());
	}

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */
	@Transactional
	public Comment findCommentByPrimaryKey(Integer commentid) throws DataAccessException {

		return findCommentByPrimaryKey(commentid, -1, -1);
	}

	/**
	 * JPQL Query - findCommentByPrimaryKey
	 *
	 */

	@Transactional
	public Comment findCommentByPrimaryKey(Integer commentid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCommentByPrimaryKey", startResult, maxRows, commentid);
			return (com.aiop.yourtask.domain.Comment) query.getSingleResult();
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
	public boolean canBeMerged(Comment entity) {
		return true;
	}
}
