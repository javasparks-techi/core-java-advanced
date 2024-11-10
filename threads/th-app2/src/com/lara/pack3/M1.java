package com.lara.pack3;

class A
{
	static void test1()
	{
		Thread t1 = Thread.currentThread();
		synchronized (A.class)
		{
			for(int i = 1; i <= 1000; i++)
			{
				System.out.println("from test1 with " + i + " by " + t1.getName());
			}
		}
	}
	static void test2()
	{
		Thread t1 = Thread.currentThread();
		synchronized (A.class)
		{
			for(int i = 1; i <= 1000; i++)
			{
				System.out.println("from test2 with " + i + " by " + t1.getName());
			}
		}
	}	
}

class Thread1 extends Thread
{
	@Override
	public void run() {
		A.test1();
	}
}

class Thread2 extends Thread
{
	@Override
	public void run() {
		A.test2();
	}
}



public class M1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}
}







