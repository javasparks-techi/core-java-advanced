class A
{
	@Deprecated
	void test1()
	{
	}
	void test2()
	{
	}
}
class M17 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();
		System.out.println("Hello World!");
	}
}
