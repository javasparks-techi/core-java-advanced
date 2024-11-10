package app3;

import java.util.HashSet;

class E
{
	int i;
	E(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(" + i + ")";
	}	
	public int hashCode()
	{
		int hash = Integer.toString(i).hashCode();
		System.out.println("hash code for " + this + " is " + hash);
		return hash;
	}
	public boolean equals(Object obj)
	{
		boolean b1 = (i == ((E)obj).i);
		System.out.println("equals between " + this + " and " + obj + " is " + b1);
		return b1;
	}
}
public class M9 {
	public static void main(String[] args) {
		E e1 = new E(90);
		E e2 = new E(90);
		HashSet set = new HashSet();
		System.out.println("adding status of " + e1 + " is :" + set.add(e1));
		System.out.println("-------");
		System.out.println("adding status of " + e2 + " is :" + set.add(e2));
		System.out.println(set);
	}
}