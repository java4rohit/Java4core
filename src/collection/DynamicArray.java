package com.java4rohit.collection;

/*
 * Design your own arrayList: dynamicArray
 */
public class DynamicArray {

	  private Object[] array;
	    private int length;
	    private int capacity = 0;
	    private int initialCapacity = 2;

	    public DynamicArray(int length) {
	        array = new Object[length];
	        this.length = length;
	    }

	  public DynamicArray() {
		  array = new Object[initialCapacity];
	        this.length = initialCapacity;
	  }

	    public void add(Object value) {
	        if (capacity >= length) {
	            int newlength = length * 2;
	            Object[] temp = new Object[newlength];
	            
	            //Copy to new array
	            copy(temp);
	            
	            length = newlength;
	            array = temp;
	            array[capacity] = value;
	        } else {
	            array[capacity] = value;
	        }
	        capacity++;
	    }



		private void copy(Object[] dest) {
			for (int i = 0; i < length; i++) {
			    dest[i] = array[i];
			}
		}
	    
	    public Object get(int i) {
	        if (i > capacity || i >= length) {
	            System.err.println("Capacity Exceeded");
	            return null;
	        }
	        final Object e =array[i];
	        return e;
	    }



		public Object[] getArray() {
			return array;
		}


	}
