import java.util.*;

//create a class name ReverseString used to display the string in reverse.
public class ReverseString
{
	public static String ReverseString(String input)
	{
		//Store the reversed string.
		String reverse = " ";
		
		//create a loop to reverse the string.
		for (int i = input.length() - 1; i >= 0; i--)
		{
			reverse += input.charAt(i);
		}
		// Return the reversed string.
		return reverse;
	}
	
	public static void main (String args[])
	{
		//Create a scanner object to store the string.
		Scanner sc = new Scanner (System.in);
		
		//take input.
		String input = sc.nextLine();
		
		//Call method.
		String ReversedString = ReverseString(input);
		
		//Display the result.
		System.out.println("The reverse of string is : " + ReversedString);
	}
}