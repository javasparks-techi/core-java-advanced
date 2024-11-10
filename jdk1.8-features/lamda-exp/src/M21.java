interface A
{
	void test1();
	public static void test2()
	{
		System.out.println("from A.test2()");
	}
}
class B implements A
{
	public void test1()
	{
		System.out.println("from B.test1");
	}
}
class C implements A
{
	public void test1()
	{
		System.out.println("from C.test1");
	}
}
class D implements A
{
	public void test1()
	{
		System.out.println("from D.test1");
	}
}
class M21 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		C c1 = new C();
		c1.test1();
		D d1 = new D();
		d1.test1();
		//B.test2();
		A.test2();
		System.out.println("done");
	}
}
