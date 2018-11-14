package interviewquestions1;

import java.util.Scanner;

public class UserValidations {
	 public void validation()
	 { 
		 int count=0;
		 String userName1="mallika";
		 String pass1="ykunta123";
		 String userName;
		 String pass;
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("enter username");
	      userName=scanner.next();
	      System.out.println("enter pass");
	      pass=scanner.next();
		   
		 if(userName.equals(userName1)&&pass.equals(pass1))
		 {
			System.out.println("Welcome "+userName1); 
		 }
		 else {
			 
		 
		 while(count<2) {
		  if(!(userName.equals(userName1)&&pass.equals(pass1)))
		  {
			  System.out.println("enter username");
		      userName=scanner.next();
		      System.out.println("enter pass");
		      pass=scanner.next();
		  }
			count=count+1; 
		 }
		 }
		 if(count==2) {
			 System.out.println("contact");
		 }
		 
	}
	 }


