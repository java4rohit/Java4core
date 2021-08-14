package com.java4rohit.inherit;

import java.io.Serializable;

public class Employee extends Person  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1895171098301720469L;
	private int employId;
	private int salary;
	private String designation;

	public Employee(String name, int age, String address, int employId, int salary, String designation) {
		super(name, age, address);
		this.employId = employId;
		this.salary = salary;
		this.designation = designation;
 	}
	
	public Employee() {
  
	}


	public String makefood(){
	 return "I do cooking ";
	}
	
	@Override   //In over ride signature remain the same, Signature-> method name and method parameter, only implementation changes
	public String food(String foodName) {
		
		return "I am making: "+foodName;
	}
	

	public int getEmployId() {
		return employId;
	}

	public void setEmployId(int employId) {
		this.employId = employId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employId=" + employId + ", salary=" + salary + ", designation=" + designation
				+ ", makefood()=" + makefood() + ", getEmployId()=" + getEmployId() + ", getSalary()=" + getSalary()
				+ ", getDesignation()=" + getDesignation() + ", getFatherName()=" + getFatherName() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getAadharNo()="
				+ getAadharNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
 
	
}
