import java.util.Scanner;

//create a class name array sum calculator used to display the sum of entered numbers
public class ArraySumCalculator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // Array to store up to 10 numbers
        double total = 0.0;                 // Variable to store the sum
        int index = 0;                      // Index to track array position

        // Take input from user
        while (true) 
		{
			// Take input from user
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double num = sc.nextDouble();

            //Check conditions
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            //Store the number in the array and increment index
            numbers[index] = num;
            index++;
        }

        //Calculate the sum of entered numbers
        for (int i = 0; i < index; i++) 
		{
            total += numbers[i];
        }

        //Display the numbers and the total sum
        System.out.println("Numbers entered:");
		
        for (int i = 0; i < index; i++) 
		{
            System.out.print(numbers[i] + " ");
        }
        System.out.println("Sum of numbers: " + total);
    }
}
