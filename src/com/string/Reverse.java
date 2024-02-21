package com.string;

public class Reverse {
	
	public static String reverseString(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseString("my name is Tejas"));  
	   
		System.out.println(method("I AM FROM BANGLORE"));
	    
	    }


	private static String method(String string) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer=new StringBuffer(string);
		sBuffer.reverse();
		
		return sBuffer.toString();
	}  

	}


