package com.lara2;

public class M4 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int[] elements = new int[999999999];
			System.out.println(2);
		}
		catch(OutOfMemoryError err)
		{
			System.out.println(3);
		}
		System.out.println("main end");
	}
}
