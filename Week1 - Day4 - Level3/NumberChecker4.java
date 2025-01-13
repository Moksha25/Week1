import java.util.Arrays;

//create a class name NumberChecker4 used to reverse the digits array.
public class NumberChecker4 
{

    // Method to count the number of digits in a number
    public static int countDigits(int number) 
	{
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits of the number in an array
    public static int[] storeDigitsInArray(int number) 
	{
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) 
		{
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) 
	{
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) 
		{
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays for equality
    public static boolean areArraysEqual(int[] array1, int[] array2) 
	{
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) 
	{
        int[] digits = storeDigitsInArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) 
	{
        int[] digits = storeDigitsInArray(number);
        for (int i = 1; i < digits.length; i++) // Start from index 1 to skip leading zeros
		{
			if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) 
	{
        int number = 12321; // Example number for demonstration

        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Store digits in an array
        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        // Reverse digits array
        int[] reversedArray = reverseDigitsArray(digitsArray);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversedArray));

        // Check if arrays are equal
        boolean arraysEqual = areArraysEqual(digitsArray, reversedArray);
        System.out.println("Are Arrays Equal: " + arraysEqual);

        // Check if the number is a palindrome
        boolean palindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + palindrome);

        // Check if the number is a duck number
        boolean duckNumber = isDuckNumber(number);
        System.out.println("Is Duck Number: " + duckNumber);
    }
}
