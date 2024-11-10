import java.util.ArrayList;
class M75 
{
	static void test(ArrayList<?> list)
	{
		list.add(90);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		test(list);
		list.add(20);
		System.out.println(list);
	}
}
