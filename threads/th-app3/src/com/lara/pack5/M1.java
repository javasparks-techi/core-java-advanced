package com.lara.pack5;
class Employee
{
	//several members
}
class A extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
class B extends Employee implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		A a2 = new A();
		a2.start();
		A a3 = new A();
		a3.start();
		
		
		B b1 = new B();
		Thread t1 = new Thread(b1);
		t1.start();
		
		Thread t2 = new Thread(b1);
		t2.start();
		
		Thread t3 = new Thread(b1);
		t3.start();
		
		
		
		
		
		
		
	}
}









