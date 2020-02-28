package com.popups.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.popups.dao.UserServiceDao;
import com.popups.model.User;

@Component
@Service ("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserServiceDao userDao;
	
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
