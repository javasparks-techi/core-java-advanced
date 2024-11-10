package com.lara;

public class M12 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}
