class M24
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void test1(Number obj)
	{
		System.out.println("test1(Number)");
	}
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);  
		System.out.println("done");
	}
}
