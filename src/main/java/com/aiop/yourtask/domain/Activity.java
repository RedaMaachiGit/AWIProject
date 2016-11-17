
package com.aiop.yourtask.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
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
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "activityid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer activityid;
	/**
	 */

	@Column(name = "activityname", length = 25, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String activityname;
	/**
	 */

	@Column(name = "activitydescription", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String activitydescription;
	/**
	 */

	@Column(name = "activityvisibility", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean activityvisibility;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;
	/**
	 */
	@OneToMany(mappedBy = "activity", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Diary> diaries;
	/**
	 */
	@OneToMany(mappedBy = "activity", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Comment> comments;
	/**
	 */
	@OneToMany(mappedBy = "activity", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.aiop.yourtask.domain.Task> tasks;

	/**
	 */
	public void setActivityid(Integer activityid) {
		this.activityid = activityid;
	}

	/**
	 */
	public Integer getActivityid() {
		return this.activityid;
	}

	/**
	 */
	public void setActivityname(String activityname) {
		this.activityname = activityname;
	}

	/**
	 */
	public String getActivityname() {
		return this.activityname;
	}

	/**
	 */
	public void setActivitydescription(String activitydescription) {
		this.activitydescription = activitydescription;
	}

	/**
	 */
	public String getActivitydescription() {
		return this.activitydescription;
	}

	/**
	 */
	public void setActivityvisibility(Boolean activityvisibility) {
		this.activityvisibility = activityvisibility;
	}

	/**
	 */
	public Boolean getActivityvisibility() {
		return this.activityvisibility;
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
	public void setDiaries(Set<Diary> diaries) {
		this.diaries = diaries;
	}

	/**
	 */
	@JsonIgnore
	public Set<Diary> getDiaries() {
		if (diaries == null) {
			diaries = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Diary>();
		}
		return diaries;
	}

	/**
	 */
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	/**
	 */
	@JsonIgnore
	public Set<Comment> getComments() {
		if (comments == null) {
			comments = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Comment>();
		}
		return comments;
	}

	/**
	 */
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	/**
	 */
	@JsonIgnore
	public Set<Task> getTasks() {
		if (tasks == null) {
			tasks = new java.util.LinkedHashSet<com.aiop.yourtask.domain.Task>();
		}
		return tasks;
	}

	/**
	 */
	public Activity() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("activityid=[").append(activityid).append("] ");
		buffer.append("activityname=[").append(activityname).append("] ");
		buffer.append("activitydescription=[").append(activitydescription).append("] ");
		buffer.append("activityvisibility=[").append(activityvisibility).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((activityid == null) ? 0 : activityid.hashCode()));
		return result;
	}

	/**
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
