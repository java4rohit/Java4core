package com.java4rohit.ooad.ClosedOpenPrinciple;

public class EmergencyRoomProcess {
	public static void main(String[] args) {
		
		HospitalManagement  Erd= new HospitalManagement();
		 Nurse nurse2= new Nurse(2, "nurse2", "emergencyy",true);  
		 
		 Erd.callupon(nurse2);
		 
           Doctor doc = new Doctor(11, "Alha", "Surgery", true);
		 
		 Erd.callupon(nurse2);
	
		 
	}
	

}
