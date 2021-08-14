 package com.java4rohit.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.java4rohit.inherit.Person;

public class PersonHasMapClient {
	public static void main(String[] args) {
		
		
		Person p1 = new Person("111", "Rahul", 20, "26/5");
		Person p2 = new Person("112", "Rohit", 10, "26/5");
		Person p3 = new Person("113", "Ram", 30, "26/5");
		Person p4 = new Person("111", "Shyam", 50, "26/5");
		
		Map<Person, String> hash=new HashMap<>();
		hash.put(p1, "employee");
		hash.put(p2, "Student");
		hash.put(p3, "chaiwala");
		hash.put(p4, "cook");
		
		System.out.println("================By EntrySet=========");
		Set<Map.Entry<Person, String>>  entrySet =hash.entrySet();
		
		for(Map.Entry<Person, String> entry:entrySet ) {
			System.out.print(entry.getKey()+"= ");
			System.out.println(entry.getValue());
		}
		
		System.out.println("================By KeySet=========");
		Set<Person> keys = hash.keySet();
		
		for(Person p : keys) {
			System.out.print(p+" ");
			System.out.println(hash.get(p));
		}
		
		
		System.out.println("================By Stream=========");
	
		          
		hash.keySet().stream().forEach(k -> {
			System.out.print(k+" ");
			System.out.println(hash.get(k));
		});		
		System.out.println("================================");
		
		hash.entrySet().stream().forEach(E ->{
			System.out.print(E.getKey()+ " ");
			System.out.println(E.getValue());
		}
		);
		
	}
}
