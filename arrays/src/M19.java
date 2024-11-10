class M19
{
	public static void main(String[] args) 
	{
		int []x = new int[5];
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		for(int i : x)  // JDK 1.5
		{
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println(java.util.Arrays.toString(x));
	}
}
