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
 * The Class Notification.
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllNotifications", query = "select myNotification from Notification myNotification"),
		@NamedQuery(name = "findNotificationByPrimaryKey", query = "select myNotification from Notification myNotification where myNotification.notificationid = ?1") })

@Table(schema = "public", name = "notification")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Notification")

public class Notification implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The notificationid. */

	@Column(name = "notificationid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer notificationid;
	
	/** The notificationseen. */

	@Column(name = "notificationseen", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean notificationseen;
	
	/** The notificationcontent. */

	@Column(name = "notificationcontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String notificationcontent;

	/** The yourtaskuser. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;

	/**
	 * Sets the notificationid.
	 *
	 * @param notificationid the new notificationid
	 */
	public void setNotificationid(Integer notificationid) {
		this.notificationid = notificationid;
	}

	/**
	 * Gets the notificationid.
	 *
	 * @return the notificationid
	 */
	public Integer getNotificationid() {
		return this.notificationid;
	}

	/**
	 * Sets the notificationseen.
	 *
	 * @param notificationseen the new notificationseen
	 */
	public void setNotificationseen(Boolean notificationseen) {
		this.notificationseen = notificationseen;
	}

	/**
	 * Gets the notificationseen.
	 *
	 * @return the notificationseen
	 */
	public Boolean getNotificationseen() {
		return this.notificationseen;
	}

	/**
	 * Sets the notificationcontent.
	 *
	 * @param notificationcontent the new notificationcontent
	 */
	public void setNotificationcontent(String notificationcontent) {
		this.notificationcontent = notificationcontent;
	}

	/**
	 * Gets the notificationcontent.
	 *
	 * @return the notificationcontent
	 */
	public String getNotificationcontent() {
		return this.notificationcontent;
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
	 * Instantiates a new notification.
	 */
	public Notification() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 * @param that the that
	 */
	public void copy(Notification that) {
		setNotificationid(that.getNotificationid());
		setNotificationseen(that.getNotificationseen());
		setNotificationcontent(that.getNotificationcontent());
		setYourtaskuser(that.getYourtaskuser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("notificationid=[").append(notificationid).append("] ");
		buffer.append("notificationseen=[").append(notificationseen).append("] ");
		buffer.append("notificationcontent=[").append(notificationcontent).append("] ");

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((notificationid == null) ? 0 : notificationid.hashCode()));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Notification))
			return false;
		Notification equalCheck = (Notification) obj;
		if ((notificationid == null && equalCheck.notificationid != null) || (notificationid != null && equalCheck.notificationid == null))
			return false;
		if (notificationid != null && !notificationid.equals(equalCheck.notificationid))
			return false;
		return true;
	}
}
