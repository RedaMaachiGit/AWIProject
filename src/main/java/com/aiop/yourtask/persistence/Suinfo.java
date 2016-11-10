package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suinfo")
public class Suinfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="suinfoId")
	private int suinfoId;

	@Column(name="suinfoFirstname")
	private String suinfoFirstname;
	
	@Column(name="suinfoLastname")
	private String suinfoLastname;

	public Suinfo() {}

	public Suinfo(int suinfoId, String suinfoFirstname, String suinfoLastname) {
		this.suinfoId = suinfoId;
		this.suinfoFirstname = suinfoFirstname;
		this.suinfoLastname = suinfoLastname;
	}

	public Suinfo(String suinfoFirstname, String suinfoLastname) {
		super();
		this.suinfoFirstname = suinfoFirstname;
		this.suinfoLastname = suinfoLastname;
	}

	public int getSuinfoId() {
		return suinfoId;
	}

	public void setSuinfoId(int suinfoId) {
		this.suinfoId = suinfoId;
	}

	public String getSuinfoFirstname() {
		return suinfoFirstname;
	}

	public void setSuinfoFirstname(String suinfoFirstname) {
		this.suinfoFirstname = suinfoFirstname;
	}

	public String getSuinfoLastname() {
		return suinfoLastname;
	}

	public void setSuinfoLastname(String suinfoLastname) {
		this.suinfoLastname = suinfoLastname;
	}

	@Override
	public String toString() {
		return "Suinfo [suinfoId=" + suinfoId + ", suinfoFirstname=" + suinfoFirstname + ", suinfoLastname="
				+ suinfoLastname + "]";
	}
	
	
		
}