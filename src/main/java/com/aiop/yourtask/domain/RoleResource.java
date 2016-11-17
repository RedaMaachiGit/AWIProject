
package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */
@IdClass(com.aiop.yourtask.domain.RoleResourcePK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllRoleResources", query = "select myRoleResource from RoleResource myRoleResource"),
		@NamedQuery(name = "findRoleResourceByPrimaryKey", query = "select myRoleResource from RoleResource myRoleResource where myRoleResource.roleid = ?1 and myRoleResource.resourceid = ?2"),
		@NamedQuery(name = "findRoleResourceByResourceid", query = "select myRoleResource from RoleResource myRoleResource where myRoleResource.resourceid = ?1"),
		@NamedQuery(name = "findRoleResourceByRightrole", query = "select myRoleResource from RoleResource myRoleResource where myRoleResource.rightrole = ?1"),
		@NamedQuery(name = "findRoleResourceByRoleid", query = "select myRoleResource from RoleResource myRoleResource where myRoleResource.roleid = ?1") })

@Table(schema = "public", name = "role_resource")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "RoleResource")

public class RoleResource implements Serializable {
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

	@Column(name = "resourceid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer resourceid;
	/**
	 */

	@Column(name = "rightrole", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean rightrole;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "resourceid", referencedColumnName = "resourceid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Resource resource;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "roleid", referencedColumnName = "roleid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Role role;

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
	public void setRightrole(Boolean rightrole) {
		this.rightrole = rightrole;
	}

	/**
	 */
	public Boolean getRightrole() {
		return this.rightrole;
	}

	/**
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 */
	@JsonIgnore
	public Resource getResource() {
		return resource;
	}

	/**
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 */
	@JsonIgnore
	public Role getRole() {
		return role;
	}

	/**
	 */
	public RoleResource() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RoleResource that) {
		setRoleid(that.getRoleid());
		setResourceid(that.getResourceid());
		setRightrole(that.getRightrole());
		setResource(that.getResource());
		setRole(that.getRole());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roleid=[").append(roleid).append("] ");
		buffer.append("resourceid=[").append(resourceid).append("] ");
		buffer.append("rightrole=[").append(rightrole).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof RoleResource))
			return false;
		RoleResource equalCheck = (RoleResource) obj;
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
}
