import java.util.Arrays;

//create a class name FootballTeamHeights used to calculate the sum of heights
public class FootballTeamHeights 
{

    // Generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) 
	{
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) 
		{
            heights[i] = (int) (Math.random() * 101) + 150; // Range: 150 to 250
        }
        return heights;
    }

    // Method to calculate the sum of heights
    public static int calculateSum(int[] heights) 
	{
        int sum = 0;
        for (int height : heights) 
		{
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) 
	{
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) 
	{
        int shortest = heights[0];
        for (int height : heights) 
		{
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights)
	{
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) 
	{
        // Create an array of heights for 11 players
        int[] heights = generateHeights(11);

        // Display the generated heights
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));

        // Calculate and display the sum, mean, shortest, and tallest heights
        double meanHeight = calculateMean(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        System.out.println("Mean Height: " + meanHeight + " cm");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
    }
}
