package com.jy.myzone.pojo;

public class UserInfo {
	private String password;
	private String userID;
	private String userName;
	private String email;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

		
	/**
	 * ·µ»ØUserInfoµÄ×Ö·û´®
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserInfo [email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userID=");
		builder.append(userID);
		builder.append(", userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
}
