package com.bridgelabz.loginregistration.services;

import org.springframework.stereotype.Repository;

import com.bridgelabz.loginregistration.models.User;
import com.bridgelabz.loginregistration.repositories.UserRepository;
import com.bridgelabz.loginregistration.repositories.UserRepositoryImplementation;

@Repository
public class UserServiceImplementation implements UserService
{

	@Override
	public User login(String emailId, String password) {
		
		UserRepository repository = new UserRepositoryImplementation();
		User user = repository.getUser(emailId);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}

	@Override
	public boolean register(User user) 
	{
		
		UserRepository repository = new UserRepositoryImplementation();
		User checkUser = repository.getUser(user.getEmailId());
		if(checkUser != null)
		{
			return false;
		}
		else {
			repository.saveUser(user);
			return true;
		}
	}
	
}
