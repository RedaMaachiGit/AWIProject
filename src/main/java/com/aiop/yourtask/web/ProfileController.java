package com.aiop.yourtask.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aiop.yourtask.dao.NotificationDAO;
import com.aiop.yourtask.dao.ScinfoDAO;
import com.aiop.yourtask.dao.SuinfoDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;
import com.aiop.yourtask.domain.Scinfo;
import com.aiop.yourtask.domain.Suinfo;
import com.aiop.yourtask.domain.Yourtaskuser;
import com.aiop.yourtask.service.YourtaskuserService;

/**
 * Spring MVC controller that handles CRUD requests for Yourtaskuser entities
 * 
 */

@Controller("ProfileController")

public class ProfileController {

	/**
	 * DAO injected by Spring that manages Notification entities
	 * 
	 */
	@Autowired
	private NotificationDAO notificationDAO;

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
	* Select an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/su/profile")
	public ModelAndView suprofile(@CookieValue(value = "AUTHCOOKIE") String authCookie) {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser yourtaskuser=yourtaskuserService.findByUsername(authCookie);
		mav.addObject("yourtaskuser",yourtaskuser );
		mav.addObject("suinfo", suinfoDAO.findSuinfoByPrimaryKey(yourtaskuser.getUserid()));
		mav.setViewName("profile/userprofile.jsp");
		return mav;
	}
	
	/**
	* Select an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/sc/profile")
	public ModelAndView scprofile(@CookieValue(value = "AUTHCOOKIE") String authCookie) {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser yourtaskuser=yourtaskuserService.findByUsername(authCookie);
		mav.addObject("yourtaskuser",yourtaskuser );
		mav.addObject("scinfo", scinfoDAO.findScinfoByPrimaryKey(yourtaskuser.getUserid()));
		mav.setViewName("profile/companyprofile.jsp");
		return mav;
	}
	
	/*Gaétan pour les modelview du controller pour récupèrer le user courant il faut mettre comme @CookieValue(value = "AUTHCOOKIE") String authCookie*/




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
	* Save an existing Scinfo entity
	* 
	*/
	@RequestMapping("/profile/saveYourtaskuserScinfos")
	public String saveYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Scinfo scinfos) {
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Yourtaskuser yourtaskuser=yourtaskuserService.findByUsername(user.getUsername());
		yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser.getUserid(), scinfos);

		return "redirect:/sc/profile";
	}

	/**
	* Save an existing Suinfo entity
	* 
	*/
	@RequestMapping("/profile/saveYourtaskuserSuinfos")
	public String saveYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Suinfo suinfos) {	
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Yourtaskuser yourtaskuser=yourtaskuserService.findByUsername(user.getUsername());
		yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser.getUserid(), suinfos);


		return "redirect:/su/profile";
	}


	/**
	* Show all Notification entities by Yourtaskuser
	* 
	*/
	@RequestMapping("/profile/listYourtaskuserNotifications")
	public ModelAndView listYourtaskuserNotifications(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/notifications/listNotifications.jsp");

		return mav;
	}
}