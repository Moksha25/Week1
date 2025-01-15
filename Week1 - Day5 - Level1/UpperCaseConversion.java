import java.util.Scanner;

public class UpperCaseConversion 
{
    public static String convertToUpperCaseUsingCharAt(String text) 
	{
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) 
		{
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') 
			{
                result.append((char) (currentChar - 32));
            } 
			else 
			{
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) 
	{
        return str1.equals(str2);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        String upperCaseBuiltIn = inputText.toUpperCase();

        String upperCaseCharAt = convertToUpperCaseUsingCharAt(inputText);

        boolean isEqual = compareStrings(upperCaseBuiltIn, upperCaseCharAt);

        System.out.println("\nOriginal text: " + inputText);
        System.out.println("Uppercase using built-in toUpperCase(): " + upperCaseBuiltIn);
        System.out.println("Uppercase using charAt method: " + upperCaseCharAt);
        System.out.println("\nDo both methods give the same result? " + (isEqual ? "Yes" : "No"));

        sc.close();
    }
}
