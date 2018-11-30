package com.mallika.lambda;

public class OrderImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OrderInterface order1=(a)->{
    	  if(a>10000){
    		  return "Acepted or completed";
    	  }
    	  else
    		  return "NotAcepted";
      };
      System.out.println(order1.order(20000)); 
	}
  
}
