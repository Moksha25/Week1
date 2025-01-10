import java.util.Scanner;

//create a class name CountDown used to display the count down of rocket launch.
public class CountDownFor
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter countdown start value : ");
		
		int counter = sc.nextInt();
		
		for (int i=counter; i >= 1; i--)
		{
			System.out.println(i);
		}
		System.out.println("Rocket Launched ! ");
    }
}
