import java.util.Scanner;

public class CharacterFrequency 
{
    public static String[][] findCharacterFrequency(String text) 
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

        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) 
		{
            if (frequency[i] > 0) 
			{
                result[index][0] = String.valueOf((char) i);  
                result[index][1] = String.valueOf(frequency[i]); 
                index++;
            }
        }

        return result;
    }
	
    public static void displayCharacterFrequency(String[][] result) 
	{
        for (int i = 0; i < result.length; i++) 
		{
            System.out.println( " Character : " + result[i][0] + " Frequency : " + result[i][1]);
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
