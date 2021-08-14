package com.java4rohit.array;

import java.util.Arrays;

import com.java4rohit.inherit.Person;

public class ArrayObject  {

	public static void main(String[] args) {

		 int[] arr = { 1, 2, 3, 4 };
		// long[] arr1 = { 111, 3, 3, 4, 4, 5 };
		Person[] personArray = { new Person("Raj", 45, "2888"), new Person("jay", 74, "77778"),
				new Person("rohit", 75, "5555") };
	 
	
		System.out.println(Arrays.toString(personArray));
		
		for(int num:arr) {
			System.out.println(num);
		}

		System.out.println(
				"=============================================After update=========================================");
		// update
		for (int i = 0; i < personArray.length; i++) {
			Person p = personArray[i];
			if (p.getName().equals("jay")) {
				p.setAge(20);
			}
		}
		
		for(Person p : personArray) {
			p.setAge(40);
		}
		
		
		System.out.println(Arrays.toString(personArray));
		
		Person[] Arr =new Person[4];
		
		Arr[0]=new Person("rohit", 24, "8884");
		Arr[1]=new Person("rohit", 14, "84");
		Arr[2]=new Person("rohit", 03, "84");
		Arr[3]=new Person("rahul", 44, "9884");
	}


	
	
}

//Modify all age to 20
//Then Modify Jay age to 25

//first declare array then assign person to it