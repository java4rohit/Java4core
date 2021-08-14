package com.java4rohit.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RohitMap{
	public static void main(String[] args) {
		Map<String, String> hash=new HashMap<>();
		
		hash.put("Name", "Rohit");
		hash.put("Age","22");
		hash.put("addrees", "27/8");

		//Iterating hashmap
		Set<Map.Entry<String,String>> entrySet = hash.entrySet();
		
		 for(Map.Entry<String,String> entry:entrySet) {
			 
			 System.out.print(entry.getKey());
			 System.out.println(entry.getValue());
		 }
		 
		Set<String> key =  hash.keySet();
		for (String str:key) {
			System.out.print(str);
			System.out.println(hash.get(str));
		}
		 
	}
}
