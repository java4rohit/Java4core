
package com.java4rohit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.java4rohit.collection.sorting.PersonNameCompartor;
import com.java4rohit.inherit.Person;
import com.java4rohit.java8.Animal;

public class ArrayListClient {
	public static void main(String[] args) {

		List<Person> a1 = new ArrayList<Person>(50);
		
		List<Person> a2 = new ArrayList<Person>();

		Person p1 = new Person("111", "Rahul", 20, "26/5");
		Person p2 = new Person("111", "Rohit", 10, "26/5");
		Person p3 = new Person("111", "Ram", 30, "26/5");
		Person p4 = new Person("111", "Shyam", 50, "26/5");

		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		
		
		Iterator itr= a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(a1.contains(p2));

		System.out.println("============Comparator shorting ==========================");

		Collections.sort(a1, new PersonNameCompartor());
		System.out.println("sorting by name:" + a1);
		System.out.println("sorting by name:" + a1);

		class PersonAgeComparetor implements Comparator<Person> {
			
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o1.getAge();
			}
		}
///anonymous class===========================================================
		Comparator c = new PersonAgeComparetor();
		
		Collections.sort(a1, c);
		Comparator<Person> comp = new Comparator<Person>() {
			
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}

		};

		Collections.sort(a1, comp);
		//by leemda expersion ===========================================================
		Collections.sort(a1, ( o1,  o2)->{
			return o1.getName().compareTo(o2.getName());
			
		});
		List<String> names = new ArrayList<>();
		// update age=========
		for (Person r : a1) {
			names.add(r.getName());
			r.setAge(30);
			System.out.println(r);
		}
		System.out.println("Name List:: " + names);
		System.out.println("==========================");
		a2 = a1;
		for (Person p : a2) {
			System.out.println(p);
		}
		a2.addAll(a1);
		a2.get(3);
		a2.remove(2);
		System.out.println(a2.contains(p4));
	}
}
