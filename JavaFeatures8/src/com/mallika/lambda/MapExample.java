package com.mallika.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,String> map1=new HashMap();
        map1.put("102", "mallika");
        map1.put("101", "santhi");
        map1.entrySet().stream().map(entry->entry.getKey().concat(entry.getValue())).forEach(m->System.out.print(m));
        System.out.print(map1);
    
		
	}

}
