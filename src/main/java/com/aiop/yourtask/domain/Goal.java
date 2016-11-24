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
 * The Class Goal.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllGoals", query = "select myGoal from Goal myGoal"),
		@NamedQuery(name = "findGoalByGoaldescription", query = "select myGoal from Goal myGoal where myGoal.goaldescription = ?1"),
		@NamedQuery(name = "findGoalByGoaldescriptionContaining", query = "select myGoal from Goal myGoal where myGoal.goaldescription like ?1"),
		@NamedQuery(name = "findGoalByGoalid", query = "select myGoal from Goal myGoal where myGoal.goalid = ?1"),
		@NamedQuery(name = "findGoalByGoalname", query = "select myGoal from Goal myGoal where myGoal.goalname = ?1"),
		@NamedQuery(name = "findGoalByGoalnameContaining", query = "select myGoal from Goal myGoal where myGoal.goalname like ?1"),
		@NamedQuery(name = "findGoalByPrimaryKey", query = "select myGoal from Goal myGoal where myGoal.goalid = ?1") })

@Table(schema = "public", name = "goal")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Goal")

public class Goal implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The goalid. */

	@Column(name = "goalid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer goalid;
	
	/** The goalname. */

	@Column(name = "goalname", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String goalname;
	
	/** The goaldescription. */

	@Column(name = "goaldescription", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String goaldescription;

	/** The diary. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "iddiary", referencedColumnName = "iddiary", nullable = false) })
	@XmlTransient
	Diary diary;

	/**
	 * Sets the goalid.
	 *
	 * @param goalid the new goalid
	 */
	public void setGoalid(Integer goalid) {
		this.goalid = goalid;
	}

	/**
	 * Gets the goalid.
	 *
	 * @return the goalid
	 */
	public Integer getGoalid() {
		return this.goalid;
	}

	/**
	 * Sets the goalname.
	 *
	 * @param goalname the new goalname
	 */
	public void setGoalname(String goalname) {
		this.goalname = goalname;
	}

	/**
	 * Gets the goalname.
	 *
	 * @return the goalname
	 */
	public String getGoalname() {
		return this.goalname;
	}

	/**
	 * Sets the goaldescription.
	 *
	 * @param goaldescription the new goaldescription
	 */
	public void setGoaldescription(String goaldescription) {
		this.goaldescription = goaldescription;
	}

	/**
	 * Gets the goaldescription.
	 *
	 * @return the goaldescription
	 */
	public String getGoaldescription() {
		return this.goaldescription;
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
	 * Instantiates a new goal.
	 */
	public Goal() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Goal that) {
		setGoalid(that.getGoalid());
		setGoalname(that.getGoalname());
		setGoaldescription(that.getGoaldescription());
		setDiary(that.getDiary());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("goalid=[").append(goalid).append("] ");
		buffer.append("goalname=[").append(goalname).append("] ");
		buffer.append("goaldescription=[").append(goaldescription).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((goalid == null) ? 0 : goalid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Goal))
			return false;
		Goal equalCheck = (Goal) obj;
		if ((goalid == null && equalCheck.goalid != null) || (goalid != null && equalCheck.goalid == null))
			return false;
		if (goalid != null && !goalid.equals(equalCheck.goalid))
			return false;
		return true;
	}
}
