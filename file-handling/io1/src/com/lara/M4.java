package com.lara;

import java.io.File;

public class M4 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("hello4.java");
		boolean flag = f1.createNewFile();
		System.out.println("done:" + flag);
	}
}
