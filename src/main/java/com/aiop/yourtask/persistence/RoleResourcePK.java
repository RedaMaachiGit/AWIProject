package com.aiop.yourtask.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RoleResourcePK implements Serializable {
    protected Integer roleId;
    protected Integer resourceId;

    public RoleResourcePK() {}

	public RoleResourcePK(Integer roleId, Integer resourceId) {
		this.roleId = roleId;
		this.resourceId = resourceId;
	}
	
	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "RoleResourcePK [roleId=" + roleId + ", resourceId=" + resourceId + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resourceId == null) ? 0 : resourceId.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleResourcePK other = (RoleResourcePK) obj;
		if (resourceId == null) {
			if (other.resourceId != null)
				return false;
		} else if (!resourceId.equals(other.resourceId))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		return true;
	}

}