
package com.aiop.yourtask.service;

import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Role entities
 * 
 */
public interface RoleService {

	/**
	* Delete an existing Yourtaskuser entity
	* 
	 */
	public Role deleteRoleYourtaskusers(Integer role_roleid, Integer related_yourtaskusers_userid);

	/**
	* Delete an existing Role entity
	* 
	 */
	public void deleteRole(Role role);

	/**
	 */
	public Role findRoleByPrimaryKey(Integer roleid);

	/**
	* Return a count of all Role entity
	* 
	 */
	public Integer countRoles();

	/**
	* Save an existing Yourtaskuser entity
	* 
	 */
	public Role saveRoleYourtaskusers(Integer roleid_1, Yourtaskuser related_yourtaskusers);

	/**
	* Load an existing Role entity
	* 
	 */
	public Set<Role> loadRoles();

	/**
	* Save an existing RoleResource entity
	* 
	 */
	public Role saveRoleRoleResources(Integer roleid_2, RoleResource related_roleresources);

	/**
	* Return all Role entity
	* 
	 */
	public List<Role> findAllRoles(Integer startResult, Integer maxRows);

	/**
	* Save an existing Role entity
	* 
	 */
	public void saveRole(Role role_1);

	/**
	* Delete an existing RoleResource entity
	* 
	 */
	public Role deleteRoleRoleResources(Integer role_roleid_1, Integer related_roleresources_roleid, Integer related_roleresources_resourceid);
}