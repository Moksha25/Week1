import java.util.Arrays;

//create a class name NumberChecker5 used to check if a number is prime,  neon, automorphic number, buzz or spy number.
public class NumberChecker5 
{

    // Method to check if a number is prime
    public static boolean isPrimeNumber(int number) 
	{
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) 
		{
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) 
	{
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) 
		{
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) 
	{
        int sum = 0, product = 1;
        while (number > 0) 
		{
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) 
	{
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) 
	{
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) 
	{
        int number = 5; // Example number for demonstration

        System.out.println("Number: " + number);

        // Check if prime
        boolean prime = isPrimeNumber(number);
        System.out.println("Is Prime Number: " + prime);

        // Check if neon number
        boolean neon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + neon);

        // Check if spy number
        boolean spy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + spy);

        // Check if automorphic number
        boolean automorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number: " + automorphic);

        // Check if buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + buzz);
    }
}
