import java.util.*;

public class RemoveChar 
{
	public static String RemoveChar(String input, char chartoremove)
	{
		StringBuilder modifiedString = new StringBuilder();
		
		for (int i=0; i <input.length(); i++)
		{
			char currentChar = input.charAt(i);
			
			 if (currentChar != chartoremove) 
			{
                modifiedString.append(currentChar);  // Append the character if it's not the one to remove
            }
		}
		return modifiedString.toString();
	}
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter string : ");
		String input = sc.nextLine();
		
		System.out.println("Enter character to remove from string : ");
		char chartoremove = sc.next().charAt(0);
		
		String result = RemoveChar(input, chartoremove);

        // Output the modified string
        System.out.println("Modified String: " + result);
	}
}