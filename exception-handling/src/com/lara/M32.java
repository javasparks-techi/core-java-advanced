package com.lara;

public class M32 {
	public static void main(String[] args) {
		System.out.println(1);
		int i = 10 / 0;
		try
		{
			System.out.println(2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
	}
}
