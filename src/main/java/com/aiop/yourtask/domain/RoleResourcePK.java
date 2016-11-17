
package com.aiop.yourtask.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class RoleResourcePK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public RoleResourcePK() {
	}

	/**
	 */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer roleid;
	/**
	 */

	@Column(name = "resourceid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer resourceid;

	/**
	 */
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	/**
	 */
	public Integer getRoleid() {
		return this.roleid;
	}

	/**
	 */
	public void setResourceid(Integer resourceid) {
		this.resourceid = resourceid;
	}

	/**
	 */
	public Integer getResourceid() {
		return this.resourceid;
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roleid == null) ? 0 : roleid.hashCode()));
		result = (int) (prime * result + ((resourceid == null) ? 0 : resourceid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof RoleResourcePK))
			return false;
		RoleResourcePK equalCheck = (RoleResourcePK) obj;
		if ((roleid == null && equalCheck.roleid != null) || (roleid != null && equalCheck.roleid == null))
			return false;
		if (roleid != null && !roleid.equals(equalCheck.roleid))
			return false;
		if ((resourceid == null && equalCheck.resourceid != null) || (resourceid != null && equalCheck.resourceid == null))
			return false;
		if (resourceid != null && !resourceid.equals(equalCheck.resourceid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("RoleResourcePK");
		sb.append(" roleid: ").append(getRoleid());
		sb.append(" resourceid: ").append(getResourceid());
		return sb.toString();
	}
}
