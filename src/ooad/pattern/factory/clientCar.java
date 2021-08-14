package com.java4rohit.ooad.pattern.factory;

public class clientCar {
	public static void main(String[] args) {
		 CarFactory carfactory=new CarFactory();
		 
		  Car car= carfactory.getCar("SendanCar");
		  
		  car.carNAme();
		  
		 
	
	}

}
