package com.java4rohit.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employees {
	int id;
	String name, address;

	Employees(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id + " " + name + " " + address);
	}

	public int hashCode() {
		return id * 10;
	}

	public boolean equals(Object o) {
		Employees e = (Employees) o;
		if (this.id == e.id)
			return true;

		else
			return false;

	}

}

public class HashSetDemo {

	public static void main(String[] args) {

		Employees e1 = new Employees(900, "rohit", "gkp");
		Employees e2 = new Employees(3000, "rahul", "okk");
		Employees e5 = new Employees(3000, "rahul", "okk");
		Employees e4 = new Employees(600, "anurag", "g");
		Employees e3 = new Employees(700, "avinasg", "kolkata");
		
	

		Set<Employees> h = new HashSet<Employees>();
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);

		System.out.println(h);
		Iterator<Employees> i = h.iterator();
		while (i.hasNext()) {
			Employees employees = i.next();

			employees.show();
		}

	}

}
