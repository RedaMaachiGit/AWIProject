package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diaryresource")
public class DiaryResource {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idDiaryResource")
	private int diaryResourceId;

	@Column(name="typeDiaryResource")
	private String diaryResourceType;
	
	@Column(name="urlDiaryResource")
	private String diaryResourceUrl;

	@Column(name="diaryEntryId")
	private int diaryEntryId;
	
	
	public DiaryResource() {}


	public DiaryResource(int diaryResourceId, String diaryResourceType, String diaryResourceUrl, int diaryEntryId) {
		this.diaryResourceId = diaryResourceId;
		this.diaryResourceType = diaryResourceType;
		this.diaryResourceUrl = diaryResourceUrl;
		this.diaryEntryId = diaryEntryId;
	}


	public DiaryResource(String diaryResourceType, String diaryResourceUrl, int diaryEntryId) {
		this.diaryResourceType = diaryResourceType;
		this.diaryResourceUrl = diaryResourceUrl;
		this.diaryEntryId = diaryEntryId;
	}


	public int getDiaryResourceId() {
		return diaryResourceId;
	}


	public void setDiaryResourceId(int diaryResourceId) {
		this.diaryResourceId = diaryResourceId;
	}


	public String getDiaryResourceType() {
		return diaryResourceType;
	}


	public void setDiaryResourceType(String diaryResourceType) {
		this.diaryResourceType = diaryResourceType;
	}


	public String getDiaryResourceUrl() {
		return diaryResourceUrl;
	}


	public void setDiaryResourceUrl(String diaryResourceUrl) {
		this.diaryResourceUrl = diaryResourceUrl;
	}


	public int getDiaryEntryId() {
		return diaryEntryId;
	}


	public void setDiaryEntryId(int diaryEntryId) {
		this.diaryEntryId = diaryEntryId;
	}


	@Override
	public String toString() {
		return "DiaryResource [diaryResourceId=" + diaryResourceId + ", diaryResourceType=" + diaryResourceType
				+ ", diaryResourceUrl=" + diaryResourceUrl + ", diaryEntryId=" + diaryEntryId + "]";
	}

	
}