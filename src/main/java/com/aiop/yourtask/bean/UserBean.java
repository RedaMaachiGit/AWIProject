package com.aiop.yourtask.bean;


/**
 * @author Babacar THIAW
 *
 */
public class UserBean {
	private int userId;
	private String userDateofbirth;
	private String userPhonenumber;
	private String userEmail;
	private String userStreetnumber;
	private String userZipcode;
	private String userCity;
	private String userUsername;
	private String userPassword;
	private String userToken;
	private String userLastconnectiondate;
	private String userType;
	private String userIban;
	private int roleId;
	
	public UserBean(){

		this.roleId = 1;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserDateofbirth() {
		return userDateofbirth;
	}
	public void setUserDateofbirth(String userDateofbirth) {
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
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserZipcode() {
		return userZipcode;
	}
	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
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
	public String getUserLastconnectiondate() {
		return userLastconnectiondate;
	}
	public void setUserLastconnectiondate(String userLastconnectiondate) {
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
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	

}
