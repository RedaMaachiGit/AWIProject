/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
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
 * The Class Diaryentry.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllDiaryentrys", query = "select myDiaryentry from Diaryentry myDiaryentry"),
		@NamedQuery(name = "findDiaryentryByPrimaryKey", query = "select myDiaryentry from Diaryentry myDiaryentry where myDiaryentry.diaryentryid = ?1") })

@Table(schema = "public", name = "diaryentry")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Diaryentry")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Diaryentry implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The diaryentryid. */

	@Column(name = "diaryentryid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer diaryentryid;
	
	/** The diaryentrydate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "diaryentrydate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar diaryentrydate;
	
	/** The diaryentrycontent. */

	@Column(name = "diaryentrycontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String diaryentrycontent;
	
	/** The diaryentryvisibility. */

	@Column(name = "diaryentryvisibility", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean diaryentryvisibility;

	/** The diary. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "iddiary", referencedColumnName = "iddiary", nullable = false) })
	@XmlTransient
	Diary diary;
	
	/** The diaryresources. */
	@OneToMany(mappedBy = "diaryentry", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Diaryresource> diaryresources;

	/**
	 * Sets the diaryentryid.
	 *
	 * @param diaryentryid the new diaryentryid
	 */
	public void setDiaryentryid(Integer diaryentryid) {
		this.diaryentryid = diaryentryid;
	}

	/**
	 * Gets the diaryentryid.
	 *
	 * @return the diaryentryid
	 */
	public Integer getDiaryentryid() {
		return this.diaryentryid;
	}

	/**
	 * Sets the diaryentrydate.
	 *
	 * @param diaryentrydate the new diaryentrydate
	 */
	public void setDiaryentrydate(Calendar diaryentrydate) {
		this.diaryentrydate = diaryentrydate;
	}

	/**
	 * Gets the diaryentrydate.
	 *
	 * @return the diaryentrydate
	 */
	public Calendar getDiaryentrydate() {
		return this.diaryentrydate;
	}

	/**
	 * Sets the diaryentrycontent.
	 *
	 * @param diaryentrycontent the new diaryentrycontent
	 */
	public void setDiaryentrycontent(String diaryentrycontent) {
		this.diaryentrycontent = diaryentrycontent;
	}

	/**
	 * Gets the diaryentrycontent.
	 *
	 * @return the diaryentrycontent
	 */
	public String getDiaryentrycontent() {
		return this.diaryentrycontent;
	}

	/**
	 * Sets the diaryentryvisibility.
	 *
	 * @param diaryentryvisibility the new diaryentryvisibility
	 */
	public void setDiaryentryvisibility(Boolean diaryentryvisibility) {
		this.diaryentryvisibility = diaryentryvisibility;
	}

	/**
	 * Gets the diaryentryvisibility.
	 *
	 * @return the diaryentryvisibility
	 */
	public Boolean getDiaryentryvisibility() {
		return this.diaryentryvisibility;
	}

	/**
	 * Sets the diary.
	 *
	 * @param diary the new diary
	 */
	public void setDiary(Diary diary) {
		this.diary = diary;
	}

	/**
	 * Gets the diary.
	 *
	 * @return the diary
	 */
	@JsonIgnore
	public Diary getDiary() {
		return diary;
	}

	/**
	 * Sets the diaryresources.
	 *
	 * @param diaryresources the new diaryresources
	 */
	public void setDiaryresources(Set<Diaryresource> diaryresources) {
		this.diaryresources = diaryresources;
	}

	/**
	 * Gets the diaryresources.
	 *
	 * @return the diaryresources
	 */
	@JsonIgnore
	public Set<Diaryresource> getDiaryresources() {
		if (diaryresources == null) {
			diaryresources = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diaryresource>();
		}
		return diaryresources;
	}

	/**
	 * Instantiates a new diaryentry.
	 */
	public Diaryentry() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Diaryentry that) {
		setDiaryentryid(that.getDiaryentryid());
		setDiaryentrydate(that.getDiaryentrydate());
		setDiaryentrycontent(that.getDiaryentrycontent());
		setDiaryentryvisibility(that.getDiaryentryvisibility());
		setDiary(that.getDiary());
		setDiaryresources(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diaryresource>(that.getDiaryresources()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("diaryentryid=[").append(diaryentryid).append("] ");
		buffer.append("diaryentrydate=[").append(diaryentrydate).append("] ");
		buffer.append("diaryentrycontent=[").append(diaryentrycontent).append("] ");
		buffer.append("diaryentryvisibility=[").append(diaryentryvisibility).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((diaryentryid == null) ? 0 : diaryentryid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Diaryentry))
			return false;
		Diaryentry equalCheck = (Diaryentry) obj;
		if ((diaryentryid == null && equalCheck.diaryentryid != null) || (diaryentryid != null && equalCheck.diaryentryid == null))
			return false;
		if (diaryentryid != null && !diaryentryid.equals(equalCheck.diaryentryid))
			return false;
		return true;
	}
}
