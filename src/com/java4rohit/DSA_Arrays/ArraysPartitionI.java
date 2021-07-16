package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class ArraysPartitionI {
	
	
	private static void arrayPairSum(int[] arr, int maxsum2) {
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for( int i = 0 ; i < arr.length-1; i++) {
		maxsum2=maxsum2+arr[i];
		i=i+1;
		}
		
		
		
		System.out.println(maxsum2);
		
	}

	public static void main(String[] args) {
		int arr[] = { 6,2,6,5,1,2	};
		int	maxsum=0;
		arrayPairSum(arr,maxsum);
	}

}
