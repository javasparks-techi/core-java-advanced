package com.lara.pack5;

import java.util.ArrayList;
import java.util.Collections;

class B implements Comparable
{
	int i;
	B(int i)
	{
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
	
	@Override
	public int compareTo(Object o) {
		int results = i - ((B)o).i;
		System.out.println("comparing " + this + " and " + o + " and the results:" + results);
		return results;
	}
	
}
public class M9 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new B(90));
		list.add(new B(9));
		list.add(new B(0));
		list.add(new B(80));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}






