import java.util.Arrays;

//create  a class name NumberChecker  used to store digits of the number in an array
public class NumberChecker 
{

    // Method to find the count of digits in the number
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) 
	{
        for (int i = 1; i < digits.length; i++) { // Skip leading zero check
            if (digits[i] == 0) 
			{
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) 
	{
        int[] digits = storeDigitsInArray(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) 
		{
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) 
	{
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) 
		{
            if (digit > largest) 
			{
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) 
			{
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) 
	{
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        
		for (int digit : digits) 
		{
            if (digit < smallest) 
			{
                secondSmallest = smallest;
                smallest = digit;
            } 
			else if (digit < secondSmallest && digit != smallest) 
			{
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) 
	{
        int number = 153; // Example number, can be replaced with user input
        
        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Store digits in an array
        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        // Check Duck Number
        boolean isDuck = isDuckNumber(digitsArray);
        System.out.println("Is Duck Number: " + isDuck);

        // Check Armstrong Number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest elements
        int[] largestElements = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest: " + largestElements[0] + ", Second Largest: " + largestElements[1]);

        // Find smallest and second smallest elements
        int[] smallestElements = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest: " + smallestElements[0] + ", Second Smallest: " + smallestElements[1]);
    }
}
