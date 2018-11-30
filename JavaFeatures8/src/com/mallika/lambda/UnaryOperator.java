package com.mallika.lambda;

import java.util.ArrayList;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> list=new ArrayList();
      list.add("mallika");
      list.stream().forEach(words->System.out.println(words.replaceAll(words,words.toUpperCase())));
      
	}

}
