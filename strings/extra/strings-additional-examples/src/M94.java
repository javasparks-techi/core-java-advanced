import java.util.Date;
import java.util.Calendar;
class M94
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
