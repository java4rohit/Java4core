 package com.java4rohit.hasa;
/**
 * 
 * @author java4rohit
 * Association relationship
 */
public class EmpClient {

	public static void main(String[] args) {

		Employee e1= new Employee();
		 e1.setName("Saqib");
		 e1.setSalary(2);
		 e1.setDesignation("cook");
		
		 Address a1=new Address();
		 a1.setHouseno("2352/4");
		 a1.setCity("Durgapur");
		 a1.setContact("8232190092");
		 a1.setState("West Bengal");
		 
         e1.setAddress(a1);
         
         System.out.println(e1);
         
		 }
}
