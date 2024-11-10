package com.lara.pack2;
class E
{
	int i;
	E(int i)
	{
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof E) && (i == ((E) obj).i);
	}
}
class F
{
	int j;
	E e1;
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof F) && (j == ((F)obj).j) && (e1.equals(((F)obj).e1));
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(90);
		E e2 = new E(90);
		
		F f1 = new F();
		f1.j = 100;
		f1.e1 = e1;
		
		F f2 = new F();
		f2.j = 200;
		f2.e1 = e2;
		
		F f3 = new F();
		f3.j = 100;

		System.out.println(f1.equals(f2));
		System.out.println(1);
		System.out.println(f2.equals(f3));
		System.out.println(2);
		System.out.println(f3.equals(f1));
		System.out.println(3);
		System.out.println();
	}
}
