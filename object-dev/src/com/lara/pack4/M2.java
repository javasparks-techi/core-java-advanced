package com.lara.pack4;

import java.util.HashMap;

public class M2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new A(10, 20, 30), "hello1");
		System.out.println("--------------:" + map);
		map.put(new A(10, 20, 30), "hello2");
		System.out.println("--------------:" + map);
		map.put(new A(20, 10, 30), "hello3");
		System.out.println("--------------:" + map);
		map.put(new A(20, 10, 30), "hello4");
		System.out.println("--------------:" + map);
		map.put(new A(30, 20, 10), "hello5");
		System.out.println("--------------:" + map);
		map.put(new A(30, 20, 10), "hello6");
		System.out.println("--------------:" + map);
		map.put(new A(300, 20, 10), "hello7");
		System.out.println("--------------:" + map);
		map.put(new A(30, 200, 10), "hello8");
		System.out.println("--------------:" + map);
		map.put(new A(30, 20, 100), "hello9");
		System.out.println("--------------:" + map);

	}
}
