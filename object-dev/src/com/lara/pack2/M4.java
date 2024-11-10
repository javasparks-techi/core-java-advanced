package com.lara.pack2;
class D
{
	int i;
	int j;
	public D(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = (obj instanceof D) &&
				       i == ((D) obj).i &&
				       j == ((D) obj).j;		
		return flag;
	}	
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10, 20);
		D d2 = new D(10, 20);
		D d3 = new D(20, 10);
		System.out.println(d1.equals(d2));
		System.out.println(d2.equals(d3));
		System.out.println(d3.equals(d1));
		System.out.println(d1.equals("hello"));
	}
}
