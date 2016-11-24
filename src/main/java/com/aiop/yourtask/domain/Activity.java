/*
 * 
 */

package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Activity.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findActivityByActivitydescription", query = "select myActivity from Activity myActivity where myActivity.activitydescription = ?1"),
		@NamedQuery(name = "findActivityByActivitydescriptionContaining", query = "select myActivity from Activity myActivity where myActivity.activitydescription like ?1"),
		@NamedQuery(name = "findActivityByActivityid", query = "select myActivity from Activity myActivity where myActivity.activityid = ?1"),
		@NamedQuery(name = "findActivityByActivityname", query = "select myActivity from Activity myActivity where myActivity.activityname = ?1"),
		@NamedQuery(name = "findActivityByActivitynameContaining", query = "select myActivity from Activity myActivity where myActivity.activityname like ?1"),
		@NamedQuery(name = "findActivityByActivityvisibility", query = "select myActivity from Activity myActivity where myActivity.activityvisibility = ?1"),
		@NamedQuery(name = "findActivityByPrimaryKey", query = "select myActivity from Activity myActivity where myActivity.activityid = ?1"),
		@NamedQuery(name = "findAllActivitys", query = "select myActivity from Activity myActivity") })

@Table(schema = "public", name = "activity")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Activity")
@XmlRootElement(namespace = "aiopproject/com/aiop/yourtask/domain")
public class Activity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The activityid. */

	@Column(name = "activityid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer activityid;
	
	/** The activityname. */

	@Column(name = "activityname", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String activityname;
	
	/** The activitydescription. */

	@Column(name = "activitydescription", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String activitydescription;
	
	/** The activityvisibility. */

	@Column(name = "activityvisibility", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean activityvisibility;

	/** The yourtaskuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;
	
	/** The diaries. */
	@OneToMany(mappedBy = "activity", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Diary> diaries;
	
	/** The comments. */
	@OneToMany(mappedBy = "activity", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Comment> comments;
	
	/** The tasks. */
	@OneToMany(mappedBy = "activity", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Task> tasks;

	/**
	 * Sets the activityid.
	 *
	 * @param activityid the new activityid
	 */
	public void setActivityid(Integer activityid) {
		this.activityid = activityid;
	}

	/**
	 * Gets the activityid.
	 *
	 * @return the activityid
	 */
	public Integer getActivityid() {
		return this.activityid;
	}

	/**
	 * Sets the activityname.
	 *
	 * @param activityname the new activityname
	 */
	public void setActivityname(String activityname) {
		this.activityname = activityname;
	}

	/**
	 * Gets the activityname.
	 *
	 * @return the activityname
	 */
	public String getActivityname() {
		return this.activityname;
	}

	/**
	 * Sets the activitydescription.
	 *
	 * @param activitydescription the new activitydescription
	 */
	public void setActivitydescription(String activitydescription) {
		this.activitydescription = activitydescription;
	}

	/**
	 * Gets the activitydescription.
	 *
	 * @return the activitydescription
	 */
	public String getActivitydescription() {
		return this.activitydescription;
	}

	/**
	 * Sets the activityvisibility.
	 *
	 * @param activityvisibility the new activityvisibility
	 */
	public void setActivityvisibility(Boolean activityvisibility) {
		this.activityvisibility = activityvisibility;
	}

	/**
	 * Gets the activityvisibility.
	 *
	 * @return the activityvisibility
	 */
	public Boolean getActivityvisibility() {
		return this.activityvisibility;
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
	 * Sets the diaries.
	 *
	 * @param diaries the new diaries
	 */
	public void setDiaries(Set<Diary> diaries) {
		this.diaries = diaries;
	}

	/**
	 * Gets the diaries.
	 *
	 * @return the diaries
	 */
	@JsonIgnore
	public Set<Diary> getDiaries() {
		if (diaries == null) {
			diaries = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diary>();
		}
		return diaries;
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	@JsonIgnore
	public Set<Comment> getComments() {
		if (comments == null) {
			comments = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Comment>();
		}
		return comments;
	}

	/**
	 * Sets the tasks.
	 *
	 * @param tasks the new tasks
	 */
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	/**
	 * Gets the tasks.
	 *
	 * @return the tasks
	 */
	@JsonIgnore
	public Set<Task> getTasks() {
		if (tasks == null) {
			tasks = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Task>();
		}
		return tasks;
	}

	/**
	 * Instantiates a new activity.
	 */
	public Activity() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Activity that) {
		setActivityid(that.getActivityid());
		setActivityname(that.getActivityname());
		setActivitydescription(that.getActivitydescription());
		setActivityvisibility(that.getActivityvisibility());
		setYourtaskuser(that.getYourtaskuser());
		setDiaries(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diary>(that.getDiaries()));
		setComments(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Comment>(that.getComments()));
		setTasks(new java.util.LinkedHashSet<com.aiop.yourtask.domain.Task>(that.getTasks()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("activityid=[").append(activityid).append("] ");
		buffer.append("activityname=[").append(activityname).append("] ");
		buffer.append("activitydescription=[").append(activitydescription).append("] ");
		buffer.append("activityvisibility=[").append(activityvisibility).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((activityid == null) ? 0 : activityid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Activity))
			return false;
		Activity equalCheck = (Activity) obj;
		if ((activityid == null && equalCheck.activityid != null) || (activityid != null && equalCheck.activityid == null))
			return false;
		if (activityid != null && !activityid.equals(equalCheck.activityid))
			return false;
		return true;
	}
}
