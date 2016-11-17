
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RoleResource entities
 * 
 */
public interface RoleResourceService {

	/**
	* Return all RoleResource entity
	* 
	 */
	public List<RoleResource> findAllRoleResources(Integer startResult, Integer maxRows);

	/**
	* Return a count of all RoleResource entity
	* 
	 */
	public Integer countRoleResources();

	/**
	* Load an existing RoleResource entity
	* 
	 */
	public Set<RoleResource> loadRoleResources();

	/**
	* Save an existing RoleResource entity
	* 
	 */
	public void saveRoleResource(RoleResource roleresource);

	/**
	* Save an existing Resource entity
	* 
	 */
	public RoleResource saveRoleResourceResource(Integer roleid, Integer resourceid, Resource related_resource);

	/**
	* Save an existing Role entity
	* 
	 */
	public RoleResource saveRoleResourceRole(Integer roleid_1, Integer resourceid_1, Role related_role);

	/**
	* Delete an existing Resource entity
	* 
	 */
	public RoleResource deleteRoleResourceResource(Integer roleresource_roleid, Integer roleresource_resourceid, Integer related_resource_resourceid);

	/**
	 */
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid_2, Integer resourceid_2);

	/**
	* Delete an existing Role entity
	* 
	 */
	public RoleResource deleteRoleResourceRole(Integer roleresource_roleid_1, Integer roleresource_resourceid_1, Integer related_role_roleid);

	/**
	* Delete an existing RoleResource entity
	* 
	 */
	public void deleteRoleResource(RoleResource roleresource_1);
}