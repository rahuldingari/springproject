package com.original.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.original.pojo.SubData;



@Repository
public class EcommerceDAOImpl implements EcommerceDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")

	@Transactional
	public List<SubData> listDesign(String pro_type) {
		Session session =this.sessionFactory.getCurrentSession();
		Query query=session.createQuery("from SubData where pro_type='"+pro_type+"'"); 
		List<SubData> list2=query.list();
				 return list2;
	}
	@Transactional
	public List<SubData> listProducts(int prod_id) {
		Session session =this.sessionFactory.getCurrentSession();
		Query query=session.createQuery("from SubData where prod_id='"+prod_id+"'"); 
		List<SubData> list2=query.list();
				 return list2;
	}


}
