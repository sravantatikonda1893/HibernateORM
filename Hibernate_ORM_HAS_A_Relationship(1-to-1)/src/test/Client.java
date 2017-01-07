package test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Vote;
import beans.Voter;

public class Client {

	public static void main(String[] args) {
//Associating 2 votes with same voter
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		Create a voter object
		Voter vr=new Voter();
		vr.setvId(1);
		vr.setvName("sravan");
		vr.setvAge(24);
//		create vote and use voter reference
		Vote v1=new Vote();
		v1.setPartyName("TRS");
		v1.setCastDate(new Date());
		v1.setVoter(vr);
		
/* this operation is not possible
 * 		Vote v2=new Vote();
		v2.setPartyName("TRS");
		v2.setCastDate(new Date());
		v2.setVoter(vr);
Only one vote can be casted by an voter for this reason this is commented. This constarint of one-to-one is specified in 
vote.hbm.xml file
*/
		s.save(vr);
		s.save(v1);
//		s.save(v2);
		
		t.commit();
		s.close();
		sf.close();
	}

}
