import java.util.Scanner;

public class SubstringComparison 
{
    public static String createSubstring(String str, int start, int end) 
	{
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) 
		{
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String str1, String str2) 
	{
        return str1.equals(str2);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = sc.next();

        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();
		
        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();

        String substringUsingCharAt = createSubstring(inputString, startIndex, endIndex);

        String substringUsingSubstringMethod = inputString.substring(startIndex, endIndex);

        boolean areSubstringsEqual = compareStrings(substringUsingCharAt, substringUsingSubstringMethod);

        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingSubstringMethod);
        System.out.println("Are the two substrings equal? " + areSubstringsEqual);

        sc.close();
    }
}
