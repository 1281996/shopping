package com.mallika2.sample;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   
		    
		    
    Employee e=new Employee();
        e.getEmployeeDetails();
     Employee e1=new Employee(1234,"santhi",23);
        e1.getEmployeeDetails();
        System.out.println("enter emp id:");
        int emp1Id=sc.nextInt();
        
        System.out.println("enter emp name:");
        String emp1Name=sc.next();
      
      System.out.println("enter emp age:");
	    int emp1Age=sc.nextInt();
	    
	   
	    System.out.println(" emp id"+emp1Id);
	    System.out.println(" emp name"+emp1Name);
	    System.out.println(" emp age"+emp1Age);
        
	    Employee employee=new Employee();
        
	}

}
