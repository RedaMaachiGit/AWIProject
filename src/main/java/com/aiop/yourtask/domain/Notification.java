
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
		@NamedQuery(name = "findAllNotifications", query = "select myNotification from Notification myNotification"),
		@NamedQuery(name = "findNotificationByPrimaryKey", query = "select myNotification from Notification myNotification where myNotification.notificationid = ?1") })

@Table(schema = "public", name = "notification")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "aiopproject/com/aiop/yourtask/domain", name = "Notification")

public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "notificationid", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer notificationid;
	/**
	 */

	@Column(name = "notificationseen", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean notificationseen;
	/**
	 */

	@Column(name = "notificationcontent", length = 2000, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String notificationcontent;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false) })
	@XmlTransient
	Yourtaskuser yourtaskuser;

	/**
	 */
	public void setNotificationid(Integer notificationid) {
		this.notificationid = notificationid;
	}

	/**
	 */
	public Integer getNotificationid() {
		return this.notificationid;
	}

	/**
	 */
	public void setNotificationseen(Boolean notificationseen) {
		this.notificationseen = notificationseen;
	}

	/**
	 */
	public Boolean getNotificationseen() {
		return this.notificationseen;
	}

	/**
	 */
	public void setNotificationcontent(String notificationcontent) {
		this.notificationcontent = notificationcontent;
	}

	/**
	 */
	public String getNotificationcontent() {
		return this.notificationcontent;
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
	public Notification() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
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
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("notificationid=[").append(notificationid).append("] ");
		buffer.append("notificationseen=[").append(notificationseen).append("] ");
		buffer.append("notificationcontent=[").append(notificationcontent).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((notificationid == null) ? 0 : notificationid.hashCode()));
		return result;
	}

	/**
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
