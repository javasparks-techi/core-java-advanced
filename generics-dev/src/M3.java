class A
{
	String obj;
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.obj = "hello";

		A a2 = new A();
		a2.obj = "xyz";

		A a3 = new A();
		a3.obj = "test";

		System.out.println("done");
	}
}
