package algorithm;

/**
 * 941. Valid Mountain Array
 * 
 * Given an array A of integers, return true if and only if it is a valid
 * mountain array.
 * Recall that A is a mountain array if and only if:
 * 		A.length >= 3
 * 		There exists some i with 0 < i < A.length - 1 such that:
 * 			A[0] < A[1] < ... A[i-1] < A[i]
 * 			A[i] > A[i+1] > ... > A[B.length - 1]
 * 
 * Example 1: Input: [2,1] Output: false
 * Example 2: Input: [3,5,5] Output: false
 * Example 3: Input: [0,3,2,1] Output: true
 * 
 * Note: 0 <= A.length <= 10000; 0 <= A[i] <= 10000
 * 
 * @author qiminghao
 *
 */
public class ValidMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidMountainArray obj = new ValidMountainArray();
		int[] A = new int[] { 2, 1 };
		boolean res = obj.validMountainArray(A);
		System.out.println(res);
		A = new int[] { 3, 5, 5 };
		res = obj.validMountainArray(A);
		System.out.println(res);
		A = new int[] { 0, 3, 2, 1 };
		res = obj.validMountainArray(A);
		System.out.println(res);
	}

	public boolean validMountainArray(int[] A) {
		if (A.length < 3) {
			return false;
		}
		int max = A[0], maxIdx = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
				maxIdx = i;
			}
		}
		if (maxIdx == 0 || maxIdx == A.length - 1) {
			return false;
		}
		for (int i = maxIdx - 1; i >= 0; i--) {
			if (A[i + 1] <= A[i]) {
				return false;
			}
		}
		for (int i = maxIdx + 1; i < A.length; i++) {
			if (A[i] >= A[i - 1]) {
				return false;
			}
		}
		return true;
	}

}
