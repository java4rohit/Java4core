package com.java4rohit.ooad.pattern.prototype;

public class Engine {
	private String hoursePowser;
	private String highSpeed;
	
	
	public String getHoursePowser() {
		return hoursePowser;
	}
	public void setHoursePowser(String hoursePowser) {
		this.hoursePowser = hoursePowser;
	}
	public String getHighSpeed() {
		return highSpeed;
	}
	public void setHighSpeed(String highSpeed) {
		this.highSpeed = highSpeed;
	}
	@Override
	public String toString() {
		return "Engine [hoursePowser=" + hoursePowser + ", highSpeed=" + highSpeed + "]";
	}
	
	
	

}
