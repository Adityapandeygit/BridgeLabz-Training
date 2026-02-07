package java_8_features.stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Claim {
    String claimType;
    double amount;

    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceClaimAnalysis {
	public static void main(String[] args) {
		List<Claim> claims = Arrays.asList(
	            new Claim("Health", 5000),
	            new Claim("Vehicle", 8000),
	            new Claim("Health", 7000),
	            new Claim("Vehicle", 6000),
	            new Claim("Home", 10000)
	        );
		Map<String, Double> avgClaimByType = claims.stream().collect(groupingBy(
                Claim::getClaimType,
                averagingDouble(Claim::getAmount)
            ));
		System.out.println(avgClaimByType);
	}

}
