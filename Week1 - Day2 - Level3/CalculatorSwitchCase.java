import java.util.Scanner;

public class CalculatorSwitchCase 
{
    public static void main(String[] args) 
	{
        // Create variables to store user input
        double first, second;
        String op;

        // Create a scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Taking input for first number, operator, and second number
        System.out.print("Enter the first number: ");
        first = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = sc.next();

        System.out.print("Enter the second number: ");
        second = sc.nextDouble();

        // Perform operation using switch case
        double result;
        switch (op) 
		{
            case "+":
                result = first + second;
                System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
                break;
            case "/":
                if (second != 0) 
				{
                    result = first / second;
                    System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
                } 
				else 
				{
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
				
            default:
			
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                
				break;
        }
    }
}
