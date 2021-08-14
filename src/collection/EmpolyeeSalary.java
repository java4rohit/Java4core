package com.java4rohit.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.java4rohit.hasa.Employee;

public class EmpolyeeSalary {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("rohit", 23, 1, "west bengal"));
		employeeList.add(new Employee("rahul", 332 ,4, "west bengal"));
		employeeList.add(new Employee("rohit", 533, 6, "west bengal"));
		employeeList.add(new Employee("rohit", 334, 7, "west bengal"));
		employeeList.add(new Employee("rohit", 989, 8, "west bengal"));
		
		
	
	//	double sum = 0;
		/*
		 * for(int i =0; i<employeeList.size(); i++) { sum = sum +
		 * employeeList.get(i).getSalary(); }
		 */
	//	employeeList.stream().map(e -> e.getSalary()).reduce(0d, Double::sum);
		//System.out.println(sum);
		
		  
		Map<Integer,Employee> map= new HashMap<Integer, Employee>();
		
		 for(Employee employee: employeeList) {
			 map.put(employee.getId(),employee);
		 }
		 
		 System.out.println("Map"+map);
		 
//		 for(Map.Entry<Integer,Employee> entry :  map.entrySet()) {
//			 
//			 System.out.println(entry.getKey()+","+entry.getValue());
//		 }
		 
		 System.out.println("================");
//		 
		 for(Integer key: map.keySet()) {
			 System.out.println(key+""+map.get(key));
		 }
		
		
	}
	public static class Employee {
		private String name;
		private int salary;
		private int Id;
		private String city;
		
		
		
		
		
		public Employee() {
			super();
		}
		public Employee(String name,int salary, int id, String city) {
			super();
			this.name = name;
			this.salary = salary;
			Id = id;
			this.city = city;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", Id=" + Id + ", city=" + city + "]";
		}
		
		

	}
}