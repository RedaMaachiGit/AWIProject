package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diary")
public class Diary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idDiary")
	private int diaryId;

	@Column(name="diaryName")
	private String diaryName;
	
	@Column(name="diaryDate")
	private Date diaryDate;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="activityId")
	private int activityId;
	
	
	public Diary() {}


	public Diary(int diaryId, String diaryName, Date diaryDate, int userId, int activityId) {
		this.diaryId = diaryId;
		this.diaryName = diaryName;
		this.diaryDate = diaryDate;
		this.userId = userId;
		this.activityId = activityId;
	}


	public Diary(String diaryName, Date diaryDate, int userId, int activityId) {
		this.diaryName = diaryName;
		this.diaryDate = diaryDate;
		this.userId = userId;
		this.activityId = activityId;
	}


	public int getDiaryId() {
		return diaryId;
	}


	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
	}


	public String getDiaryName() {
		return diaryName;
	}


	public void setDiaryName(String diaryName) {
		this.diaryName = diaryName;
	}


	public Date getDiaryDate() {
		return diaryDate;
	}


	public void setDiaryDate(Date diaryDate) {
		this.diaryDate = diaryDate;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getActivityId() {
		return activityId;
	}


	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}


	@Override
	public String toString() {
		return "Diary [diaryId=" + diaryId + ", diaryName=" + diaryName + ", diaryDate=" + diaryDate + ", userId="
				+ userId + ", activityId=" + activityId + "]";
	}



}