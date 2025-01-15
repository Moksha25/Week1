import java.util.Scanner;

public class StringCharacterComparison 
{

    public static char[] convertStringToCharArray(String input)
	{
        char[] charArray = new char[input.length()];
        
        for (int i = 0; i < input.length(); i++) 
		{
            charArray[i] = input.charAt(i);
        }
        
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) 
	{
        if (arr1.length != arr2.length) 
		{
            return false;
        }

        for (int i = 0; i < arr1.length; i++) 
		{
            if (arr1[i] != arr2[i]) 
			{
                return false;
            }
        }

        return true;  
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.next();

        char[] customArray = convertStringToCharArray(inputString);

        char[] builtInArray = inputString.toCharArray();

        boolean isEqual = compareCharArrays(customArray, builtInArray);

        System.out.println("Custom Method Output (character array): ");
		
        for (char c : customArray) 
		{
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Built-in Method Output (character array): ");
		
        for (char c : builtInArray) 
		{
            System.out.print(c + " ");
        }
        System.out.println();

        if (isEqual) 
		{
            System.out.println("The two arrays are identical.");
        } 
		else 
		{
			System.out.println("The two arrays are not identical.");
        }

        sc.close();
    }
}
