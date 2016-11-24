/*
 * 
 */
package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.ResourceDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.RoleResource;

import com.aiop.yourtask.service.ResourceService;

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

// TODO: Auto-generated Javadoc
/**
 * Spring MVC controller that handles CRUD requests for Resource entities.
 */

@Controller("ResourceController")

public class ResourceController {

	/** DAO injected by Spring that manages Resource entities. */
	@Autowired
	private ResourceDAO resourceDAO;

	/** DAO injected by Spring that manages RoleResource entities. */
	@Autowired
	private RoleResourceDAO roleResourceDAO;

	/** Service injected by Spring that provides CRUD operations for Resource entities. */
	@Autowired
	private ResourceService resourceService;

	/**
	 * Select the child RoleResource entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param related_roleresources_roleid the related roleresources roleid
	 * @param related_roleresources_resourceid the related roleresources resourceid
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteResourceRoleResources")
	public ModelAndView confirmDeleteResourceRoleResources(@RequestParam Integer resource_resourceid, @RequestParam Integer related_roleresources_roleid, @RequestParam Integer related_roleresources_resourceid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources_roleid, related_roleresources_resourceid));
		mav.addObject("resource_resourceid", resource_resourceid);
		mav.setViewName("resource/roleresources/deleteRoleResources.jsp");

		return mav;
	}

	/**
	 * Stream binary.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the model and view
	 */
	@RequestMapping("/resourceController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Resource entity.
	 *
	 * @param resourceidKey the resourceid key
	 * @return the model and view
	 */
	@RequestMapping("/selectResource")
	public ModelAndView selectResource(@RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resource", resourceDAO.findResourceByPrimaryKey(resourceidKey));
		mav.setViewName("resource/viewResource.jsp");

		return mav;
	}

	/**
	 * Edit an existing RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param roleresources_roleid the roleresources roleid
	 * @param roleresources_resourceid the roleresources resourceid
	 * @return the model and view
	 */
	@RequestMapping("/editResourceRoleResources")
	public ModelAndView editResourceRoleResources(@RequestParam Integer resource_resourceid, @RequestParam Integer roleresources_roleid, @RequestParam Integer roleresources_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresources_roleid, roleresources_resourceid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("resource_resourceid", resource_resourceid);
		mav.addObject("roleresource", roleresource);
		mav.setViewName("resource/roleresources/editRoleResources.jsp");

		return mav;
	}

	/**
	 * Show all RoleResource entities by Resource.
	 *
	 * @param resourceidKey the resourceid key
	 * @return the model and view
	 */
	@RequestMapping("/listResourceRoleResources")
	public ModelAndView listResourceRoleResources(@RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resource", resourceDAO.findResourceByPrimaryKey(resourceidKey));
		mav.setViewName("resource/roleresources/listRoleResources.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors.
	 *
	 * @param binder the binder
	 * @param request the request
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
	 * Edit an existing Resource entity.
	 *
	 * @param resourceidKey the resourceid key
	 * @return the model and view
	 */
	@RequestMapping("/editResource")
	public ModelAndView editResource(@RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resource", resourceDAO.findResourceByPrimaryKey(resourceidKey));
		mav.setViewName("resource/editResource.jsp");

		return mav;
	}

	/**
	 * Create a new RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @return the model and view
	 */
	@RequestMapping("/newResourceRoleResources")
	public ModelAndView newResourceRoleResources(@RequestParam Integer resource_resourceid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("resource_resourceid", resource_resourceid);
		mav.addObject("roleresource", new RoleResource());
		mav.addObject("newFlag", true);
		mav.setViewName("resource/roleresources/editRoleResources.jsp");

		return mav;
	}

	/**
	 * Save an existing Resource entity.
	 *
	 * @param resource the resource
	 * @return the string
	 */
	@RequestMapping("/saveResource")
	public String saveResource(@ModelAttribute Resource resource) {
		resourceService.saveResource(resource);
		return "forward:/indexResource";
	}

	/**
	 * Save an existing RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param roleresources the roleresources
	 * @return the model and view
	 */
	@RequestMapping("/saveResourceRoleResources")
	public ModelAndView saveResourceRoleResources(@RequestParam Integer resource_resourceid, @ModelAttribute RoleResource roleresources) {
		Resource parent_resource = resourceService.saveResourceRoleResources(resource_resourceid, roleresources);

		ModelAndView mav = new ModelAndView();
		mav.addObject("resource_resourceid", resource_resourceid);
		mav.addObject("resource", parent_resource);
		mav.setViewName("resource/viewResource.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Resource entities.
	 *
	 * @return the string
	 */
	public String indexResource() {
		return "redirect:/indexResource";
	}

	/**
	 * Delete an existing Resource entity.
	 *
	 * @param resourceidKey the resourceid key
	 * @return the string
	 */
	@RequestMapping("/deleteResource")
	public String deleteResource(@RequestParam Integer resourceidKey) {
		Resource resource = resourceDAO.findResourceByPrimaryKey(resourceidKey);
		resourceService.deleteResource(resource);
		return "forward:/indexResource";
	}

	/**
	 * View an existing RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param roleresources_roleid the roleresources roleid
	 * @param roleresources_resourceid the roleresources resourceid
	 * @return the model and view
	 */
	@RequestMapping("/selectResourceRoleResources")
	public ModelAndView selectResourceRoleResources(@RequestParam Integer resource_resourceid, @RequestParam Integer roleresources_roleid, @RequestParam Integer roleresources_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresources_roleid, roleresources_resourceid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("resource_resourceid", resource_resourceid);
		mav.addObject("roleresource", roleresource);
		mav.setViewName("resource/roleresources/viewRoleResources.jsp");

		return mav;
	}

	/**
	 * Show all Resource entities.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/indexResource")
	public ModelAndView listResources() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resources", resourceService.loadResources());

		mav.setViewName("resource/listResources.jsp");

		return mav;
	}

	/**
	 * Create a new Resource entity.
	 *
	 * @return the model and view
	 */
	@RequestMapping("/newResource")
	public ModelAndView newResource() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resource", new Resource());
		mav.addObject("newFlag", true);
		mav.setViewName("resource/editResource.jsp");

		return mav;
	}

	/**
	 * Delete an existing RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param related_roleresources_roleid the related roleresources roleid
	 * @param related_roleresources_resourceid the related roleresources resourceid
	 * @return the model and view
	 */
	@RequestMapping("/deleteResourceRoleResources")
	public ModelAndView deleteResourceRoleResources(@RequestParam Integer resource_resourceid, @RequestParam Integer related_roleresources_roleid, @RequestParam Integer related_roleresources_resourceid) {
		ModelAndView mav = new ModelAndView();

		Resource resource = resourceService.deleteResourceRoleResources(resource_resourceid, related_roleresources_roleid, related_roleresources_resourceid);

		mav.addObject("resource_resourceid", resource_resourceid);
		mav.addObject("resource", resource);
		mav.setViewName("resource/viewResource.jsp");

		return mav;
	}

	/**
	 * Select the Resource entity for display allowing the user to confirm that they would like to delete the entity.
	 *
	 * @param resourceidKey the resourceid key
	 * @return the model and view
	 */
	@RequestMapping("/confirmDeleteResource")
	public ModelAndView confirmDeleteResource(@RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resource", resourceDAO.findResourceByPrimaryKey(resourceidKey));
		mav.setViewName("resource/deleteResource.jsp");

		return mav;
	}
}