import java.util.Scanner;

public class LowerCaseConversion 
{
    public static String convertToLowerCaseUsingCharAt(String text) 
	{
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) 
		{
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') 
			{
                result.append((char) (currentChar + 32));
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

        String lowerCaseBuiltIn = inputText.toLowerCase();

        String lowerCaseCharAt = convertToLowerCaseUsingCharAt(inputText);

        boolean isEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCharAt);

        System.out.println("Original text: " + inputText);
        System.out.println("Lowercase using built-in toLowerCase(): " + lowerCaseBuiltIn);
        System.out.println("Lowercase using charAt method: " + lowerCaseCharAt);
        System.out.println("Do both methods give the same result? " + (isEqual ? "Yes" : "No"));

        sc.close();
    }
}
