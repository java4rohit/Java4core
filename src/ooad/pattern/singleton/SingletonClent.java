package com.java4rohit.ooad.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClent  {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Sun sun1 = Sun.getsun();
		Sun sun2 = Sun.getsun();
		Sun sun3 = Sun.getsun();

		System.out.println(sun1.hashCode() + " " + sun2.hashCode() + " " + sun3.hashCode());

		//Breaking the singleton
		Class clazz = Class.forName("com.java4rohit.ooad.pattern.singleton.Sun");
		Constructor<Sun> cons = clazz.getDeclaredConstructor();
		cons.setAccessible(true);

		Sun sun4 = cons.newInstance();
		Sun sun5 = cons.newInstance();
		Sun sun6 = cons.newInstance();

		System.out.println(sun5.hashCode() + " " + sun6.hashCode() + " " + sun4.hashCode());

		// Library
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();

		System.out.println(runtime1.hashCode() + "  " + runtime2.hashCode());

	}
}

//When we run, there are two process involved.
//1. Class Loading
//2. run the loaded class