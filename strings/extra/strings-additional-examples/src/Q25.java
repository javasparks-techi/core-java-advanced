//25. How do you find the number of characters, 
//words and lines in the given text file in java?
import java.io.*;
class Q25 
{
	public static void main(String[] args) 
	{
		int lineCount = 0, wordCount = 0, charCount = 0;
		try(FileReader fin = 
			new FileReader("E:\\strings-app\\src\\test.txt");
		    BufferedReader bin = new BufferedReader(fin))
		{
			String line = bin.readLine();
			String[] words;
			while(line != null)
			{
				lineCount ++;
				words = line.split(" ");
				wordCount += words.length;
				charCount += line.length();
				line = bin.readLine();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("number of lines:" + lineCount);
		System.out.println("number of words:" + wordCount);
		System.out.println("number of chars:" + charCount);
	}
}
