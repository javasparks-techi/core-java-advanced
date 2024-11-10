import java.util.Date;
class M91
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		System.out.println(d1);
		System.out.println(d2);
	}
}
