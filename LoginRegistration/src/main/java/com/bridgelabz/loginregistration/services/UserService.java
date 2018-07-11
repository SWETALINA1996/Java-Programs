package com.bridgelabz.loginregistration.services;

import com.bridgelabz.loginregistration.models.User;

public interface UserService 
{
	public User login(String emailId, String password);
	public boolean register(User user);
}
