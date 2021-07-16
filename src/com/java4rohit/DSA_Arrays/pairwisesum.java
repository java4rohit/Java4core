package com.java4rohit.DSA_Arrays;

import java.util.HashMap;
import java.util.Map;

public class pairwisesum {

	public static void main(String[] args) {

		int arr[] = { 1, 5,4 };
		int sum = 9;
		int count = 0;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(sum - arr[i])) {
				System.out.printf(arr[map.get(sum - arr[i])], arr[i]);
                return;
			}
			
			else {
				
				map.put(arr[i], sum-arr[i]);
			}
		}
	}

}
