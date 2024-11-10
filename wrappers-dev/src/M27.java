class M27
{
	static void test(int ... args)
	{
		System.out.println("var arg:" + args.length);
	}
	public static void main(String[] args) 
	{
		test();
		test(1);
		test(2, 4);
		test(40, 10, 5);
		test(40, 10, 5, 45, 100);
		System.out.println("done");
	}
}
