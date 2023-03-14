public class Solution {
    public int maxProfit(int[] prices) {
        /*
        This brute force solution is hardly ideal, clocking in with a time complexity of O(n^2). Note the nested
        for loops. This usually indicates an inefficient solution.

        We pass through the array considering the profit to be made by buying on any given day. We do this by taking
        that day's price and subtracting it from all future prices, looking for the greatest profit. Once we are
        finished, we will have considered about n^2 possible outcomes.
         */
        int potentialProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                if(potentialProfit < sell - buy) {
                    potentialProfit = sell - buy;
                }
            }
        }

        return potentialProfit;
    }
}
