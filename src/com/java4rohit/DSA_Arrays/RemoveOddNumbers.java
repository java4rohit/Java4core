package com.java4rohit.DSA_Arrays;

import java.util.ArrayList;

public class RemoveOddNumbers {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i]%2==0) {

				al1.add(arr[i]);
			}
			else{
				al2.add(arr[i]);
			}
		}
		System.out.println(al1);
		System.out.println(al2);
	}

}
