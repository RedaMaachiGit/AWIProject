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
 * The Class Task.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTasks", query = "select myTask from Task myTask"),
		@NamedQuery(name = "findTaskByPrimaryKey", query = "select myTask from Task myTask where myTask.taskid = ?1"),
		@NamedQuery(name = "findTaskByTaskcontent", query = "select myTask from Task myTask where myTask.taskcontent = ?1"),
		@NamedQuery(name = "findTaskByTaskcontentContaining", query = "select myTask from Task myTask where myTask.taskcontent like ?1"),
		@NamedQuery(name = "findTaskByTaskid", query = "select myTask from Task myTask where myTask.taskid = ?1") })

@Table(schema = "public", name = "task")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Task")

public class Task implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The taskid. */

	@Column(name = "taskid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer taskid;
	
	/** The taskcontent. */

	@Column(name = "taskcontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String taskcontent;

	/** The activity. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "activityid", referencedColumnName = "activityid", nullable = false) })
	@XmlTransient
	Activity activity;

	/**
	 * Sets the taskid.
	 *
	 * @param taskid the new taskid
	 */
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	/**
	 * Gets the taskid.
	 *
	 * @return the taskid
	 */
	public Integer getTaskid() {
		return this.taskid;
	}

	/**
	 * Sets the taskcontent.
	 *
	 * @param taskcontent the new taskcontent
	 */
	public void setTaskcontent(String taskcontent) {
		this.taskcontent = taskcontent;
	}

	/**
	 * Gets the taskcontent.
	 *
	 * @return the taskcontent
	 */
	public String getTaskcontent() {
		return this.taskcontent;
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
	 * Instantiates a new task.
	 */
	public Task() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Task that) {
		setTaskid(that.getTaskid());
		setTaskcontent(that.getTaskcontent());
		setActivity(that.getActivity());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("taskid=[").append(taskid).append("] ");
		buffer.append("taskcontent=[").append(taskcontent).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((taskid == null) ? 0 : taskid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Task))
			return false;
		Task equalCheck = (Task) obj;
		if ((taskid == null && equalCheck.taskid != null) || (taskid != null && equalCheck.taskid == null))
			return false;
		if (taskid != null && !taskid.equals(equalCheck.taskid))
			return false;
		return true;
	}
}
