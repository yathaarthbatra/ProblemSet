package arrays;

//It is the part -1 of the best time to buy and sell stock
//need to calculate the maximum profit

/*
Algorithm:
To calculate the maximum profit, we have to have the minimum cost price
to have minimum cost price maintain a minimum cost variable
and maintain a maxProfit variable
this works because profit can only be achieved by buying before and selling after
 */

public class BestTimeToSellStock {

    public static int maxProfit(int[] arr){
        // if we traverse the array again and again to find
        // the maximum profit by finding the maxiumum difference
        //this will take O(n^2) time

        int maxProfit = 0;
        int minCostPrice = Integer.MAX_VALUE;
        // 7 1 5 3 6 4
        for (int j : arr) {
            if (minCostPrice > j) {
                minCostPrice = j;
            }
            int profit = j - minCostPrice;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        int maxProfit = maxProfit(arr);
        System.out.print(maxProfit);
    }
}
