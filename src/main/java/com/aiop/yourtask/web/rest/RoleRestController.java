package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;
import com.aiop.yourtask.domain.Yourtaskuser;

import com.aiop.yourtask.service.RoleService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Role entities
 * 
 */

@Controller("RoleRestController")

public class RoleRestController {

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
	 * Show all RoleResource entities by Role
	 * 
	 */
	@RequestMapping(value = "/Role/{role_roleid}/roleResources", method = RequestMethod.GET)
	@ResponseBody
	public List<RoleResource> getRoleRoleResources(@PathVariable Integer role_roleid) {
		return new java.util.ArrayList<RoleResource>(roleDAO.findRoleByPrimaryKey(role_roleid).getRoleResources());
	}

	/**
	* Select an existing Role entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}", method = RequestMethod.GET)
	@ResponseBody
	public Role loadRole(@PathVariable Integer role_roleid) {
		return roleDAO.findRoleByPrimaryKey(role_roleid);
	}

	/**
	* Save an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/roleResources", method = RequestMethod.PUT)
	@ResponseBody
	public RoleResource saveRoleRoleResources(@PathVariable Integer role_roleid, @RequestBody RoleResource roleresources) {
		roleService.saveRoleRoleResources(role_roleid, roleresources);
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresources.getRoleid(), roleresources.getResourceid());
	}

	/**
	* Save an existing Role entity
	* 
	*/
	@RequestMapping(value = "/Role", method = RequestMethod.PUT)
	@ResponseBody
	public Role saveRole(@RequestBody Role role) {
		roleService.saveRole(role);
		return roleDAO.findRoleByPrimaryKey(role.getRoleid());
	}

	/**
	* Create a new Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/yourtaskusers", method = RequestMethod.POST)
	@ResponseBody
	public Yourtaskuser newRoleYourtaskusers(@PathVariable Integer role_roleid, @RequestBody Yourtaskuser yourtaskuser) {
		roleService.saveRoleYourtaskusers(role_roleid, yourtaskuser);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskuser.getUserid());
	}

	/**
	* Show all Role entities
	* 
	*/
	@RequestMapping(value = "/Role", method = RequestMethod.GET)
	@ResponseBody
	public List<Role> listRoles() {
		return new java.util.ArrayList<Role>(roleService.loadRoles());
	}

	/**
	* Create a new Role entity
	* 
	*/
	@RequestMapping(value = "/Role", method = RequestMethod.POST)
	@ResponseBody
	public Role newRole(@RequestBody Role role) {
		roleService.saveRole(role);
		return roleDAO.findRoleByPrimaryKey(role.getRoleid());
	}

	/**
	* Save an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/yourtaskusers", method = RequestMethod.PUT)
	@ResponseBody
	public Yourtaskuser saveRoleYourtaskusers(@PathVariable Integer role_roleid, @RequestBody Yourtaskuser yourtaskusers) {
		roleService.saveRoleYourtaskusers(role_roleid, yourtaskusers);
		return yourtaskuserDAO.findYourtaskuserByPrimaryKey(yourtaskusers.getUserid());
	}

	/**
	* Show all Yourtaskuser entities by Role
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/yourtaskusers", method = RequestMethod.GET)
	@ResponseBody
	public List<Yourtaskuser> getRoleYourtaskusers(@PathVariable Integer role_roleid) {
		return new java.util.ArrayList<Yourtaskuser>(roleDAO.findRoleByPrimaryKey(role_roleid).getYourtaskusers());
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
	* View an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/yourtaskusers/{yourtaskuser_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Yourtaskuser loadRoleYourtaskusers(@PathVariable Integer role_roleid, @PathVariable Integer related_yourtaskusers_userid) {
		Yourtaskuser yourtaskuser = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskusers_userid, -1, -1);

		return yourtaskuser;
	}

	/**
	* View an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}", method = RequestMethod.GET)
	@ResponseBody
	public RoleResource loadRoleRoleResources(@PathVariable Integer role_roleid, @PathVariable Integer related_roleresources_roleid, @PathVariable Integer related_roleresources_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources_roleid, related_roleresources_resourceid, -1, -1);

		return roleresource;
	}

	/**
	* Create a new RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/roleResources", method = RequestMethod.POST)
	@ResponseBody
	public RoleResource newRoleRoleResources(@PathVariable Integer role_roleid, @RequestBody RoleResource roleresource) {
		roleService.saveRoleRoleResources(role_roleid, roleresource);
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource.getRoleid(), roleresource.getResourceid());
	}

	/**
	* Delete an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoleRoleResources(@PathVariable Integer role_roleid, @PathVariable Integer related_roleresources_roleid, @PathVariable Integer related_roleresources_resourceid) {
		roleService.deleteRoleRoleResources(role_roleid, related_roleresources_roleid, related_roleresources_resourceid);
	}

	/**
	* Delete an existing Role entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRole(@PathVariable Integer role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(role_roleid);
		roleService.deleteRole(role);
	}

	/**
	* Delete an existing Yourtaskuser entity
	* 
	*/
	@RequestMapping(value = "/Role/{role_roleid}/yourtaskusers/{yourtaskuser_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoleYourtaskusers(@PathVariable Integer role_roleid, @PathVariable Integer related_yourtaskusers_userid) {
		roleService.deleteRoleYourtaskusers(role_roleid, related_yourtaskusers_userid);
	}
}