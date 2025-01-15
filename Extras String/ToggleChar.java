import java.util.*;

//create a class name ToggleChar used to convert the upper charachter into lower and vice versa. 
public class ToggleChar 
{
    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) 
	{
        StringBuilder toggledString = new StringBuilder();

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) 
		{
            char ch = str.charAt(i);

            // If the character is lowercase, convert it to uppercase
            if (Character.isLowerCase(ch)) 
			{
                toggledString.append(Character.toUpperCase(ch));
            }
            // If the character is uppercase, convert it to lowercase
            else if (Character.isUpperCase(ch)) 
			{
                toggledString.append(Character.toLowerCase(ch));
            } 
            // If it's neither (like digits or punctuation), just append it as is
            else 
			{
                toggledString.append(ch);
            }
        }

        // Return the toggled string
        return toggledString.toString();
    }
	
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        // Taking the input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the toggleCase method to toggle the case of each character
        String result = toggleCase(input);

        // Output the result
        System.out.println("String after toggling the case: " + result);
    }
}
