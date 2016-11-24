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

// TODO: Auto-generated Javadoc
/**
 * The Class AdminController.
 */
@Controller
@RequestMapping
public class AdminController {
	
	/** Service injected by Spring that provides CRUD operations for Yourtaskuser entities. */
	@Autowired
	private YourtaskuserService yourtaskuserService;


	/**
	 * Admin dashboard.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/admin")
	public ModelAndView adminDashboard() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("yourtaskusers", yourtaskuserService.loadYourtaskusers());
		mav.setViewName("admin/dashboard.jsp");
		return mav;
	}
		
}