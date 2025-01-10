import java.util.Scanner;

//create a class name IntOperation whose purpose is to display the result of given operation.

public class IntOperation 
{
    public static void main(String[] args) 
	{
		//create a scanner to take input
        Scanner scanner = new Scanner(System.in);
		
        // Take input integer values a, b, and c
		
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for c: ");
        int c = scanner.nextInt();

        // Perform the operations
        int result1 = a + b * c;         // Multiplication(*) has higher precedence than addition(+)
        int result2 = a * b + c;         // Multiplication(*) has higher precedence than addition(+)
        int result3 = c + a / b;         // Division(/) has higher precedence than addition(+)
        int result4 = a % b + c;         // Modulus(%) has higher precedence than addition(+)

        // Display the results
        System.out.printf("The results of Int Operations are " + result1 + "," + result2 + "," + result3 + ", and " + result4);

    }
}
