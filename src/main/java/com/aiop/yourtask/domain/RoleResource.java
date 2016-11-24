/*
 * 
 */

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

// TODO: Auto-generated Javadoc
/**
 * The Class RoleResource.
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
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The roleid. */

	@Column(name = "roleid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer roleid;
	
	/** The resourceid. */

	@Column(name = "resourceid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer resourceid;
	
	/** The rightrole. */

	@Column(name = "rightrole", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean rightrole;

	/** The resource. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "resourceid", referencedColumnName = "resourceid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Resource resource;
	
	/** The role. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "roleid", referencedColumnName = "roleid", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Role role;

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

	/**
	 * Sets the rightrole.
	 *
	 * @param rightrole the new rightrole
	 */
	public void setRightrole(Boolean rightrole) {
		this.rightrole = rightrole;
	}

	/**
	 * Gets the rightrole.
	 *
	 * @return the rightrole
	 */
	public Boolean getRightrole() {
		return this.rightrole;
	}

	/**
	 * Sets the resource.
	 *
	 * @param resource the new resource
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * Gets the resource.
	 *
	 * @return the resource
	 */
	@JsonIgnore
	public Resource getResource() {
		return resource;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	@JsonIgnore
	public Role getRole() {
		return role;
	}

	/**
	 * Instantiates a new role resource.
	 */
	public RoleResource() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roleid=[").append(roleid).append("] ");
		buffer.append("resourceid=[").append(resourceid).append("] ");
		buffer.append("rightrole=[").append(rightrole).append("] ");

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
		result = (int) (prime * result + ((resourceid == null) ? 0 : resourceid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
