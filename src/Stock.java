public class Stock {
    private String stockId;
    private String ticker;
    private int quantity;

    public Stock(String stockId, String name, int quantity){
        this.stockId = stockId;
        this.ticker = name;
        this.quantity = quantity;
    }

    public String getStockId() {
        return stockId;
    }
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getTicker() {
        return ticker;
    }
}