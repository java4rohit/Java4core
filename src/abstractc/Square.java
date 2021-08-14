package com.java4rohit.abstractc;

public class Square extends Shape {

	public Square() {
   super();
	}

	@Override
	public double area(int length) {

		return length * length;
	}

}
