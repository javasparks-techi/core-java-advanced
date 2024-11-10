class A < X >
{
	X obj;
}
class M34
{
	public static void main(String[] args) 
	{
		A < ? > a1 = null;
		a1 = new A<Integer>();


		
		a1.obj = 30;
		System.out.println("done");
	}
}
