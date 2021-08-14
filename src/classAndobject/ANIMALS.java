package com.java4rohit.classAndobject;

public class ANIMALS {
	private String animalname;
	private int ageOFanimal;	  
	
	
	ANIMALS(String animalname,int ageOFanimal){	 
		this.animalname = animalname;
		this.ageOFanimal = ageOFanimal;
	}
   ANIMALS(){
	   this.animalname = animalname;
		this.ageOFanimal = ageOFanimal;
   }
	


	@Override
	public String toString() {
		return "ANIMALS [Animalname=" + animalname + ", ageOFanimal=" + ageOFanimal + "]";
	}
	
	


}
