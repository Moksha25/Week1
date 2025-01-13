import java.util.Scanner;

//create a class name reverse number array used to reverse a number.
public class ReverseNumberArray 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the count of digits in the number
        int tempNumber = number;
        int count = 0;
		
        while (tempNumber != 0) 
		{
            tempNumber /= 10;
            count++;
        }

        // Store digits in an array
        int[] digits = new int[count];
        int index = 0;
        
        while (number != 0) 
		{
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
		
        for (int i = 0; i < count; i++) 
		{
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
