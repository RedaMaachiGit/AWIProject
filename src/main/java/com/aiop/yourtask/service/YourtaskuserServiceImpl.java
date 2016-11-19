package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ActivityDAO;
import com.aiop.yourtask.dao.CommentDAO;
import com.aiop.yourtask.dao.DiaryDAO;
import com.aiop.yourtask.dao.NotificationDAO;
import com.aiop.yourtask.dao.OrderDAO;
import com.aiop.yourtask.dao.ProductDAO;
import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.ScinfoDAO;
import com.aiop.yourtask.dao.SuinfoDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

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

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Yourtaskuser entities
 * 
 */

@Service("YourtaskuserService")

@Transactional
public class YourtaskuserServiceImpl implements YourtaskuserService {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * DAO injected by Spring that manages Comment entities
	 * 
	 */
	@Autowired
	private CommentDAO commentDAO;

	/**
	 * DAO injected by Spring that manages Diary entities
	 * 
	 */
	@Autowired
	private DiaryDAO diaryDAO;

	/**
	 * DAO injected by Spring that manages Notification entities
	 * 
	 */
	@Autowired
	private NotificationDAO notificationDAO;

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * DAO injected by Spring that manages Role entities
	 * 
	 */
	@Autowired
	private RoleDAO roleDAO;

	/**
	 * DAO injected by Spring that manages Scinfo entities
	 * 
	 */
	@Autowired
	private ScinfoDAO scinfoDAO;

	/**
	 * DAO injected by Spring that manages Suinfo entities
	 * 
	 */
	@Autowired
	private SuinfoDAO suinfoDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Instantiates a new YourtaskuserServiceImpl.
	 *
	 */
	public YourtaskuserServiceImpl() {
	}

	/**
	 * Save an existing Comment entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserComments(Integer userid, Comment related_comments) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Comment existingcomments = commentDAO.findCommentByPrimaryKey(related_comments.getCommentid());

		// copy into the existing record to preserve existing relationships
		if (existingcomments != null) {
			existingcomments.setCommentid(related_comments.getCommentid());
			existingcomments.setCommentcontent(related_comments.getCommentcontent());
			existingcomments.setCommentdate(related_comments.getCommentdate());
			related_comments = existingcomments;
		}

		related_comments.setYourtaskuser(yourtaskuser);
		yourtaskuser.getComments().add(related_comments);
		related_comments = commentDAO.store(related_comments);
		commentDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Delete an existing Role entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserRole(Integer yourtaskuser_userid, Integer related_role_roleid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);
		Role related_role = roleDAO.findRoleByPrimaryKey(related_role_roleid, -1, -1);

		yourtaskuser.setRole(null);
		related_role.getYourtaskusers().remove(yourtaskuser);
		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		related_role = roleDAO.store(related_role);
		roleDAO.flush();

		roleDAO.remove(related_role);
		roleDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserOrdersForUseridsc(Integer userid, Order related_ordersforuseridsc) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Order existingordersForUseridsc = orderDAO.findOrderByPrimaryKey(related_ordersforuseridsc.getOrderid());

		// copy into the existing record to preserve existing relationships
		if (existingordersForUseridsc != null) {
			existingordersForUseridsc.setOrderid(related_ordersforuseridsc.getOrderid());
			existingordersForUseridsc.setOrderdate(related_ordersforuseridsc.getOrderdate());
			existingordersForUseridsc.setOrdershippingcost(related_ordersforuseridsc.getOrdershippingcost());
			existingordersForUseridsc.setOrderprice(related_ordersforuseridsc.getOrderprice());
			existingordersForUseridsc.setOrderstate(related_ordersforuseridsc.getOrderstate());
			related_ordersforuseridsc = existingordersForUseridsc;
		}

		related_ordersforuseridsc.setYourtaskuserByUseridsc(yourtaskuser);
		yourtaskuser.getOrdersForUseridsc().add(related_ordersforuseridsc);
		related_ordersforuseridsc = orderDAO.store(related_ordersforuseridsc);
		orderDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Delete an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public void deleteYourtaskuser(Yourtaskuser yourtaskuser) {
		yourtaskuserDAO.remove(yourtaskuser);
		yourtaskuserDAO.flush();
	}

	/**
	 * Delete an existing Suinfo entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserSuinfos(Integer yourtaskuser_userid, Integer related_suinfos_suinfoid) {
		Suinfo related_suinfos = suinfoDAO.findSuinfoByPrimaryKey(related_suinfos_suinfoid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_suinfos.setYourtaskuser(null);
		yourtaskuser.getSuinfos().remove(related_suinfos);

		suinfoDAO.remove(related_suinfos);
		suinfoDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Delete an existing Notification entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserNotifications(Integer yourtaskuser_userid, Integer related_notifications_notificationid) {
		Notification related_notifications = notificationDAO.findNotificationByPrimaryKey(related_notifications_notificationid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_notifications.setYourtaskuser(null);
		yourtaskuser.getNotifications().remove(related_notifications);

		notificationDAO.remove(related_notifications);
		notificationDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Suinfo entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserSuinfos(Integer userid, Suinfo related_suinfos) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Suinfo existingsuinfos = suinfoDAO.findSuinfoByPrimaryKey(related_suinfos.getSuinfoid());

		// copy into the existing record to preserve existing relationships
		if (existingsuinfos != null) {
			existingsuinfos.setSuinfoid(related_suinfos.getSuinfoid());
			existingsuinfos.setSuinfofirstname(related_suinfos.getSuinfofirstname());
			existingsuinfos.setSuinfolastname(related_suinfos.getSuinfolastname());
			related_suinfos = existingsuinfos;
		}

		related_suinfos.setYourtaskuser(yourtaskuser);
		yourtaskuser.getSuinfos().add(related_suinfos);
		related_suinfos = suinfoDAO.store(related_suinfos);
		suinfoDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Return a count of all Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Integer countYourtaskusers() {
		return ((Long) yourtaskuserDAO.createQuerySingleResult("select count(o) from Yourtaskuser o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Comment entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserComments(Integer yourtaskuser_userid, Integer related_comments_commentid) {
		Comment related_comments = commentDAO.findCommentByPrimaryKey(related_comments_commentid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_comments.setYourtaskuser(null);
		yourtaskuser.getComments().remove(related_comments);

		commentDAO.remove(related_comments);
		commentDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Delete an existing Scinfo entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserScinfos(Integer yourtaskuser_userid, Integer related_scinfos_scinfoid) {
		Scinfo related_scinfos = scinfoDAO.findScinfoByPrimaryKey(related_scinfos_scinfoid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_scinfos.setYourtaskuser(null);
		yourtaskuser.getScinfos().remove(related_scinfos);

		scinfoDAO.remove(related_scinfos);
		scinfoDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserOrdersForUseridsc(Integer yourtaskuser_userid, Integer related_ordersforuseridsc_orderid) {
		Order related_ordersforuseridsc = orderDAO.findOrderByPrimaryKey(related_ordersforuseridsc_orderid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_ordersforuseridsc.setYourtaskuserByUseridsc(null);
		yourtaskuser.getOrdersForUseridsc().remove(related_ordersforuseridsc);

		orderDAO.remove(related_ordersforuseridsc);
		orderDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Scinfo entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserScinfos(Integer userid, Scinfo related_scinfos) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Scinfo existingscinfos = scinfoDAO.findScinfoByPrimaryKey(related_scinfos.getScinfoid());

		// copy into the existing record to preserve existing relationships
		if (existingscinfos != null) {
			existingscinfos.setScinfoid(related_scinfos.getScinfoid());
			existingscinfos.setScinfosiret(related_scinfos.getScinfosiret());
			existingscinfos.setScinfoactivitydomain(related_scinfos.getScinfoactivitydomain());
			existingscinfos.setScinfowebsite(related_scinfos.getScinfowebsite());
			related_scinfos = existingscinfos;
		}

		related_scinfos.setYourtaskuser(yourtaskuser);
		yourtaskuser.getScinfos().add(related_scinfos);
		related_scinfos = scinfoDAO.store(related_scinfos);
		scinfoDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public void saveYourtaskuser(Yourtaskuser yourtaskuser) {
		Yourtaskuser existingYourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());

		if (existingYourtaskuser != null) {
			if (existingYourtaskuser != yourtaskuser) {
				existingYourtaskuser.setUserid(yourtaskuser.getUserid());
				existingYourtaskuser.setUserdateofbirth(yourtaskuser.getUserdateofbirth());
				existingYourtaskuser.setUserphonenumber(yourtaskuser.getUserphonenumber());
				existingYourtaskuser.setUseremail(yourtaskuser.getUseremail());
				existingYourtaskuser.setUserstreetnumber(yourtaskuser.getUserstreetnumber());
				existingYourtaskuser.setUserzipcode(yourtaskuser.getUserzipcode());
				existingYourtaskuser.setUsercity(yourtaskuser.getUsercity());
				existingYourtaskuser.setUserusername(yourtaskuser.getUserusername());
				existingYourtaskuser.setUserpassword(yourtaskuser.getUserpassword());
				existingYourtaskuser.setUsertoken(yourtaskuser.getUsertoken());
				existingYourtaskuser.setUserlastconnectiondate(yourtaskuser.getUserlastconnectiondate());
				existingYourtaskuser.setUsertype(yourtaskuser.getUsertype());
				existingYourtaskuser.setUseriban(yourtaskuser.getUseriban());
			}
			yourtaskuser = yourtaskuserDAO.store(existingYourtaskuser);
		} else {
			yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		}
		yourtaskuserDAO.flush();
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserOrdersForUserid(Integer yourtaskuser_userid, Integer related_ordersforuserid_orderid) {
		Order related_ordersforuserid = orderDAO.findOrderByPrimaryKey(related_ordersforuserid_orderid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_ordersforuserid.setYourtaskuserByUseridsc(null);
		yourtaskuser.getOrdersForUseridsc().remove(related_ordersforuserid);

		orderDAO.remove(related_ordersforuserid);
		orderDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserProducts(Integer userid, Product related_products) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Product existingproducts = productDAO.findProductByPrimaryKey(related_products.getProductid());

		// copy into the existing record to preserve existing relationships
		if (existingproducts != null) {
			existingproducts.setProductid(related_products.getProductid());
			existingproducts.setProductname(related_products.getProductname());
			existingproducts.setProductdescription(related_products.getProductdescription());
			existingproducts.setProductimage(related_products.getProductimage());
			existingproducts.setProductprice(related_products.getProductprice());
			existingproducts.setProductavailablequantity(related_products.getProductavailablequantity());
			related_products = existingproducts;
		}

		related_products.setYourtaskuser(yourtaskuser);
		yourtaskuser.getProducts().add(related_products);
		related_products = productDAO.store(related_products);
		productDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Return all Yourtaskuser entity
	 * 
	 */
	@Transactional
	public List<Yourtaskuser> findAllYourtaskusers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Yourtaskuser>(yourtaskuserDAO.findAllYourtaskusers(startResult, maxRows));
	}

	/**
	 * Delete an existing Activity entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserActivities(Integer yourtaskuser_userid, Integer related_activities_activityid) {
		Activity related_activities = activityDAO.findActivityByPrimaryKey(related_activities_activityid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_activities.setYourtaskuser(null);
		yourtaskuser.getActivities().remove(related_activities);

		activityDAO.remove(related_activities);
		activityDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Role entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserRole(Integer userid, Role related_role) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Role existingrole = roleDAO.findRoleByPrimaryKey(related_role.getRoleid());

		// copy into the existing record to preserve existing relationships
		if (existingrole != null) {
			existingrole.setRoleid(related_role.getRoleid());
			existingrole.setRolename(related_role.getRolename());
			related_role = existingrole;
		}

		yourtaskuser.setRole(related_role);
		related_role.getYourtaskusers().add(yourtaskuser);
		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		related_role = roleDAO.store(related_role);
		roleDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Diary entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserDiaries(Integer userid, Diary related_diaries) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Diary existingdiaries = diaryDAO.findDiaryByPrimaryKey(related_diaries.getIddiary());

		// copy into the existing record to preserve existing relationships
		if (existingdiaries != null) {
			existingdiaries.setIddiary(related_diaries.getIddiary());
			existingdiaries.setDiaryname(related_diaries.getDiaryname());
			existingdiaries.setDiarydate(related_diaries.getDiarydate());
			related_diaries = existingdiaries;
		}

		related_diaries.setYourtaskuser(yourtaskuser);
		yourtaskuser.getDiaries().add(related_diaries);
		related_diaries = diaryDAO.store(related_diaries);
		diaryDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Load an existing Yourtaskuser entity
	 * 
	 */
	@Transactional
	public Set<Yourtaskuser> loadYourtaskusers() {
		return yourtaskuserDAO.findAllYourtaskusers();
	}

	/**
	 * Save an existing Notification entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserNotifications(Integer userid, Notification related_notifications) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Notification existingnotifications = notificationDAO.findNotificationByPrimaryKey(related_notifications.getNotificationid());

		// copy into the existing record to preserve existing relationships
		if (existingnotifications != null) {
			existingnotifications.setNotificationid(related_notifications.getNotificationid());
			existingnotifications.setNotificationseen(related_notifications.getNotificationseen());
			existingnotifications.setNotificationcontent(related_notifications.getNotificationcontent());
			related_notifications = existingnotifications;
		}

		related_notifications.setYourtaskuser(yourtaskuser);
		yourtaskuser.getNotifications().add(related_notifications);
		related_notifications = notificationDAO.store(related_notifications);
		notificationDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 */
	@Transactional
	public Yourtaskuser findYourtaskuserByPrimaryKey(Integer userid) {
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid);
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserProducts(Integer yourtaskuser_userid, Integer related_products_productid) {
		Product related_products = productDAO.findProductByPrimaryKey(related_products_productid, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_products.setYourtaskuser(null);
		yourtaskuser.getProducts().remove(related_products);

		productDAO.remove(related_products);
		productDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Delete an existing Diary entity
	 * 
	 */
	@Transactional
	public Yourtaskuser deleteYourtaskuserDiaries(Integer yourtaskuser_userid, Integer related_diaries_iddiary) {
		Diary related_diaries = diaryDAO.findDiaryByPrimaryKey(related_diaries_iddiary, -1, -1);

		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid, -1, -1);

		related_diaries.setYourtaskuser(null);
		yourtaskuser.getDiaries().remove(related_diaries);

		diaryDAO.remove(related_diaries);
		diaryDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserOrdersForUserid(Integer userid, Order related_ordersforuserid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Order existingordersForUserid = orderDAO.findOrderByPrimaryKey(related_ordersforuserid.getOrderid());

		// copy into the existing record to preserve existing relationships
		if (existingordersForUserid != null) {
			existingordersForUserid.setOrderid(related_ordersforuserid.getOrderid());
			existingordersForUserid.setOrderdate(related_ordersforuserid.getOrderdate());
			existingordersForUserid.setOrdershippingcost(related_ordersforuserid.getOrdershippingcost());
			existingordersForUserid.setOrderprice(related_ordersforuserid.getOrderprice());
			existingordersForUserid.setOrderstate(related_ordersforuserid.getOrderstate());
			related_ordersforuserid = existingordersForUserid;
		}

		related_ordersforuserid.setYourtaskuserByUseridsc(yourtaskuser);
		yourtaskuser.getOrdersForUseridsc().add(related_ordersforuserid);
		related_ordersforuserid = orderDAO.store(related_ordersforuserid);
		orderDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	/**
	 * Save an existing Activity entity
	 * 
	 */
	@Transactional
	public Yourtaskuser saveYourtaskuserActivities(Integer userid, Activity related_activities) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid, -1, -1);
		Activity existingactivities = activityDAO.findActivityByPrimaryKey(related_activities.getActivityid());

		// copy into the existing record to preserve existing relationships
		if (existingactivities != null) {
			existingactivities.setActivityid(related_activities.getActivityid());
			existingactivities.setActivityname(related_activities.getActivityname());
			existingactivities.setActivitydescription(related_activities.getActivitydescription());
			existingactivities.setActivityvisibility(related_activities.getActivityvisibility());
			related_activities = existingactivities;
		}

		related_activities.setYourtaskuser(yourtaskuser);
		yourtaskuser.getActivities().add(related_activities);
		related_activities = activityDAO.store(related_activities);
		activityDAO.flush();

		yourtaskuser = yourtaskuserDAO.store(yourtaskuser);
		yourtaskuserDAO.flush();

		return yourtaskuser;
	}

	@Override
	public Yourtaskuser findByUsername(String username) {
		// TODO Auto-generated method stub
		Iterator it = yourtaskuserDAO.findYourtaskuserByUserusername(username).iterator();
		if (it.hasNext()){
			return (Yourtaskuser) it.next();
		}
		
		// this for avoiding exception
		System.out.println("this user doesnt exist unfortunately");
		return new Yourtaskuser();
	}
}
