import java.util.Scanner;

public class NumberFormatException 
{
    public static void generateNumberFormatException(String text) 
	{
        System.out.println("Attempting to parse the string as an integer...");
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormatException(String text) 
	{
        try 
		{
            System.out.println("Attempting to parse the string as an integer...");
            int number = Integer.parseInt(text); 
            System.out.println("Parsed number: " + number);
        } 
		catch (NumberFormatException e) 
		{
            System.out.println("Invalid number format.");
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

        System.out.print("Enter a number: ");
        String inputString = sc.nextLine();

        System.out.println("Generating NumberFormatException:");
		
        try 
		{
            generateNumberFormatException(inputString);
        } 
		catch (NumberFormatException e) 
		{
            System.out.println("Caught NumberFormatException during generation.");
        }

        System.out.println("Handling NumberFormatException:");
        handleNumberFormatException(inputString);

        sc.close();
    }
}
