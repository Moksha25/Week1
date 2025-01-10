import java.util.*;

// Creating Class with name CalculateProfit indicating the purpose is to display profit and profit percentage

public class CalculateProfit 
{
	public static void main (String args [])
	{
		// create int variable cost price and selling price
		int costprice = 129;
		int sellingprice = 191;
		
		// create double variable profit and profit percentage for calculation
		double profit = sellingprice - costprice ;
		double profitpercentage = profit / costprice * 100 ;
		
		//Display the result
		System.out.println("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellingprice);
		System.out.println("The profit is INR " + profit + " and the Profit Percentage is " + profitpercentage);
	}
}