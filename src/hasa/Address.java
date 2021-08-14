package com.java4rohit.hasa;

import java.io.Serializable;

public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Address(String houseno, String city, String state, String contact) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.state = state;
		this.contact = contact;
	}
	private String houseno;
	private String city;
	private String state ;
	private String contact;
	
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + ", state=" + state + ", contact=" + contact + "]";
	}
	
	
	
	

}
