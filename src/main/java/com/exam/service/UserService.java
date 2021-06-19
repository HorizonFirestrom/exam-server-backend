package com.exam.service;

import java.util.Set;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {
	
	//creating user
	public User createUser(User user, Set<UserRole> roles) throws Exception;
	
	//get user by username
	public User getUser(String username);
	
	//delete user by userId
	public void deleteUser(Long userId);

	
	

}
