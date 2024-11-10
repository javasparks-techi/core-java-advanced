package com.lara.pack1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M7 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("abc", 23344);
		map1.put(345, "rty");
		map1.put(3.4, true);
		map1.put('a', "xyz");
		map1.put("test", 456);		
		Set entries = map1.entrySet();
		Entry entry;
		for(Object obj : entries)
		{
			entry = (Entry) obj;
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
