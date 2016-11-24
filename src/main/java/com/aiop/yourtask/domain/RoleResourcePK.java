/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class RoleResourcePK.
 */
public class RoleResourcePK implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new role resource PK.
	 */
	public RoleResourcePK() {
	}

	/** The roleid. */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer roleid;
	
	/** The resourceid. */

	@Column(name = "resourceid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	public Integer resourceid;

	/**
	 * Sets the roleid.
	 *
	 * @param roleid the new roleid
	 */
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	/**
	 * Gets the roleid.
	 *
	 * @return the roleid
	 */
	public Integer getRoleid() {
		return this.roleid;
	}

	/**
	 * Sets the resourceid.
	 *
	 * @param resourceid the new resourceid
	 */
	public void setResourceid(Integer resourceid) {
		this.resourceid = resourceid;
	}

	/**
	 * Gets the resourceid.
	 *
	 * @return the resourceid
	 */
	public Integer getResourceid() {
		return this.resourceid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roleid == null) ? 0 : roleid.hashCode()));
		result = (int) (prime * result + ((resourceid == null) ? 0 : resourceid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("RoleResourcePK");
		sb.append(" roleid: ").append(getRoleid());
		sb.append(" resourceid: ").append(getResourceid());
		return sb.toString();
	}
}
