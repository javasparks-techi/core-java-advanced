package com.lara.pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class C
{
	int i, j;

	public C(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "C [i=" + i + ", j=" + j + "]";
	}
}

class SortBasedOnIValue implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((C)o1).i - ((C)o2).i;
	}
}
class SortBasedOnJValue implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((C)o1).j - ((C)o2).j;
	}
}
public class M10 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new C(10, 20));
		list.add(new C(20, 10));
		list.add(new C(5, 15));
		list.add(new C(15, 8));
		System.out.println(list);
		Collections.sort(list, new SortBasedOnIValue());
		System.out.println(list);
		Collections.sort(list, new SortBasedOnJValue());
		System.out.println(list);
	}
}







