package com.java4rohit.DSA_Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindSingleNumble {
	
	public static int finalthesingle(int[] arr){
		   
				Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		        int n=0;
		        for(Integer i: arr){
		            map.put(i,map.getOrDefault(i,0)+1);
		            
		        }
		        
		        Set<Map.Entry<Integer, Integer>> entryset= map.entrySet();
		        
		        for(Map.Entry<Integer, Integer> entry:entryset) {
		        	if(entry.getValue()==1) {
		        		 n=entry.getKey();
		        	}
		        }
		        
		        map.forEach((k,v)->{
		            if(v==1){
		             // k;  
		            }
		        });
				return n;
		
	}
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,2,4,5,6,5,6};
		System.out.println(finalthesingle(arr));
	}

}
