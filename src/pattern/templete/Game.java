package com.java4rohit.pattern.templete;

public abstract class Game {
	
	abstract void StartPlay();
	 

		protected void initialize() {
			System.out.println("intilizing the game...............................");
		}
 
		protected void EndPlay() {
			System.out.println("end game...........");
			
		}
	 
	 
	//templete method
	 public final void play() {
		 initialize();
		 
		 
		 
		 StartPlay();
		 
		 
		 
		 EndPlay();
	 }

}
