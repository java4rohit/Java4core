package com.java4rohit.ooad.IspPrinciple;

public class Ostrich implements Flying, Walking {

	@Override
	public void fly() {
		System.out.println("Ostrich Flying");
	}

	@Override
	public void walk() {
		System.out.println("Ostrich Walking");
	}


}
