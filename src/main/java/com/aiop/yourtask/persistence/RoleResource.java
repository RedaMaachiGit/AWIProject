package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role_resource")
public class RoleResource {
	
	@EmbeddedId
	private RoleResourcePK roleResourcePK;
	
	@Column(name="rightRole")
	private Boolean rightRole;
	
	public RoleResource() {}

	public RoleResource(RoleResourcePK roleResourcePK, Boolean rightRole) {
		super();
		this.roleResourcePK = roleResourcePK;
		this.rightRole = rightRole;
	}

	public RoleResourcePK getRoleResourcePK() {
		return roleResourcePK;
	}

	public void setRoleResourcePK(RoleResourcePK roleResourcePK) {
		this.roleResourcePK = roleResourcePK;
	}

	public Boolean getRightRole() {
		return rightRole;
	}

	public void setRightRole(Boolean rightRole) {
		this.rightRole = rightRole;
	}

	@Override
	public String toString() {
		return "RoleResource [roleResourcePK=" + roleResourcePK + ", rightRole=" + rightRole + "]";
	}

	
}