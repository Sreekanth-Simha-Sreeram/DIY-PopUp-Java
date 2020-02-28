package com.popups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="brandId")
public class Brand {
	
	   @Id
	   @Column(name="brandId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
      int brandId;
	
	 @Column(name="brandName")
     String brandName;
	 
	 @Column(name="brandDescription")
      String brandDescription;

	 @Column(name="advertiserId")
     int advertiserId;
	 
	 @Column(name="image")
     String image;
	 
	 @Column(name="video")
     String video;

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public int getAdvertiserId() {
		return advertiserId;
	}

	public void setAdvertiserId(int advertiserId) {
		this.advertiserId = advertiserId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	 
	 


}
