package com.placideh.hibernate7;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con= new Configuration().configure()
    			.addAnnotatedClass(Alien.class)
    			.addAnnotatedClass(Laptop.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session =sf.openSession();
    	session.beginTransaction();
    	
    	
		
		  Alien a=session.get(Alien.class,1);
		  
		  System.out.println(a);
//		  //this is for Lazy Fetch
//		  Collection<Laptop> laptops=a.getLaptops();
//		  
//		  for(Laptop l: laptops) { System.out.println(l); }
		 
    	
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
