package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.ResourceDAO;
import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;

import com.aiop.yourtask.service.RoleResourceService;

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
 * Spring Rest controller that handles CRUD requests for RoleResource entities
 * 
 */

@Controller("RoleResourceRestController")

public class RoleResourceRestController {

	/**
	 * DAO injected by Spring that manages Resource entities
	 * 
	 */
	@Autowired
	private ResourceDAO resourceDAO;

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
	 * Service injected by Spring that provides CRUD operations for RoleResource entities
	 * 
	 */
	@Autowired
	private RoleResourceService roleResourceService;

	/**
	 * Create a new Resource entity
	 * 
	 */
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource", method = RequestMethod.POST)
	@ResponseBody
	public Resource newRoleResourceResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @RequestBody Resource resource) {
		roleResourceService.saveRoleResourceResource(roleresource_roleid, roleresource_resourceid, resource);
		return resourceDAO.findResourceByPrimaryKey(resource.getResourceid());
	}

	/**
	* Save an existing Resource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource", method = RequestMethod.PUT)
	@ResponseBody
	public Resource saveRoleResourceResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @RequestBody Resource resource) {
		roleResourceService.saveRoleResourceResource(roleresource_roleid, roleresource_resourceid, resource);
		return resourceDAO.findResourceByPrimaryKey(resource.getResourceid());
	}

	/**
	* Save an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource", method = RequestMethod.PUT)
	@ResponseBody
	public RoleResource saveRoleResource(@RequestBody RoleResource roleresource) {
		roleResourceService.saveRoleResource(roleresource);
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource.getRoleid(), roleresource.getResourceid());
	}

	/**
	* View an existing Resource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource/{resource_resourceid}", method = RequestMethod.GET)
	@ResponseBody
	public Resource loadRoleResourceResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @PathVariable Integer related_resource_resourceid) {
		Resource resource = resourceDAO.findResourceByPrimaryKey(related_resource_resourceid, -1, -1);

		return resource;
	}

	/**
	* View an existing Role entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role/{role_roleid}", method = RequestMethod.GET)
	@ResponseBody
	public Role loadRoleResourceRole(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @PathVariable Integer related_role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(related_role_roleid, -1, -1);

		return role;
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
	* Show all RoleResource entities
	* 
	*/
	@RequestMapping(value = "/RoleResource", method = RequestMethod.GET)
	@ResponseBody
	public List<RoleResource> listRoleResources() {
		return new java.util.ArrayList<RoleResource>(roleResourceService.loadRoleResources());
	}

	/**
	* Delete an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoleResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresource_roleid, roleresource_resourceid);
		roleResourceService.deleteRoleResource(roleresource);
	}

	/**
	* Save an existing Role entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role", method = RequestMethod.PUT)
	@ResponseBody
	public Role saveRoleResourceRole(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @RequestBody Role role) {
		roleResourceService.saveRoleResourceRole(roleresource_roleid, roleresource_resourceid, role);
		return roleDAO.findRoleByPrimaryKey(role.getRoleid());
	}

	/**
	* Get Resource entity by RoleResource
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource", method = RequestMethod.GET)
	@ResponseBody
	public Resource getRoleResourceResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid) {
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource_roleid, roleresource_resourceid).getResource();
	}

	/**
	* Create a new RoleResource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource", method = RequestMethod.POST)
	@ResponseBody
	public RoleResource newRoleResource(@RequestBody RoleResource roleresource) {
		roleResourceService.saveRoleResource(roleresource);
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource.getRoleid(), roleresource.getResourceid());
	}

	/**
	* Select an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}", method = RequestMethod.GET)
	@ResponseBody
	public RoleResource loadRoleResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid) {
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource_roleid, roleresource_resourceid);
	}

	/**
	* Delete an existing Role entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role/{role_roleid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoleResourceRole(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @PathVariable Integer related_role_roleid) {
		roleResourceService.deleteRoleResourceRole(roleresource_roleid, roleresource_resourceid, related_role_roleid);
	}

	/**
	* Create a new Role entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role", method = RequestMethod.POST)
	@ResponseBody
	public Role newRoleResourceRole(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @RequestBody Role role) {
		roleResourceService.saveRoleResourceRole(roleresource_roleid, roleresource_resourceid, role);
		return roleDAO.findRoleByPrimaryKey(role.getRoleid());
	}

	/**
	* Delete an existing Resource entity
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/resource/{resource_resourceid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoleResourceResource(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid, @PathVariable Integer related_resource_resourceid) {
		roleResourceService.deleteRoleResourceResource(roleresource_roleid, roleresource_resourceid, related_resource_resourceid);
	}

	/**
	* Get Role entity by RoleResource
	* 
	*/
	@RequestMapping(value = "/RoleResource/{roleresource_roleid}/{roleresource_resourceid}/role", method = RequestMethod.GET)
	@ResponseBody
	public Role getRoleResourceRole(@PathVariable Integer roleresource_roleid, @PathVariable Integer roleresource_resourceid) {
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource_roleid, roleresource_resourceid).getRole();
	}
}