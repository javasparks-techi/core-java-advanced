package com.lara.pack1;
class C
{
	int i;
	C(int i)
	{
		this.i = i;
	}
	
	@Override
	public String toString() {
		return "i = " + i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90);
		C c2 = new C(190);
		C c3 = null;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
