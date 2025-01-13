import java.util.Arrays;

//create a class name RandomNumberStats used to generate an array of 4-digit random numbers
public class RandomNumberStats
{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) 
	{
        int[] randomNumbers = new int[size];
        
        // Generating 4-digit random numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000; // Range between 1000 and 9999
        }
        
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum values of the array
    public static double[] findAverageMinMax(int[] numbers) 
	{
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        // Calculating the sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Calculating the average
        double average = sum / numbers.length;
        
        // Returning the average, min, and max as an array
        return new double[] { average, min, max };
    }

    public static void main(String[] args) 
	{
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        // Find the average, min, and max values
        double[] stats = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
