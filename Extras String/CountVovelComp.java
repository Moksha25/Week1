import java.util.*;

//create a class name countvovelcomp used to display the total number of vovel and component in string.
public class CountVovelComp
{
	public static void CountVovelComp(String input)
	{
		//convert the string to lower case.
		input = input.toLowerCase();
		
		//initialize the variables.
		int countVovel = 0;
		int countComponent = 0;
		
		//loop to count the number of vovels and components.
		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				countVovel++;
			}
			else
			{
				countComponent++;
			}
		}
		System.out.println("The number of vovels : " + countVovel);
		System.out.println("The number of components : " + countComponent);
	}
	
	public static void main (String args[])
	{
		//create a scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//take input.
		String input = sc.nextLine();
		
		//call the method.
		CountVovelComp(input);
	}
}