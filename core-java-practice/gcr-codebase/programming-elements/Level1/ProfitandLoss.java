package Level_1_Practice_Programs;

public class ProfitandLoss {
	public static void main(String[] args) {
		int cp = 129;
		int sp = 191;
		int profit = sp-cp;
		int loss  = cp-sp;
		double profitper = (profit*100)/cp;
		double lossper = (loss/cp)*100;
	
		System.out.println("The Cost Price is INR" +cp+ "Selling Price is INR"+sp);
		System.out.println("The Profit is INR "+profit+"The Profit Percentage is"+profitper);
		
	}
}
