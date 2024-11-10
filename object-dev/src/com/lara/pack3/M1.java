package com.lara.pack3;
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
		A a2 = new A(90);
		A a3 = a2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}
