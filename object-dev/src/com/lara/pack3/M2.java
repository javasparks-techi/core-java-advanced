package com.lara.pack3;
class B
{
	int i;
	
	B(int i)
	{
		this.i = i;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(90);
		B b2 = new B(90);
		B b3 = new B(90);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
	}
}
