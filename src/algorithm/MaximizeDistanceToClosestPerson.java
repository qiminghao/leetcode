package algorithm;

/**
 * 849. Maximize Distance to Closest Person
 * 
 * In a row of seats, 1 represents a person sitting in that seat, and 0
 * represents that the seat is empty. There is at least one empty seat, and at
 * least one person sitting. Alex wants to sit in the seat such that the
 * distance between him and the closest person to him is maximized. Return that
 * maximum distance to closest person.
 * 
 * Example 1: Input: [1,0,0,0,1,0,1] Output: 2
 * Explanation: If Alex sits in the second open seat (seats[2]), then the
 * closest person has distance 2. If Alex sits in any other open seat, the
 * closest person has distance 1. Thus, the maximum distance to the closest
 * person is 2.
 * 
 * Example 2: Input: [1,0,0,0] Output: 3
 * Explanation: If Alex sits in the last seat, the closest person is 3 seats
 * away. This is the maximum distance possible, so the answer is 3.
 * 
 * Note:
 * 1. 1 <= seats.length <= 20000
 * 2. seats contains only 0s or 1s, at least one 0, and at least one 1.
 * 
 * @author qiminghao
 *
 */
public class MaximizeDistanceToClosestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximizeDistanceToClosestPerson obj = new MaximizeDistanceToClosestPerson();
		int[] seats = new int[] { 1, 0, 0, 0, 1, 0, 1 };
		int res = obj.maxDistToClosest(seats);
		System.out.println(res);
		seats = new int[] { 1, 0, 0, 0 };
		res = obj.maxDistToClosest(seats);
		System.out.println(res);
	}

	public int maxDistToClosest(int[] seats) {
		int res = 0, start = 0;
		for (; start < seats.length && seats[start] != 1; start++);
		res = start;
		while (start < seats.length) {
			int end = start + 1;
			for (; end < seats.length && seats[end] != 1; end++)
				;
			if (end == seats.length) {
				res = Math.max(res, end - start - 1);
			}
			res = Math.max(res, (end - start) / 2);
			start = end;
		}
		return res;
	}

}
