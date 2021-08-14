package com.java4rohit.ooad.principle;

public class Address1 {
	
		private String houseno;
		private String city;
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
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Address1 [houseno=" + houseno + ", city=" + city + ", contact=" + contact + "]";
		}
		
		
		
}
