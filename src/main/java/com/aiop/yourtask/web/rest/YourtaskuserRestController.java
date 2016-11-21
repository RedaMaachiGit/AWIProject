package com.aiop.yourtask.web.rest;

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

import com.aiop.yourtask.service.YourtaskuserService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Yourtaskuser entities
 * 
 */

@Controller("YourtaskuserRestController")

public class YourtaskuserRestController {

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
	 * Service injected by Spring that provides CRUD operations for Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserService yourtaskuserService;

	/**
	 * Delete an existing Diary entity
	 * 
	 */
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/diaries/{diary_iddiary}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserDiaries(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_diaries_iddiary) {
		yourtaskuserService.deleteYourtaskuserDiaries(yourtaskuser_userid, related_diaries_iddiary);
	}

	/**
	* Delete an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc/{order_orderid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserOrdersForUseridsc(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_ordersforuseridsc_orderid) {
		yourtaskuserService.deleteYourtaskuserOrdersForUseridsc(yourtaskuser_userid, related_ordersforuseridsc_orderid);
	}

	/**
	* Get Role entity by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/role", method = RequestMethod.GET)
	@ResponseBody
	public Role getYourtaskuserRole(@PathVariable Integer yourtaskuser_userid) {
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getRole();
	}

	/**
	* Save an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveYourtaskuserOrdersForUseridsc(@PathVariable Integer yourtaskuser_userid, @RequestBody Order ordersforuseridsc) {
		yourtaskuserService.saveYourtaskuserOrdersForUseridsc(yourtaskuser_userid, ordersforuseridsc);
		return orderDAO.findOrderByPrimaryKey(ordersforuseridsc.getOrderid());
	}

	/**
	* Create a new Scinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/scinfos", method = RequestMethod.POST)
	@ResponseBody
	public Scinfo newYourtaskuserScinfos(@PathVariable Integer yourtaskuser_userid, @RequestBody Scinfo scinfo) {
		yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser_userid, scinfo);
		return scinfoDAO.findScinfoByPrimaryKey(scinfo.getScinfoid());
	}

	/**
	* View an existing Scinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/scinfos/{scinfo_scinfoid}", method = RequestMethod.GET)
	@ResponseBody
	public Scinfo loadYourtaskuserScinfos(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_scinfos_scinfoid) {
		Scinfo scinfo = scinfoDAO.findScinfoByPrimaryKey(related_scinfos_scinfoid, -1, -1);

		return scinfo;
	}

	/**
	* Show all Scinfo entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/scinfos", method = RequestMethod.GET)
	@ResponseBody
	public List<Scinfo> getYourtaskuserScinfos(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Scinfo>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getScinfos());
	}

	/**
	* Create a new Diary entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/diaries", method = RequestMethod.POST)
	@ResponseBody
	public Diary newYourtaskuserDiaries(@PathVariable Integer yourtaskuser_userid, @RequestBody Diary diary) {
		yourtaskuserService.saveYourtaskuserDiaries(yourtaskuser_userid, diary);
		return diaryDAO.findDiaryByPrimaryKey(diary.getIddiary());
	}

	/**
	* Save an existing Scinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/scinfos", method = RequestMethod.PUT)
	@ResponseBody
	public Scinfo saveYourtaskuserScinfos(@PathVariable Integer yourtaskuser_userid, @RequestBody Scinfo scinfos) {
		yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser_userid, scinfos);
		return scinfoDAO.findScinfoByPrimaryKey(scinfos.getScinfoid());
	}

	/**
	* Create a new Notification entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/notifications", method = RequestMethod.POST)
	@ResponseBody
	public Notification newYourtaskuserNotifications(@PathVariable Integer yourtaskuser_userid, @RequestBody Notification notification) {
		yourtaskuserService.saveYourtaskuserNotifications(yourtaskuser_userid, notification);
		return notificationDAO.findNotificationByPrimaryKey(notification.getNotificationid());
	}

	/**
	* Select an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadYourtaskuser(@PathVariable Integer yourtaskuser_userid) {
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid);
	}

	/**
	* Show all Diary entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/diaries", method = RequestMethod.GET)
	@ResponseBody
	public List<Diary> getYourtaskuserDiaries(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Diary>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getDiaries());
	}

	/**
	* Save an existing Product entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/products", method = RequestMethod.PUT)
	@ResponseBody
	public Product saveYourtaskuserProducts(@PathVariable Integer yourtaskuser_userid, @RequestBody Product products) {
		yourtaskuserService.saveYourtaskuserProducts(yourtaskuser_userid, products);
		return productDAO.findProductByPrimaryKey(products.getProductid());
	}

	/**
	* Create a new Comment entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/comments", method = RequestMethod.POST)
	@ResponseBody
	public Comment newYourtaskuserComments(@PathVariable Integer yourtaskuser_userid, @RequestBody Comment comment) {
		yourtaskuserService.saveYourtaskuserComments(yourtaskuser_userid, comment);
		return commentDAO.findCommentByPrimaryKey(comment.getCommentid());
	}

	/**
	* Save an existing Suinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/suinfos", method = RequestMethod.PUT)
	@ResponseBody
	public Suinfo saveYourtaskuserSuinfos(@PathVariable Integer yourtaskuser_userid, @RequestBody Suinfo suinfos) {
		yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser_userid, suinfos);
		return suinfoDAO.findSuinfoByPrimaryKey(suinfos.getSuinfoid());
	}

	/**
	* Save an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/diaries", method = RequestMethod.PUT)
	@ResponseBody
	public Diary saveYourtaskuserDiaries(@PathVariable Integer yourtaskuser_userid, @RequestBody Diary diaries) {
		yourtaskuserService.saveYourtaskuserDiaries(yourtaskuser_userid, diaries);
		return diaryDAO.findDiaryByPrimaryKey(diaries.getIddiary());
	}

	/**
	* Delete an existing Role entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/role/{role_roleid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserRole(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_role_roleid) {
		yourtaskuserService.deleteYourtaskuserRole(yourtaskuser_userid, related_role_roleid);
	}

	/**
	* Delete an existing Product entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/products/{product_productid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserProducts(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_products_productid) {
		yourtaskuserService.deleteYourtaskuserProducts(yourtaskuser_userid, related_products_productid);
	}

	/**
	* Create a new Suinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/suinfos", method = RequestMethod.POST)
	@ResponseBody
	public Suinfo newYourtaskuserSuinfos(@PathVariable Integer yourtaskuser_userid, @RequestBody Suinfo suinfo) {
		yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser_userid, suinfo);
		return suinfoDAO.findSuinfoByPrimaryKey(suinfo.getSuinfoid());
	}

	/**
	* Show all Suinfo entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/suinfos", method = RequestMethod.GET)
	@ResponseBody
	public List<Suinfo> getYourtaskuserSuinfos(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Suinfo>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getSuinfos());
	}

	/**
	* Save an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveYourtaskuserOrdersForUserid(@PathVariable Integer yourtaskuser_userid, @RequestBody Order ordersforuserid) {
		yourtaskuserService.saveYourtaskuserOrdersForUserid(yourtaskuser_userid, ordersforuserid);
		return orderDAO.findOrderByPrimaryKey(ordersforuserid.getOrderid());
	}

	/**
	* View an existing Notification entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/notifications/{notification_notificationid}", method = RequestMethod.GET)
	@ResponseBody
	public Notification loadYourtaskuserNotifications(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_notifications_notificationid) {
		Notification notification = notificationDAO.findNotificationByPrimaryKey(related_notifications_notificationid, -1, -1);

		return notification;
	}

	/**
	* Show all Yourtaskuser entities
	* 
	*/
	@RequestMapping(value = "/Company", method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public EntityListCompany<Yourtaskuser> getCompanys() {
//		List<Product> listeProducts = productService.findAllProducts();
//		EntityList<Product> listOfProducts = new EntityList<Product>(listeProducts);
//	    return listOfProducts;   

		List<Yourtaskuser> listeCompanys = yourtaskuserService.findAllCompanys();
		EntityListCompany<Yourtaskuser> listOfCompanys = new EntityListCompany<Yourtaskuser>(listeCompanys);
		return listOfCompanys;
	}
	
	/**
	* Show all Yourtaskuser entities
	* 
	*/
	@RequestMapping(value = "/Company/{company_companySIRET}", method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public Yourtaskuser getCompanyBySIRET(@PathVariable String company_companySIRET) {
		Yourtaskuser company = yourtaskuserService.findCompanyBySIRET(company_companySIRET);
		///EntityList<Yourtaskuser> listOfCompanys = new EntityList<Yourtaskuser>(listeCompanys);
		return company;
//		return new java.util.ArrayList<Yourtaskuser>(yourtaskuserService.loadYourtaskusers());
	}
	
//
//	/**
//	* Show all Product entities
//	* 
//	*/
//	@RequestMapping(value = "/Product", method = RequestMethod.GET, produces="application/xml")
//	@ResponseBody
//	public EntityList<Product> getProducts() {
//		List<Product> listeProducts = productService.findAllProducts();
//		EntityList<Product> listOfProducts = new EntityList<Product>(listeProducts);
//	    return listOfProducts;   
//	}

	/**
	* Save an existing Role entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/role", method = RequestMethod.PUT)
	@ResponseBody
	public Role saveYourtaskuserRole(@PathVariable Integer yourtaskuser_userid, @RequestBody Role role) {
		yourtaskuserService.saveYourtaskuserRole(yourtaskuser_userid, role);
		return roleDAO.findRoleByPrimaryKey(role.getRoleid());
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newYourtaskuser(@RequestBody Yourtaskuser yourtaskuser) {
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/activities/{activity_activityid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserActivities(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_activities_activityid) {
		yourtaskuserService.deleteYourtaskuserActivities(yourtaskuser_userid, related_activities_activityid);
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* View an existing Diary entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/diaries/{diary_iddiary}", method = RequestMethod.GET)
	@ResponseBody
	public Diary loadYourtaskuserDiaries(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(related_diaries_iddiary, -1, -1);

		return diary;
	}

	/**
	* Delete an existing Suinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/suinfos/{suinfo_suinfoid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserSuinfos(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_suinfos_suinfoid) {
		yourtaskuserService.deleteYourtaskuserSuinfos(yourtaskuser_userid, related_suinfos_suinfoid);
	}

	/**
	* Save an existing Notification entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/notifications", method = RequestMethod.PUT)
	@ResponseBody
	public Notification saveYourtaskuserNotifications(@PathVariable Integer yourtaskuser_userid, @RequestBody Notification notifications) {
		yourtaskuserService.saveYourtaskuserNotifications(yourtaskuser_userid, notifications);
		return notificationDAO.findNotificationByPrimaryKey(notifications.getNotificationid());
	}

	/**
	* Delete an existing Notification entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/notifications/{notification_notificationid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserNotifications(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_notifications_notificationid) {
		yourtaskuserService.deleteYourtaskuserNotifications(yourtaskuser_userid, related_notifications_notificationid);
	}

	/**
	* Show all Product entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/products", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getYourtaskuserProducts(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Product>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getProducts());
	}

	/**
	* Delete an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid/{order_orderid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserOrdersForUserid(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_ordersforuserid_orderid) {
		yourtaskuserService.deleteYourtaskuserOrdersForUserid(yourtaskuser_userid, related_ordersforuserid_orderid);
	}

	/**
	* View an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/comments/{comment_commentid}", method = RequestMethod.GET)
	@ResponseBody
	public Comment loadYourtaskuserComments(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(related_comments_commentid, -1, -1);

		return comment;
	}

	/**
	* Create a new Product entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/products", method = RequestMethod.POST)
	@ResponseBody
	public Product newYourtaskuserProducts(@PathVariable Integer yourtaskuser_userid, @RequestBody Product product) {
		yourtaskuserService.saveYourtaskuserProducts(yourtaskuser_userid, product);
		return productDAO.findProductByPrimaryKey(product.getProductid());
	}

	/**
	* Delete an existing Scinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/scinfos/{scinfo_scinfoid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserScinfos(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_scinfos_scinfoid) {
		yourtaskuserService.deleteYourtaskuserScinfos(yourtaskuser_userid, related_scinfos_scinfoid);
	}

	/**
	* Create a new Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc", method = RequestMethod.POST)
	@ResponseBody
	public Order newYourtaskuserOrdersForUseridsc(@PathVariable Integer yourtaskuser_userid, @RequestBody Order order) {
		yourtaskuserService.saveYourtaskuserOrdersForUseridsc(yourtaskuser_userid, order);
		return orderDAO.findOrderByPrimaryKey(order.getOrderid());
	}

	/**
	* View an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid/{order_orderid}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadYourtaskuserOrdersForUserid(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_ordersforuserid_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(related_ordersforuserid_orderid, -1, -1);

		return order;
	}

	/**
	* Show all Notification entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/notifications", method = RequestMethod.GET)
	@ResponseBody
	public List<Notification> getYourtaskuserNotifications(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Notification>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getNotifications());
	}

	/**
	* View an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/activities/{activity_activityid}", method = RequestMethod.GET)
	@ResponseBody
	public Activity loadYourtaskuserActivities(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_activities_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(related_activities_activityid, -1, -1);

		return activity;
	}

	/**
	* View an existing Product entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/products/{product_productid}", method = RequestMethod.GET)
	@ResponseBody
	public Product loadYourtaskuserProducts(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_products_productid) {
		Product product = productDAO.findProductByPrimaryKey(related_products_productid, -1, -1);

		return product;
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/activities", method = RequestMethod.POST)
	@ResponseBody
	public Activity newYourtaskuserActivities(@PathVariable Integer yourtaskuser_userid, @RequestBody Activity activity) {
		yourtaskuserService.saveYourtaskuserActivities(yourtaskuser_userid, activity);
		return activityDAO.findActivityByPrimaryKey(activity.getActivityid());
	}

	/**
	* Delete an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/comments/{comment_commentid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuserComments(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_comments_commentid) {
		yourtaskuserService.deleteYourtaskuserComments(yourtaskuser_userid, related_comments_commentid);
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteYourtaskuser(@PathVariable Integer yourtaskuser_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid);
		yourtaskuserService.deleteYourtaskuser(yourtaskuser);
	}

	/**
	* Create a new Role entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/role", method = RequestMethod.POST)
	@ResponseBody
	public Role newYourtaskuserRole(@PathVariable Integer yourtaskuser_userid, @RequestBody Role role) {
		yourtaskuserService.saveYourtaskuserRole(yourtaskuser_userid, role);
		return roleDAO.findRoleByPrimaryKey(role.getRoleid());
	}

	/**
	* View an existing Suinfo entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/suinfos/{suinfo_suinfoid}", method = RequestMethod.GET)
	@ResponseBody
	public Suinfo loadYourtaskuserSuinfos(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_suinfos_suinfoid) {
		Suinfo suinfo = suinfoDAO.findSuinfoByPrimaryKey(related_suinfos_suinfoid, -1, -1);

		return suinfo;
	}

	/**
	* Show all Order entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> getYourtaskuserOrdersForUserid(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Order>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getOrdersForUserid());
	}

	/**
	* View an existing Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc/{order_orderid}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadYourtaskuserOrdersForUseridsc(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_ordersforuseridsc_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(related_ordersforuseridsc_orderid, -1, -1);

		return order;
	}

	/**
	* Show all Activity entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/activities", method = RequestMethod.GET)
	@ResponseBody
	public List<Activity> getYourtaskuserActivities(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Activity>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getActivities());
	}

	/**
	* View an existing Role entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/role/{role_roleid}", method = RequestMethod.GET)
	@ResponseBody
	public Role loadYourtaskuserRole(@PathVariable Integer yourtaskuser_userid, @PathVariable Integer related_role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(related_role_roleid, -1, -1);

		return role;
	}

	/**
	* Show all Comment entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/comments", method = RequestMethod.GET)
	@ResponseBody
	public List<Comment> getYourtaskuserComments(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Comment>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getComments());
	}

	/**
	* Show all Order entities by Yourtaskuser
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUseridsc", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> getYourtaskuserOrdersForUseridsc(@PathVariable Integer yourtaskuser_userid) {
		return new java.util.ArrayList<Order>(yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser_userid).getOrdersForUseridsc());
	}

	/**
	* Create a new Order entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/ordersForUserid", method = RequestMethod.POST)
	@ResponseBody
	public Order newYourtaskuserOrdersForUserid(@PathVariable Integer yourtaskuser_userid, @RequestBody Order order) {
		yourtaskuserService.saveYourtaskuserOrdersForUserid(yourtaskuser_userid, order);
		return orderDAO.findOrderByPrimaryKey(order.getOrderid());
	}

	/**
	* Save an existing Comment entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/comments", method = RequestMethod.PUT)
	@ResponseBody
	public Comment saveYourtaskuserComments(@PathVariable Integer yourtaskuser_userid, @RequestBody Comment comments) {
		yourtaskuserService.saveYourtaskuserComments(yourtaskuser_userid, comments);
		return commentDAO.findCommentByPrimaryKey(comments.getCommentid());
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveYourtaskuser(@RequestBody Yourtaskuser yourtaskuser) {
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Yourtaskuser/{yourtaskuser_userid}/activities", method = RequestMethod.PUT)
	@ResponseBody
	public Activity saveYourtaskuserActivities(@PathVariable Integer yourtaskuser_userid, @RequestBody Activity activities) {
		yourtaskuserService.saveYourtaskuserActivities(yourtaskuser_userid, activities);
		return activityDAO.findActivityByPrimaryKey(activities.getActivityid());
	}
}