import java.util.Arrays;
class M29
{
	public static void main(String[] args) 
	{
		int[] x = new int[10];
		byte[] y = new byte[10];
		x = y; //stmt1
		y = x; //stmt2
		System.out.println("done");
	}
}
