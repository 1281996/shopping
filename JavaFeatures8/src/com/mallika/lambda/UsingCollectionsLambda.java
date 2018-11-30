package com.mallika.lambda;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsingCollectionsLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
        ArrayList<UsingCollections> list=new ArrayList<UsingCollections>();
        list.add(new UsingCollections(76, "mallika", "klunta"));
        list.add(new UsingCollections(75, "mallika2", "ylunta2"));
        list.add(new UsingCollections(79, "mallika3", "llunta3"));
        Collections.sort(list, (p1,p2)-> 
            p1.lName.compareTo(p2.lName)
        );
        for(UsingCollections u:list){
        	System.out.println(u.getId()+" "+u.fName+" "+u.lName);
        }
	}

}
