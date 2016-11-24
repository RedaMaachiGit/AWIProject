/*
 * 
 */
package com.aiop.yourtask.service;

import com.aiop.yourtask.dao.RoleDAO;
import com.aiop.yourtask.dao.RoleResourceDAO;
import com.aiop.yourtask.dao.YourtaskuserDAO;

import com.aiop.yourtask.domain.Role;
import com.aiop.yourtask.domain.RoleResource;
import com.aiop.yourtask.domain.Yourtaskuser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Spring service that handles CRUD requests for Role entities.
 */

@Service("RoleService")

@Transactional
public class RoleServiceImpl implements RoleService {

	/** DAO injected by Spring that manages Role entities. */
	@Autowired
	private RoleDAO roleDAO;

	/** DAO injected by Spring that manages RoleResource entities. */
	@Autowired
	private RoleResourceDAO roleResourceDAO;

	/** DAO injected by Spring that manages Yourtaskuser entities. */
	@Autowired
	private YourtaskuserDAO yourtaskuserDAO;

	/**
	 * Instantiates a new RoleServiceImpl.
	 *
	 */
	public RoleServiceImpl() {
	}

	/**
	 * Delete an existing Yourtaskuser entity.
	 *
	 * @param role_roleid the role roleid
	 * @param related_yourtaskusers_userid the related yourtaskusers userid
	 * @return the role
	 */
	@Transactional
	public Role deleteRoleYourtaskusers(Integer role_roleid, Integer related_yourtaskusers_userid) {
		Yourtaskuser related_yourtaskusers = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskusers_userid, -1, -1);

		Role role = roleDAO.findRoleByPrimaryKey(role_roleid, -1, -1);

		related_yourtaskusers.setRole(null);
		role.getYourtaskusers().remove(related_yourtaskusers);

		yourtaskuserDAO.remove(related_yourtaskusers);
		yourtaskuserDAO.flush();

		return role;
	}

	/**
	 * Delete an existing Role entity.
	 *
	 * @param role the role
	 */
	@Transactional
	public void deleteRole(Role role) {
		roleDAO.remove(role);
		roleDAO.flush();
	}

	/* (non-Javadoc)
	 * @see com.aiop.yourtask.service.RoleService#findRoleByPrimaryKey(java.lang.Integer)
	 */
	@Transactional
	public Role findRoleByPrimaryKey(Integer roleid) {
		return roleDAO.findRoleByPrimaryKey(roleid);
	}

	/**
	 * Return a count of all Role entity.
	 *
	 * @return the integer
	 */
	@Transactional
	public Integer countRoles() {
		return ((Long) roleDAO.createQuerySingleResult("select count(o) from Role o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Yourtaskuser entity.
	 *
	 * @param roleid the roleid
	 * @param related_yourtaskusers the related yourtaskusers
	 * @return the role
	 */
	@Transactional
	public Role saveRoleYourtaskusers(Integer roleid, Yourtaskuser related_yourtaskusers) {
		Role role = roleDAO.findRoleByPrimaryKey(roleid, -1, -1);
		Yourtaskuser existingyourtaskusers = yourtaskuserDAO.findYourtaskuserByPrimaryKey(related_yourtaskusers.getUserid());

		// copy into the existing record to preserve existing relationships
		if (existingyourtaskusers != null) {
			existingyourtaskusers.setUserid(related_yourtaskusers.getUserid());
			existingyourtaskusers.setUserdateofbirth(related_yourtaskusers.getUserdateofbirth());
			existingyourtaskusers.setUserphonenumber(related_yourtaskusers.getUserphonenumber());
			existingyourtaskusers.setUseremail(related_yourtaskusers.getUseremail());
			existingyourtaskusers.setUserstreetnumber(related_yourtaskusers.getUserstreetnumber());
			existingyourtaskusers.setUserzipcode(related_yourtaskusers.getUserzipcode());
			existingyourtaskusers.setUsercity(related_yourtaskusers.getUsercity());
			existingyourtaskusers.setUserusername(related_yourtaskusers.getUserusername());
			existingyourtaskusers.setUserpassword(related_yourtaskusers.getUserpassword());
			existingyourtaskusers.setUsertoken(related_yourtaskusers.getUsertoken());
			existingyourtaskusers.setUserlastconnectiondate(related_yourtaskusers.getUserlastconnectiondate());
			existingyourtaskusers.setUsertype(related_yourtaskusers.getUsertype());
			existingyourtaskusers.setUseriban(related_yourtaskusers.getUseriban());
			related_yourtaskusers = existingyourtaskusers;
		}

		related_yourtaskusers.setRole(role);
		role.getYourtaskusers().add(related_yourtaskusers);
		related_yourtaskusers = yourtaskuserDAO.store(related_yourtaskusers);
		yourtaskuserDAO.flush();

		role = roleDAO.store(role);
		roleDAO.flush();

		return role;
	}

	/**
	 * Load an existing Role entity.
	 *
	 * @return the sets the
	 */
	@Transactional
	public Set<Role> loadRoles() {
		return roleDAO.findAllRoles();
	}

	/**
	 * Save an existing RoleResource entity.
	 *
	 * @param roleid the roleid
	 * @param related_roleresources the related roleresources
	 * @return the role
	 */
	@Transactional
	public Role saveRoleRoleResources(Integer roleid, RoleResource related_roleresources) {
		Role role = roleDAO.findRoleByPrimaryKey(roleid, -1, -1);
		RoleResource existingroleResources = roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources.getRoleid(), related_roleresources.getResourceid());

		// copy into the existing record to preserve existing relationships
		if (existingroleResources != null) {
			existingroleResources.setRoleid(related_roleresources.getRoleid());
			existingroleResources.setResourceid(related_roleresources.getResourceid());
			existingroleResources.setRightrole(related_roleresources.getRightrole());
			related_roleresources = existingroleResources;
		}

		related_roleresources.setRole(role);
		role.getRoleResources().add(related_roleresources);
		related_roleresources = roleResourceDAO.store(related_roleresources);
		roleResourceDAO.flush();

		role = roleDAO.store(role);
		roleDAO.flush();

		return role;
	}

	/**
	 * Return all Role entity.
	 *
	 * @param startResult the start result
	 * @param maxRows the max rows
	 * @return the list
	 */
	@Transactional
	public List<Role> findAllRoles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Role>(roleDAO.findAllRoles(startResult, maxRows));
	}

	/**
	 * Save an existing Role entity.
	 *
	 * @param role the role
	 */
	@Transactional
	public void saveRole(Role role) {
		Role existingRole = roleDAO.findRoleByPrimaryKey(role.getRoleid());

		if (existingRole != null) {
			if (existingRole != role) {
				existingRole.setRoleid(role.getRoleid());
				existingRole.setRolename(role.getRolename());
			}
			role = roleDAO.store(existingRole);
		} else {
			role = roleDAO.store(role);
		}
		roleDAO.flush();
	}

	/**
	 * Delete an existing RoleResource entity.
	 *
	 * @param role_roleid the role roleid
	 * @param related_roleresources_roleid the related roleresources roleid
	 * @param related_roleresources_resourceid the related roleresources resourceid
	 * @return the role
	 */
	@Transactional
	public Role deleteRoleRoleResources(Integer role_roleid, Integer related_roleresources_roleid, Integer related_roleresources_resourceid) {
		RoleResource related_roleresources = roleResourceDAO.findRoleResourceByPrimaryKey(related_roleresources_roleid, related_roleresources_resourceid, -1, -1);

		Role role = roleDAO.findRoleByPrimaryKey(role_roleid, -1, -1);

		related_roleresources.setRole(null);
		role.getRoleResources().remove(related_roleresources);

		roleResourceDAO.remove(related_roleresources);
		roleResourceDAO.flush();

		return role;
	}
}
