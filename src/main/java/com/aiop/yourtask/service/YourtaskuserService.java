
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

/**
 * Spring service that handles CRUD requests for Yourtaskuser entities
 * 
 */
public interface YourtaskuserService {

	/**
	* Save an existing Comment entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserComments(Integer userid, Comment related_comments);

	/**
	* Delete an existing Role entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserRole(Integer yourtaskuser_userid, Integer related_role_roleid);

	/**
	* Save an existing Order entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserOrdersForUseridsc(Integer userid_1, Order related_ordersforuseridsc);

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public void deleteYourtaskuser(Yourtaskuser yourtaskuser);

	/**
	* Delete an existing Suinfo entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserSuinfos(Integer yourtaskuser_userid_1, Integer related_suinfos_suinfoid);

	/**
	* Delete an existing Notification entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserNotifications(Integer yourtaskuser_userid_2, Integer related_notifications_notificationid);

	/**
	* Save an existing Suinfo entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserSuinfos(Integer userid_2, Suinfo related_suinfos);

	/**
	* Return a count of all Yourtaskuser entity
	* 
	 */
	public Integer countYourtaskusers();

	/**
	* Delete an existing Comment entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserComments(Integer yourtaskuser_userid_3, Integer related_comments_commentid);

	/**
	* Delete an existing Scinfo entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserScinfos(Integer yourtaskuser_userid_4, Integer related_scinfos_scinfoid);

	/**
	* Delete an existing Order entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserOrdersForUseridsc(Integer yourtaskuser_userid_5, Integer related_ordersforuseridsc_orderid);

	/**
	* Save an existing Scinfo entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserScinfos(Integer userid_3, Scinfo related_scinfos);

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public void saveYourtaskuser(Yourtaskuser yourtaskuser_1);

	/**
	* Delete an existing Order entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserOrdersForUserid(Integer yourtaskuser_userid_6, Integer related_ordersforuserid_orderid);

	/**
	* Save an existing Product entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserProducts(Integer userid_4, Product related_products);

	/**
	* Return all Yourtaskuser entity
	* 
	 */
	public List<Yourtaskuser> findAllYourtaskusers(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Activity entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserActivities(Integer yourtaskuser_userid_7, Integer related_activities_activityid);

	/**
	* Save an existing Role entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserRole(Integer userid_5, Role related_role);

	/**
	* Save an existing Diary entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserDiaries(Integer userid_6, Diary related_diaries);

	/**
	* Load an existing Yourtaskuser entity
	* 
	 */
	public Set<Yourtaskuser> loadYourtaskusers();

	/**
	* Save an existing Notification entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserNotifications(Integer userid_7, Notification related_notifications);

	/**
	 */
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid_8);

	/**
	* Delete an existing Product entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserProducts(Integer yourtaskuser_userid_8, Integer related_products_productid);

	/**
	* Delete an existing Diary entity
	* 
	 */
	public Yourtaskuser deleteYourtaskuserDiaries(Integer yourtaskuser_userid_9, Integer related_diaries_iddiary);

	/**
	* Save an existing Order entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserOrdersForUserid(Integer userid_9, Order related_ordersforuserid);

	/**
	* Save an existing Activity entity
	* 
	 */
	public Yourtaskuser saveYourtaskuserActivities(Integer userid_10, Activity related_activities);
}