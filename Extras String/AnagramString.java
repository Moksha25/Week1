import java.util.Scanner;

public class AnagramString 
{
    
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) 
	{
        // Remove spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        
        // If the lengths are not equal, they can't be anagrams
        if (str1.length() != str2.length()) 
		{
            return false;
        }
        
        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        // Compare sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Accept input strings from the user
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) 
		{
            System.out.println("The strings are anagrams.");
        } 
		else 
		{
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
