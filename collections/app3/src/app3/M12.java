package app3;

import java.util.HashSet;
import java.util.TreeSet;

public class M12 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(90);
		set.add(190);
		set.add(910);
		set.add(901);
		set.add(290);
		set.add(920);
		set.add(500);
		System.out.println(set);
		TreeSet set1 = new TreeSet<E>();
		set1.addAll(set);
		System.out.println(set1);
	}
}
