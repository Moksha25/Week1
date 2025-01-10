import java.util.Scanner;

//creating class with name HandshakeCal  indicating a purpose to display the the total price of items bought.

public class HandshakeCal 
{
    public static void main(String[] args) 
	{
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //take input of number of students
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        //Display the result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

    }
}
