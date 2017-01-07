package test;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Faculty;

public class Client {

	public static void main(String[] args) {
//One course can be taught by any number of faculty and one faculty can teach any number of courses
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Course c1=new Course();
		c1.setCid(1);
		c1.setCname("java");
		c1.setFee(2000);
		
		Course c2=new Course();
		c2.setCid(2);
		c2.setCname("C");
		c2.setFee(3000);

		Course c3=new Course();
		c3.setCid(3);
		c3.setCname("C++");
		c3.setFee(20000);
		
		Course c4=new Course();
		c4.setCid(4);
		c4.setCname("Hibernate");
		c4.setFee(200000);
		Set<Course> cset=new HashSet<Course>();
		cset.add(c1);
		cset.add(c2);
		Set<Course> cset1=new HashSet<Course>();
		cset1.add(c2);
		cset1.add(c3);
		cset1.add(c4);
//		creating two faculty objects and the above created courses to them
		Faculty f1=new Faculty();
		f1.setFid(1);
		f1.setExp(3);
		f1.setFname("Ram");
		f1.setCourses(cset);

		Faculty f2=new Faculty();
		f2.setFid(2);
		f2.setExp(4);
		f2.setFname("Ramya");
		f2.setCourses(cset1);
		s.saveOrUpdate(f1);
		s.saveOrUpdate(f2);
		s.saveOrUpdate(c1);
		s.saveOrUpdate(c2);
		s.saveOrUpdate(c3);
		s.saveOrUpdate(c4);
		t.commit();
		s.close();
		sf.close();
 	}

}
