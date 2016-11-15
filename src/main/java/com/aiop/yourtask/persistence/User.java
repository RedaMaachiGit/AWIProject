package com.aiop.yourtask.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="yourtaskuser")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	@Column(name="userDateofbirth")
	private Date userDateofbirth;
	
	@Column(name="userPhonenumber")
	private String userPhonenumber;
	
	@Column(name="userEmail")
	private String userEmail;
	
	@Column(name="userStreetnumber")
	private String userStreetnumber;
	
	@Column(name="userZipcode")
	private String userZipcode;
	
	@Column(name="userCity")
	private String userCity;
	
	@Column(name="userUsername")
	private String userUsername;
	
	@Column(name="userPassword")
	private String userPassword;
	
	@Column(name="userToken")
	private String userToken;
	
	@Column(name="userLastconnectiondate")
	private Date userLastconnectiondate;
	
	@Column(name="userType")
	private String userType;
	
	@Column(name="userIban")
	private String userIban;
	
	@Column(name="roleId")
	private int roleId;
	
	public User() {}

	public User(int userId, Date userDateofbirth, String userPhonenumber, String userEmail, String userStreetnumber,
			String userZipcode, String userCity, String userUsername, String userPassword, String userToken,
			Date userLastconnectiondate, String userType, String userIban, int roleId) {
		this.userId = userId;
		this.userDateofbirth = userDateofbirth;
		this.userPhonenumber = userPhonenumber;
		this.userEmail = userEmail;
		this.userStreetnumber = userStreetnumber;
		this.userZipcode = userZipcode;
		this.userCity = userCity;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userToken = userToken;
		this.userLastconnectiondate = userLastconnectiondate;
		this.userType = userType;
		this.userIban = userIban;
		this.roleId = roleId;
	}

	public User(Date userDateofbirth, String userPhonenumber, String userEmail, String userStreetnumber,
			String userZipcode, String userCity, String userUsername, String userPassword, String userToken,
			Date userLastconnectiondate, String userType, String userIban, int roleId) {
		this.userDateofbirth = userDateofbirth;
		this.userPhonenumber = userPhonenumber;
		this.userEmail = userEmail;
		this.userStreetnumber = userStreetnumber;
		this.userZipcode = userZipcode;
		this.userCity = userCity;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userToken = userToken;
		this.userLastconnectiondate = userLastconnectiondate;
		this.userType = userType;
		this.userIban = userIban;
		this.roleId = roleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getUserDateofbirth() {
		return userDateofbirth;
	}

	public void setUserDateofbirth(Date userDateofbirth) {
		this.userDateofbirth = userDateofbirth;
	}

	public String getUserPhonenumber() {
		return userPhonenumber;
	}

	public void setUserPhonenumber(String userPhonenumber) {
		this.userPhonenumber = userPhonenumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserStreetnumber() {
		return userStreetnumber;
	}

	public void setUserStreetnumber(String userStreetnumber) {
		this.userStreetnumber = userStreetnumber;
	}

	public String getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public Date getUserLastconnectiondate() {
		return userLastconnectiondate;
	}

	public void setUserLastconnectiondate(Date userLastconnectiondate) {
		this.userLastconnectiondate = userLastconnectiondate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserIban() {
		return userIban;
	}

	public void setUserIban(String userIban) {
		this.userIban = userIban;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userDateofbirth=" + userDateofbirth + ", userPhonenumber="
				+ userPhonenumber + ", userEmail=" + userEmail + ", userStreetnumber=" + userStreetnumber
				+ ", userZipcode=" + userZipcode + ", userCity=" + userCity + ", userUsername=" + userUsername
				+ ", userPassword=" + userPassword + ", userToken=" + userToken + ", userLastconnectiondate="
				+ userLastconnectiondate + ", userType=" + userType + ", userIban=" + userIban + ", roleId=" + roleId
				+ "]";
	}
	
	

	
}