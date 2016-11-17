
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.RoleResource;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Resource entities
 * 
 */
public interface ResourceService {

	/**
	 */
	public Resource findResourceByPrimaryKey(Integer resourceid);

	/**
	* Return all Resource entity
	* 
	 */
	public List<Resource> findAllResources(Integer startResult, Integer maxRows);

	/**
	* Save an existing RoleResource entity
	* 
	 */
	public Resource saveResourceRoleResources(Integer resourceid_1, RoleResource related_roleresources);

	/**
	* Save an existing Resource entity
	* 
	 */
	public void saveResource(Resource resource);

	/**
	* Return a count of all Resource entity
	* 
	 */
	public Integer countResources();

	/**
	* Load an existing Resource entity
	* 
	 */
	public Set<Resource> loadResources();

	/**
	* Delete an existing Resource entity
	* 
	 */
	public void deleteResource(Resource resource_1);

	/**
	* Delete an existing RoleResource entity
	* 
	 */
	public Resource deleteResourceRoleResources(Integer resource_resourceid, Integer related_roleresources_roleid, Integer related_roleresources_resourceid);
}