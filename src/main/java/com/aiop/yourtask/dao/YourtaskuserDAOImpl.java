/*
 * 
 */

package com.aiop.yourtask.dao;

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
 * DAO to manage Yourtaskuser entities.
 * 
 */
@Repository("YourtaskuserDAO")

@Transactional
public class YourtaskuserDAOImpl extends AbstractJpaDao<Yourtaskuser> implements YourtaskuserDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Yourtaskuser.class }));

	/** EntityManager injected by Spring for persistence unit postgresqlall. */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new YourtaskuserDAOImpl.
	 */
	public YourtaskuserDAOImpl() {
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
	 * JPQL Query - findYourtaskuserByUsertype.
	 *
	 * @param usertype the usertype
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype) throws DataAccessException {

		return findYourtaskuserByUsertype(usertype, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertype.
	 *
	 * @param usertype the usertype
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertype", startResult, maxRows, usertype);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining.
	 *
	 * @param userstreetnumber the userstreetnumber
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber) throws DataAccessException {

		return findYourtaskuserByUserstreetnumberContaining(userstreetnumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining.
	 *
	 * @param userstreetnumber the userstreetnumber
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserstreetnumberContaining", startResult, maxRows, userstreetnumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseriban.
	 *
	 * @param useriban the useriban
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban) throws DataAccessException {

		return findYourtaskuserByUseriban(useriban, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseriban.
	 *
	 * @param useriban the useriban
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseriban", startResult, maxRows, useriban);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertoken.
	 *
	 * @param usertoken the usertoken
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken) throws DataAccessException {

		return findYourtaskuserByUsertoken(usertoken, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertoken.
	 *
	 * @param usertoken the usertoken
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertoken", startResult, maxRows, usertoken);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(java.util.Calendar userdateofbirth) throws DataAccessException {

		return findYourtaskuserByUserdateofbirth(userdateofbirth, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(java.util.Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserdateofbirth", startResult, maxRows, userdateofbirth);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode.
	 *
	 * @param userzipcode the userzipcode
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode) throws DataAccessException {

		return findYourtaskuserByUserzipcode(userzipcode, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode.
	 *
	 * @param userzipcode the userzipcode
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserzipcode", startResult, maxRows, userzipcode);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllYourtaskusers.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findAllYourtaskusers() throws DataAccessException {

		return findAllYourtaskusers(-1, -1);
	}

	/**
	 * JPQL Query - findAllYourtaskusers.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findAllYourtaskusers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllYourtaskusers", startResult, maxRows);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining.
	 *
	 * @param userphonenumber the userphonenumber
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber) throws DataAccessException {

		return findYourtaskuserByUserphonenumberContaining(userphonenumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining.
	 *
	 * @param userphonenumber the userphonenumber
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserphonenumberContaining", startResult, maxRows, userphonenumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining.
	 *
	 * @param usertoken the usertoken
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken) throws DataAccessException {

		return findYourtaskuserByUsertokenContaining(usertoken, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining.
	 *
	 * @param usertoken the usertoken
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertokenContaining", startResult, maxRows, usertoken);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserid.
	 *
	 * @param userid the userid
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Yourtaskuser findYourtaskuserByUserid(Integer userid) throws DataAccessException {

		return findYourtaskuserByUserid(userid, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserid.
	 *
	 * @param userid the userid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Yourtaskuser findYourtaskuserByUserid(Integer userid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findYourtaskuserByUserid", startResult, maxRows, userid);
			return (com.aiop.yourtask.domain.Yourtaskuser) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(java.util.Calendar userlastconnectiondate) throws DataAccessException {

		return findYourtaskuserByUserlastconnectiondateAfter(userlastconnectiondate, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(java.util.Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserlastconnectiondateAfter", startResult, maxRows, userlastconnectiondate);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(java.util.Calendar userdateofbirth) throws DataAccessException {

		return findYourtaskuserByUserdateofbirthBefore(userdateofbirth, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(java.util.Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserdateofbirthBefore", startResult, maxRows, userdateofbirth);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpassword.
	 *
	 * @param userpassword the userpassword
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword) throws DataAccessException {

		return findYourtaskuserByUserpassword(userpassword, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpassword.
	 *
	 * @param userpassword the userpassword
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserpassword", startResult, maxRows, userpassword);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining.
	 *
	 * @param useriban the useriban
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban) throws DataAccessException {

		return findYourtaskuserByUseribanContaining(useriban, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining.
	 *
	 * @param useriban the useriban
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseribanContaining", startResult, maxRows, useriban);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining.
	 *
	 * @param userusername the userusername
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername) throws DataAccessException {

		return findYourtaskuserByUserusernameContaining(userusername, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining.
	 *
	 * @param userusername the userusername
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserusernameContaining", startResult, maxRows, userusername);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey.
	 *
	 * @param userid the userid
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid) throws DataAccessException {

		return findYourtaskuserByPrimaryKey(userid, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey.
	 *
	 * @param userid the userid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */

	@Transactional
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findYourtaskuserByPrimaryKey", startResult, maxRows, userid);
			return (com.aiop.yourtask.domain.Yourtaskuser) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
	

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(java.util.Calendar userlastconnectiondate) throws DataAccessException {

		return findYourtaskuserByUserlastconnectiondate(userlastconnectiondate, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(java.util.Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserlastconnectiondate", startResult, maxRows, userlastconnectiondate);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusername.
	 *
	 * @param userusername the userusername
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername) throws DataAccessException {

		return findYourtaskuserByUserusername(userusername, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusername.
	 *
	 * @param userusername the userusername
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserusername", startResult, maxRows, userusername);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremail.
	 *
	 * @param useremail the useremail
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail) throws DataAccessException {

		return findYourtaskuserByUseremail(useremail, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremail.
	 *
	 * @param useremail the useremail
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseremail", startResult, maxRows, useremail);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercity.
	 *
	 * @param usercity the usercity
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity) throws DataAccessException {

		return findYourtaskuserByUsercity(usercity, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercity.
	 *
	 * @param usercity the usercity
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsercity", startResult, maxRows, usercity);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber.
	 *
	 * @param userphonenumber the userphonenumber
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber) throws DataAccessException {

		return findYourtaskuserByUserphonenumber(userphonenumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber.
	 *
	 * @param userphonenumber the userphonenumber
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserphonenumber", startResult, maxRows, userphonenumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(java.util.Calendar userdateofbirth) throws DataAccessException {

		return findYourtaskuserByUserdateofbirthAfter(userdateofbirth, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(java.util.Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserdateofbirthAfter", startResult, maxRows, userdateofbirth);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining.
	 *
	 * @param usercity the usercity
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity) throws DataAccessException {

		return findYourtaskuserByUsercityContaining(usercity, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining.
	 *
	 * @param usercity the usercity
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsercityContaining", startResult, maxRows, usercity);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining.
	 *
	 * @param userpassword the userpassword
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword) throws DataAccessException {

		return findYourtaskuserByUserpasswordContaining(userpassword, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining.
	 *
	 * @param userpassword the userpassword
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserpasswordContaining", startResult, maxRows, userpassword);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber.
	 *
	 * @param userstreetnumber the userstreetnumber
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber) throws DataAccessException {

		return findYourtaskuserByUserstreetnumber(userstreetnumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber.
	 *
	 * @param userstreetnumber the userstreetnumber
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserstreetnumber", startResult, maxRows, userstreetnumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(java.util.Calendar userlastconnectiondate) throws DataAccessException {

		return findYourtaskuserByUserlastconnectiondateBefore(userlastconnectiondate, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(java.util.Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserlastconnectiondateBefore", startResult, maxRows, userlastconnectiondate);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining.
	 *
	 * @param userzipcode the userzipcode
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode) throws DataAccessException {

		return findYourtaskuserByUserzipcodeContaining(userzipcode, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining.
	 *
	 * @param userzipcode the userzipcode
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserzipcodeContaining", startResult, maxRows, userzipcode);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining.
	 *
	 * @param usertype the usertype
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype) throws DataAccessException {

		return findYourtaskuserByUsertypeContaining(usertype, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining.
	 *
	 * @param usertype the usertype
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertypeContaining", startResult, maxRows, usertype);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining.
	 *
	 * @param useremail the useremail
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail) throws DataAccessException {

		return findYourtaskuserByUseremailContaining(useremail, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining.
	 *
	 * @param useremail the useremail
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseremailContaining", startResult, maxRows, useremail);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 * @see store
	 */
	public boolean canBeMerged(Yourtaskuser entity) {
		return true;
	}


	/**
	 * JPQL Query - findAllCompanys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public Set<Yourtaskuser> findAllCompanys(int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAllCompanys", startResult, maxRows);
			return new LinkedHashSet<Yourtaskuser>(query.getResultList());
		} catch (NoResultException nre){
			return null;
		}
	}

	

	/**
	 * JPQL Query - findAllCompanys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public Set<Yourtaskuser> findAllCompanys() throws DataAccessException {
		try {
			Query query = createNamedQuery("findAllCompanys", -1, -1);
			return new LinkedHashSet<Yourtaskuser>(query.getResultList());	
		} catch (NoResultException nre) {
			return null;
		}	
	}

	/* (non-Javadoc)
	 * @see com.aiop.yourtask.dao.YourtaskuserDAO#findCompanyBySIRET(java.lang.String)
	 */
	@Override
	public Yourtaskuser findCompanyBySIRET(String company_companySIRET) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCompanyBySIRET", -1, -1, company_companySIRET);
			return (com.aiop.yourtask.domain.Yourtaskuser) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.aiop.yourtask.dao.YourtaskuserDAO#findCompanyBySIRET(java.lang.Integer, int, int)
	 */
	@Override
	public Yourtaskuser findCompanyBySIRET(Integer company_companySIRET, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCompanyBySIRET", startResult, maxRows, company_companySIRET);
			return (com.aiop.yourtask.domain.Yourtaskuser) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
}






