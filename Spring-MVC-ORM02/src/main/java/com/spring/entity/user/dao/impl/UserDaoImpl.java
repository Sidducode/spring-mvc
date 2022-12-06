package com.spring.entity.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.user.dao.UserDao;
import com.spring.entity.user.entity.User;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		int save=(Integer) hibernateTemplate.save(user);
		
		return save;
	}

	@Override
	public List<User> findall() {
		return hibernateTemplate.loadAll(User.class);
	}
}
