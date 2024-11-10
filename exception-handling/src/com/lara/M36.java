package com.lara;

public class M36 {
	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			System.out.println(2);
			System.exit(0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println(5);
	}
}
