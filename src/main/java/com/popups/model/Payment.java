package com.popups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	
	 @Id
	   @Column(name="paymentId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int paymentId;
	 
	 @Column(name="Pay_per_like")
	int Pay_per_like;
	 
	 @Column(name="Pay_per_view")
	int Pay_per_view;
	 
	 @Column(name="Pay_per_click")
	int Pay_per_click;
	 
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getPay_per_like() {
		return Pay_per_like;
	}
	public void setPay_per_like(int pay_per_like) {
		Pay_per_like = pay_per_like;
	}
	public int getPay_per_view() {
		return Pay_per_view;
	}
	public void setPay_per_view(int pay_per_view) {
		Pay_per_view = pay_per_view;
	}
	public int getPay_per_click() {
		return Pay_per_click;
	}
	public void setPay_per_click(int pay_per_click) {
		Pay_per_click = pay_per_click;
	}

}
