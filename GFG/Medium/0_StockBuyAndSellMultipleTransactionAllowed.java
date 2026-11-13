/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/stock-buy-and-sell2615/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int maxProfit(int[] prices) {
    int profit=0;
      

              for (int i = 1; i < prices.length; i++) {
                  if (prices[i] > prices[i - 1]) {
                      profit += prices[i] - prices[i - 1];
                  }
              }

              return profit;
          
     

        
    }
}
