package com.java4rohit.callByValue;

public class PerssionExec {

	public static void main(String[] args) {
		Perssion x1 = new Perssion("Rohit", 19);

		System.out.println(x1.getAge());
		// x1.updateAge(x1);
		
		System.out.println(x1.getAge());
		
		Perssion x2 = new Perssion("rahul", 33);
		
		System.out.println(x1);
		System.out.println(x2);

		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		WrapperPerson wp1 = new WrapperPerson();
		wp1.p = x1;
		WrapperPerson wp2 = new WrapperPerson();
		wp2.p = x2;

		WrapperPerson.swap(wp1, wp2);

		System.out.println(wp1.p);
		System.out.println(wp2.p);
	}

}
