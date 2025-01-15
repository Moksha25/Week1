import java.util.Scanner;

public class ArrayIndexOutOfBounds 
{
    public static void generateArrayIndexOutOfBoundsException(String[] names) 
	{
        System.out.println("Attempting to access an index out of bounds...");
        System.out.println(names[10]); 
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) 
	{
        try 
		{
            System.out.println("Attempting to access an index out of bounds...");
            System.out.println(names[10]); 
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Invalid index.");
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

        System.out.print("Enter the number of names you want to input: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) 
		{
            names[i] = sc.nextLine();
        }

        System.out.println("Generating ArrayIndexOutOfBoundsException:");
        try 
		{
            generateArrayIndexOutOfBoundsException(names);
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Caught ArrayIndexOutOfBoundsException during generation.");
        }

        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);

        sc.close();
    }
}
