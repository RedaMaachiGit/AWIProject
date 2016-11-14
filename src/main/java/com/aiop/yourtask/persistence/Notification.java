package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notification")
public class Notification {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="notificationId")
	private int notificationId;

	@Column(name="notificationSeen")
	private Boolean notificationSeen;
	
	@Column(name="notificationContent")
	private String notificationContent;

	@Column(name="userId")
	private int userId;

	
	public Notification() {}


	public Notification(int notificationId, Boolean notificationSeen, String notificationContent, int userId) {
		this.notificationId = notificationId;
		this.notificationSeen = notificationSeen;
		this.notificationContent = notificationContent;
		this.userId = userId;
	}


	public Notification(Boolean notificationSeen, String notificationContent, int userId) {
		super();
		this.notificationSeen = notificationSeen;
		this.notificationContent = notificationContent;
		this.userId = userId;
	}


	public int getNotificationId() {
		return notificationId;
	}


	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}


	public Boolean getNotificationSeen() {
		return notificationSeen;
	}


	public void setNotificationSeen(Boolean notificationSeen) {
		this.notificationSeen = notificationSeen;
	}


	public String getNotificationContent() {
		return notificationContent;
	}


	public void setNotificationContent(String notificationContent) {
		this.notificationContent = notificationContent;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", notificationSeen=" + notificationSeen
				+ ", notificationContent=" + notificationContent + ", userId=" + userId + "]";
	}
	
	
	
	
}