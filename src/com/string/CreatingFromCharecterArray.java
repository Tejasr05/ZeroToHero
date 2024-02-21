package com.string;

public class CreatingFromCharecterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars= {'T','E','J','A','S'};
		String str=new String(chars);
		System.out.println(str); // TEJAS
		
		
		//Allocates a String from a uni_code_array but choose count characters from the start_index.
		int[] uni_code= {72,73,90,83};
		String obj=new String(uni_code,0,3);
		System.out.println(obj); //HIZ
		
		System.out.println(str.charAt(4)); //S
		
		//
		String str1=new String(chars,2,2);
		System.out.println(str1);        //JA
		
		
		//Allocates a new string from the string in strBuffer
		StringBuffer strBuffer=new StringBuffer("welcome");
		String strFromBuffer=new String(strBuffer);
		System.out.println(strFromBuffer); //welcome
		
		
		//Allocates a new string from the string in strBuilder
		StringBuilder strBuilder=new StringBuilder("welcome");
		String strFromBuilder=new String(strBuilder);
		System.out.println(strFromBuilder);//welcome
		
		

	}

}
