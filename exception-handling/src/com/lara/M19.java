package com.lara;

public class M19 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("catch begin");
			try
			{
				System.out.println(3);
				int x = 10 / 0;
				System.out.println(4);
			}
			catch(ArithmeticException ex1)
			{
				System.out.println(5);
			}
			System.out.println("catch end");
		}
		System.out.println("main end");
	}
}
