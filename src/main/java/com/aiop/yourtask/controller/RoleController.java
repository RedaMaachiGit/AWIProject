package com.aiop.yourtask.controller;

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

import com.aiop.yourtask.bean.RoleBean;
import com.aiop.yourtask.persistence.Role;
import com.aiop.yourtask.serviceinterface.RoleServiceInterface;

/**
 * @author Babacar Sobel THIAW
 * Role Controller
 */

@Controller
public class RoleController {
	
	@Autowired
	private RoleServiceInterface roleService;
	
	@RequestMapping(value = "/role/save", method = RequestMethod.POST)
	public ModelAndView saveRole(@ModelAttribute("command") RoleBean RoleBean, 
			BindingResult result) {
		Role Role = prepareModel(RoleBean);
		roleService.persist(Role);
		return new ModelAndView("redirect:/role/list");
	}

	@RequestMapping(value="/role/list", method = RequestMethod.GET)
	public ModelAndView listRoles() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("roles",  prepareListofBean(roleService.findAll()));
		return new ModelAndView("rolelist", model);
	}

	@RequestMapping(value = "/role/add", method = RequestMethod.GET)
	public ModelAndView addRole(@ModelAttribute("command")  RoleBean RoleBean,
			BindingResult result) {
		return new ModelAndView("roleadd");
	}
	
	
	@RequestMapping(value = "/role/edit", method = RequestMethod.GET)
	public ModelAndView editRole(@RequestParam("id") int id, @ModelAttribute("command")  RoleBean RoleBean,
			BindingResult result) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("role", prepareRoleBean(roleService.findById(id)));
		return new ModelAndView("roleedit", model);
	}
	
	@RequestMapping(value = "/role/update", method = RequestMethod.POST)
	public ModelAndView updateRole(@ModelAttribute("command")  RoleBean roleBean,
			BindingResult result) {
		Role role = prepareModel(roleBean);
		roleService.update(role);
		return new ModelAndView("redirect:/role/list");
	}
	
	@RequestMapping(value = "/role/delete", method = RequestMethod.GET)
	public ModelAndView deleteRole(@RequestParam("id") int id) {
		roleService.delete(roleService.findById(id));
		return new ModelAndView("redirect:/role/list");
	}
	
	private Role prepareModel(RoleBean roleBean){
		Role role = new Role();
		role.setRoleId(roleBean.getRoleId());
		role.setRoleName(roleBean.getRoleName());
		return role;
	}
	
	private List<RoleBean> prepareListofBean(List<Role> roles){
		List<RoleBean> beans = null;
		if(roles != null && !roles.isEmpty()){
			beans = new ArrayList<RoleBean>();
			RoleBean bean = null;
			for(Role role : roles){
				bean = new RoleBean();
				bean.setRoleId(role.getRoleId());
				bean.setRoleName(role.getRoleName());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private RoleBean prepareRoleBean(Role role){
		RoleBean bean = new RoleBean();
		bean.setRoleId(role.getRoleId());
		bean.setRoleName(role.getRoleName());
		return bean;
	}
}