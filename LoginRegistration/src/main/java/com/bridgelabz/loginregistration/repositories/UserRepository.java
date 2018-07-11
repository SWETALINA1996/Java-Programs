package com.bridgelabz.loginregistration.repositories;

import com.bridgelabz.loginregistration.models.User;

public interface UserRepository 
{

	public User getUser(String emailId);
	public boolean saveUser(User user);
	

}
