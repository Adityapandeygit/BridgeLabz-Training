package methods;

public class OTPGenerator {
	public static int generateOTP() {
        // Generates number between 100000 and 999999
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all unique
    }

    // Main method
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Validate uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Duplicate OTP found ");
        }
    }
}
