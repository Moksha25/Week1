import java.util.Scanner;

//create a class name CountDown used to display the count down of rocket launch.
public class CountDown
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter countdown start value : ");
		
		int counter = sc.nextInt();
		
		while (counter >= 1)
		{
			System.out.println(counter);
			counter--;
		}
		System.out.println("Rocket Launched ! ");
    }
}
