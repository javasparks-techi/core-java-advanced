package com.lara.pack2;
class C
{
	int i;
	C(int i)
	{
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof C && i == ((C)obj).i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90);
		Integer ref = new Integer(90);
		System.out.println(c1.equals(ref));
	}
}
