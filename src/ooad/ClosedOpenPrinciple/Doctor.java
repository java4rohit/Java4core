package com.java4rohit.ooad.ClosedOpenPrinciple;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		
		System.out.println("Doctor in action....");
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		
	}	
	
	
	}
	
	
	
	

