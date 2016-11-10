package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scinfo")
public class Scinfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="scinfoId")
	private int scinfoId;

	@Column(name="scinfoSiret")
	private String scinfoSiret;
	
	@Column(name="scinfoActivityDomain")
	private String scinfoActivityDomain;
	
	@Column(name="scinfoWebsite")
	private String scinfoWebsite;
	
	@Column(name="userId")
	private int userId;

	public Scinfo() {}

	public Scinfo(int scinfoId, String scinfoSiret, String scinfoActivityDomain, String scinfoWebsite, int userId) {
		this.scinfoId = scinfoId;
		this.scinfoSiret = scinfoSiret;
		this.scinfoActivityDomain = scinfoActivityDomain;
		this.scinfoWebsite = scinfoWebsite;
		this.userId = userId;
	}
	
	

	public Scinfo(String scinfoSiret, String scinfoActivityDomain, String scinfoWebsite, int userId) {
		this.scinfoSiret = scinfoSiret;
		this.scinfoActivityDomain = scinfoActivityDomain;
		this.scinfoWebsite = scinfoWebsite;
		this.userId = userId;
	}

	public int getScinfoId() {
		return scinfoId;
	}

	public void setScinfoId(int scinfoId) {
		this.scinfoId = scinfoId;
	}

	public String getScinfoSiret() {
		return scinfoSiret;
	}

	public void setScinfoSiret(String scinfoSiret) {
		this.scinfoSiret = scinfoSiret;
	}

	public String getScinfoActivityDomain() {
		return scinfoActivityDomain;
	}

	public void setScinfoActivityDomain(String scinfoActivityDomain) {
		this.scinfoActivityDomain = scinfoActivityDomain;
	}

	public String getScinfoWebsite() {
		return scinfoWebsite;
	}

	public void setScinfoWebsite(String scinfoWebsite) {
		this.scinfoWebsite = scinfoWebsite;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Scinfo [scinfoId=" + scinfoId + ", scinfoSiret=" + scinfoSiret + ", scinfoActivityDomain="
				+ scinfoActivityDomain + ", scinfoWebsite=" + scinfoWebsite + ", userId=" + userId + "]";
	}
	
	
	
	

	
	
}