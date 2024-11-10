package com.lara.pack3;
class D
{
	int i;
	int j;
	double k;
	public D(int i, int j, double k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Double.toString(k);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		hash += s3.hashCode();
		return hash;
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10, 20, 4.5);
		D d2 = new D(10, 20, 4.5);
		D d3 = new D(20, 10, 4.5);
		D d4 = new D(20, 20, 5.5);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
	}
}







