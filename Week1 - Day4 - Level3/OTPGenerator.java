import java.util.HashSet;
import java.util.Set;

//create a class name OTPGenerator used to check if OTPs are unique. 
public class OTPGenerator 
{

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateSixDigitOTP() 
	{
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to generate 10 unique OTPs and store in an array
    public static int[] generateOTPs(int count) 
	{
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) 
		{
            otps[i] = generateSixDigitOTP();
        }
        return otps;
    }

    // Method to check if OTPs are unique
    public static boolean areUniqueOTPs(int[] otps) 
	{
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) 
		{
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) 
	{
        int[] otps = generateOTPs(10);

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) 
		{
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areUniqueOTPs(otps);
        System.out.println("\nAre OTPs unique? " + (unique ? "Yes" : "No"));
    }
}
