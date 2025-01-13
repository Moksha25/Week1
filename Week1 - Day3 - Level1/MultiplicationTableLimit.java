import java.util.Scanner;

//create a class name multiplication table limit used to display the multiplication table.
public class MultiplicationTableLimit 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        //Define an array to store the multiplication results
        int[] multiplicationResult = new int[4];  // Array to store results for 6 to 9

        //Calculate multiplication table and store results in array
        for (int i = 6; i <= 9; i++) 
		{
            multiplicationResult[i - 6] = number * i;
        }

        // Step 4: Display the multiplication table
        System.out.println("Multiplication Table for " + number + " from 6 to 9:");
        
		for (int i = 6; i <= 9; i++) 
		{
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
