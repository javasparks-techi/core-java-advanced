package com.lara;

public class M15 {
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
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
