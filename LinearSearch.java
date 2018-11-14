package interviewquestions1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index;
		
		int num[]=new int[15];
		
		for(index=0;index<num.length;index++)
		{
			System.out.println("enter element");
			int b=sc.nextInt();	
		    num[index]=	b;
		}
		System.out.println("enter searching element");
		
		int search=sc.nextInt();
		for(index=0;index<num.length;index++)
		{
			if(num[index]==search)
			{
			System.out.println("element is found at   " +index+ "  index");
			break;
			}
			
			
		}
		
	

	}

}
