import java.util.Scanner;

//craete a class name MultiplicationTable  to display the table .
public class MultiplicationTable 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Print multiplication table for 6, 7, 8, and 9
        for (int i = 6; i <= 9; i++) 
		{
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
