package com.java4rohit.collection.sorting;

import java.util.Comparator;

import com.java4rohit.inherit.Person;

public class PersonAgeComparetor implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getAge()-o1.getAge();
	}
	

}
