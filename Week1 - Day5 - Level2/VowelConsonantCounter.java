import java.util.Scanner;

public class VowelConsonantCounter 
{
    public static String checkCharacterType(char ch) 
	{
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
            return "Vowel";
        }
        else if ((ch >= 'a' && ch <= 'z')) 
		{
            return "Consonant";
        }
        else 
		{
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String text) 
	{
        int[] counts = new int[2]; 
        for (int i = 0; i < text.length(); i++) 
		{
            char ch = text.charAt(i);

            String result = checkCharacterType(ch);

            if (result.equals("Vowel")) 
			{
                counts[0]++;
            } 
			else if (result.equals("Consonant")) 
			{
                counts[1]++;  
            }
        }
        return counts;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        int[] counts = countVowelsAndConsonants(inputText);

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        sc.close();
    }
}
