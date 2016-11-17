
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
		@NamedQuery(name = "findAllScinfos", query = "select myScinfo from Scinfo myScinfo"),
		@NamedQuery(name = "findScinfoByPrimaryKey", query = "select myScinfo from Scinfo myScinfo where myScinfo.scinfoid = ?1") })

@Table(schema = "public", name = "scinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Scinfo")

public class Scinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "scinfoid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer scinfoid;
	/**
	 */

	@Column(name = "scinfosiret", length = 14, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String scinfosiret;
	/**
	 */

	@Column(name = "scinfoactivitydomain", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String scinfoactivitydomain;
	/**
	 */

	@Column(name = "scinfowebsite", length = 75, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String scinfowebsite;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;

	/**
	 */
	public void setScinfoid(Integer scinfoid) {
		this.scinfoid = scinfoid;
	}

	/**
	 */
	public Integer getScinfoid() {
		return this.scinfoid;
	}

	/**
	 */
	public void setScinfosiret(String scinfosiret) {
		this.scinfosiret = scinfosiret;
	}

	/**
	 */
	public String getScinfosiret() {
		return this.scinfosiret;
	}

	/**
	 */
	public void setScinfoactivitydomain(String scinfoactivitydomain) {
		this.scinfoactivitydomain = scinfoactivitydomain;
	}

	/**
	 */
	public String getScinfoactivitydomain() {
		return this.scinfoactivitydomain;
	}

	/**
	 */
	public void setScinfowebsite(String scinfowebsite) {
		this.scinfowebsite = scinfowebsite;
	}

	/**
	 */
	public String getScinfowebsite() {
		return this.scinfowebsite;
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
	public Scinfo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Scinfo that) {
		setScinfoid(that.getScinfoid());
		setScinfosiret(that.getScinfosiret());
		setScinfoactivitydomain(that.getScinfoactivitydomain());
		setScinfowebsite(that.getScinfowebsite());
		setYourtaskuser(that.getYourtaskuser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("scinfoid=[").append(scinfoid).append("] ");
		buffer.append("scinfosiret=[").append(scinfosiret).append("] ");
		buffer.append("scinfoactivitydomain=[").append(scinfoactivitydomain).append("] ");
		buffer.append("scinfowebsite=[").append(scinfowebsite).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((scinfoid == null) ? 0 : scinfoid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Scinfo))
			return false;
		Scinfo equalCheck = (Scinfo) obj;
		if ((scinfoid == null && equalCheck.scinfoid != null) || (scinfoid != null && equalCheck.scinfoid == null))
			return false;
		if (scinfoid != null && !scinfoid.equals(equalCheck.scinfoid))
			return false;
		return true;
	}
}
