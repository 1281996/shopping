package com.mallika.lambda;

public class Greetings {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Greeting myGretings =()->System.out.println("hello world");
     Add myAdd =(int a,int b)->a+b;
    	 
    	 
       //Greeting myAdd=(int a,int b)->a+b;
    System.out.println(myAdd.add(7, 9)); 
     myGretings.disp();
     Greeting gret= new GreetingImpl();
     gret.disp();
	}

}
