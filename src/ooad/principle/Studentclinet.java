package com.java4rohit.ooad.principle;

public class Studentclinet {

	public static void main(String[] args) {
	
		
		Address1 add = new Address1();
		
		add.setCity("DGP");
		add.setHouseno("26/5");
		add.setContact("98283");
		 
		Student s= new Student("rohit", 22, add );
		

		System.out.println(s.hashCode()+" "+s);
		
		 s= new Student("rohit", 23, add );
		
		System.out.println(s.hashCode()+" "+s);
		
		System.out.println("====================================");
		
		s.getAddress1().setCity("KOL"); 
		System.out.println(s.hashCode()+" "+s);
		
		
		
		
		

	}

}
