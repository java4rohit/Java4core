package com.java4rohit.ooad.pattern.prototype;

public class HeroClient {

	public static void main(String[] args) throws CloneNotSupportedException {
//
//		HeroHonda splendor = new HeroHonda();
//		
////		splendor.setMileage(92);
////		splendor.setPetorlCapcity(5);
////		splendor.setModel("53");
////		
////		System.out.println(splendor);
////
////		HeroHonda superSplendor = splendor.clone();
////		System.out.println(superSplendor);
////		
////		
//		System.out.println("==================================================");		
//		splendor.setModel("856");
//		
//		System.out.println(splendor);
//		
//		System.out.println(superSplendor);
//		
//		
		System.out.println("==================================wITH eNGINE==================================");
		
		HeroHonda splendor1 = new HeroHonda();
		
		
		splendor1.setMileage(92);
		splendor1.setPetorlCapcity(5);
		splendor1.setModel("53");
		
		Engine engine=new Engine();
		engine.setHighSpeed("220km");
		engine.setHoursePowser("100");
		splendor1.setEngine(engine);
		
		
		HeroHonda superSlendor1= splendor1.clone();
		System.out.println(splendor1);
		System.out.println(superSlendor1);
		System.out.println("==================================================");		

       splendor1.getEngine().setHighSpeed("330Km");
       System.out.println(splendor1);
	   System.out.println(superSlendor1);
		
		
		
	}

}
