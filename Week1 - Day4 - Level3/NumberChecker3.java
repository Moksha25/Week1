import java.util.Arrays;

//create class name NumberChecker3 used to find the sum of the digits
public class NumberChecker3 
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

    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) 
	{
        int sum = 0;
        for (int digit : digits) 
		{
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static int sumOfSquaresOfDigits(int[] digits) 
	{
        int sum = 0;
        for (int digit : digits) 
		{
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) 
	{
        int[] digits = storeDigitsInArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequencies(int[] digits) 
	{
        int[][] frequency = new int[10][2]; // 0-9 digits, frequency columns
        for (int i = 0; i < 10; i++) 
		{
            frequency[i][0] = i;
        }
        for (int digit : digits) 
		{
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) 
	{
        int number = 156; // Example number, can replace with user input
        
        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        // Store digits in an array
        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        // Find sum of digits
        int sumDigits = sumOfDigits(digitsArray);
        System.out.println("Sum of Digits: " + sumDigits);

        // Find sum of squares of digits
        int sumSquares = sumOfSquaresOfDigits(digitsArray);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        // Check Harshad Number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find digit frequencies
        int[][] frequencies = findDigitFrequencies(digitsArray);
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequencies) 
		{
            if (freq[1] > 0) 
			{
                System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
            }
        }
    }
}
