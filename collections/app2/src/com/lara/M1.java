package com.lara;

import java.util.LinkedList;

public class M1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(190);
		list.add(1190);
		list.add(1910);
		list.add(1901);
		list.add(1290);
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);

	}
}
