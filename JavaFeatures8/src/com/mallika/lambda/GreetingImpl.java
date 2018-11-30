package com.mallika.lambda;

public class GreetingImpl implements Greeting,Add {
	public void disp(){
		System.out.println("Hello World mallika");
	}
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		return a+b;
	}
}
