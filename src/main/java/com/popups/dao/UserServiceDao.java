package com.popups.dao;

import com.popups.model.User;



public interface UserServiceDao {
	boolean register(User user);
	boolean signIn(String userName,String password);
	boolean changePassword(String password);
	boolean blockAdd(int brandId);
}
