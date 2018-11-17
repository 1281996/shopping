package com.mallika2.sample;

import java.util.Scanner;

public class Manager extends Employee1 {
	double sal;
	Scanner scanner=new Scanner(System.in);
	
	
	 
	 
	 void calSal(){
		 System.out.println("enter per");
		 String perfo=scanner.next();
		 sal=super.msal;
		 
		  switch(perfo){
		  case "good" : sal=sal+1500;
		  System.out.println(sal);
		                 break;
		  case "avg" : sal=sal+1000;
		  System.out.println(sal);
		                 break;
		  case "belowavg" : sal=sal+500;
		  System.out.println(sal);
		                   break;
		          default : sal=sal+0;
		          System.out.println(sal);
		                   break;
		          
		  }
	 }

}
