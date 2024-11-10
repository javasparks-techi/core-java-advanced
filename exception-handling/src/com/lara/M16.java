package com.lara;

public class M16 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch(NullPointerException ex)
		{
			System.out.println("from catch:" + ex.getMessage());
		}
		System.out.println("main end");
	}
}
