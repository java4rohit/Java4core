package com.java4rohit.classAndobject;

public class CalculatorClient {

	public static void main(String[] args) {

		
		Calculator c1 = new Calculator();
		int result = c1.sum(2, 3);
		
		System.out.println("Sum: " + result);

		int result2 = c1.sum(1, 3, 5);
		System.out.println("sum: " + result2);

	}

}
