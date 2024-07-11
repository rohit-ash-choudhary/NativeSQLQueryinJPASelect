package com.sp.main.NativeSQLQueryinJPASelect;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sp.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("main-persistence");
       EntityManager em=emf.createEntityManager();
       
       try{
    	  String native_sql_uqery="select * from Employee_details";
    	  Query query= em.createNativeQuery(native_sql_uqery, Employee.class);
    	   List<Employee> emp_DE=query.getResultList();
    	   
    	   for(Employee emp: emp_DE)
    	   { 
    		  System.out.println("Id "+emp.getEmployee_id());
    		  System.out.println("Id "+emp.getEmployee_id());
    		  
    		  System.out.println("--------------------------------");
    	   }
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
       finally{
    	   
       }
    }
}
