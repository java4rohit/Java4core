package com.java4rohit.hasa;

/**
 * 
 * @author java4rohit
 * this represent composition
 *
 */
public class Buyer {

	public static void main(String[] args) {
		
		Engine engine = new Engine("100RPM", "10L");
		Car car = new Car("Audi","xyz", "red", engine);
		
		System.out.println(car);

	}

}
