package algorithm;

/**
 * 746. Min Cost Climbing Stairs
 * 
 * On a staircase, the i-th step has some non-negative cost cost[i] assigned (0
 * indexed). Once you pay the cost, you can either climb one or two steps. You
 * need to find minimum cost to reach the top of the floor, and you can either
 * start from the step with index 0, or the step with index 1.
 * 
 * 
 * Example 1: Input: cost = [10, 15, 20] Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 * 
 * Example 2: Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1] Output: 6
 * Explanation: Cheapest is start on cost[0], and only step on 1s, skipping
 * cost[3].
 * 
 * Note:
 * 1. cost will have a length in the range [2, 1000].
 * 2. Every cost[i] will be an integer in the range [0, 999].
 * 
 * @author qiminghao
 *
 */
public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinCostClimbingStairs obj = new MinCostClimbingStairs();
		int[] cost = new int[] { 10, 15, 20 };
		int res = obj.minCostClimbingStairs(cost);
		System.out.println(res);
		cost = new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		res = obj.minCostClimbingStairs(cost);
		System.out.println(res);
	}

	public int minCostClimbingStairs(int[] cost) {
		int[] d = new int[cost.length];
		d[0] = cost[0];
		d[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			d[i] = cost[i] + Math.min(d[i - 1], d[i - 2]);
		}
		return Math.min(d[cost.length - 2], d[cost.length - 1]);
	}

}
