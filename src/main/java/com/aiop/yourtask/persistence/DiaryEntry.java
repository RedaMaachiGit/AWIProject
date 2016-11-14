package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diaryentry")
public class DiaryEntry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="diaryEntryId")
	private int diaryEntryId;

	@Column(name="diaryEntryDate")
	private Date diaryEntryDate;
	
	@Column(name="diaryEntryContent")
	private String diaryEntryContent;
	
	@Column(name="diaryEntryVisibility")
	private Boolean diaryEntryVisibility;

	@Column(name="idDiary")
	private int diaryId;
	
	
	public DiaryEntry() {}


	public DiaryEntry(int diaryEntryId, Date diaryEntryDate, String diaryEntryContent, Boolean diaryEntryVisibility,
			int diaryId) {
		this.diaryEntryId = diaryEntryId;
		this.diaryEntryDate = diaryEntryDate;
		this.diaryEntryContent = diaryEntryContent;
		this.diaryEntryVisibility = diaryEntryVisibility;
		this.diaryId = diaryId;
	}


	public DiaryEntry(Date diaryEntryDate, String diaryEntryContent, Boolean diaryEntryVisibility, int diaryId) {
		this.diaryEntryDate = diaryEntryDate;
		this.diaryEntryContent = diaryEntryContent;
		this.diaryEntryVisibility = diaryEntryVisibility;
		this.diaryId = diaryId;
	}


	public int getDiaryEntryId() {
		return diaryEntryId;
	}


	public void setDiaryEntryId(int diaryEntryId) {
		this.diaryEntryId = diaryEntryId;
	}


	public Date getDiaryEntryDate() {
		return diaryEntryDate;
	}


	public void setDiaryEntryDate(Date diaryEntryDate) {
		this.diaryEntryDate = diaryEntryDate;
	}


	public String getDiaryEntryContent() {
		return diaryEntryContent;
	}


	public void setDiaryEntryContent(String diaryEntryContent) {
		this.diaryEntryContent = diaryEntryContent;
	}


	public Boolean getDiaryEntryVisibility() {
		return diaryEntryVisibility;
	}


	public void setDiaryEntryVisibility(Boolean diaryEntryVisibility) {
		this.diaryEntryVisibility = diaryEntryVisibility;
	}


	public int getDiaryId() {
		return diaryId;
	}


	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
	}


	@Override
	public String toString() {
		return "DiaryEntry [diaryEntryId=" + diaryEntryId + ", diaryEntryDate=" + diaryEntryDate
				+ ", diaryEntryContent=" + diaryEntryContent + ", diaryEntryVisibility=" + diaryEntryVisibility
				+ ", diaryId=" + diaryId + "]";
	}


}