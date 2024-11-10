package com.lara.pack9;


class Thread1 extends Thread
{
	@Override
	public void run() {
		
		synchronized (this)
		{
			System.out.println("wait on " + this + " begin by " + Thread.currentThread().getName());
			try
			{
				this.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + this + " end by " + Thread.currentThread().getName());			
		}
	}
}

class Thread2 extends Thread
{
	Thread1 obj;
	Thread2(Thread1 obj)
	{
		this.obj = obj;
	}
	public void run() {
		
		synchronized (obj)
		{
			System.out.println("notify on " + obj + " begin by " + Thread.currentThread().getName());
			obj.notify();
			System.out.println("notify on " + obj + " end by " + Thread.currentThread().getName());			
		}
	}
}
public class M1 {
	public static void main(String[] args) throws InterruptedException{
		Thread1 t1 = new Thread1();
		t1.start();
		Thread.sleep(10000);
		System.out.println("main after 10 sec sleep");
		Thread2 t2 = new Thread2(t1);
		t2.start();
	}
}











