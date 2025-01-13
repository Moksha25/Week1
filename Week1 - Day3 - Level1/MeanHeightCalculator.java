import java.util.Scanner;

//create a class name mean height calculator used to display the mean height of the players.
public class MeanHeightCalculator 
{
    public static void main(String[] args) 
	{
        //Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;  // Variable to store the sum of heights

        Scanner sc = new Scanner(System.in);

        //Take input from the user
        System.out.println("Enter the heights of 11 football team players (in cm):");
        
		for (int i = 0; i < 11; i++) 
		{
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            
            // Check for invalid height values
            while (heights[i] <= 0) 
			{
                System.out.print("Invalid height. Please enter a positive value for Player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
            }

            // Add the height to the sum
            sum += heights[i];
        }

        //Calculate the mean height
        double meanHeight = sum / 11;

        //Display the Result
        System.out.printf("The mean height of the football team is: " + meanHeight);
    }
}
