package com.java4rohit.DSA_Arrays;

public class SubArraysGivenSum {
	
	public static void main(String[] args) {
		
		int k =12;
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int n=arr.length;
		
		for(int i = 0 ; i <n-1; i++) {
			int sum = 0;
			if(sum<k) {
				 sum=+arr[i];
			}
			else if(sum==k) {
				
			}
			else {
				for(int j=0; j<n-1; j++) {
				  sum=-arr[i];	
				}
			}
		}
		
		
	}

}
