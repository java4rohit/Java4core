package com.java4rohit.serilization;

import java.io.IOException;
import java.io.Serializable;

import com.java4rohit.hasa.Address;
import com.java4rohit.inherit.Employee;
import com.java4rohit.inherit.Person;
import com.mysql.cj.util.DnsSrv.SrvRecord;

public class SerialDemo {

	public static void main(String[] args) throws IOException {
		
		Person p1 = new  Person("1234", "rohit", 34, "34rd");
		
		p1.setAddress1(new Address("34\4", "durgapur", "wb", "3454534322"));
		
		SerializationUtil.serialize(p1, "Person.ser");
		
//		Employee e1=new Employee("rohit", 23,"26/5joydev avenue", 1234,4566,"HOD");
//		SerializationUtil.serialize(e1, "Employee.cer");
//		
		System.out.println("Serialized");
	
	}

}
