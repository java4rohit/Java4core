package com.java4rohit.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java4rohit.inherit.Person;
public class SteamClient {
	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();
	

		Person p1 = new Person("111", "Rahul", 20, "26/5");
		Person p2 = new Person("111", "Rohit", 10, "26/5");
		Person p3 = new Person("111", "Ram", 30, "26/5");
		Person p4 = new Person("111", "Shyam", 50, "26/5");

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
	
	List<String> nameList = new ArrayList<>();	
	for(Person p:personList) {
		if(p.getAge()<=30)
		nameList.add(p.getName());
	}
	System.out.println(nameList);

  //Print the person
  personList.stream().forEach(p -> System.out.println(p.getName()));
  personList.stream().forEach(System.out :: println);
  
  
  //Prepare name list who is less or equal to 30 age
  List<String> nameList2 = personList.stream().map(p -> p.getName()).collect(Collectors.toList());
  System.out.println(nameList2);
  
}
}