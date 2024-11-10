package com.lara.pack1;

import java.util.TreeMap;

public class M13 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(12, "test");
		map.put(1, "test3");
		map.put(null, "abc");
		map.put(10, "xyz");
		map.put(2, 500);
		System.out.println(map);
	}
}
