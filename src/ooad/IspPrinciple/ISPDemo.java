package com.java4rohit.ooad.IspPrinciple;

public class ISPDemo {
	public static void main(String[] args) {
		
		Walking walk = new Dog();
		walk.walk();
		
		Flying fly = new Bird();
		fly.fly();
		
		Flying flyOst = new Ostrich();
		Walking walkOst = new Ostrich();
		
		flyOst.fly();
		walkOst.walk();
	}

}
