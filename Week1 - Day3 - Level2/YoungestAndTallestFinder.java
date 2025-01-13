import java.util.Scanner;

//create a class name YoungestAndTallestFinder used to display the result who is youngest and tallest.
public class YoungestAndTallestFinder 
{

    public static void main(String[] args) 
	{
        // Define arrays to store age and height
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
		//create a scanner object to take input.
        Scanner sc = new Scanner(System.in);

        //take input from user.
        for (int i = 0; i < 3; i++) 
		{
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) 
		{
            if (ages[i] < ages[youngestIndex]) 
			{
                youngestIndex = i;
            }
        }

        // Find tallest friend
        int tallestIndex = 0;
		
        for (int i = 1; i < 3; i++) 
		{
            if (heights[i] > heights[tallestIndex]) 
			{
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
