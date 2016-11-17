
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Yourtaskuser;

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

	/**
	 * EntityManager injected by Spring for persistence unit postgresqlall
	 *
	 */
	@PersistenceContext(unitName = "postgresqlall")
	private EntityManager entityManager;

	/**
	 * Instantiates a new YourtaskuserDAOImpl
	 *
	 */
	public YourtaskuserDAOImpl() {
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
	 * JPQL Query - findYourtaskuserByUsertype
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype) throws DataAccessException {

		return findYourtaskuserByUsertype(usertype, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertype
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertype", startResult, maxRows, usertype);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber) throws DataAccessException {

		return findYourtaskuserByUserstreetnumberContaining(userstreetnumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserstreetnumberContaining", startResult, maxRows, userstreetnumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseriban
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban) throws DataAccessException {

		return findYourtaskuserByUseriban(useriban, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseriban
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseriban", startResult, maxRows, useriban);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertoken
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken) throws DataAccessException {

		return findYourtaskuserByUsertoken(usertoken, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertoken
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertoken", startResult, maxRows, usertoken);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(java.util.Calendar userdateofbirth) throws DataAccessException {

		return findYourtaskuserByUserdateofbirth(userdateofbirth, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(java.util.Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserdateofbirth", startResult, maxRows, userdateofbirth);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode) throws DataAccessException {

		return findYourtaskuserByUserzipcode(userzipcode, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserzipcode", startResult, maxRows, userzipcode);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllYourtaskusers
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findAllYourtaskusers() throws DataAccessException {

		return findAllYourtaskusers(-1, -1);
	}

	/**
	 * JPQL Query - findAllYourtaskusers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findAllYourtaskusers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllYourtaskusers", startResult, maxRows);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber) throws DataAccessException {

		return findYourtaskuserByUserphonenumberContaining(userphonenumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserphonenumberContaining", startResult, maxRows, userphonenumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken) throws DataAccessException {

		return findYourtaskuserByUsertokenContaining(usertoken, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertokenContaining", startResult, maxRows, usertoken);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserid
	 *
	 */
	@Transactional
	public Yourtaskuser findYourtaskuserByUserid(Integer userid) throws DataAccessException {

		return findYourtaskuserByUserid(userid, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserid
	 *
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
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(java.util.Calendar userlastconnectiondate) throws DataAccessException {

		return findYourtaskuserByUserlastconnectiondateAfter(userlastconnectiondate, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(java.util.Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserlastconnectiondateAfter", startResult, maxRows, userlastconnectiondate);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(java.util.Calendar userdateofbirth) throws DataAccessException {

		return findYourtaskuserByUserdateofbirthBefore(userdateofbirth, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(java.util.Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserdateofbirthBefore", startResult, maxRows, userdateofbirth);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpassword
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword) throws DataAccessException {

		return findYourtaskuserByUserpassword(userpassword, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserpassword", startResult, maxRows, userpassword);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban) throws DataAccessException {

		return findYourtaskuserByUseribanContaining(useriban, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseribanContaining", startResult, maxRows, useriban);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername) throws DataAccessException {

		return findYourtaskuserByUserusernameContaining(userusername, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserusernameContaining", startResult, maxRows, userusername);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey
	 *
	 */
	@Transactional
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid) throws DataAccessException {

		return findYourtaskuserByPrimaryKey(userid, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey
	 *
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
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(java.util.Calendar userlastconnectiondate) throws DataAccessException {

		return findYourtaskuserByUserlastconnectiondate(userlastconnectiondate, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(java.util.Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserlastconnectiondate", startResult, maxRows, userlastconnectiondate);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusername
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername) throws DataAccessException {

		return findYourtaskuserByUserusername(userusername, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserusername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserusername", startResult, maxRows, userusername);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremail
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail) throws DataAccessException {

		return findYourtaskuserByUseremail(useremail, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseremail", startResult, maxRows, useremail);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercity
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity) throws DataAccessException {

		return findYourtaskuserByUsercity(usercity, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsercity", startResult, maxRows, usercity);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber) throws DataAccessException {

		return findYourtaskuserByUserphonenumber(userphonenumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserphonenumber", startResult, maxRows, userphonenumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(java.util.Calendar userdateofbirth) throws DataAccessException {

		return findYourtaskuserByUserdateofbirthAfter(userdateofbirth, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(java.util.Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserdateofbirthAfter", startResult, maxRows, userdateofbirth);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity) throws DataAccessException {

		return findYourtaskuserByUsercityContaining(usercity, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsercityContaining", startResult, maxRows, usercity);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword) throws DataAccessException {

		return findYourtaskuserByUserpasswordContaining(userpassword, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserpasswordContaining", startResult, maxRows, userpassword);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber) throws DataAccessException {

		return findYourtaskuserByUserstreetnumber(userstreetnumber, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserstreetnumber", startResult, maxRows, userstreetnumber);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(java.util.Calendar userlastconnectiondate) throws DataAccessException {

		return findYourtaskuserByUserlastconnectiondateBefore(userlastconnectiondate, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(java.util.Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserlastconnectiondateBefore", startResult, maxRows, userlastconnectiondate);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode) throws DataAccessException {

		return findYourtaskuserByUserzipcodeContaining(userzipcode, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUserzipcodeContaining", startResult, maxRows, userzipcode);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype) throws DataAccessException {

		return findYourtaskuserByUsertypeContaining(usertype, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUsertypeContaining", startResult, maxRows, usertype);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining
	 *
	 */
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail) throws DataAccessException {

		return findYourtaskuserByUseremailContaining(useremail, -1, -1);
	}

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findYourtaskuserByUseremailContaining", startResult, maxRows, useremail);
		return new LinkedHashSet<Yourtaskuser>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Yourtaskuser entity) {
		return true;
	}
}
