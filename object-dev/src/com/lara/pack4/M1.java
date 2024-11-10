package com.lara.pack4;

import java.util.HashSet;

class A
{
	int i, j, k;

	public A(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public String toString() {
		return "(" + i + "," + j + "," + k + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean b1 = (obj instanceof A) &&
				     (i == ((A)obj).i) &&
				     (j == ((A)obj).j) &&
				     (k == ((A)obj).k);
		System.out.println("equals b/w " + this + " and " + obj + " is " + b1);
		return b1;
	}
	
	
	@Override
	public int hashCode() {
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		hash += Integer.toString(k).hashCode();
		System.out.println("hashCode for " + this + " is " + hash);
		return hash;
	}
}
public class M1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new A(100, 200, 300));
		System.out.println("-----------");
		set.add(new A(100, 200, 300)); //no addition
		System.out.println("-----------");
		set.add(new A(200, 100, 300));
		System.out.println("-----------");
		set.add(new A(200, 100, 300)); //no addition
		System.out.println("-----------");
		set.add(new A(100, 300, 200));
		System.out.println("-----------");
		set.add(new A(100, 300, 200)); //no addition
		System.out.println("-----------");
		set.add(new A(300, 200, 100));
		System.out.println("-----------");
		set.add(new A(300, 200, 100)); //no addition
		System.out.println("-----------");
		set.add(new A(300, 200, 1000));
		System.out.println("-----------");
		set.add(new A(300, 2000, 100));
		System.out.println("-----------");
		set.add(new A(3000, 200, 100));
		System.out.println("-----------");
		set.add(new A(3000, 2000, 100));
		System.out.println("-----------");
		System.out.println(set);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}







