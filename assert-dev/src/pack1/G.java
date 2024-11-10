package pack1;

public class G {
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert test();
		System.out.println(2);
	}
	static boolean test()
	{
		return true;
	}
}
