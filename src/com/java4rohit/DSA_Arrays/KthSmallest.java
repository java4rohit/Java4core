package com.java4rohit.DSA_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

	public static void kthsmallestNo(int[] arr, int k) {
         Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[k-1]);

	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("size of arrays");
//		int len = sc.nextInt();
//		int arr[] = new int[len];
//		for (int i = 0; i <len; i++) {
//			arr[i] = sc.nextInt();
//		}

		int arr[] = { 7, 10, 4, 3, 20, 15 };
		int K = 3;

		kthsmallestNo(arr, K);

	}

}
