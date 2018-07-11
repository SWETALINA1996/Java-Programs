package com.bridgelabz.loginregistrationusingmongodb.services;


import com.bridgelabz.loginregistrationusingmongodb.models.User;
import com.bridgelabz.loginregistrationusingmongodb.repositories.UserRepository;
import com.bridgelabz.loginregistrationusingmongodb.repositories.UserRepositoryImplementation;

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
		}	}

	@Override
	public boolean register(User user) {
		return false;
	}

}
