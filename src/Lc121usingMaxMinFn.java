public class Lc121usingMaxMinFn {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = 0;
        int profit = 0;
        for(int i = 0; i < n; i++){
            buy = Math.min(buy, prices[i]);
            sell = prices[i] - buy;
            profit = Math.max(profit, sell);
        }
        return profit;
    }
}
