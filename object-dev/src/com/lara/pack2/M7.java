package com.lara.pack2;
class I
{
	int x;
	I(int x)
	{
		this.x = x;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof I) && (x == ((I)obj).x);
	}
}

class J extends I
{
	int y;

	public J(int x, int y) {
		super(x);
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof J) && (y == ((J)obj).y) && super.equals(((J)obj));
	}
	
}
public class M7 {
	public static void main(String[] args) {
		J obj1 = new J(90, 10);
		J obj2 = new J(90, 10);
		J obj3 = new J(90, 20);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj1));
		System.out.println(obj2.equals(obj3));
		
	}
}








