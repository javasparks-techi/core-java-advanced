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
class C implements A, B
{
}
class M23 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
