import java.util.Scanner;

//create a class name multiplication table
public class MultiplicationTable 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //take input from the user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();

        //Define an array to store multiplication results
        int[] table = new int[10];

        //Compute and store multiplication results in the array
        for (int i = 1; i <= 10; i++) 
		{
            table[i - 1] = number * i;
        }

        //Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
		
        for (int i = 1; i <= 10; i++) 
		{
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
