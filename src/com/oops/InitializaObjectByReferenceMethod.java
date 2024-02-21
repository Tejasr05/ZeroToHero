package com.oops;

public class InitializaObjectByReferenceMethod {
	
	int id;
	String name;
	
	public void method(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializaObjectByReferenceMethod obj1=new InitializaObjectByReferenceMethod();
		InitializaObjectByReferenceMethod obj2=new InitializaObjectByReferenceMethod();
		
		obj1.method(101, "Tejas");
		obj2.method(102, "ramesh");
		
		obj1.display();
		//obj2.display();
		System.out.println(obj2.id+" "+obj2.name);

	}

}
