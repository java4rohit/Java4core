package com.java4rohit.DSA_Arrays;

import java.util.Arrays;

/**
 * 
 * @author java4rohit int arr[]={4,3,5,1,2}; inverseofArrays
 *
 *
 *
 *
 *
 */
public class InverseOfAnArray {

	public static void main(String[] args) {

		           // 0  1  2  3  4
		int arr[] = { 2, 3, 4, 1, 0 };

		// inverse arr= 4,3,0,1,2
		int n = arr.length;
		int inv[]=new int[arr.length];

		for (int i = 0; i <= n - 1; i++) {
			int val = arr[i];
			inv[val]=i;
			

		}
		System.out.println(Arrays.toString(inv));
	}

}
