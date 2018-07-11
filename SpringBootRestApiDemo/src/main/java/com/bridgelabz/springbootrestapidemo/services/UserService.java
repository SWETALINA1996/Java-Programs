package com.bridgelabz.springbootrestapidemo.services;

import java.util.List;

import com.bridgelabz.springbootrestapidemo.models.User;

public interface UserService 
{
public List<User> findAllUsers();
public User findById(int id);
public void deleteUserById(int id);
public void deleteAllUsers();
public void updateUser(User user);
public void create();

}
