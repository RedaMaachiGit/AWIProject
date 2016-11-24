/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Activity;
import com.aiop.yourtask.domain.Comment;
import com.aiop.yourtask.domain.Diary;
import com.aiop.yourtask.domain.Notification;
import com.aiop.yourtask.domain.Order;
import com.aiop.yourtask.domain.Product;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.Scinfo;
import com.aiop.yourtask.domain.Suinfo;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Yourtaskuser entities.
 */
public interface YourtaskuserService {

	/**
	 * Save an existing Comment entity.
	 *
	 * @param userid the userid
	 * @param related_comments the related comments
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserComments(Integer userid, Comment related_comments);

	/**
	 * Delete an existing Role entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_role_roleid the related role roleid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserRole(Integer yourtaskuser_userid, Integer related_role_roleid);

	/**
	 * Save an existing Order entity.
	 *
	 * @param userid_1 the userid 1
	 * @param related_ordersforuseridsc the related ordersforuseridsc
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserOrdersForUseridsc(Integer userid_1, Order related_ordersforuseridsc);

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param yourtaskuser the yourtaskuser
	 */
	public void deleteYourtaskuser(Yourtaskuser yourtaskuser);

	/**
	 * Delete an existing Suinfo entity.
	 *
	 * @param yourtaskuser_userid_1 the yourtaskuser userid 1
	 * @param related_suinfos_suinfoid the related suinfos suinfoid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserSuinfos(Integer yourtaskuser_userid_1, Integer related_suinfos_suinfoid);

	/**
	 * Delete an existing Notification entity.
	 *
	 * @param yourtaskuser_userid_2 the yourtaskuser userid 2
	 * @param related_notifications_notificationid the related notifications notificationid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserNotifications(Integer yourtaskuser_userid_2, Integer related_notifications_notificationid);

	/**
	 * Save an existing Suinfo entity.
	 *
	 * @param userid_2 the userid 2
	 * @param related_suinfos the related suinfos
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserSuinfos(Integer userid_2, Suinfo related_suinfos);

	/**
	 * Return a count of all Yourtaskuser entity.
	 *
	 * @return the integer
	 */
	public Integer countYourtaskusers();

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param yourtaskuser_userid_3 the yourtaskuser userid 3
	 * @param related_comments_commentid the related comments commentid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserComments(Integer yourtaskuser_userid_3, Integer related_comments_commentid);

	/**
	 * Delete an existing Scinfo entity.
	 *
	 * @param yourtaskuser_userid_4 the yourtaskuser userid 4
	 * @param related_scinfos_scinfoid the related scinfos scinfoid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserScinfos(Integer yourtaskuser_userid_4, Integer related_scinfos_scinfoid);

	/**
	 * Delete an existing Order entity.
	 *
	 * @param yourtaskuser_userid_5 the yourtaskuser userid 5
	 * @param related_ordersforuseridsc_orderid the related ordersforuseridsc orderid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserOrdersForUseridsc(Integer yourtaskuser_userid_5, Integer related_ordersforuseridsc_orderid);

	/**
	 * Save an existing Scinfo entity.
	 *
	 * @param userid_3 the userid 3
	 * @param related_scinfos the related scinfos
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserScinfos(Integer userid_3, Scinfo related_scinfos);

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param yourtaskuser_1 the yourtaskuser 1
	 */
	public void saveYourtaskuser(Yourtaskuser yourtaskuser_1);

	/**
	 * Delete an existing Order entity.
	 *
	 * @param yourtaskuser_userid_6 the yourtaskuser userid 6
	 * @param related_ordersforuserid_orderid the related ordersforuserid orderid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserOrdersForUserid(Integer yourtaskuser_userid_6, Integer related_ordersforuserid_orderid);

	/**
	 * Save an existing Product entity.
	 *
	 * @param userid_4 the userid 4
	 * @param related_products the related products
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserProducts(Integer userid_4, Product related_products);

	/**
	 * Return all Yourtaskuser entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Yourtaskuser> findAllYourtaskusers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param yourtaskuser_userid_7 the yourtaskuser userid 7
	 * @param related_activities_activityid the related activities activityid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserActivities(Integer yourtaskuser_userid_7, Integer related_activities_activityid);

	/**
	 * Save an existing Role entity.
	 *
	 * @param userid_5 the userid 5
	 * @param related_role the related role
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserRole(Integer userid_5, Role related_role);

	/**
	 * Save an existing Diary entity.
	 *
	 * @param userid_6 the userid 6
	 * @param related_diaries the related diaries
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserDiaries(Integer userid_6, Diary related_diaries);

	/**
	 * Load an existing Yourtaskuser entity.
	 *
	 * @return the sets the
	 */
	public Set<Yourtaskuser> loadYourtaskusers();

	/**
	 * Save an existing Notification entity.
	 *
	 * @param userid_7 the userid 7
	 * @param related_notifications the related notifications
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserNotifications(Integer userid_7, Notification related_notifications);

	/**
	 * Find yourtaskuser by primary key.
	 *
	 * @param userid_8 the userid 8
	 * @return the yourtaskuser
	 */
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid_8);

	/**
	 * Delete an existing Product entity.
	 *
	 * @param yourtaskuser_userid_8 the yourtaskuser userid 8
	 * @param related_products_productid the related products productid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserProducts(Integer yourtaskuser_userid_8, Integer related_products_productid);

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param yourtaskuser_userid_9 the yourtaskuser userid 9
	 * @param related_diaries_iddiary the related diaries iddiary
	 * @return the yourtaskuser
	 */
	public Yourtaskuser deleteYourtaskuserDiaries(Integer yourtaskuser_userid_9, Integer related_diaries_iddiary);

	/**
	 * Save an existing Order entity.
	 *
	 * @param userid_9 the userid 9
	 * @param related_ordersforuserid the related ordersforuserid
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserOrdersForUserid(Integer userid_9, Order related_ordersforuserid);

	/**
	 * Save an existing Activity entity.
	 *
	 * @param userid_10 the userid 10
	 * @param related_activities the related activities
	 * @return the yourtaskuser
	 */
	public Yourtaskuser saveYourtaskuserActivities(Integer userid_10, Activity related_activities);

	/**
	 * Find a user by his username.
	 *
	 * @param username the username
	 * @return the yourtaskuser
	 */
	public Yourtaskuser findByUsername(String username);

	/**
	 * Find all companys.
	 *
	 * @return the list
	 */
	public List<Yourtaskuser> findAllCompanys();

	/**
	 * Find all companys.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Yourtaskuser> findAllCompanys(int startResult, int maxRows);

	/**
	 * Find company by SIRET.
	 *
	 * @param company_companySIRET the company company SIRET
	 * @return the yourtaskuser
	 */
	public Yourtaskuser findCompanyBySIRET(String company_companySIRET);
}