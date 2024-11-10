package com.lara.pack3;
class C
{
	int i, j;
	C(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public int hashCode() {
		return i + j;
	}	
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(10, 20);
		C c2 = new C(10, 20);
		C c3 = new C(20, 10);
		C c4 = new C(15, 15);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
	}
}
