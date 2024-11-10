package com.lara.pack1;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(190);
		System.out.println(a1);
		System.out.println(a2);
		A a3 = null;
		System.out.println(a3);
	}
}
