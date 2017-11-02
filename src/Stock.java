// source: https://www.tutorialspoint.com/easymock/easymock_first_application.htm

public class Stock {
    private String stockId;
    private String ticker;
    private int quantity;

    // constructor
    Stock(String stockId, String ticker, int quantity){
        this.stockId = stockId;
        this.ticker = ticker;
        this.quantity = quantity;
    }

    // override equals() for assertEquals in test
    @Override
    public boolean equals(Object o) {
        if(o instanceof Stock) {
            Stock stock = (Stock) o;
            if (!stockId.equals(stock.getStockId())) return false;
            if (!ticker.equals(stock.ticker)) return false;
            if (quantity != stock.getQuantity()) return false;
            return true;
        }
        else return false;
    }

    // methods
    String getStockId() {
        return stockId;
    }
    void setStockId(String stockId) {
        this.stockId = stockId;
    }
    int getQuantity() {
        return quantity;
    }
    String getTicker() {
        return ticker;
    }
}