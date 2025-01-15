import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops 
{
    public static String[] findCharacterFrequency(String text) 
	{
        char[] chars = text.toCharArray();
        int length = chars.length;

        int[] frequency = new int[length];
        String[] result = new String[length];

        for (int i = 0; i < length; i++) 
		{
            if (frequency[i] != 0) 
			{
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < length; j++) 
			{
                if (chars[i] == chars[j]) 
				{
                    frequency[i]++;
                    frequency[j] = 0;
                }
            }
        }

        int resultIndex = 0;
        for (int i = 0; i < length; i++) 
		{
            if (frequency[i] != 0) 
			{
                result[resultIndex] = "Character: " + chars[i] + " | Frequency: " + frequency[i];
                resultIndex++;
            }
        }

        return result;
    }

    public static void displayCharacterFrequency(String[] result) 
	{
        System.out.println("Character Frequency:");
        for (String res : result) 
		{
            if (res != null) 
			{
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findCharacterFrequency(text);

        displayCharacterFrequency(result);

        sc.close();
    }
}
