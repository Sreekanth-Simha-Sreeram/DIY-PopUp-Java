package com.popups.dao;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.popups.model.Advertiser;
import com.popups.model.Brand;
import com.popups.model.Payment;
import com.popups.model.User;
import com.popups.services.AdvertiserService;


@Component
public class AdvertiserServiceDaoImpl implements AdvertiserService {

	@Autowired
	SessionFactory sessionfactory;

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
	public List<User> searchAllUsers(int age, String userName, String gender, String interest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean agreePayment(int advertiserId, int userId, Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
