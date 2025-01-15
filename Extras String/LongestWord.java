import java.util.*;

//create a class name longest word used to display the longest word in sentence.
public class LongestWord
{
	public static String LongestWord(String input)
	{
		//Split the sentence into words.
		String[] words = input.split(" ");
		
		//Store the result.
		String result = "";
		
		//Find the longest word.
		for (String word : words)
		{
			if ( word.length() > result.length() )
			{
				result = word ;
			}
		}
		return result;
	}
	
	public static void main (String args[])
	{
		//Create a scanner object to take input.
		Scanner sc = new Scanner(System.in);
		
		//Take input.
		String input = sc.nextLine();
		
		String output = LongestWord(input);
		
		//Display the result
		System.out.println("The longest word in sentence is : " + output);
	}
}