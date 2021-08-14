
package com.java4rohit.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhasSetClient {

	public static void main(String[] args) {
		
		Set<String> names = new LinkedHashSet<>();
		names.add("Rohit");
		names.add("ABCX");
		names.add("RRYZ");
		names.add("DDCV");
		names.add("CCNM");
		names.add("KKLM");
		names.add("GGHB");
		
		System.out.println(names);
		
		names = new HashSet<>();
		names.add("Rohit");
		names.add("ABCX");
		names.add("RRYZ");
		names.add("DDCV");
		names.add("CCNM");
		names.add("KKLM");
		names.add("GGHB");
		
		System.out.println(names);
		
	}
}
