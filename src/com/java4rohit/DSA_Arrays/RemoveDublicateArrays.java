package com.java4rohit.DSA_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDublicateArrays {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 9 };

		int n = arr.length;
		System.out.println(n);

		int j = 0;
		for (int i = 0; i < n - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j]=arr[n-1];
	
		System.out.println(Arrays.toString(arr));
		
	}

}
