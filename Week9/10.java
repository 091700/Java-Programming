class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            return 0;
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    public double getCurrentPrice() {
        return currentPrice;
    }
}
public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", "Apple Inc.");
        stock.setPreviousClosingPrice(150.00);
        stock.setCurrentPrice(152.50);
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: $" + stock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + stock.getCurrentPrice());
        System.out.println("Change Percent: " + stock.getChangePercent() + "%");
    }
}
