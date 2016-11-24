/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Resource;
import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for RoleResource entities.
 */
public interface RoleResourceService {

	/**
	 * Return all RoleResource entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<RoleResource> findAllRoleResources(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all RoleResource entity.
	 *
	 * @return the integer
	 */
	public Integer countRoleResources();

	/**
	 * Load an existing RoleResource entity.
	 *
	 * @return the sets the
	 */
	public Set<RoleResource> loadRoleResources();

	/**
	 * Save an existing RoleResource entity.
	 *
	 * @param roleresource the roleresource
	 */
	public void saveRoleResource(RoleResource roleresource);

	/**
	 * Save an existing Resource entity.
	 *
	 * @param roleid the roleid
	 * @param resourceid the resourceid
	 * @param related_resource the related resource
	 * @return the role resource
	 */
	public RoleResource saveRoleResourceResource(Integer roleid, Integer resourceid, Resource related_resource);

	/**
	 * Save an existing Role entity.
	 *
	 * @param roleid_1 the roleid 1
	 * @param resourceid_1 the resourceid 1
	 * @param related_role the related role
	 * @return the role resource
	 */
	public RoleResource saveRoleResourceRole(Integer roleid_1, Integer resourceid_1, Role related_role);

	/**
	 * Delete an existing Resource entity.
	 *
	 * @param roleresource_roleid the roleresource roleid
	 * @param roleresource_resourceid the roleresource resourceid
	 * @param related_resource_resourceid the related resource resourceid
	 * @return the role resource
	 */
	public RoleResource deleteRoleResourceResource(Integer roleresource_roleid, Integer roleresource_resourceid, Integer related_resource_resourceid);

	/**
	 * Find role resource by primary key.
	 *
	 * @param roleid_2 the roleid 2
	 * @param resourceid_2 the resourceid 2
	 * @return the role resource
	 */
	public RoleResource findRoleResourceByPrimaryKey(Integer roleid_2, Integer resourceid_2);

	/**
	 * Delete an existing Role entity.
	 *
	 * @param roleresource_roleid_1 the roleresource roleid 1
	 * @param roleresource_resourceid_1 the roleresource resourceid 1
	 * @param related_role_roleid the related role roleid
	 * @return the role resource
	 */
	public RoleResource deleteRoleResourceRole(Integer roleresource_roleid_1, Integer roleresource_resourceid_1, Integer related_role_roleid);

	/**
	 * Delete an existing RoleResource entity.
	 *
	 * @param roleresource_1 the roleresource 1
	 */
	public void deleteRoleResource(RoleResource roleresource_1);
}