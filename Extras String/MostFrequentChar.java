import java.util.*;

//create a class name MostFrequentChar used to find the most frequent character in string.
public class MostFrequentChar 
{
	public static char MostFrequentChar(String input)
	{
		// Create an array to store the frequency of each character (assuming ASCII characters)
		int frequency = new int[256];
		
		// Iterate through the string and count the frequency of each character
		for (int i=0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			
			frequency [ch]++;      // Increment the frequency of the character
		}
		
		// Variables to track the most frequent character
		char mostFrequentChar = input.charAt(0);
		
		int maxCount = frequency[mostFrequentChar];
		
		// Iterate through the frequency array to find the character with the maximum frequency
		for (int i=1; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if (frequency[ch] > maxCount) 
			{
                mostFrequentChar = ch;
                maxCount = frequency[ch];
            }
		}
		// Return the most frequent character
		return mostFrequentChar;
	}
	
	public static void main (String args[])
	{
		//create a scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		string input = sc.nextLine();
		
		char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: " + result);
}