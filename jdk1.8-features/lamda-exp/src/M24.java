interface A
{
	default void test()
	{
		System.out.println("from A ==> test");
	}
}
interface B
{
	default void test()
	{
		System.out.println("from B ==> test");
	}
}
class C implements A
{
	int i = 10;
}
class M24
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test();
		System.out.println("Hello World!");
	}
}
