package com.lara;
interface E{
	void test1(int i);
}
public class M9 {
	static void m1(double i) {
		System.out.println("done:" + i);
	}
	
	public static void main(String[] args) {
		E e1 = M9 :: m1;
		e1.test1(45);
		//e1.test1(4.5);
	}
}
