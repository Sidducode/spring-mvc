package com.spring.user.Dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.user.Dao.UserDao;
import com.spring.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int createuser(User user) {
		int save=(Integer) hibernateTemplate.save(user);
		return save;
	}
	
	

}
