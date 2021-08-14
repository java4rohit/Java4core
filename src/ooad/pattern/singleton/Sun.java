package com.java4rohit.ooad.pattern.singleton;

/**
 * @author java4rohit
 * Description  Design sun class such that client can create only a single object of it,
 *
 */
public class Sun {

	private  static Sun sun = null;

	private Sun() {
	}

	public  static Sun getsun() {

		if (sun == null) {
			sun = new Sun();
		}

		return sun;
	}
}

//Rule: First strict access to the constructor
//Then, provide static method to create object
//Object is created only when the object do not exist
//Once created, same object is returned again and again

//Singleton class are of two types 1. lazy loading 2. Eager loading
