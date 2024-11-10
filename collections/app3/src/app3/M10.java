package app3;

import java.util.HashSet;

class F
{
	int i, j;
	F(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "address:" + super.hashCode() + " and state: (" + i + "," + j + ")";
	}	
	public int hashCode()
	{
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		System.out.println("hash code for " + this + " is " + hash);
		return hash;
	}
	public boolean equals(Object obj)
	{
		boolean b1 = (i == ((F)obj).i)  &&  (j == ((F)obj).j);
		System.out.println("equals between " + this + " and " + obj + " is " + b1);
		return b1;
	}
}
public class M10 {
	public static void main(String[] args) {
		F f1 = new F(90, 1);
		F f2 = new F(90, 1);
		F f3 = new F(1, 90);
		F f4 = new F(1, 90);
		F f5 = new F(20, 90);
		F f6 = new F(90, 20);
		HashSet set = new HashSet();
		System.out.println("adding status of " + f1 + " is :" + set.add(f1));
		System.out.println("-------");
		System.out.println("adding status of " + f2 + " is :" + set.add(f2));
		System.out.println("-------");
		System.out.println("adding status of " + f3 + " is :" + set.add(f3));
		System.out.println("-------");
		System.out.println("adding status of " + f4 + " is :" + set.add(f4));
		System.out.println("-------");
		System.out.println("adding status of " + f5 + " is :" + set.add(f5));
		System.out.println("-------");
		System.out.println("adding status of " + f6 + " is :" + set.add(f6));
		System.out.println(set);
	}
}