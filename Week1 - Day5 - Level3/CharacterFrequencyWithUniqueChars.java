import java.util.Scanner;

public class CharacterFrequencyWithUniqueChars 
{
    public static char[] uniqueCharacters(String text) 
	{
        int[] frequency = new int[256];
		
        for (int i = 0; i < text.length(); i++) 
		{
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) 
		{
            if (frequency[i] > 0) 
			{
                uniqueCharCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCharCount];
        int index = 0;
        for (int i = 0; i < 256; i++) 
		{
            if (frequency[i] > 0) 
			{
                uniqueChars[index] = (char) i;  
                index++;
            }
        }

        return uniqueChars;
    }

    public static String[][] findCharacterFrequency(String text) 
	{
        int[] frequency = new int[256];
		
        for (int i = 0; i < text.length(); i++) 
		{
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); 
        }

        return result;
    }

    public static void displayCharacterFrequency(String[][] result) 
	{
        for (int i = 0; i < result.length; i++) 
		{
            System.out.println( "Character : " + result[i][0] + " Frequency : " + result[i][1]);
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findCharacterFrequency(text);

        displayCharacterFrequency(result);

        sc.close();
    }
}
