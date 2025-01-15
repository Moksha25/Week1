import java.util.Scanner;

public class VowelConsonantChecker 
{
    public static String checkCharacterType(char ch) 
	{
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
            return "Vowel";
        }
        else if (ch >= 'a' && ch <= 'z') 
		{
            return "Consonant";
        }
        else
		{
            return "Not a Letter";
        }
    }

    public static String[][] findVowelsAndConsonants(String text) 
	{
        int length = text.length();
        String[][] result = new String[length][2];  

        for (int i = 0; i < length; i++) 
		{
            char ch = text.charAt(i);
            String characterType = checkCharacterType(ch);
            result[i][0] = String.valueOf(ch);  
            result[i][1] = characterType;     
        }

        return result;
    }

    public static void displayResult(String[][] result) 
	{
        for (int i = 0; i < result.length; i++) 
		{
            System.out.printf("Character : "+ result[i][0] + " Type : " + result[i][1]);
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        String[][] result = findVowelsAndConsonants(inputText);

        displayResult(result);

        sc.close();
    }
}
