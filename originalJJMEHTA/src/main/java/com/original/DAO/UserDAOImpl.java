package com.original.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.original.pojo.User;
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired(required = true)
	SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void register(User ca) 
	{
		
		sessionFactory.getCurrentSession().save(ca);
		
		
	}

}

