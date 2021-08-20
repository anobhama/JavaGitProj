package com.lti.user;

import javax.persistence.*;

import com.lti.entity.Contract_Employee;
import com.lti.entity.Employee;
import com.lti.entity.Regular_Employee;

public class UserApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		
			Employee e1=new Employee();  
		    e1.setName("Sanjana");  
		      
		    Regular_Employee r2=new Regular_Employee();  
		    r2.setName("Gamana");  
		    r2.setSalary(50000);  
		    r2.setBonus(5);  
		      
		    Contract_Employee e3=new Contract_Employee();  
		    e3.setName("Sumeet");  
		    e3.setPay_per_hour(1000);  
		    e3.setContract_duration("15 hours");  
		      
		    em.persist(e1);  
		    em.persist(r2);  
		    em.persist(e3);  
		
		
		em.getTransaction().commit();
	}
}
