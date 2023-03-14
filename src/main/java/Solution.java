public class Solution {
    public int maxProfit(int[] prices) {
        /*
        With this solution we are only going to pass through the array once, giving us a time complexity of O(n).
        We only care about two values as we go: the lowest price, and the highest profit. Our solution will always be
        the greatest difference between any two elements in the array. As we pass through the array, we track the
        lowest price, any time we find a lower price we use that price instead. If we didn't find a lower price,
        we check the profit to be made. Any time we find greater profit, we update the value of maxProfit.
         */

        int lowPrice = 10000;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < lowPrice) {
                lowPrice = prices[i];
            } else if(prices[i] - lowPrice > maxProfit) {
                maxProfit = prices[i] - lowPrice;
            }
        }

        return maxProfit;
    }
}
