
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
		@NamedQuery(name = "findAllResources", query = "select myResource from Resource myResource"),
		@NamedQuery(name = "findResourceByPrimaryKey", query = "select myResource from Resource myResource where myResource.resourceid = ?1"),
		@NamedQuery(name = "findResourceByResourceid", query = "select myResource from Resource myResource where myResource.resourceid = ?1"),
		@NamedQuery(name = "findResourceByResourceurl", query = "select myResource from Resource myResource where myResource.resourceurl = ?1"),
		@NamedQuery(name = "findResourceByResourceurlContaining", query = "select myResource from Resource myResource where myResource.resourceurl like ?1") })

@Table(schema = "public", name = "resource")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Resource")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "resourceid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer resourceid;
	/**
	 */

	@Column(name = "resourceurl", length = 75, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String resourceurl;

	/**
	 */
	@OneToMany(mappedBy = "resource", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.RoleResource> roleResources;

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
	public void setResourceurl(String resourceurl) {
		this.resourceurl = resourceurl;
	}

	/**
	 */
	public String getResourceurl() {
		return this.resourceurl;
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
	public Resource() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Resource that) {
		setResourceid(that.getResourceid());
		setResourceurl(that.getResourceurl());
		setRoleResources(new java.util.LinkedHashSet<com.aiop.yourtask.domain.RoleResource>(that.getRoleResources()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("resourceid=[").append(resourceid).append("] ");
		buffer.append("resourceurl=[").append(resourceurl).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((resourceid == null) ? 0 : resourceid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Resource))
			return false;
		Resource equalCheck = (Resource) obj;
		if ((resourceid == null && equalCheck.resourceid != null) || (resourceid != null && equalCheck.resourceid == null))
			return false;
		if (resourceid != null && !resourceid.equals(equalCheck.resourceid))
			return false;
		return true;
	}
}
