package com.lara4;

public class M4 {
	public static void main(String[] args) throws ClassNotFoundException {
		test1();
	}
	static void test1() throws ClassNotFoundException
	{
		test2();
	}
	static void test2() throws ClassNotFoundException
	{
		Class.forName("");
	}
}
