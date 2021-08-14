package com.java4rohit.exceptions;

import com.java4rohit.inherit.Person;

public class TestingException {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException,Exception {
		int result =0;
		int accountbalance = 0;
		
		try {
		 result = 10/0;
		}
	
		catch(ArithmeticException exception){
			System.out.println(exception.getMessage());
			//throw new Exception();
		}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		catch(Throwable exception){
			System.out.println(exception.getMessage());
		}
	 
		
		
		Person p = (Person)Class.forName("com.java4rohit.inherit.Person").newInstance();
		 
		
		System.out.println("Finished");
		
		if(accountbalance==0) {
			throw new Exception("Insufficiant balance");
		}
		
	}
}

//Exception is abnormal condition
//try catch
//throws
//throw
//finally

