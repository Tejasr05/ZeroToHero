package com.string.method;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. int length() : Returns the number of characters in the String.
		
		String str="Iamattendinganinterview";
		System.out.println(str.length()); //23
		
		//2.Char charAt(int i) : Returns the character at ith index.
		
		System.out.println(str.charAt(20)); //i
		
		//3 . String substring (int i) : Return the substring from the ith  index character to end.
		
		System.out.println(str.substring(5)); //tendinganinterview
		
		//4.  String substring (int i, int j) : Returns the substring from i to j-1 index.
		
		System.out.println(str.substring(5,20)); //tendinganinterv
		
		//5. String concat( String str) : Concatenates specified string to the end of this string.
		
		String str1="abc";
		String str2="def";
		String result= str1.concat(str2);
		System.out.println(result);// abcdef
		
		//6. int indexOf (String s) : Returns the index within the string of the first occurrence of the specified string.
            
		String str3="I m ttending ninterview";
		System.out.println(str3.indent(20)); //indent means space                     I m ttending ninterview
		System.out.println(str3.indexOf("ttending"));//4 //I m //4 GAP after ttending it is starting
		
		//7.Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.
	    System.out.println(str3.lastIndexOf("m")); //2
	    System.out.println(str3.replaceFirst(" ", "a")); //Iam ttending ninterview
	    System.out.println(str3.replace(" ", "a"));//Iamattendinganinterview
	    
	    //8. boolean equals( Object otherObj): Compares this string to the specified object.
	    boolean b="Tejas".equals("Tejas");
	    System.out.println(b);
	    
	    boolean c="tejas".equals("Tejas");
	    System.out.println(c);
	    
	    //9. String toLowerCase() : Converts all the characters in the String to lower case.
	    String s="Hello World!";
	    System.out.println(s.toLowerCase());// hello world!
	    
	    String s1="Hello World!";
	    System.out.println(s1.toUpperCase()); // HELLO WORLD!
	    
	    //10.  String trim():  Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
	    String s2="  hello world !  ";
	    System.out.println(s2.trim());//hello world !
	    
	    //11.boolean contain string
	    
	    String a1="Hello";
	    String a2="Hello world";
	    System.out.println(a1.contains(a2));//false
	    System.out.println(a2.contains(a2));//true
	    
	    //12. Char[] toCharArray(): Converts this String to a new character array.
	    String t="Tejas";
	    char []ch=t.toCharArray();
	    System.out.println(ch);
	    
	    
	}

}
