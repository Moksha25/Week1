import java.util.Scanner;

public class StringTrimAndCompare 
{
    public static int[] trimSpaces(String text) 
	{
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') 
		{
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') 
		{
            end--;
        }

        return new int[] { start, end };
    }

    public static String createSubstring(String text, int start, int end) 
	{
        StringBuilder substring = new StringBuilder();

        for (int i = start; i <= end; i++) 
		{
            substring.append(text.charAt(i));
        }

        return substring.toString();
    }

    public static boolean compareStrings(String str1, String str2) 
	{
        if (str1.length() != str2.length()) 
		{
            return false;
        }

        for (int i = 0; i < str1.length(); i++) 
		{
            if (str1.charAt(i) != str2.charAt(i)) 
			{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String inputText = sc.nextLine();

        int[] indices = trimSpaces(inputText);
        String trimmedText = createSubstring(inputText, indices[0], indices[1]);

        String builtInTrimmedText = inputText.trim();

        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);

        System.out.println("Trimmed text using charAt(): " + trimmedText);
        System.out.println("Trimmed text using built-in trim(): " + builtInTrimmedText);
        System.out.println("Are both trimmed texts equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
