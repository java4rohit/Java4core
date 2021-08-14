package com.java4rohit.ooad.pattern.factory;

public class clientFlower  {

	public static void main(String[] args) {
	
		Nersuary nurse = new Nersuary();
		
		Flower flower = nurse.getFlower("Lotus");
		
		flower.grows();
	
	}

}
