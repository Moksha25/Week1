import java.util.Scanner;

public class CountSubString 
{

    public static int countSubstringOccurrences(String mainString, String substring) 
	{
        int count = 0; 
        int index = 0;

        while ((index = mainString.indexOf(substring, index)) != -1) 
		{
            count++; 
            index += substring.length(); 
        }

        return count; 
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring to search for: ");
        String substring = sc.nextLine();

        int occurrences = countSubstringOccurrences(mainString, substring);

        System.out.println("The substring " + substring + " occurs " + occurrences + " times in the main string.");

        sc.close();
    }
}
