package m1.SmartBank;

public class CreditRiskProcessor {
	public static boolean validateCustomerDetails(int age, String employmentType,
            double monthlyIncome, double dues,
            int creditScore, int defaults)
            		throws InvalidCreditDataException {
		if (age < 21 || age > 65) {
            throw new InvalidCreditDataException("Invalid age");
        }

        // Employment Type validation
        if (!(employmentType.equals("Salaried") || employmentType.equals("Self-Employed"))) {
            throw new InvalidCreditDataException("Invalid employment type");
        }

        // Monthly Income validation
        if (monthlyIncome < 20000) {
            throw new InvalidCreditDataException("Invalid monthly income");
        }

        // Dues validation
        if (dues < 0) {
            throw new InvalidCreditDataException("Invalid credit dues");
        }

        // Credit Score validation
        if (creditScore < 300 || creditScore > 900) {
            throw new InvalidCreditDataException("Invalid credit score");
        }

        // Defaults validation
        if (defaults < 0) {
            throw new InvalidCreditDataException("Invalid default count");
        }

        return true;
	}
	
	public static double calculateCreditLimit(double monthlyIncome, double dues,
            int creditScore, int defaults) {
		double debtRatio = dues / (monthlyIncome * 12);
		// High Risk
        if (creditScore < 600 || defaults >= 3 || debtRatio > 0.4) {
            return 50000;
        }

        // Low Risk
        if (creditScore >= 750 && defaults == 0 && debtRatio < 0.25) {
            return 300000;
        }

        // Medium Risk
        return 150000;
	}
}
