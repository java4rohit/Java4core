package com.java4rohit.serilization;

import java.io.IOException;

import com.java4rohit.inherit.Employee;
import com.java4rohit.inherit.Person;

public class SerialGetState {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person p1 = (Person)SerializationUtil.deserialize("Person.ser");
		
		//Employee e1 = (Employee)SerializationUtil.deserialize("Employee.cer");
		
		System.out.println(p1);

	}

}
