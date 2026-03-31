package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    @Override
    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}
public class InvoiceGenerator {
	public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T1001", "T1002", "T1003", "T1004");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new) 
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
