
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
		@NamedQuery(name = "findAllTasks", query = "select myTask from Task myTask"),
		@NamedQuery(name = "findTaskByPrimaryKey", query = "select myTask from Task myTask where myTask.taskid = ?1"),
		@NamedQuery(name = "findTaskByTaskcontent", query = "select myTask from Task myTask where myTask.taskcontent = ?1"),
		@NamedQuery(name = "findTaskByTaskcontentContaining", query = "select myTask from Task myTask where myTask.taskcontent like ?1"),
		@NamedQuery(name = "findTaskByTaskid", query = "select myTask from Task myTask where myTask.taskid = ?1") })

@Table(schema = "public", name = "task")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Task")

public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "taskid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer taskid;
	/**
	 */

	@Column(name = "taskcontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String taskcontent;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "activityid", referencedColumnName = "activityid", nullable = false) })
	@XmlTransient
	Activity activity;

	/**
	 */
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	/**
	 */
	public Integer getTaskid() {
		return this.taskid;
	}

	/**
	 */
	public void setTaskcontent(String taskcontent) {
		this.taskcontent = taskcontent;
	}

	/**
	 */
	public String getTaskcontent() {
		return this.taskcontent;
	}

	/**
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 */
	@JsonIgnore
	public Activity getActivity() {
		return activity;
	}

	/**
	 */
	public Task() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Task that) {
		setTaskid(that.getTaskid());
		setTaskcontent(that.getTaskcontent());
		setActivity(that.getActivity());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("taskid=[").append(taskid).append("] ");
		buffer.append("taskcontent=[").append(taskcontent).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((taskid == null) ? 0 : taskid.hashCode()));
		return result;
	}

	/**
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
