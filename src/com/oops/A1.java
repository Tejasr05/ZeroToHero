package com.oops;


class A2{
	long acc_no;
	String name;
	float amount;
	
	void insert(long ano,String nam,float amt) {
		acc_no=ano;
		name=nam;
		amount=amt;
	}
	void display() {
		System.out.println(acc_no+ " "+name+" "+amount);
	}
	
	void balance() {
		System.out.println(" balance is: "+amount);
	}
	
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println("The deposited amount is: "+amt);
		System.out.println("Now the balance is: "+amount);
	}
	
	void withdraw(float amt) {
		amount=amount-amt;
		System.out.println("The withdraw amount is: "+amt);
		System.out.println("Now the balance is: "+amount);
	}
	
}
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj=new A2();
		obj.insert(641268399, "Tejas", 1000);
		obj.display();
		
		obj.balance();
		
		obj.deposit(5000);
		
		obj.withdraw(5000);

	}

}
