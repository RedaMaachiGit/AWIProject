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
public class HomeController {

	/** The authentication facade. */
	@Autowired
	private AuthenticationFacade authenticationFacade;

	@RequestMapping("/")
	public ModelAndView login(@RequestParam(required = false) String message) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("access/login.jsp");
		return mav;
	}
	
}