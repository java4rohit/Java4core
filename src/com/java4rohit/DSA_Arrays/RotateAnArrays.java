package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

public class RotateAnArrays {

	public static void reverse(int arr[], int i, int j) {
		int start = i;
		int end = j;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int arr[] = { -1 };
		int k = 2; // 7,1,2,3,4,5,6
		int n = arr.length;
		System.out.println("length of arr:"+n);

		System.out.println(k);
	    k=k%n;
	    System.out.println(k);
	
			reverse(arr, 0, n - k - 1);

			reverse(arr, n - k, n - 1);

			reverse(arr, 0, n - 1);

			System.out.println(Arrays.toString(arr));
		}
	

}
