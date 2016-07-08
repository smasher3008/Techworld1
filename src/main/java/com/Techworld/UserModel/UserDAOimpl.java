package com.Techworld.UserModel;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAOimpl implements UserDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Transactional
	public void insert(User u) {
		// TODO Auto-generated method stub

		sessionfactory.getCurrentSession().saveOrUpdate(u);
		
	}

	@Transactional
	public void delete(User u) {
		// TODO Auto-generated method stub
		
	}

}
