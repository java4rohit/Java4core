package com.java4rohit.array;

import java.util.Arrays;

import com.java4rohit.inherit.Person;
//merge two array==============================

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] personArrayA = { new Person("Raj", 45, "2888"), new Person("jay", 74, "77778"),
				new Person("rohan", 75, "5555") };
		Person[] personArrayB = { new Person("Rohit", 45, "2888"), new Person("rahul", 74, "77778") };

		int a = personArrayA.length;
		int b = personArrayB.length;

		System.out.println(a);
		System.out.println(b);

		Person[] personArrayC = new Person[a + b];
		int c = personArrayC.length;

		System.out.println(c);
		
		for (int i = 0; i < a; i++) {
			personArrayC[i] = personArrayA[i];
		}
		for (int i = 0; i < b; i++) {
			personArrayC[a + i] = personArrayB[i];
		}
		for (int i = 0; i < c; i++) {

			System.out.println("Array:- " + personArrayC[i] + " ");
		}

	}
}
