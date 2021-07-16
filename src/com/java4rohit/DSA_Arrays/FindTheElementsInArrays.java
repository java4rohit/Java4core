package com.java4rohit.DSA_Arrays;

import java.util.Scanner;

public class FindTheElementsInArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how the no :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the " + n + " number");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the data:");

		int data = sc.nextInt();
		

		int l = arr.length;

		int idx=-1;
		for (int i = 0; i < l; i++) {
			if (arr[i] == data) {
				idx=i;
				break;
			}
			
			
		}
		System.out.println(idx);

	}

}
