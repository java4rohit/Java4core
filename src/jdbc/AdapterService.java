package com.java4rohit.jdbc;

import java.util.List;

public class AdapterService {
	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		AddressSeervice addressSeervice = new AddressSeervice();

		List<Student> studentList = studentService.getStudents();

		List<Address> addresslist = addressSeervice.getAddress();

		System.out.println("======= student before merge===========");
		studentList.stream().forEach(s1 -> System.out.println(s1));

		System.out.println("======= adress before merge===========");
		addresslist.stream().forEach(a1 -> System.out.println(a1));

		for (Student s1 : studentList) {
			String addID = s1.getAddressiId();

			for (Address address : addresslist) {
				if (addID.equals(address.getId())) {
					s1.setAddress(address);
				}
			}

		}
		System.out.println("======= student after merge===========");
		studentList.stream().forEach(s1 -> System.out.println(s1));

	}

}
