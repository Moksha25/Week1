import java.util.Scanner;

//creating class with name TotalPriceCalculator  indicating a purpose to display the the total price of items bought.

public class TotalPriceCalculator 
{
    public static void main(String[] args) 
	{
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //take input of Unit price and quantity
        double unitPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        //Display the result
        System.out.printf("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    }
}
