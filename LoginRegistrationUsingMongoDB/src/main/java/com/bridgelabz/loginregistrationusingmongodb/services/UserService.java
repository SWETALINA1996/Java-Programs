package com.bridgelabz.loginregistrationusingmongodb.services;

import com.bridgelabz.loginregistrationusingmongodb.models.User;

public interface UserService 
{
	public User login(String emailId, String password);
	public boolean register(User user);
}
