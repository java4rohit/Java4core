package com.java4rohit.jdbc;

public class Student {
	String Name;
	String RollNo;
	String branch;
	String addressiId;
	Address address;

	public Student(String name, String rollNo, String branch) {
		super();
		Name = name;
		RollNo = rollNo;
		this.branch = branch;
	}

	public Student(String name, String rollNo, String branch, Address address) {
		super();
		Name = name;
		RollNo = rollNo;
		this.branch = branch;
		this.address = address;
	}

	public Student(String name, String rollNo, String branch, String addressiId) {
		super();
		Name = name;
		RollNo = rollNo;
		this.branch = branch;
		this.addressiId = addressiId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public String getRollNO() {
		return RollNo;
	}

	public String getBranch() {
		return branch;
	}

	public String getAddressiId() {
		return addressiId;
	}

	public void setAddressiId(String addressiId) {
		this.addressiId = addressiId;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", RollNo=" + RollNo + ", branch=" + branch + ", addressiId=" + addressiId
				+ ", address=" + address + "]";
	}

}
