import java.util.Scanner;

public class UniqueCharactersFinder 
{
    public static int findStringLength(String text) 
	{
        int length = 0;
        try {
            while (true) 
			{
                text.charAt(length); 
                length++; 
            }
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            // When exception occurs, we've reached the end of the string
        }
        return length;
    }

    public static char[] findUniqueCharacters(String text) 
	{
        int length = findStringLength(text);
        boolean[] isUnique = new boolean[length];
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) 
		{
            char currentChar = text.charAt(i);
            boolean isFound = false;

            for (int j = 0; j < i; j++) 
			{
                if (text.charAt(j) == currentChar) 
				{
                    isFound = true;  // If found, mark as not unique
                    break;
                }
            }

            if (!isFound) 
			{
                uniqueChars[uniqueCount++] = currentChar;  
            }
        }
		
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void displayUniqueCharacters(char[] uniqueChars) 
	{
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) 
		{
            System.out.print(c + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        displayUniqueCharacters(uniqueChars);

        sc.close();
    }
}
