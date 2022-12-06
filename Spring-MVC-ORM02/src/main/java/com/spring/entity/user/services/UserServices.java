package com.spring.entity.user.services;

import java.util.List;

import com.spring.entity.user.entity.User;

public interface UserServices {

	int save(User user);
	
	List<User> getUsers();
}
