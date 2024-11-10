class A 
{
	static <T> void test(T obj1, T obj2)
	{
	}
}
class M65
{
	public static void main(String[] args) 
	{
		A.<Integer>test(100, 200);
		//A.<Integer>test("abc", "xyz");
		System.out.println("done");
	}
}
