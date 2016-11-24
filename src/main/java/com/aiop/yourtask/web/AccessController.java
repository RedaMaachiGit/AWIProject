/*
 * 
 */
package com.aiop.yourtask.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.aiop.yourtask.domain.Yourtaskuser;
import com.aiop.yourtask.web.security.AuthenticationFacade;

/**
 * The Class AccessController.
 */
@Controller
@RequestMapping
public class AccessController {

	/** The authentication facade. */
	@Autowired
	private AuthenticationFacade authenticationFacade;

	/**
	 * Login.
	 *
	 * @param message
	 *            the message
	 * @return the model and view
	 */
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(required = false) String message) {
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
		if (yourtaskuser.getRole().getRolename().equals("ROLE_USER")) {
			return "redirect:/su/profile";
		} else if (yourtaskuser.getRole().getRolename().equals("ROLE_COMPANY")) {
			return "redirect:/sc/profile";
		} else {
			return "redirect:/denied";
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
		if (yourtaskuser.getRole().getRolename().equals("ROLE_USER")) {
			return "redirect:/su/profile";
		} else if (yourtaskuser.getRole().getRolename().equals("ROLE_COMPANY")) {
			return "redirect:/sc/profile";
		} else {
			return "redirect:/denied";
		}
	}

	/**
	 * Access activities.
	 *
	 * @return the string
	 */
	@RequestMapping("/access/activities")
	public String accessActivities() {
		Yourtaskuser yourtaskuser = authenticationFacade.getActiveUser();
		if (yourtaskuser.getRole().getRolename().equals("ROLE_USER")) {
			return "redirect:/su/activities";
		} else if (yourtaskuser.getRole().getRolename().equals("ROLE_COMPANY")) {
			return "redirect:/sc/activities";
		} else {
			return "redirect:/denied";
		}
	}

	/**
	 * Access activities.
	 *
	 * @return the string
	 */
	@RequestMapping("/access/products")
	public String accessProducts() {
		Yourtaskuser yourtaskuser = authenticationFacade.getActiveUser();
		if (yourtaskuser.getRole().getRolename().equals("ROLE_USER")) {
			return "redirect:/su/products";
		} else if (yourtaskuser.getRole().getRolename().equals("ROLE_COMPANY")) {
			return "redirect:/sc/products";
		} else {
			return "redirect:/denied";
		}
	}
}