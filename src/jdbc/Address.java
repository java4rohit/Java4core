package com.java4rohit.jdbc;

public class Address {

	String HouseNo;
	String City;
	String State;
	String Pin_Code;
	String Id;

	public Address(String houseNo, String city, String state, String pin_Code, String id) {
		super();
		HouseNo = houseNo;
		City = city;
		State = state;
		Pin_Code = pin_Code;
		Id = id;
	}

	public String getId() {
		return Id;
	}

	public String getHouseNo() {
		return HouseNo;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getPin_Code() {
		return Pin_Code;
	}

	@Override
	public String toString() {
		return "Address [HouseNo=" + HouseNo + ", City=" + City + ", State=" + State + ", Pin_Code=" + Pin_Code
				+ ", Id=" + Id + "]";
	}

}
