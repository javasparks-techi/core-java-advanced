class M27
{
	public static void main(String[] args) 
	{
		String s1 = new String("HelloHello");
							//  0123456789
		System.out.println(s1);
		int i = s1.indexOf("llo");
		System.out.println(i);
		i = s1.lastIndexOf("Hello");
		System.out.println(i);
		i = s1.indexOf("Hllo");
		System.out.println(i);
	}
}
