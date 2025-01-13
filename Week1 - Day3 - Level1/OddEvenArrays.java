import java.util.Scanner;

//create a class name odd even array used to display the even and odd bumbers entered by the user.
public class OddEvenArrays 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        //Check for natural number
        if (number <= 0) 
		{
            System.out.println("Error: Please enter a positive natural number.");
            return;
        }

        //Initialize arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        //Separate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) 
		{
            if (i % 2 == 0) 
			{
                evenNumbers[evenIndex++] = i;
            } 
			else 
			{
                oddNumbers[oddIndex++] = i;
            }
        }

        //Print the odd numbers array
        System.out.print("Odd numbers: ");
		
        for (int i = 0; i < oddIndex; i++) 
		{
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        //Print the even numbers array
        System.out.print("Even numbers: ");
		
        for (int i = 0; i < evenIndex; i++) 
		{
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
