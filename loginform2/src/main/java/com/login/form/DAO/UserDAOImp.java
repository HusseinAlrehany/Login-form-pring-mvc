package com.login.form.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.login.form.entity.UserProfile;

@Repository
public class UserDAOImp implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(UserProfile theUser) {

		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(theUser);

	}

	@Override
	public boolean validateUser(String userName, String passWord) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = currentSession.createQuery("from UserProfile where userName = :userName", UserProfile.class);

		theQuery.setParameter("userName", userName);
		UserProfile user = (UserProfile) theQuery.uniqueResult();

		if (user != null) {
			return user.getPassWord().equals(passWord);
		}
		return false;

	}

}
