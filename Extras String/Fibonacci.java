import java.util.Scanner;

public class Fibonacci {

    public static void generateFibonacci(int input) 
	{
        if (input <= 0) 
		{
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;

        if (input >= 1) 
		{
            System.out.print(a + " ");
        }

        if (input >= 2) 
		{
            System.out.print(b + " ");
        }

        for (int i = 3; i <= input; i++) 
		{
            int nextInput = a + b;
            System.out.print(nextInput + " ");
            a = b; 
            b = nextInput;  
        }

        System.out.println(); 
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int input = sc.nextInt();

        generateFibonacci(input);

        sc.close();
    }
}
