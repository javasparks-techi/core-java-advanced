package com.lara.pack1;

import java.util.HashMap;
import java.util.TreeMap;

class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	@Override
	public String toString() {
		return "(i = " + i + ")";
	}
	@Override
	public int compareTo(Object o) {
		return i - ((A)o).i;
	}
}
public class M14 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new A(90), "test1");
		map.put(new A(9), "test2");
		map.put(new A(0), "test3");
		map.put(new A(190), "test4");
		map.put(new A(910), "test5");
		map.put(new A(901), "test6");
		System.out.println(map);
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
		
		
	}
}
