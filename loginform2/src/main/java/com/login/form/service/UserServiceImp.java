package com.login.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.form.DAO.UserDAO;
import com.login.form.entity.UserProfile;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public void saveUser(UserProfile theUser) {

		userDAO.saveUser(theUser);

	}

	@Override
	@Transactional
	public boolean validateUser(String userName, String passWord) {

		return userDAO.validateUser(userName, passWord);

	}

}
