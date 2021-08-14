package com.java4rohit.abstractc;

public class CLientShape {

	public static void main(String[] args) {
		
		Shape t1=new Square();
	    double area= t1.area(10);
	    t1.display("Square", area);
		
	}

}
