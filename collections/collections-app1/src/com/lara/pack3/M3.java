package com.lara.pack3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

class SortEntriesBasedOnValues implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Entry entry1 = (Entry)o1;
		Entry entry2 = (Entry)o2;
		return ((Integer)entry1.getValue()).compareTo((Integer)entry2.getValue());
	}
}



public class M3 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 45);
		map.put("xyz", 405);
		map.put("pqr", 450);
		map.put("hello", 5);
		map.put("test", 4);
		map.put("java", 451);
		System.out.println(map);
		Set entries = map.entrySet();
		TreeSet sortedEntries = new TreeSet(new SortEntriesBasedOnValues());
		sortedEntries.addAll(entries);
		System.out.println(sortedEntries);
	}
}
