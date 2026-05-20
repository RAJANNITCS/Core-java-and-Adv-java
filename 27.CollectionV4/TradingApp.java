// WAP to create Trading app 

// Price Object 

import java.util.concurrent.ConcurrentHashMap;

class StockPrice {

    // Stock symbol
    String symbol;

    // Current price
    double price;

    // Constructor
    public StockPrice(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    // ToString method
    @Override
    public String toString() {
        return this.symbol + " : " + this.price;
    }

}

public class TradingApp {
    public static void main(String[] args) {
        // Thread-safe map 
        ConcurrentHashMap<String, StockPrice> market = new ConcurrentHashMap<>();

        // Add prices
        market.put("TCS", new StockPrice("TCS", 3900));

        market.put("INFY", new StockPrice("INFY", 1450));

        // Read
        System.out.println(market.get("TCS"));
    }
}
