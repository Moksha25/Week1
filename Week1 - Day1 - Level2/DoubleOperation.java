import java.util.Scanner;

//create a class name DoubleOperation whose purpose is to display the result of given operation.

public class DoubleOperation 
{
    public static void main(String[] args) 
	{
		//create a scanner to take input
        Scanner scanner = new Scanner(System.in);
		
        // Take input integer values a, b, and c
		
        System.out.print("Enter the value for a: ");
        double a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        double b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        double c = scanner.nextInt();

        // Perform the operations
        double result1 = a + b * c;         // Multiplication(*) has higher precedence than addition(+)
        double result2 = a * b + c;         // Multiplication(*) has higher precedence than addition(+)
        double result3 = c + a / b;         // Division(/) has higher precedence than addition(+)
        double result4 = a % b + c;         // Modulus(%) has higher precedence than addition(+)

        // Display the results
        System.out.printf("The results of Double Operations are " + result1 + "," + result2 + "," + result3 + ", and " + result4);

    }
}
