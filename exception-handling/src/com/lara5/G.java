package com.lara5;

public class G {
	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(4);
			throw new ArithmeticException(ex.getMessage());
		}
		System.out.println(5);
	}
}
