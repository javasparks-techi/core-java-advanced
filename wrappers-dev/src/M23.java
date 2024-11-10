class M23
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void test1(Byte obj)
	{
		System.out.println("test1(Byte)");
	}
	static void test1(double d1)
	{
		System.out.println("test1(double)");
	}
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);  
		System.out.println("done");
	}
}
