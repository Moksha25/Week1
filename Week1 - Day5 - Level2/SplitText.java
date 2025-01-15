import java.util.Scanner;

public class SplitText 
{
    public static String[] splitTextWithoutSplitMethod(String text) 
	{
        int wordCount = 0;
        int length = getStringLengthWithoutLengthMethod(text);
        
        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                wordCount++;
            }
        }

        String[] words = new String[wordCount + 1];

        int[] spaceIndexes = new int[wordCount];
        int spaceIndex = 0;

        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                spaceIndexes[spaceIndex++] = i;
            }
        }

        int wordStart = 0;
        for (int i = 0; i < wordCount; i++) 
		{
            int wordEnd = spaceIndexes[i];
            words[i] = text.substring(wordStart, wordEnd);
            wordStart = wordEnd + 1;  
        }
        words[wordCount] = text.substring(wordStart);

        return words;
    }

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
	
    public static boolean compareStringArrays(String[] arr1, String[] arr2) 
	{
        if (arr1.length != arr2.length) 
		{
            return false;  
        }
        for (int i = 0; i < arr1.length; i++) 
		{
            if (!arr1[i].equals(arr2[i])) 
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
        String inputText = sc.nextLine();

        String[] wordsWithoutSplit = splitTextWithoutSplitMethod(inputText);

        String[] wordsWithSplit = inputText.split(" ");

        boolean areEqual = compareStringArrays(wordsWithoutSplit, wordsWithSplit);

        System.out.println("\nWords using user-defined method: ");
        for (String word : wordsWithoutSplit) 
		{
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Words using built-in split() method: ");
        for (String word : wordsWithSplit) 
		{
            System.out.print(word + " ");
        }
        System.out.println();

        if (areEqual) 
		{
            System.out.println("\nBoth methods give the same result.");
        } 
		else 
		{
            System.out.println("\nThe results do not match.");
        }

        sc.close();
    }
}
