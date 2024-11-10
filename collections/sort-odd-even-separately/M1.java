package com.example.o2m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M1 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(9);
		list.add(5);
		list.add("test");
		list.add(2);
		list.add(4);
		list.add(5);
		list.add("abc");
		list.add(1);
		list.add(20);
		list.add(13);
		list.add(50);
		list.add(40);
		list.add("xyz");
		System.out.println("initial given list: " + list);
		for(int i = 0; i < list.size(); i++) {
			try {
				int k = (Integer) list.get(i);
			}
			catch(ClassCastException ex) {
				list.remove(i);
				i--;
			}
		}
		System.out.println("list without strings:" + list);
		int left = 0, right = list.size() - 1;
		Object temp = null;
		while(left < right) {
			while(((Integer)list.get(left)) % 2 == 0) {
				left ++;
			}
			while(((Integer)list.get(right)) % 2 == 1) {
				right --;
			}
			temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left ++;
			right --;
		}
		System.out.println("list before sort:" + list);
		Collections.sort(list.subList(0, left), (c1, c2) -> ((Integer)c1).compareTo(((Integer)c2)));
		Collections.sort(list.subList(left, list.size()), (c1, c2) -> ((Integer)c2).compareTo(((Integer)c1)));
		System.out.println("sorted list:" + list);		
	}	
}
