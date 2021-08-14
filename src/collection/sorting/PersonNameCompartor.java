package com.java4rohit.collection.sorting;

import java.util.Comparator;

import com.java4rohit.inherit.Person;

public class PersonNameCompartor implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}