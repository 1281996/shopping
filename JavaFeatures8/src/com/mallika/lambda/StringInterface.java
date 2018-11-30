package com.mallika.lambda;

public class StringInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringLength stringLength=(String s)->s.length();
   System.out.println(stringLength.lengthSting("mallika"));
	}
  interface StringLength{
	  int lengthSting(String name);
  }
}
