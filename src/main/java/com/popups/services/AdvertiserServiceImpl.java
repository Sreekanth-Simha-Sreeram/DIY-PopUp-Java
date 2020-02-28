package com.popups.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.popups.dao.AdvertiserServiceDao;
import com.popups.model.Advertiser;
import com.popups.model.Brand;
import com.popups.model.Payment;
import com.popups.model.User;

@Component
@Service ("AdvertiserService")
public class AdvertiserServiceImpl implements AdvertiserService {

	@Autowired
	AdvertiserServiceDao advertiserDao;
	
	@Transactional
	public boolean register(Advertiser advertiser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean postAdvertise(List<Brand> brand, List<User> user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Transactional
	public boolean agreePayment(int advertiserId, int userId, Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> searchAllUsers(int age, String userName, String gender, String interest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
