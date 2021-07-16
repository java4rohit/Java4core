package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class ReverseTheArrays {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int temp = 0;
		int n= arr.length;
		int start=0;
		 int end =n-1;
		 
		 while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		 }
		 
		 
		System.out.println(Arrays.toString(arr));
	}

}
