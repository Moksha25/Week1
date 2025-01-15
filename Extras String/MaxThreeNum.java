import java.util.*;

public class MaxThreeNum 
{
	public static void MaximumNumber(int num1, int num2, int num3)
	{
		int max = num1;
		
		if(num2 > max)
		{
			max = num2;
		}
		else if(num3 > max)
		{
			max = num3;
		}
		System.out.println("The maximum number is : " + max);
	}
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Number3 : ");
		int num3 = sc.nextInt();
		
		 // Call the method to find the maximum
        MaximumNumber(num1, num2, num3);
		
		sc.close();
	}
}