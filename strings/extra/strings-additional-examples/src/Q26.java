//26. How do you find the most repeated word in a 
//text file in java?
import java.io.*;
import java.util.*;
class Q26
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();
		try(FileReader fin = 
			new FileReader("E:\\strings-app\\src\\test.txt");
		    BufferedReader bin = new BufferedReader(fin))
		{
			String line = bin.readLine();
			String[] words;
			while(line != null)
			{
				words = line.split(" ");
				for(String word : words)
				{
					if(map.get(word) == null)
					{
						map.put(word, 1);
					}
					else
					{
						map.put(word, map.get(word) + 1);
					}
				}
				line = bin.readLine();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(map);
	}
}


/*
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
	List<Map.Entry<String, Integer>> list = 
							new ArrayList<>(entries);
		Collections.sort(list, 
					(e1, e2) -> e2.getValue() - e1.getValue());
		int i = 0;
		System.out.println(list.get(i));
		while(list.get(i).getValue() == list.get(++i).getValue())
		{
			System.out.println(list.get(i));
		}


	}
}
