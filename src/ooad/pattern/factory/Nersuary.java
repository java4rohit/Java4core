package com.java4rohit.ooad.pattern.factory;

public class Nersuary {

	private Flower flower;
	
	public Flower getFlower(String flowerType) {
		
		
		if(flowerType.equalsIgnoreCase("Rose"));
		{
			 flower = new Rose();
		}
		
		if(flowerType.equalsIgnoreCase("Lotus"));
		{
			 flower  = new Lotus();
		}
		
		return flower;
		
	}
	
}


//Nursery acts as factory which produces object(flowers)--This is called Factory pattern