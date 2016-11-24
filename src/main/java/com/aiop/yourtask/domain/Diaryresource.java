/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Set;

import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Diaryresource.
 */

@Entity

@Table(schema = "public", name = "diaryresource")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Diaryresource")

public class Diaryresource implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The iddiaryresource. */

	@Column(name = "iddiaryresource", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer iddiaryresource;
	
	/** The typediaryresource. */

	@Column(name = "typediaryresource", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String typediaryresource;
	
	/** The urldiaryresource. */

	@Column(name = "urldiaryresource", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String urldiaryresource;

	/** The diaryentry. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "diaryentryid", referencedColumnName = "diaryentryid", nullable = false) })
	@XmlTransient
	Diaryentry diaryentry;

	/**
	 * Sets the iddiaryresource.
	 *
	 * @param iddiaryresource the new iddiaryresource
	 */
	public void setIddiaryresource(Integer iddiaryresource) {
		this.iddiaryresource = iddiaryresource;
	}

	/**
	 * Gets the iddiaryresource.
	 *
	 * @return the iddiaryresource
	 */
	public Integer getIddiaryresource() {
		return this.iddiaryresource;
	}

	/**
	 * Sets the typediaryresource.
	 *
	 * @param typediaryresource the new typediaryresource
	 */
	public void setTypediaryresource(String typediaryresource) {
		this.typediaryresource = typediaryresource;
	}

	/**
	 * Gets the typediaryresource.
	 *
	 * @return the typediaryresource
	 */
	public String getTypediaryresource() {
		return this.typediaryresource;
	}

	/**
	 * Sets the urldiaryresource.
	 *
	 * @param urldiaryresource the new urldiaryresource
	 */
	public void setUrldiaryresource(String urldiaryresource) {
		this.urldiaryresource = urldiaryresource;
	}

	/**
	 * Gets the urldiaryresource.
	 *
	 * @return the urldiaryresource
	 */
	public String getUrldiaryresource() {
		return this.urldiaryresource;
	}

	/**
	 * Sets the diaryentry.
	 *
	 * @param diaryentry the new diaryentry
	 */
	public void setDiaryentry(Diaryentry diaryentry) {
		this.diaryentry = diaryentry;
	}

	/**
	 * Gets the diaryentry.
	 *
	 * @return the diaryentry
	 */
	@JsonIgnore
	public Diaryentry getDiaryentry() {
		return diaryentry;
	}

	/**
	 * Instantiates a new diaryresource.
	 */
	public Diaryresource() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
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
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("iddiaryresource=[").append(iddiaryresource).append("] ");
		buffer.append("typediaryresource=[").append(typediaryresource).append("] ");
		buffer.append("urldiaryresource=[").append(urldiaryresource).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((iddiaryresource == null) ? 0 : iddiaryresource.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
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
