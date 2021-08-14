package com.java4rohit.inherit;

public class ExecuteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Rahul",24,"26\5 Joydev",121,10000,"cook");
		
		String name=e1.getName();
		String work=e1.makefood();
		String food=e1.food("pizza");

		System.out.println("I am "+name);
		System.out.println("My Desgnition is "+e1.getDesignation());
		System.out.println(work);
		System.out.println(food);
		
		Person p1= new Employee("rohit",27,"26\5 Joydev",121,30000,"cook");
		String name2=p1.getName();
		String food2=p1.food("pizza");

		System.out.println("I am "+name2);
		System.out.println(food2);
		
		Person p2=new Person("raj", 18,"27\6");
		String food3=p2.food("ppppp");
		System.out.println("I am "+p2.getName());
		System.out.println(food3);
		
		/**
		 * Below one is invalid, cos subclass reference cannot refer super class
		 */
		//Employee p4=new Person("raju", 155,"27\6");
			}              

}
