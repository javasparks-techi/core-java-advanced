package com.lara.pack1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class B
{
	int i, j;
	B(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + "," + j + ")";
	}
}
class SortBasedOnI implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((B)o1).i - ((B)o2).i;
	}
}
class SortBasedOnJ implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((B)o1).j - ((B)o2).j;
	}
}




public class M15 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new B(90, 0), "test1");
		map.put(new B(9, 56), "test2");
		map.put(new B(0, 125), "test3");
		map.put(new B(190, 45), "test4");
		map.put(new B(910, 50), "test5");
		map.put(new B(901, 52), "test6");
		System.out.println(map);
		TreeMap map1 = new TreeMap(new SortBasedOnI());
		map1.putAll(map);
		System.out.println(map1);
		
		TreeMap map2 = new TreeMap(new SortBasedOnJ());
		map2.putAll(map);
		System.out.println(map2);
		
	}
}
