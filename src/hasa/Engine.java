package com.java4rohit.hasa;

public class Engine {
	private String power;
	private String oilcapacity;
	
	public Engine(String power, String oilcapacity) {
		super();
		this.power = power;
		this.oilcapacity = oilcapacity;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", oilcapacity=" + oilcapacity + "]";
	}
	
	

}
