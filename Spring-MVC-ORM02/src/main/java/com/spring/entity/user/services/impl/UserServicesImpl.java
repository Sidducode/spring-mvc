package com.spring.entity.user.services.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.user.dao.UserDao;
import com.spring.entity.user.entity.User;
import com.spring.entity.user.services.UserServices;


@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDao  dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return 	dao.create(user);
		
	}

	@Override
	public List<User> getUsers() {
		
		List<User> listofusers = dao.findall();
		Collections.sort(listofusers);
		return listofusers;
	}
}
