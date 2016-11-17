
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

/**
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
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer roleid;
	/**
	 */

	@Column(name = "rolename", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String rolename;

	/**
	 */
	@OneToMany(mappedBy = "role", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Yourtaskuser> yourtaskusers;
	/**
	 */
	@OneToMany(mappedBy = "role", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.RoleResource> roleResources;

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
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	/**
	 */
	public String getRolename() {
		return this.rolename;
	}

	/**
	 */
	public void setYourtaskusers(Set<Yourtaskuser> yourtaskusers) {
		this.yourtaskusers = yourtaskusers;
	}

	/**
	 */
	@JsonIgnore
	public Set<Yourtaskuser> getYourtaskusers() {
		if (yourtaskusers == null) {
			yourtaskusers = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Yourtaskuser>();
		}
		return yourtaskusers;
	}

	/**
	 */
	public void setRoleResources(Set<RoleResource> roleResources) {
		this.roleResources = roleResources;
	}

	/**
	 */
	@JsonIgnore
	public Set<RoleResource> getRoleResources() {
		if (roleResources == null) {
			roleResources = new java.util.LinkedHashSet<com.aiop.yourtask.domain.RoleResource>();
		}
		return roleResources;
	}

	/**
	 */
	public Role() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roleid=[").append(roleid).append("] ");
		buffer.append("rolename=[").append(rolename).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roleid == null) ? 0 : roleid.hashCode()));
		return result;
	}

	/**
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
