package com.java4rohit.ooad.ClosedOpenPrinciple;

public abstract class Employee {
	int id;
	 String Name;
	  String Department;
	  boolean Working;
	public Employee(int id, String name, String department, boolean working) {
		super();
		this.id = id;
		Name = name;
		Department = department;
		Working = working;
	}
	
	public abstract void performDuties();
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Department=" + Department + ", Working=" + Working + "]";
	}
	  

}
