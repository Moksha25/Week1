import java.util.*;

//create a class name number analysis used to display that the numbers are positive, negative or zero.
public class NumberAnalysis
{
	public static void main (String args[])
	{
		//create a scanner object to take the input 
		Scanner sc = new Scanner (System.in);
		int numbers[] = new int[5];
		
		//create a loop to take input
		for (int i=0; i < numbers.length; i++)
		{
			System.out.println("Enter the number : " + (i+1));
			numbers[i] = sc.nextInt();
		}
		
		for (int number : numbers)
		{
			// check if the number is positive
			if (number > 0)
			{
				//check if the number is even or odd
				if (number % 2 == 0)
				{
					System.out.println("The number " + number +" is positive and even.");
				}
				else
				{
					System.out.println("The number " + number + " is positive and odd.");
				}
			}
			//check if the number is negative or zero
			else if (number < 0)
			{
				System.out.println("The number " + number + " is negative.");
			}
			else
			{
				System.out.println("The number " + number + " is zero.");
			}
		}
		
		int firstElement = numbers[0];
		int lastElement = numbers[numbers.length - 1];
		
		//compare the first element and last element that it is equsal, greater, or less.
		if (firstElement == lastElement )
		{
			System.out.println("The first element and last element are equal.");
		}
		else if (firstElement > lastElement)
		{
			System.out.println("The first element is greater than the last element.");
		}
		else
		{
			System.out.println("The first element is less than the last number.");
		}
	}
}