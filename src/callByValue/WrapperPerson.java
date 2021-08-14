package com.java4rohit.callByValue;

public class WrapperPerson {
	
	Perssion p;
	
	public static void swap(WrapperPerson wp1, WrapperPerson wp2) {
		Perssion p1 = wp1.p;
		Perssion p2 = wp2.p;
		
		Perssion t = p1;
		p1=p2;
		p2=t;
		
		wp1.p=p1;
		wp2.p=p2;
	}

}
