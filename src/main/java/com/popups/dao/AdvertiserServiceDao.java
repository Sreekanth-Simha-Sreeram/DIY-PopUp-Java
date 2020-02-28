package com.popups.dao;

import java.util.List;

import com.popups.model.Advertiser;
import com.popups.model.Brand;
import com.popups.model.Payment;
import com.popups.model.User;


public interface AdvertiserServiceDao {
	 boolean register(Advertiser advertiser);
	 boolean signIn(String userName,String password);
	 public boolean postAdvertise(List<Brand>brand,List<User>user);
	 public List<User> searchAllUsers(int age,String userName,String gender,String interest);
	 public boolean agreePayment(int advertiserId ,int userId,Payment payment);
	

}
