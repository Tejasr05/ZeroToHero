package com.oops;

public class InitializaObjectByConstructor {
	
	int id;
	String name;
	
	InitializaObjectByConstructor(int cid,String cname){
		this.id=cid;
		this.name=cname;
	}
	void display() {
		System.out.println(id+ " "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InitializaObjectByConstructor obj1=new InitializaObjectByConstructor(101, "Tejas");
		InitializaObjectByConstructor obj2=new InitializaObjectByConstructor(102, "Suresh");
		
		obj1.display();
		//obj2.display();
		System.out.println(obj2.id+" "+obj2.name);

	}

}
