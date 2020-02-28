package com.popups.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.popups.model.User;
import com.popups.services.UserService;
@Component
public class UserServiceDaoImpl implements UserService {
	
	@Autowired
	SessionFactory sessionfactory;

	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean changePassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean blockAdd(int brandId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

}
