import java.util.Scanner;

public class StringIndexOutOfBounds 
{
    public static void generateStringIndexOutOfBoundsException(String text) 
	{
        System.out.println("Attempting to access index 10 of the string.");
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    public static void handleStringIndexOutOfBoundsException(String text) 
	{
        try 
		{
            System.out.println("Attempting to access index 10 of the string.");
            System.out.println("Character at index 10: " + text.charAt(10)); 
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            System.out.println("Invalid index access.");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.println("Generating StringIndexOutOfBoundsException:");
        try 
		{
            generateStringIndexOutOfBoundsException(inputString);
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            System.out.println("Caught StringIndexOutOfBoundsException during generation.");
        }

        System.out.println("Handling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(inputString);

        sc.close();
    }
}
