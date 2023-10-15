public class Lc121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = 0;
        int profit = 0;
        for(int i = 0; i < n; i++){
            sell = prices[i] - buy;
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if(profit < sell){
                profit = sell;
            }
        }
        return profit;
    }
}
