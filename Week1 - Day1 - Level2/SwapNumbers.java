import java.util.*;
//create a class name SwapNumbers whose purpose is to display swaped numbers.

public class SwapNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take the first number as input
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        // Take the second number as input
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the output
        System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");

    }
}
