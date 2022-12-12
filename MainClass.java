package com.hibernate.com.hibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Software details = new Software();
		details.setSoftwarename("java");
		details.setCompanyname("wipro");
		details.setPrice(3000);
		details.setSoftware_id(12);
		details.setSoftwaredescription("to write programes");
		details.setRating(4);
		details.setStock(200);
		
		
		Configuration config =new Configuration().configure().addAnnotatedClass(Software.class);
	       SessionFactory sessionFact=config.buildSessionFactory();
	       Session session=sessionFact.openSession();
	       Transaction transaction=session.beginTransaction();
	       Integer software_id=(Integer) session.save(details);
	       System.out.println(software_id);	
	transaction.commit();
	}
}

