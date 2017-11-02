// source: https://www.tutorialspoint.com/easymock/easymock_first_application.htm

import java.util.ArrayList;

public class Portfolio {
    private StockService stockService;
    private ArrayList<Stock> stocks;

    // methods
    Portfolio() {
        stocks = new ArrayList<>();
    }
    void setStockService(StockService stockService) {
        this.stockService = stockService;
    }
    ArrayList<Stock> getStock(String ticker) {
        for(Stock stock : stocks) {
            if(stock.getTicker().equals(ticker)) {
                return new ArrayList<Stock>() {{ add(stock); }};
            }
        }
        return new ArrayList<>();
    }
    int buyStock(String ticker, int quantity) {
        stocks.add(stockService.purchase(ticker, quantity));
        stocks.get(stocks.size() - 1).setStockId(Integer.toString(stocks.size() - 1));
        return 0;
    }
}