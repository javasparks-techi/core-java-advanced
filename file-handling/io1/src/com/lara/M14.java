package com.lara;

import java.io.File;

public class M14 {
	public static void main(String[] args) {
		File f1 = new File("D:/JDK8.0/dir3");
		System.out.println("a:" + f1.exists());
		System.out.println("b:" + f1.mkdir());
		System.out.println("c:" + f1.exists());
		System.out.println("done");
	}
}
