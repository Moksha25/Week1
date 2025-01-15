import java.util.Scanner;

public class StringLength 
{
    public static int getStringLengthWithoutLengthMethod(String text) 
	{
        int count = 0;
        try 
		{
            while (true) 
			{
                text.charAt(count);  
                count++; 
            }
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            return count;  
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.next();

        int lengthWithoutMethod = getStringLengthWithoutLengthMethod(inputText);

        int lengthWithMethod = inputText.length();

        System.out.println("Length using user-defined method: " + lengthWithoutMethod);
        System.out.println("Length using built-in length() method: " + lengthWithMethod);

        if (lengthWithoutMethod == lengthWithMethod) 
		{
            System.out.println("Both methods give the same result.");
        } 
		else 
		{
            System.out.println("The results do not match.");
        }

        sc.close();
    }
}
