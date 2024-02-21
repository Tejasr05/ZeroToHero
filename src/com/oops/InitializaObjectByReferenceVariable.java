package com.oops;

public class InitializaObjectByReferenceVariable {
	
	int id;
	String name;
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		InitializaObjectByReferenceVariable obj=new InitializaObjectByReferenceVariable();
		obj.id=101;
		obj.name="Tejas";
		
		//System.out.println(obj.id+" "+obj.name);
		
		obj.display();
	

	}

}
