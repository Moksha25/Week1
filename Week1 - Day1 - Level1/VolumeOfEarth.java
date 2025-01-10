import java.util.*;

// Creating Class with name VolumeOfEarth indicating the purpose is to display the vloume of earth in km^3 and miles^3.

public class VolumeOfEarth
{
	public static void main (String args [])
	{
		// create int variable radius in km
		int radius = 6378 ;
		
		// create double variable volumeinkm, volumeinmiles.
		double volumeinkm = (4/3) * Math.PI * Math.pow(radius,3);
		double volumeinmiles = (4/3) * Math.PI * Math.pow(radius,3) / (double)1.6 ;
		
		//Display the result
		System.out.println("The volume of earth in cubic kilometers is " + volumeinkm + " and cubic miles is " + volumeinmiles);
	}
}