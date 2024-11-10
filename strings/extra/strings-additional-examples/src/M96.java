import java.util.Date;
import java.util.Calendar;
class M96
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 3);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
