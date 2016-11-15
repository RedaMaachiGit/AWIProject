package com.aiop.yourtask.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aiop.yourtask.bean.UserBean;
import com.aiop.yourtask.persistence.User;
import com.aiop.yourtask.serviceinterface.UserServiceInterface;

/**
 * @author Babacar Sobel THIAW
 * User Controller
 */

@Controller
public class UserController {
	
	@Autowired
	private UserServiceInterface UserService;
	
	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("command") UserBean UserBean, 
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", "impossible to create user");
		User User = prepareModel(UserBean);
//		User.setUserDateofbirth(new Date(10,10,1990));
//		User.setUserLastconnectiondate(new Date(10,10,1990));
//		try{
			UserService.persist(User);
//		}catch(Exception e){
//			return new ModelAndView("useradd",model);
//		}
		
		return new ModelAndView("redirect:/user/list");
	}

	@RequestMapping(value="/user/list", method = RequestMethod.GET)
	public ModelAndView listUsers() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("users",  prepareListofBean(UserService.findAll()));
		return new ModelAndView("userlist", model);
	}

	@RequestMapping(value = "/user/add", method = RequestMethod.GET)
	public ModelAndView addUser(@ModelAttribute("command")  UserBean UserBean,
			BindingResult result) {
		return new ModelAndView("useradd");
	}
	
	
	@RequestMapping(value = "/user/edit", method = RequestMethod.GET)
	public ModelAndView editUser(@RequestParam("id") int id, @ModelAttribute("command")  UserBean UserBean,
			BindingResult result) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", prepareUserBean(UserService.findById(id)));
		return new ModelAndView("useredit", model);
	}
	
	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public ModelAndView updateUser(@ModelAttribute("command")  UserBean UserBean,
			BindingResult result) {
		User User = prepareModel(UserBean);
		UserService.update(User);
		return new ModelAndView("redirect:/user/list");
	}
	
	@RequestMapping(value = "/user/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(@RequestParam("id") int id) {
		UserService.delete(UserService.findById(id));
		return new ModelAndView("redirect:/user/list");
	}
	
	private User prepareModel(UserBean UserBean){
		User User = new User();
		java.sql.Date userDateofbirth = java.sql.Date.valueOf(UserBean.getUserDateofbirth());
		java.sql.Date userLastconnectiondate = java.sql.Date.valueOf(UserBean.getUserLastconnectiondate());
		User.setUserId(UserBean.getUserId());
		User.setUserDateofbirth(userDateofbirth);
		User.setUserPhonenumber(UserBean.getUserPhonenumber());
		User.setUserEmail(UserBean.getUserEmail());
		User.setUserStreetnumber(UserBean.getUserStreetnumber());
		User.setUserZipcode(UserBean.getUserZipcode());
		User.setUserCity(UserBean.getUserCity());
		User.setUserUsername(UserBean.getUserUsername());
		User.setUserPassword(UserBean.getUserPassword());
		User.setUserLastconnectiondate(userLastconnectiondate);
		User.setUserType(UserBean.getUserType());
		User.setUserIban(UserBean.getUserIban());
		User.setRoleId(UserBean.getRoleId());
		return User;
	}
	
	private List<UserBean> prepareListofBean(List<User> Users){
		List<UserBean> beans = null;
		if(Users != null && !Users.isEmpty()){
			beans = new ArrayList<UserBean>();
			UserBean bean = null;
			for(User User : Users){
				bean = new UserBean();
				bean.setUserId(User.getUserId());
				bean.setUserDateofbirth(User.getUserDateofbirth().toString());
				bean.setUserPhonenumber(User.getUserPhonenumber());
				bean.setUserEmail(User.getUserEmail());
				bean.setUserStreetnumber(User.getUserStreetnumber());
				bean.setUserZipcode(User.getUserZipcode());
				bean.setUserCity(User.getUserCity());
				bean.setUserUsername(User.getUserUsername());
				bean.setUserPassword(User.getUserPassword());
				bean.setUserLastconnectiondate(User.getUserLastconnectiondate().toString());
				bean.setUserType(User.getUserType());
				bean.setUserIban(User.getUserIban());
				bean.setRoleId(User.getRoleId());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private UserBean prepareUserBean(User User){
		UserBean bean = new UserBean();
		bean.setUserId(User.getUserId());
		bean.setUserDateofbirth(User.getUserDateofbirth().toString());
		bean.setUserPhonenumber(User.getUserPhonenumber());
		bean.setUserEmail(User.getUserEmail());
		bean.setUserStreetnumber(User.getUserStreetnumber());
		bean.setUserZipcode(User.getUserZipcode());
		bean.setUserCity(User.getUserCity());
		bean.setUserUsername(User.getUserUsername());
		bean.setUserPassword(User.getUserPassword());
		bean.setUserLastconnectiondate(User.getUserLastconnectiondate().toString());
		bean.setUserType(User.getUserType());
		bean.setUserIban(User.getUserIban());
		bean.setRoleId(User.getRoleId());
		return bean;
	}
}