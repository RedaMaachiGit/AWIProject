package com.aiop.yourtask.web.rest;

import com.aiop.yourtask.dao.ResourceDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.RoleResource;

import com.aiop.yourtask.service.ResourceService;

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
 * Spring Rest controller that handles CRUD requests for Resource entities
 * 
 */

@Controller("ResourceRestController")

public class ResourceRestController {

	/**
	 * DAO injected by Spring that manages Resource entities
	 * 
	 */
	@Autowired
	private ResourceDAO resourceDAO;

	/**
	 * DAO injected by Spring that manages RoleResource entities
	 * 
	 */
	@Autowired
	private RoleResourceDAO roleResourceDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Resource entities
	 * 
	 */
	@Autowired
	private ResourceService resourceService;

	/**
	 * Show all Resource entities
	 * 
	 */
	@RequestMapping(value = "/Resource", method = RequestMethod.GET)
	@ResponseBody
	public List<Resource> listResources() {
		return new java.util.ArrayList<Resource>(resourceService.loadResources());
	}

	/**
	* Save an existing Resource entity
	* 
	*/
	@RequestMapping(value = "/Resource", method = RequestMethod.PUT)
	@ResponseBody
	public Resource saveResource(@RequestBody Resource resource) {
		resourceService.saveResource(resource);
		return resourceDAO.findResourceByPrimaryKey(resource.getResourceid());
	}

	/**
	* Create a new RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}/roleResources", method = RequestMethod.POST)
	@ResponseBody
	public RoleResource newResourceRoleResources(@PathVariable Integer resource_resourceid, @RequestBody RoleResource roleresource) {
		resourceService.saveResourceRoleResources(resource_resourceid, roleresource);
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresource.getRoleid(), roleresource.getResourceid());
	}

	/**
	* Create a new Resource entity
	* 
	*/
	@RequestMapping(value = "/Resource", method = RequestMethod.POST)
	@ResponseBody
	public Resource newResource(@RequestBody Resource resource) {
		resourceService.saveResource(resource);
		return resourceDAO.findResourceByPrimaryKey(resource.getResourceid());
	}

	/**
	* Delete an existing Resource entity
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteResource(@PathVariable Integer resource_resourceid) {
		Resource resource = resourceDAO.findResourceByPrimaryKey(resource_resourceid);
		resourceService.deleteResource(resource);
	}

	/**
	* Delete an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteResourceRoleResources(@PathVariable Integer resource_resourceid, @PathVariable Integer related_roleresources_roleid, @PathVariable Integer related_roleresources_resourceid) {
		resourceService.deleteResourceRoleResources(resource_resourceid, related_roleresources_roleid, related_roleresources_resourceid);
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
	* Select an existing Resource entity
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}", method = RequestMethod.GET)
	@ResponseBody
	public Resource loadResource(@PathVariable Integer resource_resourceid) {
		return resourceDAO.findResourceByPrimaryKey(resource_resourceid);
	}

	/**
	* Show all RoleResource entities by Resource
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}/roleResources", method = RequestMethod.GET)
	@ResponseBody
	public List<RoleResource> getResourceRoleResources(@PathVariable Integer resource_resourceid) {
		return new java.util.ArrayList<RoleResource>(resourceDAO.findResourceByPrimaryKey(resource_resourceid).getRoleResources());
	}

	/**
	* View an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}/roleResources/{roleresource_roleid}/{roleresource_resourceid}", method = RequestMethod.GET)
	@ResponseBody
	public RoleResource loadResourceRoleResources(@PathVariable Integer resource_resourceid, @PathVariable Integer related_roleresources_roleid, @PathVariable Integer related_roleresources_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources_roleid, related_roleresources_resourceid, -1, -1);

		return roleresource;
	}

	/**
	* Save an existing RoleResource entity
	* 
	*/
	@RequestMapping(value = "/Resource/{resource_resourceid}/roleResources", method = RequestMethod.PUT)
	@ResponseBody
	public RoleResource saveResourceRoleResources(@PathVariable Integer resource_resourceid, @RequestBody RoleResource roleresources) {
		resourceService.saveResourceRoleResources(resource_resourceid, roleresources);
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleresources.getRoleid(), roleresources.getResourceid());
	}
}