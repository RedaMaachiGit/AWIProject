/*
 * 
 */

package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Role entities.
 */
public interface RoleService {

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param role_roleid the role roleid
	 * @param related_yourtaskusers_userid the related yourtaskusers userid
	 * @return the role
	 */
	public Role deleteRoleYourtaskusers(Integer role_roleid, Integer related_yourtaskusers_userid);

	/**
	 * Delete an existing Role entity.
	 *
	 * @param role the role
	 */
	public void deleteRole(Role role);

	/**
	 * Find role by primary key.
	 *
	 * @param roleid the roleid
	 * @return the role
	 */
	public Role findRoleByPrimaryKey(Integer roleid);

	/**
	 * Return a count of all Role entity.
	 *
	 * @return the integer
	 */
	public Integer countRoles();

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param roleid_1 the roleid 1
	 * @param related_yourtaskusers the related yourtaskusers
	 * @return the role
	 */
	public Role saveRoleYourtaskusers(Integer roleid_1, Yourtaskuser related_yourtaskusers);

	/**
	 * Load an existing Role entity.
	 *
	 * @return the sets the
	 */
	public Set<Role> loadRoles();

	/**
	 * Save an existing RoleResource entity.
	 *
	 * @param roleid_2 the roleid 2
	 * @param related_roleresources the related roleresources
	 * @return the role
	 */
	public Role saveRoleRoleResources(Integer roleid_2, RoleResource related_roleresources);

	/**
	 * Return all Role entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	public List<Role> findAllRoles(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Role entity.
	 *
	 * @param role_1 the role 1
	 */
	public void saveRole(Role role_1);

	/**
	 * Delete an existing RoleResource entity.
	 *
	 * @param role_roleid_1 the role roleid 1
	 * @param related_roleresources_roleid the related roleresources roleid
	 * @param related_roleresources_resourceid the related roleresources resourceid
	 * @return the role
	 */
	public Role deleteRoleRoleResources(Integer role_roleid_1, Integer related_roleresources_roleid, Integer related_roleresources_resourceid);
}