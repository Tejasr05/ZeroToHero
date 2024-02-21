package com.string;

public class ToString {
  
	 int rollno;  
	 String name;  
	 String city;  
	  
	
	  
	 public ToString(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}



	@Override
	public String toString() {
		return "ToString [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}



	public static void main(String args[]){  
		 ToString s1=new ToString(101,"Raj","lucknow");  
		 ToString s2=new ToString(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	} 