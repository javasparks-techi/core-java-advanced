package com.lara4;

import java.sql.DriverManager;

public class M7 {
	public static void main(String[] args) throws Exception {
		test1();
	}
	static void test1() throws Exception
	{
		test2();
	}
	static void test2() throws Exception
	{
		Class.forName("");
		DriverManager.getConnection("");
		Thread.sleep(230);
	}
}
