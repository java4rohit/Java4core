package com.java4rohit.hasa;

public class Car {
	
	private String Companyname;
	private String model;
	private String colour;
	private Engine engine;
	
	public Car(String companyname, String model, String colour, Engine engine) {
		Companyname = companyname;
		this.model = model;
		this.colour = colour;
		this.engine = engine;
	}

	
	@Override
	public String toString() {
		return "Car [Companyname=" + Companyname + ", model=" + model + ", colour=" + colour + ", engine=" + engine
				+ "]";
	}
	
	

}
