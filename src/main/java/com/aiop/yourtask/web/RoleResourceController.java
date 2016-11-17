package com.aiop.yourtask.web;

import com.aiop.yourtask.dao.ResourceDAO;
import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;

import com.aiop.yourtask.service.RoleResourceService;

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
 * Spring MVC controller that handles CRUD requests for RoleResource entities
 * 
 */

@Controller("RoleResourceController")

public class RoleResourceController {

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
	 * Entry point to show all RoleResource entities
	 * 
	 */
	public String indexRoleResource() {
		return "redirect:/indexRoleResource";
	}

	/**
	* Select the child Role entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRoleResourceRole")
	public ModelAndView confirmDeleteRoleResourceRole(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer related_role_roleid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("role", roleDAO.findRoleByPrimaryKey(related_role_roleid));
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.setViewName("roleresource/role/deleteRole.jsp");

		return mav;
	}

	/**
	* Create a new RoleResource entity
	* 
	*/
	@RequestMapping("/newRoleResource")
	public ModelAndView newRoleResource() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", new RoleResource());
		mav.addObject("newFlag", true);
		mav.setViewName("roleresource/editRoleResource.jsp");

		return mav;
	}

	/**
	* Create a new Resource entity
	* 
	*/
	@RequestMapping("/newRoleResourceResource")
	public ModelAndView newRoleResourceResource(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("resource", new Resource());
		mav.addObject("newFlag", true);
		mav.setViewName("roleresource/resource/editResource.jsp");

		return mav;
	}

	/**
	* Show all Role entities by RoleResource
	* 
	*/
	@RequestMapping("/listRoleResourceRole")
	public ModelAndView listRoleResourceRole(@RequestParam Integer roleidKey, @RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(roleidKey, resourceidKey));
		mav.setViewName("roleresource/role/listRole.jsp");

		return mav;
	}

	/**
	* Select the RoleResource entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRoleResource")
	public ModelAndView confirmDeleteRoleResource(@RequestParam Integer roleidKey, @RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(roleidKey, resourceidKey));
		mav.setViewName("roleresource/deleteRoleResource.jsp");

		return mav;
	}

	/**
	* Edit an existing RoleResource entity
	* 
	*/
	@RequestMapping("/editRoleResource")
	public ModelAndView editRoleResource(@RequestParam Integer roleidKey, @RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(roleidKey, resourceidKey));
		mav.setViewName("roleresource/editRoleResource.jsp");

		return mav;
	}

	/**
	* Save an existing RoleResource entity
	* 
	*/
	@RequestMapping("/saveRoleResource")
	public String saveRoleResource(@ModelAttribute RoleResource roleresource) {
		roleResourceService.saveRoleResource(roleresource);
		return "forward:/indexRoleResource";
	}

	/**
	* Save an existing Resource entity
	* 
	*/
	@RequestMapping("/saveRoleResourceResource")
	public ModelAndView saveRoleResourceResource(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @ModelAttribute Resource resource) {
		RoleResource parent_roleresource = roleResourceService.saveRoleResourceResource(roleresource_roleid, roleresource_resourceid, resource);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("roleresource", parent_roleresource);
		mav.setViewName("roleresource/viewRoleResource.jsp");

		return mav;
	}

	/**
	* Delete an existing Resource entity
	* 
	*/
	@RequestMapping("/deleteRoleResourceResource")
	public ModelAndView deleteRoleResourceResource(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer related_resource_resourceid) {
		ModelAndView mav = new ModelAndView();

		RoleResource roleresource = roleResourceService.deleteRoleResourceResource(roleresource_roleid, roleresource_resourceid, related_resource_resourceid);

		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("roleresource", roleresource);
		mav.setViewName("roleresource/viewRoleResource.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/roleresourceController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing Role entity
	* 
	*/
	@RequestMapping("/saveRoleResourceRole")
	public ModelAndView saveRoleResourceRole(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @ModelAttribute Role role) {
		RoleResource parent_roleresource = roleResourceService.saveRoleResourceRole(roleresource_roleid, roleresource_resourceid, role);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("roleresource", parent_roleresource);
		mav.setViewName("roleresource/viewRoleResource.jsp");

		return mav;
	}

	/**
	* Delete an existing Role entity
	* 
	*/
	@RequestMapping("/deleteRoleResourceRole")
	public ModelAndView deleteRoleResourceRole(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer related_role_roleid) {
		ModelAndView mav = new ModelAndView();

		RoleResource roleresource = roleResourceService.deleteRoleResourceRole(roleresource_roleid, roleresource_resourceid, related_role_roleid);

		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("roleresource", roleresource);
		mav.setViewName("roleresource/viewRoleResource.jsp");

		return mav;
	}

	/**
	* Show all Resource entities by RoleResource
	* 
	*/
	@RequestMapping("/listRoleResourceResource")
	public ModelAndView listRoleResourceResource(@RequestParam Integer roleidKey, @RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(roleidKey, resourceidKey));
		mav.setViewName("roleresource/resource/listResource.jsp");

		return mav;
	}

	/**
	* View an existing Role entity
	* 
	*/
	@RequestMapping("/selectRoleResourceRole")
	public ModelAndView selectRoleResourceRole(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(role_roleid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("role", role);
		mav.setViewName("roleresource/role/viewRole.jsp");

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
	* Edit an existing Resource entity
	* 
	*/
	@RequestMapping("/editRoleResourceResource")
	public ModelAndView editRoleResourceResource(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer resource_resourceid) {
		Resource resource = resourceDAO.findResourceByPrimaryKey(resource_resourceid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("resource", resource);
		mav.setViewName("roleresource/resource/editResource.jsp");

		return mav;
	}

	/**
	* Delete an existing RoleResource entity
	* 
	*/
	@RequestMapping("/deleteRoleResource")
	public String deleteRoleResource(@RequestParam Integer roleidKey, @RequestParam Integer resourceidKey) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleidKey, resourceidKey);
		roleResourceService.deleteRoleResource(roleresource);
		return "forward:/indexRoleResource";
	}

	/**
	* Create a new Role entity
	* 
	*/
	@RequestMapping("/newRoleResourceRole")
	public ModelAndView newRoleResourceRole(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("role", new Role());
		mav.addObject("newFlag", true);
		mav.setViewName("roleresource/role/editRole.jsp");

		return mav;
	}

	/**
	* Edit an existing Role entity
	* 
	*/
	@RequestMapping("/editRoleResourceRole")
	public ModelAndView editRoleResourceRole(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer role_roleid) {
		Role role = roleDAO.findRoleByPrimaryKey(role_roleid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("role", role);
		mav.setViewName("roleresource/role/editRole.jsp");

		return mav;
	}

	/**
	* Show all RoleResource entities
	* 
	*/
	@RequestMapping("/indexRoleResource")
	public ModelAndView listRoleResources() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresources", roleResourceService.loadRoleResources());

		mav.setViewName("roleresource/listRoleResources.jsp");

		return mav;
	}

	/**
	* View an existing Resource entity
	* 
	*/
	@RequestMapping("/selectRoleResourceResource")
	public ModelAndView selectRoleResourceResource(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer resource_resourceid) {
		Resource resource = resourceDAO.findResourceByPrimaryKey(resource_resourceid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.addObject("resource", resource);
		mav.setViewName("roleresource/resource/viewResource.jsp");

		return mav;
	}

	/**
	* Select an existing RoleResource entity
	* 
	*/
	@RequestMapping("/selectRoleResource")
	public ModelAndView selectRoleResource(@RequestParam Integer roleidKey, @RequestParam Integer resourceidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roleresource", roleResourceDAO.findRoleResourceByPrimaryKey(roleidKey, resourceidKey));
		mav.setViewName("roleresource/viewRoleResource.jsp");

		return mav;
	}

	/**
	* Select the child Resource entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRoleResourceResource")
	public ModelAndView confirmDeleteRoleResourceResource(@RequestParam Integer roleresource_roleid, @RequestParam Integer roleresource_resourceid, @RequestParam Integer related_resource_resourceid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("resource", resourceDAO.findResourceByPrimaryKey(related_resource_resourceid));
		mav.addObject("roleresource_roleid", roleresource_roleid);
		mav.addObject("roleresource_resourceid", roleresource_resourceid);
		mav.setViewName("roleresource/resource/deleteResource.jsp");

		return mav;
	}
}