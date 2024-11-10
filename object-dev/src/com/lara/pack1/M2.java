package com.lara.pack1;
class B
{
	int i;
	B(int i)
	{
		this.i = i;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(90);
		B b2 = new B(190);
		B b3 = null;
		String s1 = "first obj " + b1;
		String s2 = "2nd obj " + b2;
		String s3 = "3rd obj " + b3;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
