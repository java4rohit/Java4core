package com.java4rohit.ArraysList;

import java.util.ArrayList;
import java.util.List;

public class ArraysListFindPrimeNo {

	public static boolean isPrime(int val) {

		if (val == 0 || val == 1) {
			return true;
		}
		for (int i = 2; i <= val - 1; i++) {
			if (val % i == 0) {
				return true;
			}

		}
		return false;

	}

	private static void solution(List<Integer> l, ArrayList<Integer> al) {
		for (int i = l.size() - 1; i >= 0; i--) {
			int val = l.get(i);
			if (isPrime(val) == true) {
				al.add(val); /// this is not a prime value
				l.remove(i);

			}

		}

	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<>();
		l.add(3);
		l.add(1);
		l.add(0);
		l.add(12);
		l.add(13);
		l.add(15);
		System.out.println(l);
		solution(l, al);
		System.out.println("prime no is:" + l);
		System.out.println("not a prime no:" + al);

	}

}
