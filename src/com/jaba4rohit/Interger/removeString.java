package com.jaba4rohit.Interger;

import java.util.Arrays;

public class removeString {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 0, 0, 0 };
		int b[] = { 2, 5, 6 };

		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				c[k] = a[i];
				i++;
				k++;
			
				System.out.println(Arrays.toString(c));
			
			}
			else {
				c[k] = b[j];
				j++;
				k++;
				System.out.println(Arrays.toString(c));
			}

		}
	
		

	}

}
