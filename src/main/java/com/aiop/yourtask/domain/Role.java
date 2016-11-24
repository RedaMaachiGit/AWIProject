/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Role.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllRoles", query = "select myRole from Role myRole"),
		@NamedQuery(name = "findRoleByPrimaryKey", query = "select myRole from Role myRole where myRole.roleid = ?1"),
		@NamedQuery(name = "findRoleByRoleid", query = "select myRole from Role myRole where myRole.roleid = ?1"),
		@NamedQuery(name = "findRoleByRolename", query = "select myRole from Role myRole where myRole.rolename = ?1"),
		@NamedQuery(name = "findRoleByRolenameContaining", query = "select myRole from Role myRole where myRole.rolename like ?1") })

@Table(schema = "public", name = "role")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Role")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Role implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The roleid. */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer roleid;
	
	/** The rolename. */

	@Column(name = "rolename", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String rolename;

	/** The yourtaskusers. */
	@OneToMany(mappedBy = "role", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Yourtaskuser> yourtaskusers;
	
	/** The role resources. */
	@OneToMany(mappedBy = "role", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.RoleResource> roleResources;

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
	 * Sets the rolename.
	 *
	 * @param rolename the new rolename
	 */
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	/**
	 * Gets the rolename.
	 *
	 * @return the rolename
	 */
	public String getRolename() {
		return this.rolename;
	}

	/**
	 * Sets the yourtaskusers.
	 *
	 * @param yourtaskusers the new yourtaskusers
	 */
	public void setYourtaskusers(Set<Yourtaskuser> yourtaskusers) {
		this.yourtaskusers = yourtaskusers;
	}

	/**
	 * Gets the yourtaskusers.
	 *
	 * @return the yourtaskusers
	 */
	@JsonIgnore
	public Set<Yourtaskuser> getYourtaskusers() {
		if (yourtaskusers == null) {
			yourtaskusers = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Yourtaskuser>();
		}
		return yourtaskusers;
	}

	/**
	 * Sets the role resources.
	 *
	 * @param roleResources the new role resources
	 */
	public void setRoleResources(Set<RoleResource> roleResources) {
		this.roleResources = roleResources;
	}

	/**
	 * Gets the role resources.
	 *
	 * @return the role resources
	 */
	@JsonIgnore
	public Set<RoleResource> getRoleResources() {
		if (roleResources == null) {
			roleResources = new java.util.LinkedHashSet<com.aiop.yourtask.domain.RoleResource>();
		}
		return roleResources;
	}

	/**
	 * Instantiates a new role.
	 */
	public Role() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Role that) {
		setRoleid(that.getRoleid());
		setRolename(that.getRolename());
		setYourtaskusers(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Yourtaskuser>(that.getYourtaskusers()));
		setRoleResources(new java.util.LinkedHashSet<com.aiop.yourtask.domain.RoleResource>(that.getRoleResources()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roleid=[").append(roleid).append("] ");
		buffer.append("rolename=[").append(rolename).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roleid == null) ? 0 : roleid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Role))
			return false;
		Role equalCheck = (Role) obj;
		if ((roleid == null && equalCheck.roleid != null) || (roleid != null && equalCheck.roleid == null))
			return false;
		if (roleid != null && !roleid.equals(equalCheck.roleid))
			return false;
		return true;
	}
}
