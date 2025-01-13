import java.util.Scanner;

//create a class name ChocolateDistribution used to calculate the number of chocolate each child gets and the remaining chocolate.
public class ChocolateDistribution 
{

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) 
	{
        int[] result = new int[2]; // Array to store chocolates each child gets and the remaining chocolates
        
        // Calculate the chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        
        // Calculate the remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Store the results in the array
        result[0] = chocolatesPerChild;  // chocolates each child gets
        result[1] = remainingChocolates; // remaining chocolates
        
        return result;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of chocolates and the number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to find the chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the results
        System.out.println("Each child will get: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        scanner.close();
    }
}
