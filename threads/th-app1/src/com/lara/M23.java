package com.lara;

public class M23 {
	public static void main(String[] args) {
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000, 500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
