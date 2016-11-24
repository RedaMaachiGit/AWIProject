/*
 * 
 */
package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.ResourceDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.RoleResource;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Resource entities.
 */

@Service("ResourceService")

@Transactional
public class ResourceServiceImpl implements ResourceService {

	/** DAO injected by Spring that manages Resource entities. */
	@Autowired
	private ResourceDAO resourceDAO;

	/** DAO injected by Spring that manages RoleResource entities. */
	@Autowired
	private RoleResourceDAO roleResourceDAO;

	/**
	 * Instantiates a new ResourceServiceImpl.
	 *
	 */
	public ResourceServiceImpl() {
	}

	/* (non-Javadoc)
	 * @see com.aiop.yourtask.service.ResourceService#findResourceByPrimaryKey(java.lang.Integer)
	 */
	@Transactional
	public Resource findResourceByPrimaryKey(Integer resourceid) {
		return resourceDAO.findResourceByPrimaryKey(resourceid);
	}

	/**
	 * Return all Resource entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	@Transactional
	public List<Resource> findAllResources(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Resource>(resourceDAO.findAllResources(startResult, maxRows));
	}

	/**
	 * Save an existing RoleResource entity.
	 *
	 * @param resourceid the resourceid
	 * @param related_roleresources the related roleresources
	 * @return the resource
	 */
	@Transactional
	public Resource saveResourceRoleResources(Integer resourceid, RoleResource related_roleresources) {
		Resource resource = resourceDAO.findResourceByPrimaryKey(resourceid, -1, -1);
		RoleResource existingroleResources = roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources.getRoleid(), related_roleresources.getResourceid());

		// copy into the existing record to preserve existing relationships
		if (existingroleResources != null) {
			existingroleResources.setRoleid(related_roleresources.getRoleid());
			existingroleResources.setResourceid(related_roleresources.getResourceid());
			existingroleResources.setRightrole(related_roleresources.getRightrole());
			related_roleresources = existingroleResources;
		}

		related_roleresources.setResource(resource);
		resource.getRoleResources().add(related_roleresources);
		related_roleresources = roleResourceDAO.store(related_roleresources);
		roleResourceDAO.flush();

		resource = resourceDAO.store(resource);
		resourceDAO.flush();

		return resource;
	}

	/**
	 * Save an existing Resource entity.
	 *
	 * @param resource the resource
	 */
	@Transactional
	public void saveResource(Resource resource) {
		Resource existingResource = resourceDAO.findResourceByPrimaryKey(resource.getResourceid());

		if (existingResource != null) {
			if (existingResource != resource) {
				existingResource.setResourceid(resource.getResourceid());
				existingResource.setResourceurl(resource.getResourceurl());
			}
			resource = resourceDAO.store(existingResource);
		} else {
			resource = resourceDAO.store(resource);
		}
		resourceDAO.flush();
	}

	/**
	 * Return a count of all Resource entity.
	 *
	 * @return the integer
	 */
	@Transactional
	public Integer countResources() {
		return ((Long) resourceDAO.createQuerySingleResult("select count(o) from Resource o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Resource entity.
	 *
	 * @return the sets the
	 */
	@Transactional
	public Set<Resource> loadResources() {
		return resourceDAO.findAllResources();
	}

	/**
	 * Delete an existing Resource entity.
	 *
	 * @param resource the resource
	 */
	@Transactional
	public void deleteResource(Resource resource) {
		resourceDAO.remove(resource);
		resourceDAO.flush();
	}

	/**
	 * Delete an existing RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param related_roleresources_roleid the related roleresources roleid
	 * @param related_roleresources_resourceid the related roleresources resourceid
	 * @return the resource
	 */
	@Transactional
	public Resource deleteResourceRoleResources(Integer resource_resourceid, Integer related_roleresources_roleid, Integer related_roleresources_resourceid) {
		RoleResource related_roleresources = roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources_roleid, related_roleresources_resourceid, -1, -1);

		Resource resource = resourceDAO.findResourceByPrimaryKey(resource_resourceid, -1, -1);

		related_roleresources.setResource(null);
		resource.getRoleResources().remove(related_roleresources);

		roleResourceDAO.remove(related_roleresources);
		roleResourceDAO.flush();

		return resource;
	}
}
