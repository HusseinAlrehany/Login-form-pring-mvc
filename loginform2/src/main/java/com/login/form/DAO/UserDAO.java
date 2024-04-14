package com.login.form.DAO;

import com.login.form.entity.UserProfile;

public interface UserDAO {

	void saveUser(UserProfile theUser);

	boolean validateUser(String userName,String passWord);

}
