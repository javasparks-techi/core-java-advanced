package com.lara;

import java.io.File;

public class M2 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("hello2.html");
		f1.createNewFile();
		System.out.println("done");
	}
}
