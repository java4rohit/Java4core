package com.java4rohit.Recursion;

import java.util.Scanner;

public class displayAndArrays {

	public static void displayArr(int[] arr, int idx, int max) {
		if(idx<=arr.length-1)
		{
		System.out.println(arr[idx]);
		displayArr(arr, idx+1, max);
			}
		}

	

	public static void main(String[] args) throws Exception {
       int arr[]= {10,20,30,40};
       int max= arr[0];
	  displayArr(arr,0,max);
       
	}

}
