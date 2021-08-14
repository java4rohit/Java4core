package com.java4rohit.inherit;

public class ExtrctPerson {

	public static void main(String[] args) {
		// set using setters
		Student s1=new Student();
		s1.setName("Rohit");
		s1.setAge(14);
		s1.setAddress("26/5 joydev");
		s1.setRollno(1111111);
		s1.setStream("CSE");
 
		System.out.println("My name is: "+s1.getName());
		System.out.println(s1.food("Pizza"));
		
		
		//Set/initialize using construction
		Person s2=new Student("rahul",18,"26\5 joydev", 222222,"Mechnical Engineering");
		 
		
		
		System.out.println(	s2.getName());
		
		Person p1= new Person("aqib", 44, "666");
		
		System.out.println("++++++++++++++++++++++++++++++++++++++===");
		
		Person p2= new Person("Rahul", 24, "666");
		p2.setFatherName("RPYadav");
		

		Person p3= new Person("Rohit", 14, "777");
		
		
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("======After update===");
		p2.setFatherName("MrRPYadav");
		
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("======After update2===");
		p3.setFatherName("RPYadavJee");
		System.out.println(p2);
		System.out.println(p3);
		
		
		System.out.println("My Class is: "+Person.getClassName());
		
		
		
		
		 
		
		final int num = 10;
		//cant change
		//num=20;
		
	}

}
//rule1: private member only visible within the class
//rule2: only public meamber will inhertence. private will not
//rule3: protected member will be visible to there immidiate subclass
//rule4, a method declared as final can not be overriden in subclass
//rule5, a class declared as final can not extended
//rule6, in subclass cannot decrease the visibility of overridden method
