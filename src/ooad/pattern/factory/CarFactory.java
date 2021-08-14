package com.java4rohit.ooad.pattern.factory;

public class CarFactory {
	
	private Car car;
	
	public Car getCar(String carType){  
		
		if(carType.equalsIgnoreCase("LuxuaryCar")) {
			
			car= (Car) new LuxuaryCar();
		}
		
		if(carType.equalsIgnoreCase("SendanCar")) {
			car=(Car) new SedanCar();
		}
		
		return car;
		
	}
		
	}


