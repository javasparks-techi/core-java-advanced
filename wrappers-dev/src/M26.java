class M26 
{
	static void test(int ... args) // JDK1.5
	{
		System.out.println("var arg");
	}
	public static void main(String[] args) 
	{
		test();
		test(1);
		test(2, 4);
		test(40, 10);
		System.out.println("done");
	}
}
