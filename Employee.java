package com.mallika2.sample;

public class Employee {
	int empId;
	String empName;
	int empAge;
	
	 Employee(){
		 empId=123;
		 empName="mallika";
		 empAge=18;
	 }
	 
	 Employee(int empId,String empName,int empAge){
		 this.empId=empId;
		 this.empName=empName;
		 this.empAge=empAge;
	 }
	 
   public void getEmployeeDetails(){
	   System.out.println(empId);
	   System.out.println(empName);
	   System.out.println(empAge);
   }
   }

