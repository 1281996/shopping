package com.mallika2.sample;

import java.util.Scanner;

public class Labour extends Employee1 {
	Scanner scanner=new Scanner(System.in);
	
	double sal=super.lsal;
	 void calSal()
	 {
		 System.out.println("enter time");
		 int hour=scanner.nextInt();
	switch(hour){
	case 1:   sal=sal+1500;
	          System.out.println(sal);
		     break;
	case 2:	 sal=sal+2000;
        System.out.println(sal);
		    break;
	 case 3:  
		sal=sal+2500;
        System.out.println(sal);break;
        
        
	 default : sal=sal+600;
     System.out.println(sal);
              break;
	}
	}

}
