import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private StockService stockService;
    private ArrayList<Stock> stocks;

    public StockService getStockService() {
        return stockService;
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }
    public ArrayList<Stock> getStock() {
        return stocks;
    }
    public ArrayList<Stock> getStock(String ticker) {
        for(Stock stock : stocks) {
            if(stock.getTicker().equals(ticker)) {
                return new ArrayList<Stock>() {{ add(stock); }};
            }
        }
        return new ArrayList<>();
    }
    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }
    public double getMarketValue(){
        double marketValue = 0.0;

        for(Stock stock : stocks){
            marketValue += stockService.getPrice(stock) * stock.getQuantity();
        }
        return marketValue;
    }

    public int buyStock(String ticker, int quantity) {
        return  0;
    }

    public int sellStock(Stock stock) {
        return 0;
    }
}