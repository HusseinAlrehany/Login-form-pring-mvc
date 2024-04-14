package com.login.form.service;

import com.login.form.entity.UserProfile;

public interface UserService {

	void saveUser(UserProfile theUser);

	boolean validateUser(String userName,String passWord);

}
