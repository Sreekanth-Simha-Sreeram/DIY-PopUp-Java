package com.popups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	 @Id
	   @Column(name="userId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int	userId;
	 
	 @Column(name="userName")
    String userName;
	 
	 @Column(name="interest")
    String interest;
	 
	 @Column(name="Gender")
    String Gender;
	 
	 @Column(name="age")
	int age;
	 
	 @Column(name="location")
	String location;
	 
	 @Column(name="familystatus")
	String familystatus;
	 
	 @Column(name="password")
    String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFamilystatus() {
		return familystatus;
	}
	public void setFamilystatus(String familystatus) {
		this.familystatus = familystatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
