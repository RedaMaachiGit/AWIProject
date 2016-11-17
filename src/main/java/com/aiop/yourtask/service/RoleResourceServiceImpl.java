package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ResourceDAO;
import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RoleResource entities
 * 
 */

@Service("RoleResourceService")

@Transactional
public class RoleResourceServiceImpl implements RoleResourceService {

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
	 * Instantiates a new RoleResourceServiceImpl.
	 *
	 */
	public RoleResourceServiceImpl() {
	}

	/**
	 * Return all RoleResource entity
	 * 
	 */
	@Transactional
	public List<RoleResource> findAllRoleResources(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RoleResource>(roleResourceDAO.findAllRoleResources(startResult, maxRows));
	}

	/**
	 * Return a count of all RoleResource entity
	 * 
	 */
	@Transactional
	public Integer countRoleResources() {
		return ((Long) roleResourceDAO.createQuerySingleResult("select count(*) from RoleResource o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing RoleResource entity
	 * 
	 */
	@Transactional
	public Set<RoleResource> loadRoleResources() {
		return roleResourceDAO.findAllRoleResources();
	}

	/**
	 * Save an existing RoleResource entity
	 * 
	 */
	@Transactional
	public void saveRoleResource(RoleResource roleresource) {
		RoleResource existingRoleResource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresource.getRoleid(), roleresource.getResourceid());

		if (existingRoleResource != null) {
			if (existingRoleResource != roleresource) {
				existingRoleResource.setRoleid(roleresource.getRoleid());
				existingRoleResource.setResourceid(roleresource.getResourceid());
				existingRoleResource.setRightrole(roleresource.getRightrole());
			}
			roleresource = roleResourceDAO.store(existingRoleResource);
		} else {
			roleresource = roleResourceDAO.store(roleresource);
		}
		roleResourceDAO.flush();
	}

	/**
	 * Save an existing Resource entity
	 * 
	 */
	@Transactional
	public RoleResource saveRoleResourceResource(Integer roleid, Integer resourceid, Resource related_resource) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleid, resourceid, -1, -1);
		Resource existingresource = resourceDAO.findResourceByPrimaryKey(related_resource.getResourceid());

		// copy into the existing record to preserve existing relationships
		if (existingresource != null) {
			existingresource.setResourceid(related_resource.getResourceid());
			existingresource.setResourceurl(related_resource.getResourceurl());
			related_resource = existingresource;
		}

		roleresource.setResource(related_resource);
		related_resource.getRoleResources().add(roleresource);
		roleresource = roleResourceDAO.store(roleresource);
		roleResourceDAO.flush();

		related_resource = resourceDAO.store(related_resource);
		resourceDAO.flush();

		return roleresource;
	}

	/**
	 * Save an existing Role entity
	 * 
	 */
	@Transactional
	public RoleResource saveRoleResourceRole(Integer roleid, Integer resourceid, Role related_role) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleid, resourceid, -1, -1);
		Role existingrole = roleDAO.findRoleByPrimaryKey(related_role.getRoleid());

		// copy into the existing record to preserve existing relationships
		if (existingrole != null) {
			existingrole.setRoleid(related_role.getRoleid());
			existingrole.setRolename(related_role.getRolename());
			related_role = existingrole;
		}

		roleresource.setRole(related_role);
		related_role.getRoleResources().add(roleresource);
		roleresource = roleResourceDAO.store(roleresource);
		roleResourceDAO.flush();

		related_role = roleDAO.store(related_role);
		roleDAO.flush();

		return roleresource;
	}

	/**
	 * Delete an existing Resource entity
	 * 
	 */
	@Transactional
	public RoleResource deleteRoleResourceResource(Integer roleresource_roleid, Integer roleresource_resourceid, Integer related_resource_resourceid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresource_roleid, roleresource_resourceid, -1, -1);
		Resource related_resource = resourceDAO.findResourceByPrimaryKey(related_resource_resourceid, -1, -1);

		roleresource.setResource(null);
		related_resource.getRoleResources().remove(roleresource);
		roleresource = roleResourceDAO.store(roleresource);
		roleResourceDAO.flush();

		related_resource = resourceDAO.store(related_resource);
		resourceDAO.flush();

		resourceDAO.remove(related_resource);
		resourceDAO.flush();

		return roleresource;
	}

	/**
	 */
	@Transactional
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid, Integer resourceid) {
		return roleResourceDAO.findRoleResourceByPrimaryKey(roleid, resourceid);
	}

	/**
	 * Delete an existing Role entity
	 * 
	 */
	@Transactional
	public RoleResource deleteRoleResourceRole(Integer roleresource_roleid, Integer roleresource_resourceid, Integer related_role_roleid) {
		RoleResource roleresource = roleResourceDAO.findRoleResourceByPrimaryKey(roleresource_roleid, roleresource_resourceid, -1, -1);
		Role related_role = roleDAO.findRoleByPrimaryKey(related_role_roleid, -1, -1);

		roleresource.setRole(null);
		related_role.getRoleResources().remove(roleresource);
		roleresource = roleResourceDAO.store(roleresource);
		roleResourceDAO.flush();

		related_role = roleDAO.store(related_role);
		roleDAO.flush();

		roleDAO.remove(related_role);
		roleDAO.flush();

		return roleresource;
	}

	/**
	 * Delete an existing RoleResource entity
	 * 
	 */
	@Transactional
	public void deleteRoleResource(RoleResource roleresource) {
		roleResourceDAO.remove(roleresource);
		roleResourceDAO.flush();
	}
}
