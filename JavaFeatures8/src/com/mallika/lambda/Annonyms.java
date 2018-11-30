package com.mallika.lambda;

public class Annonyms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread a1=new Thread(new Thread(){
    	   public void run(){
    		   System.out.println("running");
    	   }
       });
       Thread lambda=new Thread(()-> System.out.println("Running"));
       lambda.run();
	}

}
