/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.RoleResource;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Resource entities.
 */
public interface ResourceService {

	/**
	 * Find resource by primary key.
	 *
	 * @param resourceid the resourceid
	 * @return the resource
	 */
	public Resource findResourceByPrimaryKey(Integer resourceid);

	/**
	 * Return all Resource entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Resource> findAllResources(Integer startResult, Integer maxRows);

	/**
	 * Save an existing RoleResource entity.
	 *
	 * @param resourceid_1 the resourceid 1
	 * @param related_roleresources the related roleresources
	 * @return the resource
	 */
	public Resource saveResourceRoleResources(Integer resourceid_1, RoleResource related_roleresources);

	/**
	 * Save an existing Resource entity.
	 *
	 * @param resource the resource
	 */
	public void saveResource(Resource resource);

	/**
	 * Return a count of all Resource entity.
	 *
	 * @return the integer
	 */
	public Integer countResources();

	/**
	 * Load an existing Resource entity.
	 *
	 * @return the sets the
	 */
	public Set<Resource> loadResources();

	/**
	 * Delete an existing Resource entity.
	 *
	 * @param resource_1 the resource 1
	 */
	public void deleteResource(Resource resource_1);

	/**
	 * Delete an existing RoleResource entity.
	 *
	 * @param resource_resourceid the resource resourceid
	 * @param related_roleresources_roleid the related roleresources roleid
	 * @param related_roleresources_resourceid the related roleresources resourceid
	 * @return the resource
	 */
	public Resource deleteResourceRoleResources(Integer resource_resourceid, Integer related_roleresources_roleid, Integer related_roleresources_resourceid);
}