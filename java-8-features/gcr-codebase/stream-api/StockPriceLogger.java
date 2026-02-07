package java_8_features.stream_Api;

import java.util.Arrays;
import java.util.List;

class Stock {
    String name;
    double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Stock> stocks = Arrays.asList(
		        new Stock("TCS", 3450.50),
		        new Stock("INFY", 1560.75),
		        new Stock("RELIANCE", 2450.00)
		);
		
		stocks.stream().forEach(stock -> System.out.println(stock.name));
	}
}
