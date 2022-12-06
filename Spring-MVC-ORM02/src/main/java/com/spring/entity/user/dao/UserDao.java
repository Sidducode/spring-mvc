package com.spring.entity.user.dao;

import java.util.List;

import com.spring.entity.user.entity.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> findall();

}
