package com.mallika.ds;

import java.util.Scanner;

public class StudentSubSumAvg9 {

	String name;
	int roll_no;
	int sub1,sub2,sub3;
	int total;
	float per;
	void getData() 
	{
		Scanner scanner = new Scanner(System.in);;
		System.out.println ("Enter Name of Student");
		name = scanner.next();
		System.out.println ("Enter Roll No. of Student");
		roll_no = scanner.nextInt();
		System.out.println ("Enter marks out of 100 of 1st subject");
		sub1= scanner.nextInt();
		System.out.println ("Enter marks out of 100 of 2nd subject");
		sub2 = scanner.nextInt();
		System.out.println ("Enter marks out of 100 of 3rd subject");
		sub3 = scanner.nextInt();
	}
	void showData()
	{
		total=sub1+sub2+sub3;
		per=(total*100)/300;
		System.out.println ("Roll No. = "+roll_no);
		System.out.println ("Name = "+name);
		 System.out.println ("Marks of 1st Subject = "+sub1);
		 System.out.println ("Marks of 1st Subject = "+sub2);
				   
		 
		 System.out.println ("Marks of 1st Subject = "+sub3);
				   
		 
		 
		System.out.println ("Total Marks = "+total);
		System.out.println ("Percentage = "+per+"%");
	}


	
}


	

