package com.java4rohit.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectingDemo {

	public static void main(String[] args) throws  InstantiationException, IllegalAccessException, ClassNotFoundException {
		 
		Class<?> clazz = Class.forName("com.java4rohit.inherit.Person");
		 
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		Method[] medhods = clazz.getDeclaredMethods();
		
		for(Method method : medhods) {
			System.out.println(method.getName());
		}
		
	}
	
}
