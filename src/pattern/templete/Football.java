package com.java4rohit.pattern.templete;

public class Football  extends Game{
	@Override
	void initialize() {
	    System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void StartPlay() {
		System.out.println("game is strt to play");
	}

	@Override
	void EndPlay() {
  System.out.println("game is end");		
	}


}
