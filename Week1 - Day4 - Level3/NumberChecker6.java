import java.util.ArrayList;

//create a class name NumberChecker6 used to display result.
public class NumberChecker6 
{

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) 
	{
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor of a number (excluding the number itself)
    public static int findGreatestFactor(int number) 
	{
        int[] factors = findFactors(number);
        return (factors.length > 1) ? factors[factors.length - 2] : 1;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) 
	{
        int sum = 0;
        for (int factor : factors) 
		{
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int productOfFactors(int[] factors) 
	{
        int product = 1;
        for (int factor : factors) 
		{
            product *= factor;
        }
        return product;
    }

    // Method to find product of cube of the factors
    public static double productOfCubeOfFactors(int[] factors) 
	{
        double product = 1;
        for (int factor : factors) 
		{
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) 
	{
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) 
	{
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) 
	{
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) 
	{
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    // Helper method to calculate factorial
    private static int factorial(int num) 
	{
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) 
	{
        int number = 28; // Example input for demonstration

        System.out.println("Number: " + number);
        
        // Finding factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        
        // Finding greatest factor
        int greatestFactor = findGreatestFactor(number);
        System.out.println("Greatest Factor (excluding number itself): " + greatestFactor);
        
        // Sum and product of factors
        int sumFactors = sumOfFactors(factors);
        int productFactors = productOfFactors(factors);
        double cubeProductFactors = productOfCubeOfFactors(factors);

        System.out.println("Sum of Factors: " + sumFactors);
        System.out.println("Product of Factors: " + productFactors);
        System.out.println("Product of Cube of Factors: " + cubeProductFactors);
        
        // Checking number properties
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
