
package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.Calendar;
import java.util.Collection;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Yourtaskuser entities.
 * 
 */
public interface YourtaskuserDAO extends JpaDao<Yourtaskuser> {

	/**
	 * JPQL Query - findYourtaskuserByUsertype
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertype
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseriban
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseriban
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertoken
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertoken
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(java.util.Calendar userdateofbirth) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllYourtaskusers
	 *
	 */
	public Set<Yourtaskuser> findAllYourtaskusers() throws DataAccessException;

	/**
	 * JPQL Query - findAllYourtaskusers
	 *
	 */
	public Set<Yourtaskuser> findAllYourtaskusers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserid
	 *
	 */
	public Yourtaskuser findYourtaskuserByUserid(Integer userid) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserid
	 *
	 */
	public Yourtaskuser findYourtaskuserByUserid(Integer userid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(java.util.Calendar userlastconnectiondate) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(java.util.Calendar userdateofbirth_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(Calendar userdateofbirth_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpassword
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpassword
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey
	 *
	 */
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey
	 *
	 */
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(java.util.Calendar userlastconnectiondate_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(Calendar userlastconnectiondate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusername
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusername
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremail
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremail
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercity
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercity
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(java.util.Calendar userdateofbirth_2) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(Calendar userdateofbirth_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(java.util.Calendar userlastconnectiondate_2) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(Calendar userlastconnectiondate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining
	 *
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCompanys
	 *
	 */
	public Set<Yourtaskuser> findAllCompanys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCompanys
	 *
	 */
	public Set<Yourtaskuser> findAllCompanys() throws DataAccessException;

	/**
	 * JPQL Query - findCompanyBySIRET
	 *
	 */
	public Yourtaskuser findCompanyBySIRET(String company_companySIRET) throws DataAccessException;

	/**
	 * JPQL Query - findCompanyBySIRET
	 *
	 */
	public Yourtaskuser findCompanyBySIRET(Integer company_companySIRET, int startResult, int maxRows) throws DataAccessException;

}