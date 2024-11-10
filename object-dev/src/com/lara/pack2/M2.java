package com.lara.pack2;
class B
{
	int i;
	int j;
	public B(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.i == ((B)obj).i && this.j == ((B)obj).j;
	}
	
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10, 20);
		B b2 = new B(10, 20);
		B b3 = new B(20, 20);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b2.equals(b3));
		//System.out.println(b1.equals("abc"));
	}
}







