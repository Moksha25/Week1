import java.util.Scanner;

public class IllegalArgumentException 
{
    public static void generateIllegalArgumentException(String text) 
	{
        System.out.println("Attempting to call substring with invalid indices...");
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    public static void handleIllegalArgumentException(String text) 
	{
        try 
		{
            System.out.println("Attempting to call substring with invalid indices...");
            String result = text.substring(5, 2); 
            System.out.println("Substring: " + result);
        } 
		catch (IllegalArgumentException e) 
		{
            System.out.println("Invalid substring indices.");
            System.out.println("Error Message: " + e.getMessage());
        } 
		catch (RuntimeException e) 
		{
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.println("Generating IllegalArgumentException:");
        try 
		{
            generateIllegalArgumentException(inputString);
        } 
		catch (IllegalArgumentException e) 
		{
            System.out.println("Caught IllegalArgumentException during generation.");
        }

        System.out.println("Handling IllegalArgumentException:");
        handleIllegalArgumentException(inputString);

        sc.close();
    }
}
