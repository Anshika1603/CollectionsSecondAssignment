package knoldus.question3;

import java.util.HashMap;

public class StockPriceListing {
    public static void main(String[] args) {
        HashMap<String, Double> stocks=new HashMap<>();
        stocks.put("GOOG",728.29);
        stocks.put("AAPL",98.94);
        stocks.put("HPQ",13.87);
        stocks.put("MSFT",52.04);
        double highestPrice=0.0;
        // Finding Highest Price of Stocks
        for (double maxPrice:
             stocks.values()) {
            if(maxPrice>highestPrice)
            {
                highestPrice=maxPrice;
            }
        }
        System.out.println("Highest Price: "+highestPrice);
    }
}
