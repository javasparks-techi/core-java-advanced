package com.lara.pack5;

import java.util.ArrayList;
import java.util.Collections;

public class M2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(900);
		list.add(901);
		list.add(100);
		list.add(990);
		list.add(909);
		list.add(400);
		list.add(904);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
