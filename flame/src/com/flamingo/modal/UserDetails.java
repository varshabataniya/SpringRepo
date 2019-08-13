package com.flamingo.modal;

public class UserDetails {
	private int userId;
	private String EmailId;
	private String name;
	private int age;
	private String gender;
	private long mobilenNumber;

	
	
	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getEmailId() {
		return EmailId;
	}



	public void setEmailId(String emailId) {
		EmailId = emailId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public long getMobilenNumber() {
		return mobilenNumber;
	}



	public void setMobilenNumber(long mobilenNumber) {
		this.mobilenNumber = mobilenNumber;
	}



	public UserDetails(int userId, String emailId, String name, int age, String gender, long mobilenNumber) {
		super();
		this.userId = userId;
		EmailId = emailId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobilenNumber = mobilenNumber;
	}

	
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
		
	}
}
