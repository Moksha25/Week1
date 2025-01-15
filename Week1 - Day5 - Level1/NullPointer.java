import java.util.*;

public class NullPointer 
{
    public static void generateNullPointerException() 
	{
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointerException() 
	{
        String text = null;
        
        try 
		{
            System.out.println("Length of text: " + text.length());
        } 
		
		catch (NullPointerException e) 
		{
            System.out.println("Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) 
	{
        System.out.println("Generating NullPointerException:");
        try 
		{
            generateNullPointerException();
        } 
		
		catch (NullPointerException e) 
		{
            System.out.println("Caught a NullPointerException during generation.");
        }

        System.out.println("Handling NullPointerException:");
        handleNullPointerException();
    }
}
