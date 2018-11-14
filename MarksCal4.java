package interviewquestions1;

public class MarksCal4 {
	public void passDetails(int sub1,int sub2,int sub3) 
	{
		 if(sub1<=100 && sub2<=100 && sub3<100) 
		 {
	           if(sub1>=60 && sub2>=60 && sub3>=60) 
	              {
	    	      System.out.println("Passed"); 
	    	
	               }
	            else if((sub1>=60 && sub2>=60) || (sub2>=60 && sub3>=60) || (sub3>=60 && sub1>=60))
	                 {
	    	        System.out.println("Promoted");
	    	   
	                }
	             else
	              {
	    	      if((sub1<60 && sub2<60) || (sub2<60 && sub3<60) || (sub3<60 && sub1<60))
	    	          System.out.println("Fail");
	    	   
	               }
		 } 
		 else {
			 System.out.println("marks should be less than 100");
		      }
	}

}
