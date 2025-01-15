import java.util.Scanner;

//Create a class name StringComparison used to compare the string length.
public class StringComparison 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Taking two strings as input
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        // Call the compareStrings method to compare the two strings
        int result = compareStrings(str1, str2);

        // Print the result based on the comparison
        if (result < 0) 
		{
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } 
		else if (result > 0) 
		{
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order");
        } 
		else 
		{
            System.out.println("Both strings are equal.");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) 
	{
        int len1 = str1.length();
        int len2 = str2.length();
        
        int minLength = Math.min(len1, len2);
        
        // Compare each character of the two strings
        for (int i = 0; i < minLength; i++) 
		{
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if (c1 < c2) 
			{
                return -1; // str1 is lexicographically smaller
            } 
			else if (c1 > c2) 
			{
                return 1; // str1 is lexicographically greater
            }
        }

        // If all characters are equal, the shorter string is considered smaller
        if (len1 < len2) 
		{
            return -1; // str1 is lexicographically smaller
        } 
		else if (len1 > len2) 
		{
            return 1; // str1 is lexicographically greater
        }

        return 0; // Both strings are equal
    }
}
