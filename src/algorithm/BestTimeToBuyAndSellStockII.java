package algorithm;

/**
 * 122. Best Time to Buy and Sell Stock II
 * 
 * Say you have an array for which the ith element is the price of a given stock
 * on day i. Design an algorithm to find the maximum profit. You may complete as
 * many transactions as you like (i.e., buy one and sell one share of the stock
 * multiple times).
 * 
 * Example 1: Input: [7,1,5,3,6,4] Output: 7
 * 
 * Example 2: Input: [1,2,3,4,5] Output: 4
 * 
 * Example 3: Input: [7,6,4,3,1] Output: 0
 * 
 * Note: You may not engage in multiple transactions at the same time (i.e., you
 * must sell the stock before you buy again).
 * 
 * @author qiminghao
 *
 */
public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeToBuyAndSellStockII obj = new BestTimeToBuyAndSellStockII();
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		int res = obj.maxProfit(prices);
		System.out.println(res);
		prices = new int[] { 1, 2, 3, 4, 5 };
		res = obj.maxProfit(prices);
		System.out.println(res);
		prices = new int[] { 7, 6, 4, 3, 1 };
		res = obj.maxProfit(prices);
		System.out.println(res);
	}

	public int maxProfit(int[] prices) {
		int res = 0;
		for (int buy = 0; buy < prices.length - 1;) {
			int sell = buy + 1;
			if (prices[sell] > prices[buy]) {
				for (; sell < prices.length && prices[sell] > prices[sell - 1]; sell++);
				res += prices[sell - 1] - prices[buy];
			}
			buy = sell;
		}
		return res;
	}

}
