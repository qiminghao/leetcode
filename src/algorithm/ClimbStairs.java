package algorithm;

/**
 * 70. Climbing Stairs
 * 
 * You are climbing a stair case. It takes n steps to reach to the top. Each
 * time you can either climb 1 or 2 steps. In how many distinct ways can you
 * climb to the top? Note: Given n will be a positive integer.
 * 
 * Example 1: Input: 2 Output: 2
 * 
 * Example 2: Input: 3 Output: 3
 * 
 * @author qiminghao
 *
 */
public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbStairs obj = new ClimbStairs();
		int n = 2;
		int res = obj.climbStairs(n);
		System.out.println(res);
		n = 3;
		res = obj.climbStairs(n);
		System.out.println(res);
	}

	public int climbStairs(int n) {
		if (n < 3)
			return n;
		int pre1 = 2, pre2 = 1, res = 0;
		for (int i = 3; i <= n; i++) {
			res = pre1 + pre2;
			pre2 = pre1;
			pre1 = res;
		}
		return res;
	}

}
