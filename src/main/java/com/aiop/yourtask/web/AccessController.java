/*
 * 
 */
package com.aiop.yourtask.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.ScinfoDAO;
import com.aiop.yourtask.dao.SuinfoDAO;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.Scinfo;
import com.aiop.yourtask.domain.Suinfo;
import com.aiop.yourtask.domain.Yourtaskuser;
import com.aiop.yourtask.service.YourtaskuserService;
import com.aiop.yourtask.web.security.AuthenticationFacade;

// TODO: Auto-generated Javadoc
/**
 * The Class AccessController.
 */
@Controller
@RequestMapping
public class AccessController {
	
	/** Service injected by Spring that provides CRUD operations for Yourtaskuser entities. */
	@Autowired
	private YourtaskuserService yourtaskuserService;
	
	/** DAO injected by Spring that manages Suinfo entities. */
	@Autowired
	private SuinfoDAO suinfoDAO;
	
	/** DAO injected by Spring that manages Scinfo entities. */
	@Autowired
	private ScinfoDAO scinfoDAO;
	
	/** DAO injected by Spring that manages Role entities. */
	@Autowired
	private RoleDAO roleDAO;
	
	/** The authentication facade. */
	@Autowired
    private AuthenticationFacade authenticationFacade;

	/**
	 * Login.
	 *
	 * @param message the message
	 * @return the model and view
	 */
	@RequestMapping("/login")
	public ModelAndView login( @RequestParam(required=false) String message) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/login.jsp");
		return mav;
	}
	
	/**
	 * Denied.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "/denied")
	public ModelAndView denied() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/denied.jsp");
		return mav;
	}
	
	/**
	 * Login failure.
	 *
	 * @return the string
	 */
	@RequestMapping(value = "/login/failure")
	public String loginFailure() {
		return "redirect:/login";
	}
	
	/**
	 * Logout success.
	 *
	 * @return the string
	 */
	@RequestMapping(value = "/logout/success")
	public String logoutSuccess() {
		return "redirect:/";
	}
	
	/**
	 * Register.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/register.jsp");
		return mav;
	}
	
	/**
	 * Register as company.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/register/company")
	public ModelAndView registerAsCompany() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/registerasasimplecompany.jsp");
		return mav;
	}
	
	/**
	 * Register as simple user.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/register/user")
	public ModelAndView registerAsSimpleUser() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/registerasasimpleuser.jsp");
		return mav;
	}
	
	/**
	 * Adds the company info.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/register/addcompanyinfos")
	public ModelAndView AddCompanyInfo() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/addscinfos.jsp");
		return mav;
	}
	
	/**
	 * Adds the user info.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/register/adduserinfos")
	public ModelAndView AddUserInfo() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/addsuinfos.jsp");
		return mav;
		}
	
	/**
	 * Access profile.
	 *
	 * @return the string
	 */
	@RequestMapping("/access/profile")
	public String accessProfile() {
		Yourtaskuser yourtaskuser = authenticationFacade.getActiveUser();
		if (yourtaskuser.getRole().getRolename() == "ROLE_USER"){
				return "redirect:/su/profile";
			}else{
				return "redirect:/sc/profile";
			}
		}
	
	/**
	 * Access diaries.
	 *
	 * @return the string
	 */
	@RequestMapping("/access/diaries")
	public String accessDiaries() {
		Yourtaskuser yourtaskuser = authenticationFacade.getActiveUser();
		if (yourtaskuser.getRole().getRolename() == "ROLE_USER"){
				return "redirect:/su/profile";
			}else{
				return "redirect:/sc/profile";
			}
		}
	
}