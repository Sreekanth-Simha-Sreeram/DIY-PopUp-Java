package com.popups.services;

import com.popups.model.User;

public interface UserService {


boolean register(User user);
boolean signIn(String userName,String password);
boolean changePassword(String password);
boolean blockAdd(int brandId);
}
