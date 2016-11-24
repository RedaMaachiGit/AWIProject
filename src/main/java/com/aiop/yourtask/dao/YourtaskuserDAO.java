/*
 * 
 */

package com.aiop.yourtask.dao;

import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

// TODO: Auto-generated Javadoc
/**
 * DAO to manage Yourtaskuser entities.
 * 
 */
public interface YourtaskuserDAO extends JpaDao<Yourtaskuser> {

	/**
	 * JPQL Query - findYourtaskuserByUsertype.
	 *
	 * @param usertype the usertype
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertype.
	 *
	 * @param usertype the usertype
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertype(String usertype, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining.
	 *
	 * @param userstreetnumber the userstreetnumber
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumberContaining.
	 *
	 * @param userstreetnumber the userstreetnumber
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumberContaining(String userstreetnumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseriban.
	 *
	 * @param useriban the useriban
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseriban.
	 *
	 * @param useriban the useriban
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseriban(String useriban, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertoken.
	 *
	 * @param usertoken the usertoken
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertoken.
	 *
	 * @param usertoken the usertoken
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertoken(String usertoken, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(java.util.Calendar userdateofbirth) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirth.
	 *
	 * @param userdateofbirth the userdateofbirth
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirth(Calendar userdateofbirth, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode.
	 *
	 * @param userzipcode the userzipcode
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcode.
	 *
	 * @param userzipcode the userzipcode
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcode(String userzipcode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllYourtaskusers.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findAllYourtaskusers() throws DataAccessException;

	/**
	 * JPQL Query - findAllYourtaskusers.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findAllYourtaskusers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining.
	 *
	 * @param userphonenumber the userphonenumber
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumberContaining.
	 *
	 * @param userphonenumber the userphonenumber
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumberContaining(String userphonenumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining.
	 *
	 * @param usertoken_1 the usertoken 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertokenContaining.
	 *
	 * @param usertoken_1 the usertoken 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertokenContaining(String usertoken_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserid.
	 *
	 * @param userid the userid
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	public Yourtaskuser findYourtaskuserByUserid(Integer userid) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserid.
	 *
	 * @param userid the userid
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	public Yourtaskuser findYourtaskuserByUserid(Integer userid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(java.util.Calendar userlastconnectiondate) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateAfter.
	 *
	 * @param userlastconnectiondate the userlastconnectiondate
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateAfter(Calendar userlastconnectiondate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore.
	 *
	 * @param userdateofbirth_1 the userdateofbirth 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(java.util.Calendar userdateofbirth_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthBefore.
	 *
	 * @param userdateofbirth_1 the userdateofbirth 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthBefore(Calendar userdateofbirth_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpassword.
	 *
	 * @param userpassword the userpassword
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpassword.
	 *
	 * @param userpassword the userpassword
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpassword(String userpassword, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining.
	 *
	 * @param useriban_1 the useriban 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseribanContaining.
	 *
	 * @param useriban_1 the useriban 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseribanContaining(String useriban_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining.
	 *
	 * @param userusername the userusername
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusernameContaining.
	 *
	 * @param userusername the userusername
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusernameContaining(String userusername, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey.
	 *
	 * @param userid_1 the userid 1
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid_1) throws DataAccessException;
	
	/**
	 * JPQL Query - findYourtaskuserOrderByPrimaryKey.
	 *
	 * @param userid_1 the userid 1
	 * @return the list
	 * @throws DataAccessException the data access exception
	 */
	public List findYourtaskuserOrderByPrimaryKey(Integer userid_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByPrimaryKey.
	 *
	 * @param userid_1 the userid 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate.
	 *
	 * @param userlastconnectiondate_1 the userlastconnectiondate 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(java.util.Calendar userlastconnectiondate_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondate.
	 *
	 * @param userlastconnectiondate_1 the userlastconnectiondate 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondate(Calendar userlastconnectiondate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusername.
	 *
	 * @param userusername_1 the userusername 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserusername.
	 *
	 * @param userusername_1 the userusername 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserusername(String userusername_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremail.
	 *
	 * @param useremail the useremail
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremail.
	 *
	 * @param useremail the useremail
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremail(String useremail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercity.
	 *
	 * @param usercity the usercity
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercity.
	 *
	 * @param usercity the usercity
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercity(String usercity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber.
	 *
	 * @param userphonenumber_1 the userphonenumber 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserphonenumber.
	 *
	 * @param userphonenumber_1 the userphonenumber 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserphonenumber(String userphonenumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter.
	 *
	 * @param userdateofbirth_2 the userdateofbirth 2
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(java.util.Calendar userdateofbirth_2) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserdateofbirthAfter.
	 *
	 * @param userdateofbirth_2 the userdateofbirth 2
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserdateofbirthAfter(Calendar userdateofbirth_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining.
	 *
	 * @param usercity_1 the usercity 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsercityContaining.
	 *
	 * @param usercity_1 the usercity 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsercityContaining(String usercity_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining.
	 *
	 * @param userpassword_1 the userpassword 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserpasswordContaining.
	 *
	 * @param userpassword_1 the userpassword 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserpasswordContaining(String userpassword_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber.
	 *
	 * @param userstreetnumber_1 the userstreetnumber 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserstreetnumber.
	 *
	 * @param userstreetnumber_1 the userstreetnumber 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserstreetnumber(String userstreetnumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore.
	 *
	 * @param userlastconnectiondate_2 the userlastconnectiondate 2
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(java.util.Calendar userlastconnectiondate_2) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserlastconnectiondateBefore.
	 *
	 * @param userlastconnectiondate_2 the userlastconnectiondate 2
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserlastconnectiondateBefore(Calendar userlastconnectiondate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining.
	 *
	 * @param userzipcode_1 the userzipcode 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUserzipcodeContaining.
	 *
	 * @param userzipcode_1 the userzipcode 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUserzipcodeContaining(String userzipcode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining.
	 *
	 * @param usertype_1 the usertype 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUsertypeContaining.
	 *
	 * @param usertype_1 the usertype 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUsertypeContaining(String usertype_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining.
	 *
	 * @param useremail_1 the useremail 1
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail_1) throws DataAccessException;

	/**
	 * JPQL Query - findYourtaskuserByUseremailContaining.
	 *
	 * @param useremail_1 the useremail 1
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findYourtaskuserByUseremailContaining(String useremail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCompanys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findAllCompanys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCompanys.
	 *
	 * @return the sets the
	 * @throws DataAccessException the data access exception
	 */
	public Set<Yourtaskuser> findAllCompanys() throws DataAccessException;

	/**
	 * JPQL Query - findCompanyBySIRET.
	 *
	 * @param company_companySIRET the company company SIRET
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	public Yourtaskuser findCompanyBySIRET(String company_companySIRET) throws DataAccessException;

	/**
	 * JPQL Query - findCompanyBySIRET.
	 *
	 * @param company_companySIRET the company company SIRET
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the yourtaskuser
	 * @throws DataAccessException the data access exception
	 */
	public Yourtaskuser findCompanyBySIRET(Integer company_companySIRET, int startResult, int maxRows) throws DataAccessException;

}