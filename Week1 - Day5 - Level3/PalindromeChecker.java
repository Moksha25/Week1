import java.util.Scanner;

public class PalindromeChecker 
{
    public static boolean isPalindromeIterative(String text) 
	{
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) 
			{
                return false;  
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) 
	{
        if (start >= end) 
		{
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) 
		{
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingArray(String text) 
	{
        char[] originalArray = text.toCharArray();
        
        char[] reversedArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) 
		{
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
        
        for (int i = 0; i < originalArray.length; i++) 
		{
            if (originalArray[i] != reversedArray[i]) 
			{
                return false;  
            }
        }
        return true;  
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        text = text.replaceAll("\\s", "").toLowerCase();

        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultArray = isPalindromeUsingArray(text);

        System.out.println("Is the text a palindrome (using iteration)? " + resultIterative);
        System.out.println("Is the text a palindrome (using recursion)? " + resultRecursive);
        System.out.println("Is the text a palindrome (using character arrays)? " + resultArray);

        sc.close();
    }
}
