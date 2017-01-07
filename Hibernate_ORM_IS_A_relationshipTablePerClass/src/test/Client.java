package test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEmployee;

public class Client {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		HEmployee he= new HEmployee(1, 10000, "sravan", "S@gmail.com", 8);
		SEmployee se=new SEmployee(2, 20000, "srujan","sru@ymail.com", "Spring");
		Admin admin=new Admin(3, "kanna", "k@gmail.com", 30000, "hyd");
		s.save(se);
		s.save(he);
		s.save(admin);
		t.commit();
		s.close();
		sf.close();
 	}

}
