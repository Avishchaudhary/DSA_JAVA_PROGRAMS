public class StockBuyAndSpan {
    public static void main(String[] args) {
        int prices[] = { 1, 5, 3, 8, 12 };
        int MaxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                int profit = prices[i] - prices[i - 1];// aise maine current prices mei se previous price ko minus kar
                                                       // diya
                // or jo profit mera nikla maine usko Maxprofit mei add karke rakh diya
                MaxProfit = MaxProfit + profit;// bus ab simply isko print karate hai
            }

        }
        System.out.println("The maximum Profit is " + MaxProfit);

    }
}