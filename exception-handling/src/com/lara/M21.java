package com.lara;

public class M21 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 20; 
			System.out.println(2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("catch begin");
			int j = 90;
			System.out.println("catch end");
		}
		//System.out.println("main end:" + ex);
		//j = 190;
	}
}
