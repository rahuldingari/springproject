package com.original.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.original.pojo.Login;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired(required = true)
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean login(Login si) {
		Session session=sessionFactory.getCurrentSession();
	    org.hibernate.query.Query q=session.createQuery("from User where email= :email");
	    		if(q!=null) {
	    			return true;
	    		}
	    		else
	    			return false;
	}

}

