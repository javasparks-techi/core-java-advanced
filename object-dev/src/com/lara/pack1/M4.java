package com.lara.pack1;
class D
{
	int i;
	int j;
	D(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "[i = " + i + ", j = " + j + "]";
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10, 20);
		D d2 = new D(190, 40);
		D d3 = null;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
