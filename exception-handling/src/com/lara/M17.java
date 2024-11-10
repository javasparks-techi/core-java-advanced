package com.lara;

public class M17 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int x = 10 / 0;
		try
		{
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("from catch:" + ex.getMessage());
		}
		System.out.println("main end");
	}
}
