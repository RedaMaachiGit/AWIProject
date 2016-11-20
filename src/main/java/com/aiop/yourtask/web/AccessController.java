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

@Controller
@RequestMapping
public class AccessController {
	
	/**
	 * Service injected by Spring that provides CRUD operations for Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserService yourtaskuserService;
	
	/**
	 * DAO injected by Spring that manages Suinfo entities
	 * 
	 */
	@Autowired
	private SuinfoDAO suinfoDAO;
	
	/**
	 * DAO injected by Spring that manages Scinfo entities
	 * 
	 */
	@Autowired
	private ScinfoDAO scinfoDAO;
	
	/**
	 * DAO injected by Spring that manages Role entities
	 * 
	 */
	@Autowired
	private RoleDAO roleDAO;

	@RequestMapping("/login")
	public ModelAndView login( @RequestParam(required=false) String message) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/login.jsp");
		return mav;
	}
	
	@RequestMapping(value = "/denied")
	public ModelAndView denied() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/denied.jsp");
		return mav;
	}
	
	@RequestMapping(value = "/login/failure")
	public String loginFailure() {
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/logout/success")
	public String logoutSuccess() {
		return "redirect:/";
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/register.jsp");
		return mav;
	}
	@RequestMapping("/register/company")
	public ModelAndView registerAsCompany() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/registerasasimplecompany.jsp");
		return mav;
	}
	
	@RequestMapping("/register/user")
	public ModelAndView registerAsSimpleUser() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/registerasasimpleuser.jsp");
		return mav;
	}
	
	@RequestMapping("/register/addcompanyinfos")
	public ModelAndView AddCompanyInfo() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/addscinfos.jsp");
		return mav;
	}
	
	@RequestMapping("/register/adduserinfos")
	public ModelAndView AddUserInfo() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.setViewName("access/addsuinfos.jsp");
		return mav;
		}
		
}