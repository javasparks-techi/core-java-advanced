package com.lara;

import java.util.Comparator;
import java.util.TreeSet;

public class M6 {
	public static void main(String[] args) {
		TreeSet<A> set = new TreeSet<A>((o1, o2) -> o1.i - o2.i);
		set.add(new A(90));
		set.add(new A(901));
		set.add(new A(910));
		set.add(new A(190));
		set.add(new A(290));
		System.out.println(set);
	}
}
