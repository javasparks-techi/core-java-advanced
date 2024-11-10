package com.lara.pack4;
class A extends Thread
{
	A(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
class B extends Thread
{
	B(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
class C implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M1 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("myFirstGroup");
		A a1 = new A(tg, "firstThread");
		A a2 = new A(tg, "secondThread");
		B b1 = new B(tg, "thirdThread");
		B b2 = new B(tg, "fourthThread");
		
		C c1 = new C();
		Thread t1 = new Thread(tg, c1, "5thThread");
		Thread t2 = new Thread(tg, c1, "6thThread");
		
		a1.start();
		a2.start();
		b1.start();
		b2.start();
		t1.start();
		t2.start();
		
		tg.stop();
	}
}









