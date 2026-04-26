import java.util.*;
/*
PROBLEM:
LeetCode 121 - Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a stock on day i.
You want to maximize your profit by choosing a single day to buy one stock
and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve. If no profit is possible, return 0.

ALGORITHM:
1. Initialize minPrice = infinity (Integer.MAX_VALUE)
2. Initialize maxProfit = 0
3. Traverse the array of prices
4. For each price:
      a) If price < minPrice → update minPrice
      b) Otherwise calculate profit = price - minPrice
      c) Update maxProfit if profit is greater
5. Return maxProfit

TIME COMPLEXITY:
O(n) — single traversal of array

SPACE COMPLEXITY:
O(1) — constant extra space
*/


public class BuyAndSellStocks {
    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){

            if(price < minPrice){
                minPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}

