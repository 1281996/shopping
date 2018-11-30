package com.mallika.lambda;



import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.*;
import java.lang.String;
public class Consumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
	
		//ArrayList<String> list2=new ArrayList();
		list.add("mallika");
		list.add("santhi");
     list.stream().forEach(words->System.out.println(words.charAt(0)+"\t"));
       System.out.println(list);
	}

}
