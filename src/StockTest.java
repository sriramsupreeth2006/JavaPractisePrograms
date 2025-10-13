public class StockTest {
    static class Stock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;
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
        public String getSymbol() {
            return symbol;
        }
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation", 278.8);
        oracle.setCurrentPrice(289.0);
        System.out.printf("Stock: %s (%s)\nPriceChange: %.2f%%\n\n",
                oracle.getName(), oracle.getSymbol(), oracle.getChangePercent());
        Stock ola = new Stock("OLA", "ANI Technologies", 56.95);
        ola.setCurrentPrice(55.95);
        System.out.printf("Stock: %s (%s)\nPriceChange: %.2f%%\n\n",
                ola.getName(), ola.getSymbol(), ola.getChangePercent());
    }
}