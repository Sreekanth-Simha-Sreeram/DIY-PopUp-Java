package com.popups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Advertiser")
public class Advertiser {
	
	 @Id
	   @Column(name="advertiserId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   int advertiserId;
	 
	 @Column(name="userName")
	String userName;
	 
	 @Column(name="email")
		String email;
		 
	 @Column(name="password")
		String password;
		 
	 
	 @Column(name="brandId")
    int	brandId;


	public int getAdvertiserId() {
		return advertiserId;
	}


	public void setAdvertiserId(int advertiserId) {
		this.advertiserId = advertiserId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getBrandId() {
		return brandId;
	}


	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}




}
