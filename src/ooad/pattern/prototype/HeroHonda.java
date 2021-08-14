package com.java4rohit.ooad.pattern.prototype;

public class HeroHonda implements Cloneable {
	private String model;
	private int petorlCapcity;
	private int mileage;
	private Engine engine;

	//Shallow
	/* @Override 
	 public HeroHonda clone() throws CloneNotSupportedException {
		 return (HeroHonda)super.clone();
	   }
	*/
	
	//Deep copy
	@Override
	public HeroHonda clone() throws CloneNotSupportedException {
		
		HeroHonda sp = new HeroHonda();
		sp.setMileage(mileage);
		sp.setModel(model);
		sp.setPetorlCapcity(petorlCapcity);
		
		Engine engine = new Engine();
		engine.setHighSpeed(getEngine().getHighSpeed());
		engine.setHoursePowser(getEngine().getHoursePowser());
		
		sp.setEngine(engine);

		return sp;
	}
 
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPetorlCapcity() {
		return petorlCapcity;
	}

	public void setPetorlCapcity(int petorlCapcity) {
		this.petorlCapcity = petorlCapcity;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "HeroHonda [model=" + model + ", petorlCapcity=" + petorlCapcity + ", mileage=" + mileage + ", engine="
				+ engine + "]";
	}
}
