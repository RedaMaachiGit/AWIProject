/*
 * 
 */
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
import com.aiop.yourtask.web.security.AuthenticationFacade;

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Yourtaskuser entities.
 */

@Controller("ProfileController")

public class ProfileController {

	/** DAO injected by Spring that manages Notification entities. */
	@Autowired
	private NotificationDAO notificationDAO;

	/** DAO injected by Spring that manages Scinfo entities. */
	@Autowired
	private ScinfoDAO scinfoDAO;

	/** DAO injected by Spring that manages Suinfo entities. */
	@Autowired
	private SuinfoDAO suinfoDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Yourtaskuser
	 * entities.
	 */
	@Autowired
	private YourtaskuserService yourtaskuserService;

	/** The authentication. */
	@Autowired
	private AuthenticationFacade authentication;

	/**
	 * Select an existing Yourtaskuser entity.
	 *
	 * @param authCookie
	 *            the auth cookie
	 * @return the model and view
	 */
	@RequestMapping("/su/profile")
	public ModelAndView suprofile() {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser yourtaskuser = authentication.getActiveUser();
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.addObject("suinfo", suinfoDAO.findSuinfoByPrimaryKey(yourtaskuser.getUserid()));
		mav.setViewName("profile/userprofile.jsp");
		return mav;
	}
	
	/**
	 * Select an existing Yourtaskuser entity.
	 *
	 * @param authCookie
	 *            the auth cookie
	 * @return the model and view
	 */
	@RequestMapping("/admin/profile")
	public ModelAndView adminprofile() {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser yourtaskuser = authentication.getActiveUser();
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("profile/adminprofile.jsp");
		return mav;
	}

	/**
	 * Select an existing Yourtaskuser entity.
	 *
	 * @param authCookie
	 *            the auth cookie
	 * @return the model and view
	 */
	@RequestMapping("/sc/profile")
	public ModelAndView scprofile() {
		ModelAndView mav = new ModelAndView();
		Yourtaskuser yourtaskuser = authentication.getActiveUser();
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.addObject("scinfo", scinfoDAO.findScinfoByPrimaryKey(yourtaskuser.getUserid()));
		mav.setViewName("profile/companyprofile.jsp");
		return mav;
	}

	/**
	 * Register custom, context-specific property editors.
	 *
	 * @param binder
	 *            the binder
	 * @param request
	 *            the request
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register
																				// static
																				// property
																				// editors.
		binder.registerCustomEditor(java.util.Calendar.class,
				new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class,
				new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class,
				new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
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
	@RequestMapping("/su/profile/saveYourtaskuserScinfos")
	public String saveYourtaskuserScinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Scinfo scinfos) {
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Yourtaskuser yourtaskuser = yourtaskuserService.findByUsername(user.getUsername());
		yourtaskuserService.saveYourtaskuserScinfos(yourtaskuser.getUserid(), scinfos);

		return "redirect:/sc/profile";
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
	@RequestMapping("/su/profile/saveYourtaskuserSuinfos")
	public String saveYourtaskuserSuinfos(@RequestParam Integer yourtaskuser_userid, @ModelAttribute Suinfo suinfos) {
		UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Yourtaskuser yourtaskuser = yourtaskuserService.findByUsername(user.getUsername());
		yourtaskuserService.saveYourtaskuserSuinfos(yourtaskuser.getUserid(), suinfos);

		return "redirect:/su/profile";
	}

	/**
	 * Show all Notification entities by Yourtaskuser.
	 *
	 * @param useridKey
	 *            the userid key
	 * @return the model and view
	 */
	@RequestMapping("/profile/listYourtaskuserNotifications")
	public ModelAndView listYourtaskuserNotifications(@RequestParam Integer useridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(useridKey));
		mav.setViewName("yourtaskuser/notifications/listNotifications.jsp");

		return mav;
	}
	
	
	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/admin/profile/save")
	public String saveAdminProfile(@ModelAttribute Yourtaskuser yourtaskuser) { // retournait un String avant
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return "redirect:/admin/profile";
		
	}
	
	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/su/profile/save")
	public String saveUserProfile(@ModelAttribute Yourtaskuser yourtaskuser) { // retournait un String avant
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return "redirect:/su/profile";
		
	}
	
	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param yourtaskuser the yourtaskuser
	 * @return the string
	 */
	@RequestMapping("/sc/profile/save")
	public String saveCompanyProfile(@ModelAttribute Yourtaskuser yourtaskuser) { // retournait un String avant
		yourtaskuserService.saveYourtaskuser(yourtaskuser);
		return "redirect:/sc/profile";
		
	}
	
}