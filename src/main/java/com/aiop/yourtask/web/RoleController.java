package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.RoleService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Role entities
 * 
 */

@Controller("RoleController")

public class RoleController {

	/**
	 * DAO injected by Spring that manages Role entities
	 * 
	 */
	@Autowired
	private RoleDAO roleDAO;

	/**
	 * DAO injected by Spring that manages RoleResource entities
	 * 
	 */
	@Autowired
	private RoleResourceDAO roleResourceDAO;

	/**
	 * DAO injected by Spring that manages Yourtaskuser entities
	 * 
	 */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Role entities
	 * 
	 */
	@Autowired
	private RoleService roleService;

	/**
	 * Save an existing Role entity
	 * 
	 */
	@RequestMapping("/saveRole")
	public String saveRole(@ModelAttribute Role role) {
		roleService.saveRole(role);
		return "forward:/indexRole";
	}

	/**
	* Save an existing RoleResource entity
	* 
	*/
	@RequestMapping("/saveRoleRoleResources")
	public ModelAndView saveRoleRoleResources(@RequestParam Integer role_roleid, @ModelAttribute RoleResource roleresources) {
		Role parent_role = roleService.saveRoleRoleResources(role_roleid, roleresources);

		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("role", parent_role);
		mav.setViewName("role/viewRole.jsp");

		return mav;
	}

	/**
	* Create a new RoleResource entity
	* 
	*/
	@RequestMapping("/newRoleRoleResources")
	public ModelAndView newRoleRoleResources(@RequestParam Integer role_roleid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("roleresource", new RoleResource());
		mav.addObject("newFlag", true);
		mav.setViewName("role/roleresources/editRoleResources.jsp");

		return mav;
	}

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
	* Edit an existing Role entity
	* 
	*/
	@RequestMapping("/editRole")
	public ModelAndView editRole(@RequestParam Integer roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(roleidKey));
		mav.setViewName("role/editRole.jsp");

		return mav;
	}

	/**
	* Show all Role entities
	* 
	*/
	@RequestMapping("/indexRole")
	public ModelAndView listRoles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roles", roleService.loadRoles());

		mav.setViewName("role/listRoles.jsp");

		return mav;
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping("/newRoleYourtaskusers")
	public ModelAndView newRoleYourtaskusers(@RequestParam Integer role_roleid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("yourtaskuser", new Yourtaskuser());
		mav.addObject("newFlag", true);
		mav.setViewName("role/yourtaskusers/editYourtaskusers.jsp");

		return mav;
	}

	/**
	* Select the child RoleResource entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRoleRoleResources")
	public ModelAndView confirmDeleteRoleRoleResources(@RequestParam Integer role_roleid, @RequestParam Integer related_roleresources_roleid, @RequestParam Integer related_roleresources_resourceid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources_roleid, related_roleresources_resourceid));
		mav.addObject("role_roleid", role_roleid);
		mav.setViewName("role/roleresources/deleteRoleResources.jsp");

		return mav;
	}

	/**
	* Edit an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/editRoleYourtaskusers")
	public ModelAndView editRoleYourtaskusers(@RequestParam Integer role_roleid, @RequestParam Integer yourtaskusers_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskusers_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("role/yourtaskusers/editYourtaskusers.jsp");

		return mav;
	}

	/**
	* Show all Yourtaskuser entities by Role
	* 
	*/
	@RequestMapping("/listRoleYourtaskusers")
	public ModelAndView listRoleYourtaskusers(@RequestParam Integer roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(roleidKey));
		mav.setViewName("role/yourtaskusers/listYourtaskusers.jsp");

		return mav;
	}

	/**
	* Delete an existing Role entity
	* 
	*/
	@RequestMapping("/deleteRole")
	public String deleteRole(@RequestParam Integer roleidKey) {
		Role role = roleDAO.findRoleByPrimaryKey(roleidKey);
		roleService.deleteRole(role);
		return "forward:/indexRole";
	}

	/**
	* Select the child Yourtaskuser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRoleYourtaskusers")
	public ModelAndView confirmDeleteRoleYourtaskusers(@RequestParam Integer role_roleid, @RequestParam Integer related_yourtaskusers_userid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("yourtaskuser", yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskusers_userid));
		mav.addObject("role_roleid", role_roleid);
		mav.setViewName("role/yourtaskusers/deleteYourtaskusers.jsp");

		return mav;
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/deleteRoleYourtaskusers")
	public ModelAndView deleteRoleYourtaskusers(@RequestParam Integer role_roleid, @RequestParam Integer related_yourtaskusers_userid) {
		ModelAndView mav = new ModelAndView();

		Role role = roleService.deleteRoleYourtaskusers(role_roleid, related_yourtaskusers_userid);

		mav.addObject("role_roleid", role_roleid);
		mav.addObject("role", role);
		mav.setViewName("role/viewRole.jsp");

		return mav;
	}

	/**
	* Select the Role entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRole")
	public ModelAndView confirmDeleteRole(@RequestParam Integer roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(roleidKey));
		mav.setViewName("role/deleteRole.jsp");

		return mav;
	}

	/**
	* Entry point to show all Role entities
	* 
	*/
	public String indexRole() {
		return "redirect:/indexRole";
	}

	/**
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/selectRoleYourtaskusers")
	public ModelAndView selectRoleYourtaskusers(@RequestParam Integer role_roleid, @RequestParam Integer yourtaskusers_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskusers_userid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("yourtaskuser", yourtaskuser);
		mav.setViewName("role/yourtaskusers/viewYourtaskusers.jsp");

		return mav;
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping("/saveRoleYourtaskusers")
	public ModelAndView saveRoleYourtaskusers(@RequestParam Integer role_roleid, @ModelAttribute Yourtaskuser yourtaskusers) {
		Role parent_role = roleService.saveRoleYourtaskusers(role_roleid, yourtaskusers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("role", parent_role);
		mav.setViewName("role/viewRole.jsp");

		return mav;
	}

	/**
	* Edit an existing RoleResource entity
	* 
	*/
	@RequestMapping("/editRoleRoleResources")
	public ModelAndView editRoleRoleResources(@RequestParam Integer role_roleid, @RequestParam Integer roleresources_roleid, @RequestParam Integer roleresources_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresources_roleid, roleresources_resourceid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("roleresource", roleresource);
		mav.setViewName("role/roleresources/editRoleResources.jsp");

		return mav;
	}

	/**
	* Select an existing Role entity
	* 
	*/
	@RequestMapping("/selectRole")
	public ModelAndView selectRole(@RequestParam Integer roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(roleidKey));
		mav.setViewName("role/viewRole.jsp");

		return mav;
	}

	/**
	* View an existing RoleResource entity
	* 
	*/
	@RequestMapping("/selectRoleRoleResources")
	public ModelAndView selectRoleRoleResources(@RequestParam Integer role_roleid, @RequestParam Integer roleresources_roleid, @RequestParam Integer roleresources_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresources_roleid, roleresources_resourceid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("role_roleid", role_roleid);
		mav.addObject("roleresource", roleresource);
		mav.setViewName("role/roleresources/viewRoleResources.jsp");

		return mav;
	}

	/**
	* Delete an existing RoleResource entity
	* 
	*/
	@RequestMapping("/deleteRoleRoleResources")
	public ModelAndView deleteRoleRoleResources(@RequestParam Integer role_roleid, @RequestParam Integer related_roleresources_roleid, @RequestParam Integer related_roleresources_resourceid) {
		ModelAndView mav = new ModelAndView();

		Role role = roleService.deleteRoleRoleResources(role_roleid, related_roleresources_roleid, related_roleresources_resourceid);

		mav.addObject("role_roleid", role_roleid);
		mav.addObject("role", role);
		mav.setViewName("role/viewRole.jsp");

		return mav;
	}

	/**
	* Create a new Role entity
	* 
	*/
	@RequestMapping("/newRole")
	public ModelAndView newRole() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", new Role());
		mav.addObject("newFlag", true);
		mav.setViewName("role/editRole.jsp");

		return mav;
	}

	/**
	* Show all RoleResource entities by Role
	* 
	*/
	@RequestMapping("/listRoleRoleResources")
	public ModelAndView listRoleRoleResources(@RequestParam Integer roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(roleidKey));
		mav.setViewName("role/roleresources/listRoleResources.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/roleController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}