package com.mvc_orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc_orm.dao.UserDao;
import com.mvc_orm.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public int createUser(User user)
	{
		return userDao.saveUser(user);
	}

}
