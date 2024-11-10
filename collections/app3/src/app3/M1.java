package app3;

import java.util.HashSet;

class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i = " + i + ")";
	}
	public int hashCode()
	{
		return i;
	}
	public boolean equals(Object obj)
	{
		return i == ((A)obj).i;
	}
}
public class M1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		System.out.println(set);
	}
}
