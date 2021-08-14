package com.java4rohit.collection;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashSet {
	public static void main(String[] args) {
		Map<String, String> lmap=new LinkedHashMap<>();
		
		lmap.put("name", "rohit");
		lmap.put("age", "33");
		lmap.put("address", "23/4");
		lmap.put("pagal", "rohit");
	
		System.out.println(lmap);
	}
 

}
