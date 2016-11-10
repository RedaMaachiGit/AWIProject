package com.aiop.yourtask.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class Activity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="activityId")
	private int activityId;

	@Column(name="activityName")
	private String activityName;
	
	@Column(name="activityDescription")
	private String activityDescription;
	
	@Column(name="activityVisibility")
	private Boolean activityVisibility;
	
	@Column(name="userId")
	private int userId;
	
	
	
	public Activity() {}
	
	public Activity(int activityId, String activityName, String activityDescription, Boolean activityVisibility,
			int userId) {
		this.activityId = activityId;
		this.activityName = activityName;
		this.activityDescription = activityDescription;
		this.activityVisibility = activityVisibility;
		this.userId = userId;
	}
	
	
	public Activity(String activityName, String activityDescription, Boolean activityVisibility, int userId) {
		this.activityName = activityName;
		this.activityDescription = activityDescription;
		this.activityVisibility = activityVisibility;
		this.userId = userId;
	}

	public int getActivityId() {
		return activityId;
	}



	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}



	public String getActivityName() {
		return activityName;
	}



	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}



	public String getActivityDescription() {
		return activityDescription;
	}



	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}



	public Boolean getActivityVisibility() {
		return activityVisibility;
	}



	public void setActivityVisibility(Boolean activityVisibility) {
		this.activityVisibility = activityVisibility;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", activityName=" + activityName + ", activityDescription="
				+ activityDescription + ", activityVisibility=" + activityVisibility + ", userId=" + userId + "]";
	}
	
	
}