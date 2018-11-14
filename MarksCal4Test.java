package interviewquestions1;

import java.util.Scanner;

public class MarksCal4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarksCal4 marks=new MarksCal4();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first subject");
		int sub1=scanner.nextInt();
		System.out.println("enter second subject");
		int sub2=scanner.nextInt();
		System.out.println("enter third subject");
		int sub3=scanner.nextInt();
		marks.passDetails(sub1, sub2, sub3);

     
	}

}
