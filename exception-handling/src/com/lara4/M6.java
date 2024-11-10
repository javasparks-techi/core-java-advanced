package com.lara4;

public class M6 {
	public static void main(String[] args) throws ArithmeticException{
		test1();
	}
	static void test1() throws ArithmeticException
	{
		test2();
	}
	static void test2() throws ArithmeticException
	{
		int i = 10 / 0;
	}
}
