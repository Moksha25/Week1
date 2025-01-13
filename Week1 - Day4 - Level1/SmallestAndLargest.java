import java.util.Scanner;

//create a class name SmallestAndLargest used to find the smallest and largest number.
public class SmallestAndLargest 
{

    // Method to find the smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) 
	{
        int[] result = new int[2]; // Array to store smallest and largest numbers
        int smallest, largest;

        // Find the smallest number
        smallest = Math.min(number1, Math.min(number2, number3));
        
        // Find the largest number
        largest = Math.max(number1, Math.max(number2, number3));

        // Store the results in the array
        result[0] = smallest; // smallest number
        result[1] = largest;  // largest number

        return result;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Get user input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
    }
}
