class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("The price change percentage is: " + stock.getChangePercent() + "%");
    }
}
