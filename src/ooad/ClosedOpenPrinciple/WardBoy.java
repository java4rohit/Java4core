package com.java4rohit.ooad.ClosedOpenPrinciple;

public class WardBoy  extends Employee{

	public WardBoy(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		
		
	}

	@Override
	public void performDuties() {
      System.out.println("Cleaning the surfrace");
	}
	

}
