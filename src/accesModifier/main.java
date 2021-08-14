package com.java4rohit.accesModifier;


	class  base {
		protected void foo() {}
	}
	
	class derivede extends base  {
		
		@Override
		protected void foo() {
			super.foo();
		}
		
	}
	
	public class main{
		
	public static void main(String[] args) {
		derivede d= new derivede();
		d.foo();
		
	}

}
