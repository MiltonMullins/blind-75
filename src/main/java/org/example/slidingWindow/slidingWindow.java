package org.example.slidingWindow;

/*
You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.

Example 1:

Input: prices = [10,1,5,6,7,1]

Output: 6
Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.

Example 2:

Input: prices = [10,8,7,5,2]

Output: 0
Explanation: No profitable transactions can be made, thus the max profit is 0.

Constraints:

1 <= prices.length <= 100
0 <= prices[i] <= 100
 */

import java.util.Arrays;
import java.util.OptionalInt;

public class slidingWindow {

    public static int maxProfit(int[] prices) {
        int maxProfit = -1;
        //OptionalInt maxPrice = Arrays.stream(prices).max();
        OptionalInt bestPrice = Arrays.stream(prices).min();

//        if (maxPrice.isPresent()){
//            maxProfit = maxPrice.getAsInt() - bestPrice.getAsInt();
//        }
        boolean pricesDesc = false;

        //System.out.println("Max: " + maxPrice.getAsInt());
        System.out.println("Min: " + bestPrice.getAsInt());

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                pricesDesc = true;
            } else {
                pricesDesc = false;
                break;
            }
        }
        if (pricesDesc) {
            return 0;
        }

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] == bestPrice.getAsInt()) {
                for (int j=i;j<prices.length-1;j++){
                    if(prices[j+1]>prices[j]){
                        maxProfit = prices[j+1] - bestPrice.getAsInt();
                    }
                }
            }
        }


        return maxProfit;
    }

//Brute Force
    public static int maxProfit2(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                res = Math.max(res, sell - buy);
            }
        }
        return res;
    }
}
