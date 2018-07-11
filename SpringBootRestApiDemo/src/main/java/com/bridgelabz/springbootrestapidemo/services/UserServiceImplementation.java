package com.bridgelabz.springbootrestapidemo.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.springbootrestapidemo.models.User;

public class UserServiceImplementation implements UserService
{

	@Override
	public List<User> findAllUsers() 
	{
		List<User> userList = new ArrayList<>();
		
		return null;
	}

	@Override
	public User findById(int id)
	{
		return null;
	}

	@Override
	public void deleteUserById(int id) {
		
	}

	@Override
	public void deleteAllUsers() {
		
	}

	@Override
	public void updateUser(User user) {
		
	}

	@Override
	public void create() {
		
	}

}
