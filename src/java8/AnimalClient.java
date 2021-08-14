package com.java4rohit.java8;

public class AnimalClient {
public static void main(String[] args) {
	
	//Bird Class. Approach 1.. Made a Bird class
	Animal animal = new Bird();
	System.out.println(animal.move("Bird"));
	
	//Ananimous class, <Actually it is mammer because it is walking>
	Animal animal2 = new Animal() {
		 
		public String move(String name) {
			return "I am walking "+name;
			
		}
	};
	System.out.println(animal2.move("Mammels"));
	
	
	//Lembda expression
	Animal animal3=( name)->{
		return "i am reptile"+name;
		
	};
	System.out.println(animal3.move("Raptile"));
}
}
