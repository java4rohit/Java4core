package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class ContainDublicate {

	private static boolean contain(int[] arr1, int k) {

		int n = arr1.length;

		for (int i = 0; i < n - 1; i++) {
			if (arr1[i] == k) {
				return true;
			}
		}
		return false;
	}


	private static boolean containDublicate(int[] arr) {

 		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			
				
				if (arr[i] == arr[i+1]) 
					return true;
		
		}
		

 		return false;
 		
	}

	public static void main(String[] args) {

 			int arr[] = { 2, 14, 18, 22, 2 };
 			int arr1[] = { 1, 2, 3, 1, 2, 3 };
 			int k = 2;
 			Arrays.sort(arr);

 			// containDublicate(arr);
 			contain(arr1, k);
 			System.out.println(containDublicate(arr));
 		}
}
