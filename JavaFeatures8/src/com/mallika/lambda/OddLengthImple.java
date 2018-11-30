package com.mallika.lambda;

import java.util.ArrayList;

public class OddLengthImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("mallika");
		list.add("santhi");
     
    	
    	 list.removeIf(word->(((String) word).length()%2)!=0);
    	 System.out.println(list);
    	 
    
	}

}
