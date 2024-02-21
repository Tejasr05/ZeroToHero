package com.string;

public class CreatingFromAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	/*	String str1="I m ttending ninterview" ;
		String str2=new String(str1.replace(" ", "a"));
		System.out.println(str2);
	*/
		
		String str1="Tejas";
		String str2=new String(str1);
		
		System.out.println(str1 == str2);
		System.out.println(str2.equals(str1));

	}

}
