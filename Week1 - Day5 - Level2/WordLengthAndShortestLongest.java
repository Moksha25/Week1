import java.util.Scanner;

public class WordLengthAndShortestLongest 
{
    public static String[] splitTextWithoutSplitMethod(String text) 
	{
        int length = getStringLengthWithoutLengthMethod(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                wordCount++;
            }
        }
		
        String[] words = new String[wordCount + 1];

        int wordStart = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ' || i == length - 1) 
			{
                int wordEnd = (i == length - 1) ? i + 1 : i; 
                words[wordIndex++] = text.substring(wordStart, wordEnd);
                wordStart = i + 1;
            }
        }

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

    public static String[][] getWordLengths(String[] words) 
	{
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) 
		{
            wordLengths[i][0] = words[i]; 
            wordLengths[i][1] = String.valueOf(words[i].length()); 
        }

        return wordLengths;
    }

    public static int[] findShortestAndLongest(String[][] wordLengths) 
	{
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordLengths.length; i++) 
		{
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < minLength) 
			{
                minLength = length;
                result[0] = i; 
            }
            if (length > maxLength) 
			{
                maxLength = length;
                result[1] = i; 
            }
        }
        return result;
    }

    public static void displayShortestAndLongest(String[][] wordLengths, int[] result) 
	{
        System.out.println("Shortest Word: " + wordLengths[result[0]][0] + " (Length: " + wordLengths[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordLengths[result[1]][0] + " (Length: " + wordLengths[result[1]][1] + ")");
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        String[] words = splitTextWithoutSplitMethod(inputText);

        String[][] wordLengths = getWordLengths(words);

        int[] result = findShortestAndLongest(wordLengths);

        displayShortestAndLongest(wordLengths, result);

        sc.close();
    }
}
