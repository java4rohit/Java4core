package com.java4rohit.DSA_Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	
	public static void main(String[] args) {
		int arr[]= {4,1,4,4,2,1,1,8,2,6,8,8,6,6,6};
		int k=2;
		
//		Map<Integer, Integer> map= new LinkedHashMap<Integer, Integer>();
//		
//		
// 
//		
//		for(int i = 0 ;i <arr.length ; i++) {
//		
//			map.put(arr[i], map.get(arr[i])==null?1:1+map.get(arr[i]));
//			
//		}
//		
//		
//		
		int count=arr.length;
	
		for( int i = 0 ; i<= arr.length ; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				
				 if (arr[j] > arr[j+1])
	                {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
			}			
			if(i==k) {
				break;
			}
			
		}
		
		for(int i = arr.length ; i>=0 ; i++) {
		
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
