/*
 * 
 */
package com.aiop.yourtask.web;

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
import com.aiop.yourtask.web.security.AuthenticationFacade;

import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Yourtaskuser entities.
 */

@Controller("YourtaskuserController")

public class YourtaskuserController {
	
	/** The authentication facade. */
	@Autowired
    private AuthenticationFacade authentication;
    

	/** DAO injected by Spring that manages Activity entities. */
	@Autowired
	private ActivityDAO activityDAO;

	/** DAO injected by Spring that manages Comment entities. */
	@Autowired
	private CommentDAO commentDAO;

	/** DAO injected by Spring that manages Diary entities. */
	@Autowired
	private DiaryDAO diaryDAO;

	/** DAO injected by Spring that manages Notification entities. */
	@Autowired
	private NotificationDAO notificationDAO;

	/** DAO injected by Spring that manages Order entities. */
	@Autowired
	private OrderDAO orderDAO;

	/** DAO injected by Spring that manages Product entities. */
	@Autowired
	private ProductDAO productDAO;

	/** DAO injected by Spring that manages Role entities. */
	@Autowired
	private RoleDAO roleDAO;

	/** DAO injected by Spring that manages Scinfo entities. */
	@Autowired
	private ScinfoDAO scinfoDAO;

	/** DAO injected by Spring that manages Suinfo entities. */
	@Autowired
	private SuinfoDAO suinfoDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/** Service injected by Spring that provides CRUD operations for Yourtaskuser entities. */
	@Autowired
	private YourtaskuserService yourtaskuserService;

	/**
	 * Create a new Product entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserProducts")
	public ModelAndView newYourtaskuserProducts(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/products/editProducts.jsp");

		return mav;
	}

	/**
	 * View an existing Scinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param scinfos_scinfoid the scinfos scinfoid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserScinfos")
	public ModelAndView selectYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer scinfos_scinfoid) {
		Scinfo scinfo = scinfoDAO.findScinfoByPrimaryKey(scinfos_scinfoid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("scinfo", scinfo);
		mav.setViewName("yourtaskuser/scinfos/viewScinfos.jsp");

		return mav;
	}

	/**
	 * View an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param ordersforuseridsc_orderid the ordersforuseridsc orderid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserOrdersForUseridsc")
	public ModelAndView selectYourtaskuserOrdersForUseridsc(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer ordersforuseridsc_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(ordersforuseridsc_orderid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("order", order);
		mav.setViewName("yourtaskuser/ordersforuseridsc/viewOrdersForUseridsc.jsp");

		return mav;
	}

	

	/**
	 * Show all Suinfo entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserSuinfos")
	public ModelAndView listYourtaskuserSuinfos(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/suinfos/listSuinfos.jsp");

		return mav;
	}

	/**
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_ordersforuserid_orderid the related ordersforuserid orderid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserOrdersForUserid")
	public ModelAndView confirmDeleteYourtaskuserOrdersForUserid(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_ordersforuserid_orderid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_ordersforuserid_orderid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/ordersforuserid/deleteOrdersForUserid.jsp");

		return mav;
	}

	/**
	 * Edit an existing Activity entity. (modified)
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the model and view
	 */
	@RequestMapping("/su/activity/{activityId}/editActivity")
	public ModelAndView editUserActivity(@PathVariable("activityId") Integer activityId) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activityId, -1, -1);
		Yourtaskuser user = authentication.getActiveUser();
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", user.getUserid());
		mav.addObject("activity", activity);
		mav.setViewName("activity/su/editactivity.jsp");

		return mav;
	}
	
	

	/**
	 * Delete an existing Diary entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_diaries_iddiary the related diaries iddiary
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserDiaries")
	public ModelAndView deleteYourtaskuserDiaries(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_diaries_iddiary) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserDiaries(yourtaskuser_userid, related_diaries_iddiary);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Show all Order entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserOrdersForUserid")
	public ModelAndView listYourtaskuserOrdersForUserid(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/ordersforuserid/listOrdersForUserid.jsp");

		return mav;
	}

	/**
	 * Show all Yourtaskuser entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexYourtaskuser")
	public ModelAndView listYourtaskusers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskusers", yourtaskuserService.loadYourtaskusers());

		mav.setViewName("yourtaskuser/listYourtaskusers.jsp");

		return mav;
	}

	/**
	 * Create a new Yourtaskuser entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuser")
	public ModelAndView newYourtaskuser() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the child Suinfo entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_suinfos_suinfoid the related suinfos suinfoid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserSuinfos")
	public ModelAndView confirmDeleteYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_suinfos_suinfoid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("suinfo", suinfoDAO.findSuinfoByPrimaryKey(related_suinfos_suinfoid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/suinfos/deleteSuinfos.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_ordersforuserid_orderid the related ordersforuserid orderid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserOrdersForUserid")
	public ModelAndView deleteYourtaskuserOrdersForUserid(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_ordersforuserid_orderid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserOrdersForUserid(yourtaskuser_userid, related_ordersforuserid_orderid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new Role entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserRole")
	public ModelAndView newYourtaskuserRole(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("role", new Role());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/role/editRole.jsp");

		return mav;
	}

	/**
	 * Delete an existing Role entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_role_roleid the related role roleid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserRole")
	public ModelAndView deleteYourtaskuserRole(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_role_roleid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserRole(yourtaskuser_userid, related_role_roleid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Edit an existing Diary entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param diaries_iddiary the diaries iddiary
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserDiaries")
	public ModelAndView editYourtaskuserDiaries(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaries_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("diary", diary);
		mav.setViewName("yourtaskuser/diaries/editDiaries.jsp");

		return mav;
	}

	/**
	 * View an existing Activity entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param products_productid the products productid
	 * @return the model and view
	 */
	/*
	@RequestMapping("/selectYourtaskuserActivities")
	public ModelAndView selectYourtaskuserActivities(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer activities_activityid) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activities_activityid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("activity", activity);
		
		//ActivityDAO activityDAO = new ActivityDAO();
		//activityDAOfindActivityByPrimaryKey(activityidKey)
		
		
		
		mav.setViewName("yourtaskuser/activities/detailsActivity.jsp");

		return mav;
	}*/

	/**
	* Edit an existing Product entity
	* 
	*/
	@RequestMapping("/editYourtaskuserProducts")
	public ModelAndView editYourtaskuserProducts(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer products_productid) {
		Product product = productDAO.findProductByPrimaryKey(products_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("product", product);
		mav.setViewName("yourtaskuser/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors.
	 *
	 * @param binder the binder
	 * @param request the request
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
	 * Edit an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param ordersforuseridsc_orderid the ordersforuseridsc orderid
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserOrdersForUseridsc")
	public ModelAndView editYourtaskuserOrdersForUseridsc(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer ordersforuseridsc_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(ordersforuseridsc_orderid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("order", order);
		mav.setViewName("yourtaskuser/ordersforuseridsc/editOrdersForUseridsc.jsp");

		return mav;
	}

	/**
	 * Save an existing Comment entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param comments the comments
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserComments")
	public ModelAndView saveYourtaskuserComments(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Comment comments) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserComments(yourtaskuser_userid, comments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Edit an existing Scinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param scinfos_scinfoid the scinfos scinfoid
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserScinfos")
	public ModelAndView editYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer scinfos_scinfoid) {
		Scinfo scinfo = scinfoDAO.findScinfoByPrimaryKey(scinfos_scinfoid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("scinfo", scinfo);
		mav.setViewName("yourtaskuser/scinfos/editScinfos.jsp");

		return mav;
	}

	/**
	 * Save an existing Product entity.
	 *
	 * @param userId the user id
	 * @param product the product
	 * @return the string
	 */
	@RequestMapping("/sc/saveYourtaskuserProducts")
	public String saveYourtaskuserProducts(@ModelAttribute Product product) {
		if (product.getProductid() == null) {
			product.setProductid((int)(System.currentTimeMillis() % Integer.MAX_VALUE));
		}
		Yourtaskuser user = authentication.getActiveUser();
		yourtaskuserService.saveYourtaskuserProducts(user.getUserid(), product);
		return "redirect:/sc/products/";
	}

	/**
	 * Show all Comment entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserComments")
	public ModelAndView listYourtaskuserComments(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/comments/listComments.jsp");

		return mav;
	}

	/**
	 * Delete an existing Scinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_scinfos_scinfoid the related scinfos scinfoid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserScinfos")
	public ModelAndView deleteYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_scinfos_scinfoid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserScinfos(yourtaskuser_userid, related_scinfos_scinfoid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the child Diary entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_diaries_iddiary the related diaries iddiary
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserDiaries")
	public ModelAndView confirmDeleteYourtaskuserDiaries(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_diaries_iddiary) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diary", diaryDAO.findDiaryByPrimaryKey(related_diaries_iddiary));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/diaries/deleteDiaries.jsp");

		return mav;
	}

	/**
	 * Save an existing Role entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param role the role
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserRole")
	public ModelAndView saveYourtaskuserRole(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Role role) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserRole(yourtaskuser_userid, role);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * View an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param ordersforuserid_orderid the ordersforuserid orderid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserOrdersForUserid")
	public ModelAndView selectYourtaskuserOrdersForUserid(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer ordersforuserid_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(ordersforuserid_orderid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("order", order);
		mav.setViewName("yourtaskuser/ordersforuserid/viewOrdersForUserid.jsp");

		return mav;
	}

	/**
	 * Show all Activity entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserActivities")
	public ModelAndView listYourtaskuserActivities(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/activities/listActivities.jsp");

		return mav;
	}

	/**
	 * Edit an existing Notification entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param notifications_notificationid the notifications notificationid
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserNotifications")
	public ModelAndView editYourtaskuserNotifications(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer notifications_notificationid) {
		Notification notification = notificationDAO.findNotificationByPrimaryKey(notifications_notificationid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("notification", notification);
		mav.setViewName("yourtaskuser/notifications/editNotifications.jsp");

		return mav;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/yourtaskuserController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Diary entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param diaries the diaries
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserDiaries")
	public ModelAndView saveYourtaskuserDiaries(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Diary diaries) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserDiaries(yourtaskuser_userid, diaries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Delete an existing Activity entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the string
	 */
	@RequestMapping("/deleteYourtaskuserActivities/{activityId}")
	public String deleteYourtaskuserActivities(@PathVariable("activityId") Integer activityId) {
		Yourtaskuser user = authentication.getActiveUser();
		yourtaskuserService.deleteYourtaskuserActivities(user.getUserid(), activityId);
		return "redirect:/su/activities/";
	}

	/**
	 * View an existing Role entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param role_roleid the role roleid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserRole")
	public ModelAndView selectYourtaskuserRole(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(role_roleid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("role", role);
		mav.setViewName("yourtaskuser/role/viewRole.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param ordersforuserid the ordersforuserid
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserOrdersForUserid")
	public ModelAndView saveYourtaskuserOrdersForUserid(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Order ordersforuserid) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserOrdersForUserid(yourtaskuser_userid, ordersforuserid);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * View an existing Notification entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param notifications_notificationid the notifications notificationid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserNotifications")
	public ModelAndView selectYourtaskuserNotifications(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer notifications_notificationid) {
		Notification notification = notificationDAO.findNotificationByPrimaryKey(notifications_notificationid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("notification", notification);
		mav.setViewName("yourtaskuser/notifications/viewNotifications.jsp");

		return mav;
	}

	/**
	 * Select the child Comment entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_comments_commentid the related comments commentid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserComments")
	public ModelAndView confirmDeleteYourtaskuserComments(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_comments_commentid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comment", commentDAO.findCommentByPrimaryKey(related_comments_commentid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/comments/deleteComments.jsp");

		return mav;
	}

	/**
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_ordersforuseridsc_orderid the related ordersforuseridsc orderid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserOrdersForUseridsc")
	public ModelAndView confirmDeleteYourtaskuserOrdersForUseridsc(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_ordersforuseridsc_orderid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_ordersforuseridsc_orderid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/ordersforuseridsc/deleteOrdersForUseridsc.jsp");

		return mav;
	}
	
	

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param useridKey the userid key
	 * @return the string
	 */
	@RequestMapping("/deleteYourtaskuser")
	public String deleteYourtaskuser(@RequestParam Integer useridKey) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey);
		yourtaskuserService.deleteYourtaskuser(yourtaskuser);
		return "forward:/indexYourtaskuser";
	}

	/**
	 * Save an existing Scinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param scinfos the scinfos
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserScinfos")
	public ModelAndView saveYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Scinfo scinfos) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser_userid, scinfos);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserOrdersForUseridsc")
	public ModelAndView newYourtaskuserOrdersForUseridsc(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/ordersforuseridsc/editOrdersForUseridsc.jsp");

		return mav;
	}

	/**
	 * Select the child Scinfo entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_scinfos_scinfoid the related scinfos scinfoid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserScinfos")
	public ModelAndView confirmDeleteYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_scinfos_scinfoid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("scinfo", scinfoDAO.findScinfoByPrimaryKey(related_scinfos_scinfoid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/scinfos/deleteScinfos.jsp");

		return mav;
	}

	/**
	 * View an existing Product entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param products_productid the products productid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserProducts")
	public ModelAndView selectYourtaskuserProducts(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer products_productid) {
		Product product = productDAO.findProductByPrimaryKey(products_productid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("product", product);
		mav.setViewName("yourtaskuser/products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuser")
	public ModelAndView editYourtaskuser(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/editYourtaskuser.jsp");

		return mav;
	}
	
	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/editSU")
	public ModelAndView editSU(/*@RequestParam Integer useridKey*/) {
		ModelAndView mav = new ModelAndView();

		
/*
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("suinfo", suinfo);
		mav.setViewName("yourtaskuser/suinfos/editSuinfos.jsp");
	*/	
		
		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(1)); // a enlever , remplacer par id cookies
		mav.setViewName("yourtaskuser/editSU.jsp");

		return mav;
	}
	

	/**
	 * Delete an existing Comment entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_comments_commentid the related comments commentid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserComments")
	public ModelAndView deleteYourtaskuserComments(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_comments_commentid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserComments(yourtaskuser_userid, related_comments_commentid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Show all Product entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserProducts")
	public ModelAndView listYourtaskuserProducts(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/products/listProducts.jsp");

		return mav;
	}

	/**
	 * Show all Role entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserRole")
	public ModelAndView listYourtaskuserRole(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/role/listRole.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Yourtaskuser entities.
	 *
	 * @return the string
	 */
	public String indexYourtaskuser() {
		return "redirect:/indexYourtaskuser";
	}

	/**
	 * Edit an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param ordersforuserid_orderid the ordersforuserid orderid
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserOrdersForUserid")
	public ModelAndView editYourtaskuserOrdersForUserid(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer ordersforuserid_orderid) {
		Order order = orderDAO.findOrderByPrimaryKey(ordersforuserid_orderid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("order", order);
		mav.setViewName("yourtaskuser/ordersforuserid/editOrdersForUserid.jsp");

		return mav;
	}

	/**
	 * Create a new Scinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserScinfos")
	public ModelAndView newYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("scinfo", new Scinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/scinfos/editScinfos.jsp");

		return mav;
	}

	/**
	 * Save an existing Activity entity.
	 *
	 * @param userId the user id
	 * @param activity the activity
	 * @return the string
	 */
	@RequestMapping("/su/saveYourtaskuserActivities")
	public String saveYourtaskuserActivities( @ModelAttribute Activity activity) {	
		Yourtaskuser user = authentication.getActiveUser();
		if (activity.getActivityid() == null) {
			activity.setActivityid((int)(System.currentTimeMillis() % Integer.MAX_VALUE));
		}
		yourtaskuserService.saveYourtaskuserActivities(user.getUserid(), activity);
		return "redirect:/su/activities/";
	}

	/**
	 * Show all Diary entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserDiaries")
	public ModelAndView listYourtaskuserDiaries(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/diaries/listDiaries.jsp");

		return mav;
	}

	/**
	 * Delete an existing Suinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_suinfos_suinfoid the related suinfos suinfoid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserSuinfos")
	public ModelAndView deleteYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_suinfos_suinfoid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserSuinfos(yourtaskuser_userid, related_suinfos_suinfoid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Save an existing Notification entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param notifications the notifications
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserNotifications")
	public ModelAndView saveYourtaskuserNotifications(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Notification notifications) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserNotifications(yourtaskuser_userid, notifications);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Edit an existing Comment entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param comments_commentid the comments commentid
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserComments")
	public ModelAndView editYourtaskuserComments(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comments_commentid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("comment", comment);
		mav.setViewName("yourtaskuser/comments/editComments.jsp");

		return mav;
	}

	/**
	 * Create a new Notification entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserNotifications")
	public ModelAndView newYourtaskuserNotifications(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("notification", new Notification());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/notifications/editNotifications.jsp");

		return mav;
	}

	/**
	 * Show all Scinfo entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserScinfos")
	public ModelAndView listYourtaskuserScinfos(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/scinfos/listScinfos.jsp");

		return mav;
	}

	/**
	 * Create a new Diary entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserDiaries")
	public ModelAndView newYourtaskuserDiaries(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("diary", new Diary());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/diaries/editDiaries.jsp");

		return mav;
	}

	/**
	 * Save an existing Suinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param suinfos the suinfos
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserSuinfos")
	public ModelAndView saveYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Suinfo suinfos) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser_userid, suinfos);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the child Product entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_products_productid the related products productid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserProducts")
	public ModelAndView confirmDeleteYourtaskuserProducts(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_products_productid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(related_products_productid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/products/deleteProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_ordersforuseridsc_orderid the related ordersforuseridsc orderid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserOrdersForUseridsc")
	public ModelAndView deleteYourtaskuserOrdersForUseridsc(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_ordersforuseridsc_orderid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserOrdersForUseridsc(yourtaskuser_userid, related_ordersforuseridsc_orderid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuser")
	public ModelAndView confirmDeleteYourtaskuser(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/deleteYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Create a new Comment entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserComments")
	public ModelAndView newYourtaskuserComments(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("comment", new Comment());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/comments/editComments.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserOrdersForUserid")
	public ModelAndView newYourtaskuserOrdersForUserid(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/ordersforuserid/editOrdersForUserid.jsp");

		return mav;
	}
	
	

	/**
	 * Show all Order entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserOrdersForUseridsc")
	public ModelAndView listYourtaskuserOrdersForUseridsc(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/ordersforuseridsc/listOrdersForUseridsc.jsp");

		return mav;
	}

	/**
	 * Select the child Role entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_role_roleid the related role roleid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserRole")
	public ModelAndView confirmDeleteYourtaskuserRole(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_role_roleid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(related_role_roleid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/role/deleteRole.jsp");

		return mav;
	}

	/**
	 * Edit an existing Role entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param role_roleid the role roleid
	 * @return the model and view
	 */
	@RequestMapping("/editYourtaskuserRole")
	public ModelAndView editYourtaskuserRole(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(role_roleid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("role", role);
		mav.setViewName("yourtaskuser/role/editRole.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param ordersforuseridsc the ordersforuseridsc
	 * @return the model and view
	 */
	@RequestMapping("/saveYourtaskuserOrdersForUseridsc")
	public ModelAndView saveYourtaskuserOrdersForUseridsc(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Order ordersforuseridsc) {
		Yourtaskuser parent_yourtaskuser = yourtaskuserService.saveYourtaskuserOrdersForUseridsc(yourtaskuser_userid, ordersforuseridsc);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", parent_yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * Select the child Activity entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param userId the user id
	 * @param activityId the activity id
	 * @return the model and view
	 */
	@RequestMapping("/su/activity/{activityId}/deleteActivity")
	public ModelAndView deleteUserActivity(@PathVariable("activityId") Integer activityId) {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser user = authentication.getActiveUser();
		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(activityId));
		mav.addObject("yourtaskuser_userid", user.getUserid());
		mav.setViewName("activity/su/deleteActivities.jsp");

		return mav;
	}
	
	

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/saveYourtaskuser")
	public String saveYourtaskuser(@ModelAttribute Yourtaskuser yourtaskuser) { // retournait un String avant
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return "forward:/indexYourtaskuser";
		
	}
	
	/**
	 * Save an existing SU entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param suinfos_suinfoid the suinfos suinfoid
	 * @return the model and view
	 */
	/*
	@RequestMapping("/saveSU")
	public String saveSU(@ModelAttribute Yourtaskuser yourtaskuser) {
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		int id=yourtaskuser.getUserid();
		return "forward:/selectYourtaskUser?useridKey="+id+"&";
	}*/

	/**
	* Edit an existing Suinfo entity
	* 
	*/
	@RequestMapping("/editYourtaskuserSuinfos")
	public ModelAndView editYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer suinfos_suinfoid) {
		Suinfo suinfo = suinfoDAO.findSuinfoByPrimaryKey(suinfos_suinfoid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("suinfo", suinfo);
		mav.setViewName("yourtaskuser/suinfos/editSuinfos.jsp");

		return mav;
	}

	/**
	 * Select the child Notification entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_notifications_notificationid the related notifications notificationid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteYourtaskuserNotifications")
	public ModelAndView confirmDeleteYourtaskuserNotifications(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_notifications_notificationid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("notification", notificationDAO.findNotificationByPrimaryKey(related_notifications_notificationid));
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.setViewName("yourtaskuser/notifications/deleteNotifications.jsp");

		return mav;
	}

	/**
	 * Delete an existing Notification entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param related_notifications_notificationid the related notifications notificationid
	 * @return the model and view
	 */
	@RequestMapping("/deleteYourtaskuserNotifications")
	public ModelAndView deleteYourtaskuserNotifications(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer related_notifications_notificationid) {
		ModelAndView mav = new ModelAndView();

		Yourtaskuser yourtaskuser = yourtaskuserService.deleteYourtaskuserNotifications(yourtaskuser_userid, related_notifications_notificationid);

		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("yourtaskuser/viewYourtaskuser.jsp");

		return mav;
	}

	/**
	 * View an existing Diary entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param diaries_iddiary the diaries iddiary
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserDiaries")
	public ModelAndView selectYourtaskuserDiaries(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer diaries_iddiary) {
		Diary diary = diaryDAO.findDiaryByPrimaryKey(diaries_iddiary, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("diary", diary);
		mav.setViewName("yourtaskuser/diaries/viewDiaries.jsp");

		return mav;
	}

	/**
	 * View an existing Comment entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param comments_commentid the comments commentid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserComments")
	public ModelAndView selectYourtaskuserComments(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer comments_commentid) {
		Comment comment = commentDAO.findCommentByPrimaryKey(comments_commentid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("comment", comment);
		mav.setViewName("yourtaskuser/comments/viewComments.jsp");

		return mav;
	}

	/**
	 * View an existing Suinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @param suinfos_suinfoid the suinfos suinfoid
	 * @return the model and view
	 */
	@RequestMapping("/selectYourtaskuserSuinfos")
	public ModelAndView selectYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @RequestParam Integer suinfos_suinfoid) {
		Suinfo suinfo = suinfoDAO.findSuinfoByPrimaryKey(suinfos_suinfoid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("suinfo", suinfo);
		mav.setViewName("yourtaskuser/suinfos/viewSuinfos.jsp");

		return mav;
	}

	
	/**
	 * Show all Notification entities by Yourtaskuser.
	 *
	 * @param useridKey the userid key
	 * @return the model and view
	 */
	@RequestMapping("/listYourtaskuserNotifications")
	public ModelAndView listYourtaskuserNotifications(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/notifications/listNotifications.jsp");

		return mav;
	}

	/**
	 * Create a new Suinfo entity.
	 *
	 * @param yourtaskuser_userid the yourtaskuser userid
	 * @return the model and view
	 */
	@RequestMapping("/newYourtaskuserSuinfos")
	public ModelAndView newYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser_userid", yourtaskuser_userid);
		mav.addObject("suinfo", new Suinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/suinfos/editSuinfos.jsp");

		return mav;
	}
	
	/**
	 * register a simple user.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/register/saveuser")
	public String saveNewUser(@ModelAttribute Yourtaskuser yourtaskuser) {
		Random rand = new Random();
		int id = rand.nextInt();
		yourtaskuser.setUserid(id);
		yourtaskuser.setRole(roleDAO.findRoleByRoleid(2));
		yourtaskuser.setUsertype("USER");
		yourtaskuser.setUsertoken("");
		yourtaskuser.setUserlastconnectiondate(Calendar.getInstance());
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		Suinfo suinfo = new Suinfo();
		suinfo.setSuinfoid(id);suinfo.setSuinfofirstname("");
		suinfo.setSuinfolastname("");suinfo.setYourtaskuser(yourtaskuser);
		suinfoDAO.store(suinfo);
		return "redirect:/login";
	}
	
	/**
	 * register a company.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/register/savecompany")
	public String saveNewCompany(@ModelAttribute Yourtaskuser yourtaskuser) {
		Random rand = new Random();
		int id = rand.nextInt();
		yourtaskuser.setUserid(id);
		yourtaskuser.setRole(roleDAO.findRoleByRoleid(3));
		yourtaskuser.setUsertype("COMPANY");
		yourtaskuser.setUsertoken("");
		yourtaskuser.setUserlastconnectiondate(Calendar.getInstance());
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		Scinfo scinfo = new Scinfo();
		scinfo.setScinfoid(id);scinfo.setScinfoactivitydomain("");
		scinfo.setScinfosiret("");scinfo.setScinfowebsite("");
		scinfo.setYourtaskuser(yourtaskuser);
		scinfoDAO.store(scinfo);
		return "redirect:/login";
	}
	
	/**
	 * Save an existing Scinfo entity.
	 *
	 * @return the model and view
	 *//*
	@RequestMapping("/register/addcompanyinfos")
	public String registerYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Scinfo scinfos) {
		yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser_userid, scinfos);

		return "forward:/login";
	}*/

	/**
	* Save an existing Suinfo entity
	* 
	*/
	/*
	@RequestMapping("/register/adduserinfos")
	public String registerYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Suinfo suinfos) {	
		yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser_userid, suinfos);


		return "forward:/login";
	}*/
	
	/*
	* Show all Yourtaskuser entities for the administrator
	* 
	*/
	@RequestMapping("/admin/users")
	public ModelAndView adminListYourtaskusers() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskusers", yourtaskuserService.loadYourtaskusers());
		mav.setViewName("yourtaskuser/admin/listYourtaskusers.jsp");

		return mav;
	}
	
	/**
	 * Create a new Yourtaskuser entity for administrator.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/admin/users/newuser")
	public ModelAndView adminNewUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/admin/newuser.jsp");

		return mav;
	}
	
	/**
	 * Create a new Yourtaskuser entity for administrator.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/admin/users/newcompany")
	public ModelAndView adminNewCompany() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("yourtaskuser/admin/newuser.jsp");

		return mav;
	}
	
	/**
	 * Edit an existing Yourtaskuser entity.
	 *
	 * @param userid the userid
	 * @return the model and view
	 */
	@RequestMapping("/admin/users/edit/{userid}")
	public ModelAndView adminEditYourtaskuser(@PathVariable Integer userid) {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid);
		mav.addObject("yourtaskuser", yourtaskuser);
		if (yourtaskuser.getRole().equals("ROLE_COMPANY")){
			mav.addObject("yourtaskuser",yourtaskuser );
			mav.addObject("scinfo", scinfoDAO.findScinfoByPrimaryKey(yourtaskuser.getUserid()));
			mav.setViewName("yourtaskuser/admin/editcompany.jsp");
		}else{
			mav.addObject("yourtaskuser",yourtaskuser );
			mav.addObject("suinfo", suinfoDAO.findSuinfoByPrimaryKey(userid));
			mav.setViewName("yourtaskuser/admin/edituser.jsp");
		}
		return mav;
	}
	
	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param useridKey the userid key
	 * @return the string
	 */
	@RequestMapping("/admin/users/delete/{userid}")
	public String adminDeleteYourtaskuser(@RequestParam Integer userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(userid);
		yourtaskuserService.deleteYourtaskuser(yourtaskuser);
		return "redirect:/admin/";
	}
	

	/**
	 * Admin create user.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/admin/users/saveuser")
	public String adminCreateUser(@ModelAttribute Yourtaskuser yourtaskuser) {
		int id = (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
		yourtaskuser.setUserid(id);
		yourtaskuser.setRole(roleDAO.findRoleByRoleid(2));
		yourtaskuser.setUsertype("USER");
		yourtaskuser.setUsertoken("");
		yourtaskuser.setUserlastconnectiondate(Calendar.getInstance());
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		Suinfo suinfo = new Suinfo();
		suinfo.setSuinfoid(id);suinfo.setSuinfofirstname("");
		suinfo.setSuinfolastname("");suinfo.setYourtaskuser(yourtaskuser);
		suinfoDAO.store(suinfo);
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return "redirect:/admin/users";
	}
	
	/**
	 * Admin create company.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/admin/users/savecompany")
	public String adminCreateCompany(@ModelAttribute Yourtaskuser yourtaskuser) {
		int id = (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
		yourtaskuser.setUserid(id);
		yourtaskuser.setRole(roleDAO.findRoleByRoleid(3));
		yourtaskuser.setUsertype("COMPANY");
		yourtaskuser.setUsertoken("");
		yourtaskuser.setUserlastconnectiondate(Calendar.getInstance());
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		Scinfo scinfo = new Scinfo();
		scinfo.setScinfoid(id);scinfo.setScinfoactivitydomain("");
		scinfo.setScinfosiret("");scinfo.setScinfowebsite("");
		scinfo.setYourtaskuser(yourtaskuser);
		scinfoDAO.store(scinfo);
		return "redirect:/admin/users";
	}
	
	/**
	 * Save an existing Scinfo entity.
	 *
	 * @param yourtaskuser_userid
	 *            the yourtaskuser userid
	 * @param scinfos
	 *            the scinfos
	 * @return the string
	 */
	@RequestMapping("/admin/company/editscinfo")
	public String adminSaveCompanyScinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Scinfo scinfos) {
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Yourtaskuser yourtaskuser = yourtaskuserService.findByUsername(user.getUsername());
		yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser.getUserid(), scinfos);

		return "redirect:/admin/users";
	}

	/**
	 * Save an existing Suinfo entity.
	 *
	 * @param yourtaskuser_userid
	 *            the yourtaskuser userid
	 * @param suinfos
	 *            the suinfos
	 * @return the string
	 */
	@RequestMapping("/admin/user/editsuinfo")
	public String adminSaveCompanySuinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Suinfo suinfos) {
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Yourtaskuser yourtaskuser = yourtaskuserService.findByUsername(user.getUsername());
		yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser.getUserid(), suinfos);

		return "redirect:/admin/users";
	}
}