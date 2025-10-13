public class StockProfit {
    public int maxprofit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice;
            }
        }
        return maxprofit;
    }
    public int maxprofit(int[] prices, int start, int end) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = start; i <= end; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        StockProfit sp = new StockProfit();
        int[] prices = {7, 5, 16, 3, 22, 4};
        System.out.println("Max profit (full array): " + sp.maxprofit(prices));
        System.out.println("Max profit (index 0 to 3): " + sp.maxprofit(prices, 0, 3));
    }
}
