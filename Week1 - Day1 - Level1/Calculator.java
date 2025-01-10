import java.util.*;

// Creating Class with name Basic calculator indicating the purpose is to display the addition, substraction, multiplication, and division.

public class Calculator
{
	public static void main (String args [])
	{
		//create scanner to take input 
		Scanner sc = new Scanner(System.in);
		
		//take the value of two numbers in float variable
		float Num1 = sc.nextFloat();
		float Num2 = sc.nextFloat();
		
		// Addition
		float Add = Num1 + Num2 ;
		
		// Substraction
		float Sub = Num1 - Num2 ;
		
		// Multiplication
		float Mul = Num1 * Num2 ;
		
		// Division
		float Div = Num1 / Num2 ;
		
		//Display the result
		System.out.println("The addition, substration, multiplication and division value of 2 numbers " + Num1 + " and " + Num2 + " is " + Add + "," + Sub + "," + Mul + "," + Div + ".");
	}
}