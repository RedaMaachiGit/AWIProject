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
 * The Class Diary.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllDiarys", query = "select myDiary from Diary myDiary"),
		@NamedQuery(name = "findDiaryByDiarydate", query = "select myDiary from Diary myDiary where myDiary.diarydate = ?1"),
		@NamedQuery(name = "findDiaryByDiarydateAfter", query = "select myDiary from Diary myDiary where myDiary.diarydate > ?1"),
		@NamedQuery(name = "findDiaryByDiarydateBefore", query = "select myDiary from Diary myDiary where myDiary.diarydate < ?1"),
		@NamedQuery(name = "findDiaryByDiaryname", query = "select myDiary from Diary myDiary where myDiary.diaryname = ?1"),
		@NamedQuery(name = "findDiaryByDiarynameContaining", query = "select myDiary from Diary myDiary where myDiary.diaryname like ?1"),
		@NamedQuery(name = "findDiaryByIddiary", query = "select myDiary from Diary myDiary where myDiary.iddiary = ?1"),
		@NamedQuery(name = "findDiaryByPrimaryKey", query = "select myDiary from Diary myDiary where myDiary.iddiary = ?1") })

@Table(schema = "public", name = "diary")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Diary")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Diary implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The iddiary. */

	@Column(name = "iddiary", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer iddiary;
	
	/** The diaryname. */

	@Column(name = "diaryname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String diaryname;
	
	/** The diarydate. */
	@Temporal(TemporalType.DATE)
	@Column(name = "diarydate", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar diarydate;

	/** The activity. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "activityid", referencedColumnName = "activityid", nullable = false) })
	@XmlTransient
	Activity activity;
	
	/** The yourtaskuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;
	
	/** The diaryentries. */
	@OneToMany(mappedBy = "diary", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Diaryentry> diaryentries;
	
	/** The goals. */
	@OneToMany(mappedBy = "diary", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Goal> goals;

	/**
	 * Sets the iddiary.
	 *
	 * @param iddiary the new iddiary
	 */
	public void setIddiary(Integer iddiary) {
		this.iddiary = iddiary;
	}

	/**
	 * Gets the iddiary.
	 *
	 * @return the iddiary
	 */
	public Integer getIddiary() {
		return this.iddiary;
	}

	/**
	 * Sets the diaryname.
	 *
	 * @param diaryname the new diaryname
	 */
	public void setDiaryname(String diaryname) {
		this.diaryname = diaryname;
	}

	/**
	 * Gets the diaryname.
	 *
	 * @return the diaryname
	 */
	public String getDiaryname() {
		return this.diaryname;
	}

	/**
	 * Sets the diarydate.
	 *
	 * @param diarydate the new diarydate
	 */
	public void setDiarydate(Calendar diarydate) {
		this.diarydate = diarydate;
	}

	/**
	 * Gets the diarydate.
	 *
	 * @return the diarydate
	 */
	public Calendar getDiarydate() {
		return this.diarydate;
	}

	/**
	 * Sets the activity.
	 *
	 * @param activity the new activity
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 * Gets the activity.
	 *
	 * @return the activity
	 */
	@JsonIgnore
	public Activity getActivity() {
		return activity;
	}

	/**
	 * Sets the yourtaskuser.
	 *
	 * @param yourtaskuser the new yourtaskuser
	 */
	public void setYourtaskuser(Yourtaskuser yourtaskuser) {
		this.yourtaskuser = yourtaskuser;
	}

	/**
	 * Gets the yourtaskuser.
	 *
	 * @return the yourtaskuser
	 */
	@JsonIgnore
	public Yourtaskuser getYourtaskuser() {
		return yourtaskuser;
	}

	/**
	 * Sets the diaryentries.
	 *
	 * @param diaryentries the new diaryentries
	 */
	public void setDiaryentries(Set<Diaryentry> diaryentries) {
		this.diaryentries = diaryentries;
	}

	/**
	 * Gets the diaryentries.
	 *
	 * @return the diaryentries
	 */
	@JsonIgnore
	public Set<Diaryentry> getDiaryentries() {
		if (diaryentries == null) {
			diaryentries = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diaryentry>();
		}
		return diaryentries;
	}

	/**
	 * Sets the goals.
	 *
	 * @param goals the new goals
	 */
	public void setGoals(Set<Goal> goals) {
		this.goals = goals;
	}

	/**
	 * Gets the goals.
	 *
	 * @return the goals
	 */
	@JsonIgnore
	public Set<Goal> getGoals() {
		if (goals == null) {
			goals = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Goal>();
		}
		return goals;
	}

	/**
	 * Instantiates a new diary.
	 */
	public Diary() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Diary that) {
		setIddiary(that.getIddiary());
		setDiaryname(that.getDiaryname());
		setDiarydate(that.getDiarydate());
		setActivity(that.getActivity());
		setYourtaskuser(that.getYourtaskuser());
		setDiaryentries(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diaryentry>(that.getDiaryentries()));
		setGoals(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Goal>(that.getGoals()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("iddiary=[").append(iddiary).append("] ");
		buffer.append("diaryname=[").append(diaryname).append("] ");
		buffer.append("diarydate=[").append(diarydate).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((iddiary == null) ? 0 : iddiary.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Diary))
			return false;
		Diary equalCheck = (Diary) obj;
		if ((iddiary == null && equalCheck.iddiary != null) || (iddiary != null && equalCheck.iddiary == null))
			return false;
		if (iddiary != null && !iddiary.equals(equalCheck.iddiary))
			return false;
		return true;
	}
}
