package app3;

import java.util.HashSet;

public class M4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add("hello"));
		System.out.println(set.add("hello"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("xyz"));
		System.out.println(set.add("xyz"));
		System.out.println(set);
	}
}
