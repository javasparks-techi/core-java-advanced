import java.util.HashMap;
class M74 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("hello", 22);
		map.put("abc", 12);
		map.put("xyz", 42);
		System.out.println(map);
		int i = map.get("abc");
		System.out.println(i);
	}
}
