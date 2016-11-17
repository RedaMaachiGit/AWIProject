
package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity

@Table(schema = "public", name = "diaryresource")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Diaryresource")

public class Diaryresource implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "iddiaryresource", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer iddiaryresource;
	/**
	 */

	@Column(name = "typediaryresource", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String typediaryresource;
	/**
	 */

	@Column(name = "urldiaryresource", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String urldiaryresource;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "diaryentryid", referencedColumnName = "diaryentryid", nullable = false) })
	@XmlTransient
	Diaryentry diaryentry;

	/**
	 */
	public void setIddiaryresource(Integer iddiaryresource) {
		this.iddiaryresource = iddiaryresource;
	}

	/**
	 */
	public Integer getIddiaryresource() {
		return this.iddiaryresource;
	}

	/**
	 */
	public void setTypediaryresource(String typediaryresource) {
		this.typediaryresource = typediaryresource;
	}

	/**
	 */
	public String getTypediaryresource() {
		return this.typediaryresource;
	}

	/**
	 */
	public void setUrldiaryresource(String urldiaryresource) {
		this.urldiaryresource = urldiaryresource;
	}

	/**
	 */
	public String getUrldiaryresource() {
		return this.urldiaryresource;
	}

	/**
	 */
	public void setDiaryentry(Diaryentry diaryentry) {
		this.diaryentry = diaryentry;
	}

	/**
	 */
	@JsonIgnore
	public Diaryentry getDiaryentry() {
		return diaryentry;
	}

	/**
	 */
	public Diaryresource() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Diaryresource that) {
		setIddiaryresource(that.getIddiaryresource());
		setTypediaryresource(that.getTypediaryresource());
		setUrldiaryresource(that.getUrldiaryresource());
		setDiaryentry(that.getDiaryentry());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("iddiaryresource=[").append(iddiaryresource).append("] ");
		buffer.append("typediaryresource=[").append(typediaryresource).append("] ");
		buffer.append("urldiaryresource=[").append(urldiaryresource).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((iddiaryresource == null) ? 0 : iddiaryresource.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Diaryresource))
			return false;
		Diaryresource equalCheck = (Diaryresource) obj;
		if ((iddiaryresource == null && equalCheck.iddiaryresource != null) || (iddiaryresource != null && equalCheck.iddiaryresource == null))
			return false;
		if (iddiaryresource != null && !iddiaryresource.equals(equalCheck.iddiaryresource))
			return false;
		return true;
	}
}
