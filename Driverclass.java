package com.hibernate.com.hibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driverclass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Students student1=new Students();
		student1.setName("suneeta");
		student1.setRollnumber(21);
		student1.setMailId("suneethabandaru");
		
		 
	       Configuration config =new Configuration().configure().addAnnotatedClass(Students.class);
	       SessionFactory sessionFact=config.buildSessionFactory();
	       Session session=sessionFact.openSession();
	      session.beginTransaction();
	      System.out.println(student1);
	      session.save(student1);
	      session.getTransaction().commit();
	      

	}

}
