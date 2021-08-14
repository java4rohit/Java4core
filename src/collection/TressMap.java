package com.java4rohit.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.java4rohit.inherit.Person;

public class TressMap {

	public static void main(String[] args) {
		Person p1 = new Person("111", "Rahul", 20, "26/5");
		Person p2 = new Person("1s2", "Rohit", 10, "26/5");
		Person p3 = new Person("55", "Ram", 30, "26/5");
		Person p4 = new Person("234", "Shyam", 50, "26/5");
		Map<Person, String> hash=new TreeMap<>();
		hash.put(p1, "employee");
		hash.put(p2, "Student");
		hash.put(p3, "chaiwala");
		hash.put(p4, "cook");
		
		System.out.println(hash);
		
	}

}

