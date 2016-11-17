
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

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllSuinfos", query = "select mySuinfo from Suinfo mySuinfo"),
		@NamedQuery(name = "findSuinfoByPrimaryKey", query = "select mySuinfo from Suinfo mySuinfo where mySuinfo.suinfoid = ?1") })

@Table(schema = "public", name = "suinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Suinfo")

public class Suinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "suinfoid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer suinfoid;
	/**
	 */

	@Column(name = "suinfofirstname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String suinfofirstname;
	/**
	 */

	@Column(name = "suinfolastname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String suinfolastname;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;

	/**
	 */
	public void setSuinfoid(Integer suinfoid) {
		this.suinfoid = suinfoid;
	}

	/**
	 */
	public Integer getSuinfoid() {
		return this.suinfoid;
	}

	/**
	 */
	public void setSuinfofirstname(String suinfofirstname) {
		this.suinfofirstname = suinfofirstname;
	}

	/**
	 */
	public String getSuinfofirstname() {
		return this.suinfofirstname;
	}

	/**
	 */
	public void setSuinfolastname(String suinfolastname) {
		this.suinfolastname = suinfolastname;
	}

	/**
	 */
	public String getSuinfolastname() {
		return this.suinfolastname;
	}

	/**
	 */
	public void setYourtaskuser(Yourtaskuser yourtaskuser) {
		this.yourtaskuser = yourtaskuser;
	}

	/**
	 */
	@JsonIgnore
	public Yourtaskuser getYourtaskuser() {
		return yourtaskuser;
	}

	/**
	 */
	public Suinfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Suinfo that) {
		setSuinfoid(that.getSuinfoid());
		setSuinfofirstname(that.getSuinfofirstname());
		setSuinfolastname(that.getSuinfolastname());
		setYourtaskuser(that.getYourtaskuser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("suinfoid=[").append(suinfoid).append("] ");
		buffer.append("suinfofirstname=[").append(suinfofirstname).append("] ");
		buffer.append("suinfolastname=[").append(suinfolastname).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((suinfoid == null) ? 0 : suinfoid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Suinfo))
			return false;
		Suinfo equalCheck = (Suinfo) obj;
		if ((suinfoid == null && equalCheck.suinfoid != null) || (suinfoid != null && equalCheck.suinfoid == null))
			return false;
		if (suinfoid != null && !suinfoid.equals(equalCheck.suinfoid))
			return false;
		return true;
	}
}
