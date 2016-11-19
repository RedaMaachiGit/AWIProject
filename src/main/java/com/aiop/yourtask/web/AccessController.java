package com.aiop.yourtask.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aiop.yourtask.domain.Yourtaskuser;

@Controller
@RequestMapping
public class AccessController {

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
		
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("access/register.jsp");
		return mav;
	}
}