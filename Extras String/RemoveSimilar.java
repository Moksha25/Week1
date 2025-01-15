import java.util.*;

//craete a class name remove similar used to remove the similar character from string.
public class RemoveSimilar 
{
	public static String RemoveSimilar(String input)
	{
		String result = "";
		
		for (int i = 0; i < input.length(); i++)
		{
			char currentChar = input.charAt(i);
			
			if (result.indexOf(currentChar) == -1)
			{
                result += currentChar;
            }
		}
		return result;
	}
	
	public static void main (String args[])
	{
		//Create a scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//Take input.
		String input = sc.nextLine();
		
		//call method
		String output = RemoveSimilar(input);
		
		//Disply the result
		System.out.println("Orignal String : " + input);
		System.out.println("Modified String : " + output);
	}
}