package com.oops;

class Student3 {
	int id;
	String name;

	void a(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		s1.a(101, "Tejas");
		s2.a(102, "Tej");
		s1.display();
		s2.display();
	}
}