package test;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;

public class Client {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		//		create a movie
		Movies m1=new Movies();
		m1.setMid(1);
		m1.setMoviename("PK");
		//		create another movie
		Movies m2=new Movies();
		m2.setMid(2);
		m2.setMoviename("Lagaan");
		//		Add both movies into a set to be added into an actor object
		Set<Movies> set=new HashSet<Movies>();
		set.add(m1);
		set.add(m2);
		//		create an actor object
		Actor a=new Actor();
		a.setAid(1);
		a.setActorname("ameerkhan");
		a.setMovies(set);
		s.save(m1);
		s.save(m2);
		s.save(a);
		t.commit();
		s.close();
		sf.close();
	}

}
